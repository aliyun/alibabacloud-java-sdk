// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryActivityItemsRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("LmActivityId")
    public Long lmActivityId;

    public static QueryActivityItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryActivityItemsRequest self = new QueryActivityItemsRequest();
        return TeaModel.build(map, self);
    }

    public QueryActivityItemsRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryActivityItemsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryActivityItemsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryActivityItemsRequest setLmActivityId(Long lmActivityId) {
        this.lmActivityId = lmActivityId;
        return this;
    }
    public Long getLmActivityId() {
        return this.lmActivityId;
    }

}
