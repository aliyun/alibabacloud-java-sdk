// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class ListPromptsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cs,qa</p>
     */
    @NameInMap("BizTags")
    public String bizTags;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>550e8400-e29b-41d4-a716-446655440000</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>customer</p>
     */
    @NameInMap("PromptKey")
    public String promptKey;

    /**
     * <strong>example:</strong>
     * <p>blur</p>
     */
    @NameInMap("Search")
    public String search;

    public static ListPromptsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPromptsRequest self = new ListPromptsRequest();
        return TeaModel.build(map, self);
    }

    public ListPromptsRequest setBizTags(String bizTags) {
        this.bizTags = bizTags;
        return this;
    }
    public String getBizTags() {
        return this.bizTags;
    }

    public ListPromptsRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public ListPromptsRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListPromptsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPromptsRequest setPromptKey(String promptKey) {
        this.promptKey = promptKey;
        return this;
    }
    public String getPromptKey() {
        return this.promptKey;
    }

    public ListPromptsRequest setSearch(String search) {
        this.search = search;
        return this;
    }
    public String getSearch() {
        return this.search;
    }

}
