// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class WearOrgHonorRequest extends TeaModel {
    @NameInMap("TenantContext")
    public WearOrgHonorRequestTenantContext tenantContext;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("honorId")
    public String honorId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("orgId")
    public Long orgId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("userId")
    public String userId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("wear")
    public Boolean wear;

    public static WearOrgHonorRequest build(java.util.Map<String, ?> map) throws Exception {
        WearOrgHonorRequest self = new WearOrgHonorRequest();
        return TeaModel.build(map, self);
    }

    public WearOrgHonorRequest setTenantContext(WearOrgHonorRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public WearOrgHonorRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public WearOrgHonorRequest setHonorId(String honorId) {
        this.honorId = honorId;
        return this;
    }
    public String getHonorId() {
        return this.honorId;
    }

    public WearOrgHonorRequest setOrgId(Long orgId) {
        this.orgId = orgId;
        return this;
    }
    public Long getOrgId() {
        return this.orgId;
    }

    public WearOrgHonorRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public WearOrgHonorRequest setWear(Boolean wear) {
        this.wear = wear;
        return this;
    }
    public Boolean getWear() {
        return this.wear;
    }

    public static class WearOrgHonorRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static WearOrgHonorRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            WearOrgHonorRequestTenantContext self = new WearOrgHonorRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public WearOrgHonorRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
