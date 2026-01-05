// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListConsumerAuthorizationRulesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>qwen3</p>
     */
    @NameInMap("apiNameLike")
    public String apiNameLike;

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
