// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class RecallHonorRequest extends TeaModel {
    @NameInMap("TenantContext")
    public RecallHonorRequestTenantContext tenantContext;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>21660610</p>
     */
    @NameInMap("honorId")
    public String honorId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>345391052</p>
     */
    @NameInMap("orgId")
    public Long orgId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>363784</p>
     */
    @NameInMap("userId")
    public String userId;

    public static RecallHonorRequest build(java.util.Map<String, ?> map) throws Exception {
        RecallHonorRequest self = new RecallHonorRequest();
        return TeaModel.build(map, self);
    }

    public RecallHonorRequest setTenantContext(RecallHonorRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public RecallHonorRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public RecallHonorRequest setHonorId(String honorId) {
        this.honorId = honorId;
        return this;
    }
    public String getHonorId() {
        return this.honorId;
    }

    public RecallHonorRequest setOrgId(Long orgId) {
        this.orgId = orgId;
        return this;
    }
    public Long getOrgId() {
        return this.orgId;
    }

    public RecallHonorRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public static class RecallHonorRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static RecallHonorRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            RecallHonorRequestTenantContext self = new RecallHonorRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public RecallHonorRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
