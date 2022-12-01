// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class CreateMyBaseRequest extends TeaModel {
    @NameInMap("AutoRenew")
    public String autoRenew;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DedicatedHostGroupDescription")
    public String dedicatedHostGroupDescription;

    @NameInMap("DedicatedHostGroupId")
    public String dedicatedHostGroupId;

    @NameInMap("ECSClassList")
    public java.util.List<CreateMyBaseRequestECSClassList> ECSClassList;

    @NameInMap("Engine")
    public String engine;

    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("KeyPairName")
    public String keyPairName;

    @NameInMap("OsPassword")
    public String osPassword;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PasswordInherit")
    public String passwordInherit;

    @NameInMap("PayType")
    public String payType;

    @NameInMap("Period")
    public String period;

    @NameInMap("PeriodType")
    public String periodType;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateMyBaseRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMyBaseRequest self = new CreateMyBaseRequest();
        return TeaModel.build(map, self);
    }

    public CreateMyBaseRequest setAutoRenew(String autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public String getAutoRenew() {
        return this.autoRenew;
    }

    public CreateMyBaseRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateMyBaseRequest setDedicatedHostGroupDescription(String dedicatedHostGroupDescription) {
        this.dedicatedHostGroupDescription = dedicatedHostGroupDescription;
        return this;
    }
    public String getDedicatedHostGroupDescription() {
        return this.dedicatedHostGroupDescription;
    }

    public CreateMyBaseRequest setDedicatedHostGroupId(String dedicatedHostGroupId) {
        this.dedicatedHostGroupId = dedicatedHostGroupId;
        return this;
    }
    public String getDedicatedHostGroupId() {
        return this.dedicatedHostGroupId;
    }

    public CreateMyBaseRequest setECSClassList(java.util.List<CreateMyBaseRequestECSClassList> ECSClassList) {
        this.ECSClassList = ECSClassList;
        return this;
    }
    public java.util.List<CreateMyBaseRequestECSClassList> getECSClassList() {
        return this.ECSClassList;
    }

    public CreateMyBaseRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public CreateMyBaseRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public CreateMyBaseRequest setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public CreateMyBaseRequest setOsPassword(String osPassword) {
        this.osPassword = osPassword;
        return this;
    }
    public String getOsPassword() {
        return this.osPassword;
    }

    public CreateMyBaseRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateMyBaseRequest setPasswordInherit(String passwordInherit) {
        this.passwordInherit = passwordInherit;
        return this;
    }
    public String getPasswordInherit() {
        return this.passwordInherit;
    }

    public CreateMyBaseRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CreateMyBaseRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public CreateMyBaseRequest setPeriodType(String periodType) {
        this.periodType = periodType;
        return this;
    }
    public String getPeriodType() {
        return this.periodType;
    }

    public CreateMyBaseRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateMyBaseRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateMyBaseRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateMyBaseRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public CreateMyBaseRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateMyBaseRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateMyBaseRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class CreateMyBaseRequestECSClassList extends TeaModel {
        @NameInMap("dataDiskPerformanceLevel")
        public String dataDiskPerformanceLevel;

        @NameInMap("diskCapacity")
        public Integer diskCapacity;

        @NameInMap("diskCount")
        public Integer diskCount;

        @NameInMap("diskType")
        public String diskType;

        @NameInMap("instanceType")
        public String instanceType;

        @NameInMap("nodeCount")
        public Integer nodeCount;

        @NameInMap("sysDiskCapacity")
        public Integer sysDiskCapacity;

        @NameInMap("sysDiskType")
        public String sysDiskType;

        @NameInMap("systemDiskPerformanceLevel")
        public String systemDiskPerformanceLevel;

        public static CreateMyBaseRequestECSClassList build(java.util.Map<String, ?> map) throws Exception {
            CreateMyBaseRequestECSClassList self = new CreateMyBaseRequestECSClassList();
            return TeaModel.build(map, self);
        }

        public CreateMyBaseRequestECSClassList setDataDiskPerformanceLevel(String dataDiskPerformanceLevel) {
            this.dataDiskPerformanceLevel = dataDiskPerformanceLevel;
            return this;
        }
        public String getDataDiskPerformanceLevel() {
            return this.dataDiskPerformanceLevel;
        }

        public CreateMyBaseRequestECSClassList setDiskCapacity(Integer diskCapacity) {
            this.diskCapacity = diskCapacity;
            return this;
        }
        public Integer getDiskCapacity() {
            return this.diskCapacity;
        }

        public CreateMyBaseRequestECSClassList setDiskCount(Integer diskCount) {
            this.diskCount = diskCount;
            return this;
        }
        public Integer getDiskCount() {
            return this.diskCount;
        }

        public CreateMyBaseRequestECSClassList setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public CreateMyBaseRequestECSClassList setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public CreateMyBaseRequestECSClassList setNodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public Integer getNodeCount() {
            return this.nodeCount;
        }

        public CreateMyBaseRequestECSClassList setSysDiskCapacity(Integer sysDiskCapacity) {
            this.sysDiskCapacity = sysDiskCapacity;
            return this;
        }
        public Integer getSysDiskCapacity() {
            return this.sysDiskCapacity;
        }

        public CreateMyBaseRequestECSClassList setSysDiskType(String sysDiskType) {
            this.sysDiskType = sysDiskType;
            return this;
        }
        public String getSysDiskType() {
            return this.sysDiskType;
        }

        public CreateMyBaseRequestECSClassList setSystemDiskPerformanceLevel(String systemDiskPerformanceLevel) {
            this.systemDiskPerformanceLevel = systemDiskPerformanceLevel;
            return this;
        }
        public String getSystemDiskPerformanceLevel() {
            return this.systemDiskPerformanceLevel;
        }

    }

}
