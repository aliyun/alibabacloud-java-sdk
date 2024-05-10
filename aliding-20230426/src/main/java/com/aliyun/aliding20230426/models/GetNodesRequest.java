// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetNodesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("NodeIds")
    public java.util.List<String> nodeIds;

    @NameInMap("Option")
    public GetNodesRequestOption option;

    @NameInMap("TenantContext")
    public GetNodesRequestTenantContext tenantContext;

    public static GetNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNodesRequest self = new GetNodesRequest();
        return TeaModel.build(map, self);
    }

    public GetNodesRequest setNodeIds(java.util.List<String> nodeIds) {
        this.nodeIds = nodeIds;
        return this;
    }
    public java.util.List<String> getNodeIds() {
        return this.nodeIds;
    }

    public GetNodesRequest setOption(GetNodesRequestOption option) {
        this.option = option;
        return this;
    }
    public GetNodesRequestOption getOption() {
        return this.option;
    }

    public GetNodesRequest setTenantContext(GetNodesRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public GetNodesRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class GetNodesRequestOption extends TeaModel {
        @NameInMap("WithPermissionRole")
        public Boolean withPermissionRole;

        @NameInMap("WithStatisticalInfo")
        public Boolean withStatisticalInfo;

        public static GetNodesRequestOption build(java.util.Map<String, ?> map) throws Exception {
            GetNodesRequestOption self = new GetNodesRequestOption();
            return TeaModel.build(map, self);
        }

        public GetNodesRequestOption setWithPermissionRole(Boolean withPermissionRole) {
            this.withPermissionRole = withPermissionRole;
            return this;
        }
        public Boolean getWithPermissionRole() {
            return this.withPermissionRole;
        }

        public GetNodesRequestOption setWithStatisticalInfo(Boolean withStatisticalInfo) {
            this.withStatisticalInfo = withStatisticalInfo;
            return this;
        }
        public Boolean getWithStatisticalInfo() {
            return this.withStatisticalInfo;
        }

    }

    public static class GetNodesRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static GetNodesRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            GetNodesRequestTenantContext self = new GetNodesRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public GetNodesRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
