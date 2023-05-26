// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GrafanaWorkspaceVpcConfig extends TeaModel {
    @NameInMap("fcConfig")
    public String fcConfig;

    @NameInMap("id")
    public Long id;

    @NameInMap("installMsg")
    public String installMsg;

    @NameInMap("installStatus")
    public String installStatus;

    @NameInMap("name")
    public String name;

    @NameInMap("regionId")
    public String regionId;

    @NameInMap("securityGroupId")
    public String securityGroupId;

    @NameInMap("userId")
    public String userId;

    @NameInMap("vSwitchId")
    public String vSwitchId;

    @NameInMap("vpcId")
    public String vpcId;

    public static GrafanaWorkspaceVpcConfig build(java.util.Map<String, ?> map) throws Exception {
        GrafanaWorkspaceVpcConfig self = new GrafanaWorkspaceVpcConfig();
        return TeaModel.build(map, self);
    }

    public GrafanaWorkspaceVpcConfig setFcConfig(String fcConfig) {
        this.fcConfig = fcConfig;
        return this;
    }
    public String getFcConfig() {
        return this.fcConfig;
    }

    public GrafanaWorkspaceVpcConfig setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GrafanaWorkspaceVpcConfig setInstallMsg(String installMsg) {
        this.installMsg = installMsg;
        return this;
    }
    public String getInstallMsg() {
        return this.installMsg;
    }

    public GrafanaWorkspaceVpcConfig setInstallStatus(String installStatus) {
        this.installStatus = installStatus;
        return this;
    }
    public String getInstallStatus() {
        return this.installStatus;
    }

    public GrafanaWorkspaceVpcConfig setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GrafanaWorkspaceVpcConfig setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GrafanaWorkspaceVpcConfig setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public GrafanaWorkspaceVpcConfig setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public GrafanaWorkspaceVpcConfig setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public GrafanaWorkspaceVpcConfig setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
