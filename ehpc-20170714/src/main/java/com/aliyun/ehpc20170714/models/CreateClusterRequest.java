// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20170714.models;

import com.aliyun.tea.*;

public class CreateClusterRequest extends TeaModel {
    @NameInMap("EcsOrder")
    public CreateClusterRequestEcsOrder ecsOrder;

    @NameInMap("AccountType")
    public String accountType;

    @NameInMap("Application")
    public java.util.List<CreateClusterRequestApplication> application;

    @NameInMap("ComputeSpotPriceLimit")
    public String computeSpotPriceLimit;

    @NameInMap("ComputeSpotStrategy")
    public String computeSpotStrategy;

    @NameInMap("Description")
    public String description;

    @NameInMap("EcsChargeType")
    public String ecsChargeType;

    @NameInMap("EhpcVersion")
    public String ehpcVersion;

    @NameInMap("HaEnable")
    public Boolean haEnable;

    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("ImageOwnerAlias")
    public String imageOwnerAlias;

    @NameInMap("KeyPairName")
    public String keyPairName;

    @NameInMap("Name")
    public String name;

    @NameInMap("OsTag")
    public String osTag;

    @NameInMap("Password")
    public String password;

    @NameInMap("RemoteDirectory")
    public String remoteDirectory;

    @NameInMap("SccClusterId")
    public String sccClusterId;

    @NameInMap("SchedulerType")
    public String schedulerType;

    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    @NameInMap("SecurityGroupName")
    public String securityGroupName;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("VolumeId")
    public String volumeId;

    @NameInMap("VolumeMountpoint")
    public String volumeMountpoint;

    @NameInMap("VolumeProtocol")
    public String volumeProtocol;

