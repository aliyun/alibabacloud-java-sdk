// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdateGrafanaWorkspaceAccountRoleRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1035730062732547</p>
     */
    @NameInMap("AccountId")
    public Long accountId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>grafana-cn-ipp4v54ms01</p>
     */
    @NameInMap("GrafanaWorkspaceId")
    public String grafanaWorkspaceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("OrgId")
    public Long orgId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Admin</p>
     */
    @NameInMap("Role")
    public String role;

    public static UpdateGrafanaWorkspaceAccountRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGrafanaWorkspaceAccountRoleRequest self = new UpdateGrafanaWorkspaceAccountRoleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGrafanaWorkspaceAccountRoleRequest setAccountId(Long accountId) {
        this.accountId = accountId;
        return this;
    }
    public Long getAccountId() {
        return this.accountId;
    }

    public UpdateGrafanaWorkspaceAccountRoleRequest setGrafanaWorkspaceId(String grafanaWorkspaceId) {
        this.grafanaWorkspaceId = grafanaWorkspaceId;
        return this;
    }
    public String getGrafanaWorkspaceId() {
        return this.grafanaWorkspaceId;
    }

    public UpdateGrafanaWorkspaceAccountRoleRequest setOrgId(Long orgId) {
        this.orgId = orgId;
        return this;
    }
    public Long getOrgId() {
        return this.orgId;
    }

    public UpdateGrafanaWorkspaceAccountRoleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateGrafanaWorkspaceAccountRoleRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

}
