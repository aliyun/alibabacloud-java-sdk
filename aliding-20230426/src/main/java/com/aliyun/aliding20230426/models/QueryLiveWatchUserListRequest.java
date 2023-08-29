// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryLiveWatchUserListRequest extends TeaModel {
    @NameInMap("LiveId")
    public String liveId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TenantContext")
    public QueryLiveWatchUserListRequestTenantContext tenantContext;

    public static QueryLiveWatchUserListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLiveWatchUserListRequest self = new QueryLiveWatchUserListRequest();
        return TeaModel.build(map, self);
    }

    public QueryLiveWatchUserListRequest setLiveId(String liveId) {
        this.liveId = liveId;
        return this;
    }
    public String getLiveId() {
        return this.liveId;
    }

    public QueryLiveWatchUserListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryLiveWatchUserListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryLiveWatchUserListRequest setTenantContext(QueryLiveWatchUserListRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public QueryLiveWatchUserListRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class QueryLiveWatchUserListRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static QueryLiveWatchUserListRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            QueryLiveWatchUserListRequestTenantContext self = new QueryLiveWatchUserListRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public QueryLiveWatchUserListRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