    @NameInMap("VolumeType")
    public String volumeType;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterRequest self = new CreateClusterRequest();
        return TeaModel.build(map, self);
    }

    public CreateClusterRequest setEcsOrder(CreateClusterRequestEcsOrder ecsOrder) {
        this.ecsOrder = ecsOrder;
        return this;
    }
    public CreateClusterRequestEcsOrder getEcsOrder() {
        return this.ecsOrder;
    }

    public CreateClusterRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public CreateClusterRequest setApplication(java.util.List<CreateClusterRequestApplication> application) {
        this.application = application;
        return this;
    }
    public java.util.List<CreateClusterRequestApplication> getApplication() {
        return this.application;
    }

    public CreateClusterRequest setComputeSpotPriceLimit(String computeSpotPriceLimit) {
        this.computeSpotPriceLimit = computeSpotPriceLimit;
        return this;
    }
    public String getComputeSpotPriceLimit() {
        return this.computeSpotPriceLimit;
    }

    public CreateClusterRequest setComputeSpotStrategy(String computeSpotStrategy) {
        this.computeSpotStrategy = computeSpotStrategy;
        return this;
    }
    public String getComputeSpotStrategy() {
        return this.computeSpotStrategy;
    }

    public CreateClusterRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateClusterRequest setEcsChargeType(String ecsChargeType) {
        this.ecsChargeType = ecsChargeType;
        return this;
    }
    public String getEcsChargeType() {
        return this.ecsChargeType;
    }

    public CreateClusterRequest setEhpcVersion(String ehpcVersion) {
        this.ehpcVersion = ehpcVersion;
        return this;
    }
    public String getEhpcVersion() {
        return this.ehpcVersion;
    }

    public CreateClusterRequest setHaEnable(Boolean haEnable) {
        this.haEnable = haEnable;
        return this;
    }
    public Boolean getHaEnable() {
        return this.haEnable;
    }

    public CreateClusterRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public CreateClusterRequest setImageOwnerAlias(String imageOwnerAlias) {
        this.imageOwnerAlias = imageOwnerAlias;
        return this;
    }
    public String getImageOwnerAlias() {
        return this.imageOwnerAlias;
    }

    public CreateClusterRequest setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public CreateClusterRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateClusterRequest setOsTag(String osTag) {
        this.osTag = osTag;
        return this;
    }
    public String getOsTag() {
        return this.osTag;
    }

    public CreateClusterRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateClusterRequest setRemoteDirectory(String remoteDirectory) {
        this.remoteDirectory = remoteDirectory;
        return this;
    }
    public String getRemoteDirectory() {
        return this.remoteDirectory;
    }

    public CreateClusterRequest setSccClusterId(String sccClusterId) {
        this.sccClusterId = sccClusterId;
        return this;
    }
    public String getSccClusterId() {
        return this.sccClusterId;
    }

    public CreateClusterRequest setSchedulerType(String schedulerType) {
        this.schedulerType = schedulerType;
        return this;
    }
    public String getSchedulerType() {
        return this.schedulerType;
    }

    public CreateClusterRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public CreateClusterRequest setSecurityGroupName(String securityGroupName) {
        this.securityGroupName = securityGroupName;
        return this;
    }
    public String getSecurityGroupName() {
        return this.securityGroupName;
    }

    public CreateClusterRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateClusterRequest setVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }
    public String getVolumeId() {
        return this.volumeId;
    }

    public CreateClusterRequest setVolumeMountpoint(String volumeMountpoint) {
        this.volumeMountpoint = volumeMountpoint;
        return this;
    }
    public String getVolumeMountpoint() {
        return this.volumeMountpoint;
    }

    public CreateClusterRequest setVolumeProtocol(String volumeProtocol) {
        this.volumeProtocol = volumeProtocol;
        return this;
    }
    public String getVolumeProtocol() {
        return this.volumeProtocol;
    }

    public CreateClusterRequest setVolumeType(String volumeType) {
        this.volumeType = volumeType;
        return this;
    }
    public String getVolumeType() {
        return this.volumeType;
    }

    public CreateClusterRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateClusterRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class CreateClusterRequestEcsOrderCompute extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("InstanceType")
        public String instanceType;

        public static CreateClusterRequestEcsOrderCompute build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterRequestEcsOrderCompute self = new CreateClusterRequestEcsOrderCompute();
            return TeaModel.build(map, self);
        }

        public CreateClusterRequestEcsOrderCompute setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public CreateClusterRequestEcsOrderCompute setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

    }

    public static class CreateClusterRequestEcsOrderLogin extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("InstanceType")
        public String instanceType;

        public static CreateClusterRequestEcsOrderLogin build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterRequestEcsOrderLogin self = new CreateClusterRequestEcsOrderLogin();
            return TeaModel.build(map, self);
        }

        public CreateClusterRequestEcsOrderLogin setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public CreateClusterRequestEcsOrderLogin setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

    }

    public static class CreateClusterRequestEcsOrderManager extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("InstanceType")
        public String instanceType;

        public static CreateClusterRequestEcsOrderManager build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterRequestEcsOrderManager self = new CreateClusterRequestEcsOrderManager();
            return TeaModel.build(map, self);
        }

        public CreateClusterRequestEcsOrderManager setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public CreateClusterRequestEcsOrderManager setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

    }

    public static class CreateClusterRequestEcsOrder extends TeaModel {
        @NameInMap("Compute")
        @Validation(required = true)
        public CreateClusterRequestEcsOrderCompute compute;

        @NameInMap("Login")
        @Validation(required = true)
        public CreateClusterRequestEcsOrderLogin login;

        @NameInMap("Manager")
        @Validation(required = true)
        public CreateClusterRequestEcsOrderManager manager;

        public static CreateClusterRequestEcsOrder build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterRequestEcsOrder self = new CreateClusterRequestEcsOrder();
            return TeaModel.build(map, self);
        }

        public CreateClusterRequestEcsOrder setCompute(CreateClusterRequestEcsOrderCompute compute) {
            this.compute = compute;
            return this;
        }
        public CreateClusterRequestEcsOrderCompute getCompute() {
            return this.compute;
        }

        public CreateClusterRequestEcsOrder setLogin(CreateClusterRequestEcsOrderLogin login) {
            this.login = login;
            return this;
        }
        public CreateClusterRequestEcsOrderLogin getLogin() {
            return this.login;
        }

        public CreateClusterRequestEcsOrder setManager(CreateClusterRequestEcsOrderManager manager) {
            this.manager = manager;
            return this;
        }
        public CreateClusterRequestEcsOrderManager getManager() {
            return this.manager;
        }

    }

    public static class CreateClusterRequestApplication extends TeaModel {
        @NameInMap("Tag")
        public String tag;

        public static CreateClusterRequestApplication build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterRequestApplication self = new CreateClusterRequestApplication();
            return TeaModel.build(map, self);
        }

        public CreateClusterRequestApplication setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

    }

}
