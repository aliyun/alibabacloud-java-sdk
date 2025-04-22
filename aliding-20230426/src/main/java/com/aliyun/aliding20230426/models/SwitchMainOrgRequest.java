// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SwitchMainOrgRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>21001</p>
     */
    @NameInMap("TargetOrgId")
    public Long targetOrgId;

    @NameInMap("TenantContext")
    public SwitchMainOrgRequestTenantContext tenantContext;

    public static SwitchMainOrgRequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchMainOrgRequest self = new SwitchMainOrgRequest();
        return TeaModel.build(map, self);
    }

    public SwitchMainOrgRequest setTargetOrgId(Long targetOrgId) {
        this.targetOrgId = targetOrgId;
        return this;
    }
    public Long getTargetOrgId() {
        return this.targetOrgId;
    }

    public SwitchMainOrgRequest setTenantContext(SwitchMainOrgRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public SwitchMainOrgRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class SwitchMainOrgRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static SwitchMainOrgRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            SwitchMainOrgRequestTenantContext self = new SwitchMainOrgRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public SwitchMainOrgRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
