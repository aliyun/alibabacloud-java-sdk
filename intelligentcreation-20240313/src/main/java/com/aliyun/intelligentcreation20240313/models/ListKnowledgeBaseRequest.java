// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class ListKnowledgeBaseRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>&quot;186432649&quot;</p>
     */
    @NameInMap("knowledgeBaseId")
    public String knowledgeBaseId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    public static ListKnowledgeBaseRequest build(java.util.Map<String, ?> map) throws Exception {
        ListKnowledgeBaseRequest self = new ListKnowledgeBaseRequest();
        return TeaModel.build(map, self);
    }

    public ListKnowledgeBaseRequest setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
        return this;
    }
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    public ListKnowledgeBaseRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListKnowledgeBaseRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
