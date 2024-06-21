// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GrafanaWorkspaceVpcConfig extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>fc、ansm</p>
     */
    @NameInMap("fcConfig")
    public String fcConfig;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    public Long id;

    @NameInMap("installMsg")
    public String installMsg;

    /**
     * <strong>example:</strong>
     * <p>CreateSucceed</p>
     */
    @NameInMap("installStatus")
    public String installStatus;

    /**
     * <strong>example:</strong>
     * <p>北京VPC-A通道</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>sg-6we94uvybteyc******</p>
     */
    @NameInMap("securityGroupId")
    public String securityGroupId;

    /**
     * <strong>example:</strong>
     * <p>10983***********</p>
     */
    @NameInMap("userId")
    public String userId;

    /**
     * <strong>example:</strong>
     * <p>vsw-6we3**********</p>
     */
    @NameInMap("vSwitchId")
    public String vSwitchId;

    /**
     * <strong>example:</strong>
     * <p>vpc-6wehr2x**********</p>
     */
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
