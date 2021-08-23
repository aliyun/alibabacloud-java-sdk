// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class QueryKnowledgesRequest extends TeaModel {
    @NameInMap("KnowledgeTitle")
    public String knowledgeTitle;

    @NameInMap("CoreWordName")
    public String coreWordName;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("CategoryId")
    public Long categoryId;

    public static QueryKnowledgesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryKnowledgesRequest self = new QueryKnowledgesRequest();
        return TeaModel.build(map, self);
    }

    public QueryKnowledgesRequest setKnowledgeTitle(String knowledgeTitle) {
        this.knowledgeTitle = knowledgeTitle;
        return this;
    }
    public String getKnowledgeTitle() {
        return this.knowledgeTitle;
    }

    public QueryKnowledgesRequest setCoreWordName(String coreWordName) {
        this.coreWordName = coreWordName;
        return this;
    }
    public String getCoreWordName() {
        return this.coreWordName;
    }

    public QueryKnowledgesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryKnowledgesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryKnowledgesRequest setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Long getCategoryId() {
        return this.categoryId;
    }

}
