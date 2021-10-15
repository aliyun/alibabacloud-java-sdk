// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryBizItemsRequest extends TeaModel {
    @NameInMap("BizId")
    @Validation(required = true)
    public String bizId;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("SubBizId")
    public String subBizId;

    @NameInMap("UserId")
    public String userId;

    public static QueryBizItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBizItemsRequest self = new QueryBizItemsRequest();
        return TeaModel.build(map, self);
    }

    public QueryBizItemsRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryBizItemsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryBizItemsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryBizItemsRequest setSubBizId(String subBizId) {
        this.subBizId = subBizId;
        return this;
    }
    public String getSubBizId() {
        return this.subBizId;
    }

    public QueryBizItemsRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
