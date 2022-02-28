// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DeployDrGatewayRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("DrGatewayClass")
    public String drGatewayClass;

    @NameInMap("GatewayImageName")
    public String gatewayImageName;

    @NameInMap("LinuxShadowVmImageName")
    public String linuxShadowVmImageName;

    @NameInMap("Name")
    public String name;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("SiteId")
    public String siteId;

    @NameInMap("SitePairId")
    public String sitePairId;

    @NameInMap("UserVSwitchId")
    public String userVSwitchId;

    @NameInMap("WindowsShadowVmImageName")
    public String windowsShadowVmImageName;

    public static DeployDrGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        DeployDrGatewayRequest self = new DeployDrGatewayRequest();
        return TeaModel.build(map, self);
    }

    public DeployDrGatewayRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DeployDrGatewayRequest setDrGatewayClass(String drGatewayClass) {
        this.drGatewayClass = drGatewayClass;
        return this;
    }
    public String getDrGatewayClass() {
        return this.drGatewayClass;
    }

    public DeployDrGatewayRequest setGatewayImageName(String gatewayImageName) {
        this.gatewayImageName = gatewayImageName;
        return this;
    }
    public String getGatewayImageName() {
        return this.gatewayImageName;
    }

    public DeployDrGatewayRequest setLinuxShadowVmImageName(String linuxShadowVmImageName) {
        this.linuxShadowVmImageName = linuxShadowVmImageName;
        return this;
    }
    public String getLinuxShadowVmImageName() {
        return this.linuxShadowVmImageName;
    }

    public DeployDrGatewayRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeployDrGatewayRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DeployDrGatewayRequest setSiteId(String siteId) {
        this.siteId = siteId;
        return this;
    }
    public String getSiteId() {
        return this.siteId;
    }

    public DeployDrGatewayRequest setSitePairId(String sitePairId) {
        this.sitePairId = sitePairId;
        return this;
    }
    public String getSitePairId() {
        return this.sitePairId;
    }

    public DeployDrGatewayRequest setUserVSwitchId(String userVSwitchId) {
        this.userVSwitchId = userVSwitchId;
        return this;
    }
    public String getUserVSwitchId() {
        return this.userVSwitchId;
    }

    public DeployDrGatewayRequest setWindowsShadowVmImageName(String windowsShadowVmImageName) {
        this.windowsShadowVmImageName = windowsShadowVmImageName;
        return this;
    }
    public String getWindowsShadowVmImageName() {
        return this.windowsShadowVmImageName;
    }

}
