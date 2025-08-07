// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ChangeDingTalkIdRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4uf_iw54grufg9</p>
     */
    @NameInMap("DingTalkId")
    public String dingTalkId;

    @NameInMap("TenantContext")
    public ChangeDingTalkIdRequestTenantContext tenantContext;

    public static ChangeDingTalkIdRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeDingTalkIdRequest self = new ChangeDingTalkIdRequest();
        return TeaModel.build(map, self);
    }

    public ChangeDingTalkIdRequest setDingTalkId(String dingTalkId) {
        this.dingTalkId = dingTalkId;
        return this;
    }
    public String getDingTalkId() {
        return this.dingTalkId;
    }

    public ChangeDingTalkIdRequest setTenantContext(ChangeDingTalkIdRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public ChangeDingTalkIdRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class ChangeDingTalkIdRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static ChangeDingTalkIdRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            ChangeDingTalkIdRequestTenantContext self = new ChangeDingTalkIdRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public ChangeDingTalkIdRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
