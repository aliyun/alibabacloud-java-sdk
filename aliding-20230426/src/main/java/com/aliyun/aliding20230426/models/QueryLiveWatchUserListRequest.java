// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryLiveWatchUserListRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4d38xxxxx</p>
     */
    @NameInMap("LiveId")
    public String liveId;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
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
