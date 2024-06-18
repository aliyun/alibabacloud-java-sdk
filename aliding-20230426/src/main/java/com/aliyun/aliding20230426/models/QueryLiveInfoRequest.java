// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryLiveInfoRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4d38xxxxx</p>
     */
    @NameInMap("LiveId")
    public String liveId;

    @NameInMap("TenantContext")
    public QueryLiveInfoRequestTenantContext tenantContext;

    public static QueryLiveInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLiveInfoRequest self = new QueryLiveInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryLiveInfoRequest setLiveId(String liveId) {
        this.liveId = liveId;
        return this;
    }
    public String getLiveId() {
        return this.liveId;
    }

    public QueryLiveInfoRequest setTenantContext(QueryLiveInfoRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public QueryLiveInfoRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class QueryLiveInfoRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static QueryLiveInfoRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            QueryLiveInfoRequestTenantContext self = new QueryLiveInfoRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public QueryLiveInfoRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
