// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeMigrationInstancesResponseBody extends TeaModel {
    @NameInMap("MigrationInstanceSet")
    public MigrationInstanceSet migrationInstanceSet;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeMigrationInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMigrationInstancesResponseBody self = new DescribeMigrationInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMigrationInstancesResponseBody setMigrationInstanceSet(MigrationInstanceSet migrationInstanceSet) {
        this.migrationInstanceSet = migrationInstanceSet;
        return this;
    }
    public MigrationInstanceSet getMigrationInstanceSet() {
        return this.migrationInstanceSet;
    }

    public DescribeMigrationInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeMigrationInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeMigrationInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMigrationInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class SecurityGroupIdSets extends TeaModel {
        @NameInMap("SecurityGroupId")
        public java.util.List<String> securityGroupId;

        public static SecurityGroupIdSets build(java.util.Map<String, ?> map) throws Exception {
            SecurityGroupIdSets self = new SecurityGroupIdSets();
            return TeaModel.build(map, self);
        }

        public SecurityGroupIdSets setSecurityGroupId(java.util.List<String> securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public java.util.List<String> getSecurityGroupId() {
            return this.securityGroupId;
        }

    }

    public static class SecurityGroupIdSetsAfterTransition extends TeaModel {
        @NameInMap("SecurityGroupId")
        public java.util.List<String> securityGroupId;

        public static SecurityGroupIdSetsAfterTransition build(java.util.Map<String, ?> map) throws Exception {
            SecurityGroupIdSetsAfterTransition self = new SecurityGroupIdSetsAfterTransition();
            return TeaModel.build(map, self);
        }

        public SecurityGroupIdSetsAfterTransition setSecurityGroupId(java.util.List<String> securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public java.util.List<String> getSecurityGroupId() {
            return this.securityGroupId;
        }

    }

    public static class Tag extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static Tag build(java.util.Map<String, ?> map) throws Exception {
            Tag self = new Tag();
            return TeaModel.build(map, self);
        }

        public Tag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public Tag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class Tags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<Tag> tag;

        public static Tags build(java.util.Map<String, ?> map) throws Exception {
            Tags self = new Tags();
            return TeaModel.build(map, self);
        }

        public Tags setTag(java.util.List<Tag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<Tag> getTag() {
            return this.tag;
        }

    }

    public static class MigrationInstance extends TeaModel {
        @NameInMap("BusinessMigrationType")
        public String businessMigrationType;

        @NameInMap("BusinessStatus")
        public String businessStatus;

        @NameInMap("ChangePublicIp")
        public Boolean changePublicIp;

        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("HasLocalDisk")
        public Boolean hasLocalDisk;

        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("InternetIp")
        public String internetIp;

        @NameInMap("InternetIpAfterTransition")
        public String internetIpAfterTransition;

        @NameInMap("IntranetIp")
        public String intranetIp;

        @NameInMap("IntranetIpAfterTransition")
        public String intranetIpAfterTransition;

        @NameInMap("LoadProgress")
        public String loadProgress;

        @NameInMap("MacAddressAfterTransition")
        public String macAddressAfterTransition;

        @NameInMap("MergeProgress")
        public String mergeProgress;

        @NameInMap("MigrationPlanId")
        public String migrationPlanId;

        @NameInMap("MigrationStatus")
        public String migrationStatus;

        @NameInMap("Name")
        public String name;

        @NameInMap("NetworkConnectivityStatus")
        public Boolean networkConnectivityStatus;

        @NameInMap("NetworkMigrationType")
        public Integer networkMigrationType;

        @NameInMap("NonStandardInstanceType")
        public Boolean nonStandardInstanceType;

        @NameInMap("PrivateMacAddress")
        public String privateMacAddress;

        @NameInMap("PublicMacAddress")
        public String publicMacAddress;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("SecurityGroupIdSets")
        public SecurityGroupIdSets securityGroupIdSets;

        @NameInMap("SecurityGroupIdSetsAfterTransition")
        public SecurityGroupIdSetsAfterTransition securityGroupIdSetsAfterTransition;

        @NameInMap("Status")
        public String status;

        @NameInMap("Tags")
        public Tags tags;

        @NameInMap("TargetVSwitchId")
        public String targetVSwitchId;

        @NameInMap("TargetVpcId")
        public String targetVpcId;

        @NameInMap("TargetZoneId")
        public String targetZoneId;

        @NameInMap("TransitionTime")
        public String transitionTime;

        @NameInMap("ZoneId")
        public String zoneId;

        public static MigrationInstance build(java.util.Map<String, ?> map) throws Exception {
            MigrationInstance self = new MigrationInstance();
            return TeaModel.build(map, self);
        }

        public MigrationInstance setBusinessMigrationType(String businessMigrationType) {
            this.businessMigrationType = businessMigrationType;
            return this;
        }
        public String getBusinessMigrationType() {
            return this.businessMigrationType;
        }

        public MigrationInstance setBusinessStatus(String businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        public MigrationInstance setChangePublicIp(Boolean changePublicIp) {
            this.changePublicIp = changePublicIp;
            return this;
        }
        public Boolean getChangePublicIp() {
            return this.changePublicIp;
        }

        public MigrationInstance setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public MigrationInstance setHasLocalDisk(Boolean hasLocalDisk) {
            this.hasLocalDisk = hasLocalDisk;
            return this;
        }
        public Boolean getHasLocalDisk() {
            return this.hasLocalDisk;
        }

        public MigrationInstance setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public MigrationInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public MigrationInstance setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public MigrationInstance setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public MigrationInstance setInternetIpAfterTransition(String internetIpAfterTransition) {
            this.internetIpAfterTransition = internetIpAfterTransition;
            return this;
        }
        public String getInternetIpAfterTransition() {
            return this.internetIpAfterTransition;
        }

        public MigrationInstance setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public MigrationInstance setIntranetIpAfterTransition(String intranetIpAfterTransition) {
            this.intranetIpAfterTransition = intranetIpAfterTransition;
            return this;
        }
        public String getIntranetIpAfterTransition() {
            return this.intranetIpAfterTransition;
        }

        public MigrationInstance setLoadProgress(String loadProgress) {
            this.loadProgress = loadProgress;
            return this;
        }
        public String getLoadProgress() {
            return this.loadProgress;
        }

        public MigrationInstance setMacAddressAfterTransition(String macAddressAfterTransition) {
            this.macAddressAfterTransition = macAddressAfterTransition;
            return this;
        }
        public String getMacAddressAfterTransition() {
            return this.macAddressAfterTransition;
        }

        public MigrationInstance setMergeProgress(String mergeProgress) {
            this.mergeProgress = mergeProgress;
            return this;
        }
        public String getMergeProgress() {
            return this.mergeProgress;
        }

        public MigrationInstance setMigrationPlanId(String migrationPlanId) {
            this.migrationPlanId = migrationPlanId;
            return this;
        }
        public String getMigrationPlanId() {
            return this.migrationPlanId;
        }

        public MigrationInstance setMigrationStatus(String migrationStatus) {
            this.migrationStatus = migrationStatus;
            return this;
        }
        public String getMigrationStatus() {
            return this.migrationStatus;
        }

        public MigrationInstance setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public MigrationInstance setNetworkConnectivityStatus(Boolean networkConnectivityStatus) {
            this.networkConnectivityStatus = networkConnectivityStatus;
            return this;
        }
        public Boolean getNetworkConnectivityStatus() {
            return this.networkConnectivityStatus;
        }

        public MigrationInstance setNetworkMigrationType(Integer networkMigrationType) {
            this.networkMigrationType = networkMigrationType;
            return this;
        }
        public Integer getNetworkMigrationType() {
            return this.networkMigrationType;
        }

        public MigrationInstance setNonStandardInstanceType(Boolean nonStandardInstanceType) {
            this.nonStandardInstanceType = nonStandardInstanceType;
            return this;
        }
        public Boolean getNonStandardInstanceType() {
            return this.nonStandardInstanceType;
        }

        public MigrationInstance setPrivateMacAddress(String privateMacAddress) {
            this.privateMacAddress = privateMacAddress;
            return this;
        }
        public String getPrivateMacAddress() {
            return this.privateMacAddress;
        }

        public MigrationInstance setPublicMacAddress(String publicMacAddress) {
            this.publicMacAddress = publicMacAddress;
            return this;
        }
        public String getPublicMacAddress() {
            return this.publicMacAddress;
        }

        public MigrationInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public MigrationInstance setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public MigrationInstance setSecurityGroupIdSets(SecurityGroupIdSets securityGroupIdSets) {
            this.securityGroupIdSets = securityGroupIdSets;
            return this;
        }
        public SecurityGroupIdSets getSecurityGroupIdSets() {
            return this.securityGroupIdSets;
        }

        public MigrationInstance setSecurityGroupIdSetsAfterTransition(SecurityGroupIdSetsAfterTransition securityGroupIdSetsAfterTransition) {
            this.securityGroupIdSetsAfterTransition = securityGroupIdSetsAfterTransition;
            return this;
        }
        public SecurityGroupIdSetsAfterTransition getSecurityGroupIdSetsAfterTransition() {
            return this.securityGroupIdSetsAfterTransition;
        }

        public MigrationInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public MigrationInstance setTags(Tags tags) {
            this.tags = tags;
            return this;
        }
        public Tags getTags() {
            return this.tags;
        }

        public MigrationInstance setTargetVSwitchId(String targetVSwitchId) {
            this.targetVSwitchId = targetVSwitchId;
            return this;
        }
        public String getTargetVSwitchId() {
            return this.targetVSwitchId;
        }

        public MigrationInstance setTargetVpcId(String targetVpcId) {
            this.targetVpcId = targetVpcId;
            return this;
        }
        public String getTargetVpcId() {
            return this.targetVpcId;
        }

        public MigrationInstance setTargetZoneId(String targetZoneId) {
            this.targetZoneId = targetZoneId;
            return this;
        }
        public String getTargetZoneId() {
            return this.targetZoneId;
        }

        public MigrationInstance setTransitionTime(String transitionTime) {
            this.transitionTime = transitionTime;
            return this;
        }
        public String getTransitionTime() {
            return this.transitionTime;
        }

        public MigrationInstance setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class MigrationInstanceSet extends TeaModel {
        @NameInMap("MigrationInstance")
        public java.util.List<MigrationInstance> migrationInstance;

        public static MigrationInstanceSet build(java.util.Map<String, ?> map) throws Exception {
            MigrationInstanceSet self = new MigrationInstanceSet();
            return TeaModel.build(map, self);
        }

        public MigrationInstanceSet setMigrationInstance(java.util.List<MigrationInstance> migrationInstance) {
            this.migrationInstance = migrationInstance;
            return this;
        }
        public java.util.List<MigrationInstance> getMigrationInstance() {
            return this.migrationInstance;
        }

    }

}
