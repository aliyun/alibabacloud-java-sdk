// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ExpandGroupCapacityRequest extends TeaModel {
    @NameInMap("OpenConversationId")
    public String openConversationId;

    @NameInMap("TenantContext")
    public ExpandGroupCapacityRequestTenantContext tenantContext;

    public static ExpandGroupCapacityRequest build(java.util.Map<String, ?> map) throws Exception {
        ExpandGroupCapacityRequest self = new ExpandGroupCapacityRequest();
        return TeaModel.build(map, self);
    }

    public ExpandGroupCapacityRequest setOpenConversationId(String openConversationId) {
        this.openConversationId = openConversationId;
        return this;
    }
    public String getOpenConversationId() {
        return this.openConversationId;
    }

    public ExpandGroupCapacityRequest setTenantContext(ExpandGroupCapacityRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public ExpandGroupCapacityRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class ExpandGroupCapacityRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static ExpandGroupCapacityRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            ExpandGroupCapacityRequestTenantContext self = new ExpandGroupCapacityRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public ExpandGroupCapacityRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
