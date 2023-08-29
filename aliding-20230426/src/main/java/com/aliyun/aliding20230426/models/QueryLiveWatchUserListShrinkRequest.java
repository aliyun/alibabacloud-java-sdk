// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryLiveWatchUserListShrinkRequest extends TeaModel {
    @NameInMap("LiveId")
    public String liveId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    public static QueryLiveWatchUserListShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLiveWatchUserListShrinkRequest self = new QueryLiveWatchUserListShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryLiveWatchUserListShrinkRequest setLiveId(String liveId) {
        this.liveId = liveId;
        return this;
    }
    public String getLiveId() {
        return this.liveId;
    }

    public QueryLiveWatchUserListShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryLiveWatchUserListShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryLiveWatchUserListShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

}
