// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class DomainKnowledgeRetrieveRequest extends TeaModel {
    /**
     * <p>Le nombre de résultats à renvoyer.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("GlobalTopN")
    public Integer globalTopN;

    /**
     * <p>Les mots-clés à récupérer.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>comment renouveler</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>Les sites de la base de connaissances à interroger, y compris cn pour le national, intl pour l\&quot;international et all pour tous.</p>
     * 
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("Site")
    public String site;

    public static DomainKnowledgeRetrieveRequest build(java.util.Map<String, ?> map) throws Exception {
        DomainKnowledgeRetrieveRequest self = new DomainKnowledgeRetrieveRequest();
        return TeaModel.build(map, self);
    }

    public DomainKnowledgeRetrieveRequest setGlobalTopN(Integer globalTopN) {
        this.globalTopN = globalTopN;
        return this;
    }
    public Integer getGlobalTopN() {
        return this.globalTopN;
    }

    public DomainKnowledgeRetrieveRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public DomainKnowledgeRetrieveRequest setSite(String site) {
        this.site = site;
        return this;
    }
    public String getSite() {
        return this.site;
    }

}
