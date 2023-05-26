// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GrafanaWorkspaceUserOrg extends TeaModel {
    @NameInMap("orgId")
    public Long orgId;

    @NameInMap("orgName")
    public String orgName;

    @NameInMap("role")
    public String role;

    public static GrafanaWorkspaceUserOrg build(java.util.Map<String, ?> map) throws Exception {
        GrafanaWorkspaceUserOrg self = new GrafanaWorkspaceUserOrg();
        return TeaModel.build(map, self);
    }

    public GrafanaWorkspaceUserOrg setOrgId(Long orgId) {
        this.orgId = orgId;
        return this;
    }
    public Long getOrgId() {
        return this.orgId;
    }

    public GrafanaWorkspaceUserOrg setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public GrafanaWorkspaceUserOrg setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

}
