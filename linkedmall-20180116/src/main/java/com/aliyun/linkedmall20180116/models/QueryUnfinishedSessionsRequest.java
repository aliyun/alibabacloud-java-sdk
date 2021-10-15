// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryUnfinishedSessionsRequest extends TeaModel {
    @NameInMap("BizId")
    @Validation(required = true)
    public String bizId;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("QueryTime")
    public Long queryTime;

    public static QueryUnfinishedSessionsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUnfinishedSessionsRequest self = new QueryUnfinishedSessionsRequest();
        return TeaModel.build(map, self);
    }

    public QueryUnfinishedSessionsRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryUnfinishedSessionsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryUnfinishedSessionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryUnfinishedSessionsRequest setQueryTime(Long queryTime) {
        this.queryTime = queryTime;
        return this;
    }
    public Long getQueryTime() {
        return this.queryTime;
    }

}
