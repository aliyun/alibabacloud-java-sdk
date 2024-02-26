// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetConversaionSpaceRequest extends TeaModel {
    @NameInMap("OpenConversationId")
    public String openConversationId;

    @NameInMap("TenantContext")
    public GetConversaionSpaceRequestTenantContext tenantContext;

    public static GetConversaionSpaceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetConversaionSpaceRequest self = new GetConversaionSpaceRequest();
        return TeaModel.build(map, self);
    }

    public GetConversaionSpaceRequest setOpenConversationId(String openConversationId) {
        this.openConversationId = openConversationId;
        return this;
    }
    public String getOpenConversationId() {
        return this.openConversationId;
    }

    public GetConversaionSpaceRequest setTenantContext(GetConversaionSpaceRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public GetConversaionSpaceRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class GetConversaionSpaceRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static GetConversaionSpaceRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            GetConversaionSpaceRequestTenantContext self = new GetConversaionSpaceRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public GetConversaionSpaceRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
