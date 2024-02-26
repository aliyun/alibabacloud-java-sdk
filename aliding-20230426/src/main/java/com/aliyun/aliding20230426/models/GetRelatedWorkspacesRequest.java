// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetRelatedWorkspacesRequest extends TeaModel {
    @NameInMap("IncludeRecent")
    public Boolean includeRecent;

    @NameInMap("TenantContext")
    public GetRelatedWorkspacesRequestTenantContext tenantContext;

    public static GetRelatedWorkspacesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRelatedWorkspacesRequest self = new GetRelatedWorkspacesRequest();
        return TeaModel.build(map, self);
    }

    public GetRelatedWorkspacesRequest setIncludeRecent(Boolean includeRecent) {
        this.includeRecent = includeRecent;
        return this;
    }
    public Boolean getIncludeRecent() {
        return this.includeRecent;
    }

    public GetRelatedWorkspacesRequest setTenantContext(GetRelatedWorkspacesRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public GetRelatedWorkspacesRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class GetRelatedWorkspacesRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static GetRelatedWorkspacesRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            GetRelatedWorkspacesRequestTenantContext self = new GetRelatedWorkspacesRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public GetRelatedWorkspacesRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
