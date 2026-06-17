// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListConsumerAuthorizationRulesRequest extends TeaModel {
    /**
     * <p>The fuzzy match parameter for the API name.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen3</p>
     */
    @NameInMap("apiNameLike")
    public String apiNameLike;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The page size. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    public static ListConsumerAuthorizationRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListConsumerAuthorizationRulesRequest self = new ListConsumerAuthorizationRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListConsumerAuthorizationRulesRequest setApiNameLike(String apiNameLike) {
        this.apiNameLike = apiNameLike;
        return this;
    }
    public String getApiNameLike() {
        return this.apiNameLike;
    }

    public ListConsumerAuthorizationRulesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListConsumerAuthorizationRulesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
