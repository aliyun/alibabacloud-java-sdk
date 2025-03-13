// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class KnowledgeBaseListResult extends TeaModel {
    @NameInMap("knowledgeBases")
    public java.util.List<KnowledgeBaseInfo> knowledgeBases;

    /**
     * <strong>example:</strong>
     * <p>3239281273464326823</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("total")
    public Integer total;

    public static KnowledgeBaseListResult build(java.util.Map<String, ?> map) throws Exception {
        KnowledgeBaseListResult self = new KnowledgeBaseListResult();
        return TeaModel.build(map, self);
    }

    public KnowledgeBaseListResult setKnowledgeBases(java.util.List<KnowledgeBaseInfo> knowledgeBases) {
        this.knowledgeBases = knowledgeBases;
        return this;
    }
    public java.util.List<KnowledgeBaseInfo> getKnowledgeBases() {
        return this.knowledgeBases;
    }

    public KnowledgeBaseListResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public KnowledgeBaseListResult setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
