// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryLiveWatchDetailRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("LiveId")
    public String liveId;

    @NameInMap("TenantContext")
    public QueryLiveWatchDetailRequestTenantContext tenantContext;

    public static QueryLiveWatchDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLiveWatchDetailRequest self = new QueryLiveWatchDetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryLiveWatchDetailRequest setLiveId(String liveId) {
        this.liveId = liveId;
        return this;
    }
    public String getLiveId() {
        return this.liveId;
    }

    public QueryLiveWatchDetailRequest setTenantContext(QueryLiveWatchDetailRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public QueryLiveWatchDetailRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class QueryLiveWatchDetailRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static QueryLiveWatchDetailRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            QueryLiveWatchDetailRequestTenantContext self = new QueryLiveWatchDetailRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public QueryLiveWatchDetailRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
