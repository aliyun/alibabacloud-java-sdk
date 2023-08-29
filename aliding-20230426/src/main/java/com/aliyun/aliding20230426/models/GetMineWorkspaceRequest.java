// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetMineWorkspaceRequest extends TeaModel {
    @NameInMap("Request")
    public java.util.Map<String, ?> request;

    @NameInMap("TenantContext")
    public GetMineWorkspaceRequestTenantContext tenantContext;

    public static GetMineWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMineWorkspaceRequest self = new GetMineWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public GetMineWorkspaceRequest setRequest(java.util.Map<String, ?> request) {
        this.request = request;
        return this;
    }
    public java.util.Map<String, ?> getRequest() {
        return this.request;
    }

    public GetMineWorkspaceRequest setTenantContext(GetMineWorkspaceRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public GetMineWorkspaceRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class GetMineWorkspaceRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static GetMineWorkspaceRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            GetMineWorkspaceRequestTenantContext self = new GetMineWorkspaceRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public GetMineWorkspaceRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
