// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class StartInstanceRequest extends TeaModel {
    @NameInMap("Config")
    public String config;

    @NameInMap("DeployModule")
    public String deployModule;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IsEipInner")
    public Boolean isEipInner;

    @NameInMap("IsSetUserAndPassword")
    public Boolean isSetUserAndPassword;

    @NameInMap("KMSKeyId")
    public String KMSKeyId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Password")
    public String password;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SecurityGroup")
    public String securityGroup;

    @NameInMap("ServiceVersion")
    public String serviceVersion;

    @NameInMap("Username")
    public String username;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("ZoneId")
    public String zoneId;

    public static StartInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        StartInstanceRequest self = new StartInstanceRequest();
        return TeaModel.build(map, self);
    }

    public StartInstanceRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public StartInstanceRequest setDeployModule(String deployModule) {
        this.deployModule = deployModule;
        return this;
    }
    public String getDeployModule() {
        return this.deployModule;
    }

    public StartInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public StartInstanceRequest setIsEipInner(Boolean isEipInner) {
        this.isEipInner = isEipInner;
        return this;
    }
    public Boolean getIsEipInner() {
        return this.isEipInner;
    }

    public StartInstanceRequest setIsSetUserAndPassword(Boolean isSetUserAndPassword) {
        this.isSetUserAndPassword = isSetUserAndPassword;
        return this;
    }
    public Boolean getIsSetUserAndPassword() {
        return this.isSetUserAndPassword;
    }

    public StartInstanceRequest setKMSKeyId(String KMSKeyId) {
        this.KMSKeyId = KMSKeyId;
        return this;
    }
    public String getKMSKeyId() {
        return this.KMSKeyId;
    }

    public StartInstanceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public StartInstanceRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public StartInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public StartInstanceRequest setSecurityGroup(String securityGroup) {
        this.securityGroup = securityGroup;
        return this;
    }
    public String getSecurityGroup() {
        return this.securityGroup;
    }

    public StartInstanceRequest setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }
    public String getServiceVersion() {
        return this.serviceVersion;
    }

    public StartInstanceRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

    public StartInstanceRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public StartInstanceRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public StartInstanceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
