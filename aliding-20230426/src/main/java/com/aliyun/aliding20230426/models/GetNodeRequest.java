// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetNodeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    @NameInMap("TenantContext")
    public GetNodeRequestTenantContext tenantContext;

    @NameInMap("WithPermissionRole")
    public Boolean withPermissionRole;

    @NameInMap("WithStatisticalInfo")
    public Boolean withStatisticalInfo;

    public static GetNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNodeRequest self = new GetNodeRequest();
        return TeaModel.build(map, self);
    }

    public GetNodeRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public GetNodeRequest setTenantContext(GetNodeRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public GetNodeRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public GetNodeRequest setWithPermissionRole(Boolean withPermissionRole) {
        this.withPermissionRole = withPermissionRole;
        return this;
    }
    public Boolean getWithPermissionRole() {
        return this.withPermissionRole;
    }

    public GetNodeRequest setWithStatisticalInfo(Boolean withStatisticalInfo) {
        this.withStatisticalInfo = withStatisticalInfo;
        return this;
    }
    public Boolean getWithStatisticalInfo() {
        return this.withStatisticalInfo;
    }

    public static class GetNodeRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static GetNodeRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            GetNodeRequestTenantContext self = new GetNodeRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public GetNodeRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
