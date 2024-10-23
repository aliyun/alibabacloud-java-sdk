// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryGroupLiveInfoRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>333d</p>
     */
    @NameInMap("AnchorUnionId")
    public String anchorUnionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4d38xxxxx</p>
     */
    @NameInMap("LiveUuid")
    public String liveUuid;

    @NameInMap("TenantContext")
    public QueryGroupLiveInfoRequestTenantContext tenantContext;

    public static QueryGroupLiveInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryGroupLiveInfoRequest self = new QueryGroupLiveInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryGroupLiveInfoRequest setAnchorUnionId(String anchorUnionId) {
        this.anchorUnionId = anchorUnionId;
        return this;
    }
    public String getAnchorUnionId() {
        return this.anchorUnionId;
    }

    public QueryGroupLiveInfoRequest setLiveUuid(String liveUuid) {
        this.liveUuid = liveUuid;
        return this;
    }
    public String getLiveUuid() {
        return this.liveUuid;
    }

    public QueryGroupLiveInfoRequest setTenantContext(QueryGroupLiveInfoRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public QueryGroupLiveInfoRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class QueryGroupLiveInfoRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static QueryGroupLiveInfoRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            QueryGroupLiveInfoRequestTenantContext self = new QueryGroupLiveInfoRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public QueryGroupLiveInfoRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
