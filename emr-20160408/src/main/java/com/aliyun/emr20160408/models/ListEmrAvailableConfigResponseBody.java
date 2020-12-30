// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListEmrAvailableConfigResponseBody extends TeaModel {
    @NameInMap("SecurityGroupList")
    public ListEmrAvailableConfigResponseBodySecurityGroupList securityGroupList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("KeyPairNameList")
    public ListEmrAvailableConfigResponseBodyKeyPairNameList keyPairNameList;

    @NameInMap("VpcInfoList")
    public ListEmrAvailableConfigResponseBodyVpcInfoList vpcInfoList;

    @NameInMap("EmrMainVersionList")
    public ListEmrAvailableConfigResponseBodyEmrMainVersionList emrMainVersionList;

    public static ListEmrAvailableConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEmrAvailableConfigResponseBody self = new ListEmrAvailableConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEmrAvailableConfigResponseBody setSecurityGroupList(ListEmrAvailableConfigResponseBodySecurityGroupList securityGroupList) {
        this.securityGroupList = securityGroupList;
        return this;
    }
    public ListEmrAvailableConfigResponseBodySecurityGroupList getSecurityGroupList() {
        return this.securityGroupList;
    }

    public ListEmrAvailableConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEmrAvailableConfigResponseBody setKeyPairNameList(ListEmrAvailableConfigResponseBodyKeyPairNameList keyPairNameList) {
        this.keyPairNameList = keyPairNameList;
        return this;
    }
    public ListEmrAvailableConfigResponseBodyKeyPairNameList getKeyPairNameList() {
        return this.keyPairNameList;
    }

    public ListEmrAvailableConfigResponseBody setVpcInfoList(ListEmrAvailableConfigResponseBodyVpcInfoList vpcInfoList) {
        this.vpcInfoList = vpcInfoList;
        return this;
    }
    public ListEmrAvailableConfigResponseBodyVpcInfoList getVpcInfoList() {
        return this.vpcInfoList;
    }

    public ListEmrAvailableConfigResponseBody setEmrMainVersionList(ListEmrAvailableConfigResponseBodyEmrMainVersionList emrMainVersionList) {
        this.emrMainVersionList = emrMainVersionList;
        return this;
    }
    public ListEmrAvailableConfigResponseBodyEmrMainVersionList getEmrMainVersionList() {
        return this.emrMainVersionList;
    }

    public static class ListEmrAvailableConfigResponseBodySecurityGroupListSecurityGroup extends TeaModel {
        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("SecurityGroupName")
        public String securityGroupName;

        @NameInMap("EcsCount")
        public Integer ecsCount;

        @NameInMap("SecurityGroupType")
        public String securityGroupType;

        @NameInMap("AvailableInstanceAmount")
        public Integer availableInstanceAmount;

        public static ListEmrAvailableConfigResponseBodySecurityGroupListSecurityGroup build(java.util.Map<String, ?> map) throws Exception {
            ListEmrAvailableConfigResponseBodySecurityGroupListSecurityGroup self = new ListEmrAvailableConfigResponseBodySecurityGroupListSecurityGroup();
            return TeaModel.build(map, self);
        }

        public ListEmrAvailableConfigResponseBodySecurityGroupListSecurityGroup setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListEmrAvailableConfigResponseBodySecurityGroupListSecurityGroup setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListEmrAvailableConfigResponseBodySecurityGroupListSecurityGroup setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListEmrAvailableConfigResponseBodySecurityGroupListSecurityGroup setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public ListEmrAvailableConfigResponseBodySecurityGroupListSecurityGroup setSecurityGroupName(String securityGroupName) {
            this.securityGroupName = securityGroupName;
            return this;
        }
        public String getSecurityGroupName() {
            return this.securityGroupName;
        }

        public ListEmrAvailableConfigResponseBodySecurityGroupListSecurityGroup setEcsCount(Integer ecsCount) {
            this.ecsCount = ecsCount;
            return this;
        }
        public Integer getEcsCount() {
            return this.ecsCount;
        }

        public ListEmrAvailableConfigResponseBodySecurityGroupListSecurityGroup setSecurityGroupType(String securityGroupType) {
            this.securityGroupType = securityGroupType;
            return this;
        }
        public String getSecurityGroupType() {
            return this.securityGroupType;
        }

        public ListEmrAvailableConfigResponseBodySecurityGroupListSecurityGroup setAvailableInstanceAmount(Integer availableInstanceAmount) {
            this.availableInstanceAmount = availableInstanceAmount;
            return this;
        }
        public Integer getAvailableInstanceAmount() {
            return this.availableInstanceAmount;
        }

    }

    public static class ListEmrAvailableConfigResponseBodySecurityGroupList extends TeaModel {
        @NameInMap("SecurityGroup")
        public java.util.List<ListEmrAvailableConfigResponseBodySecurityGroupListSecurityGroup> securityGroup;

        public static ListEmrAvailableConfigResponseBodySecurityGroupList build(java.util.Map<String, ?> map) throws Exception {
            ListEmrAvailableConfigResponseBodySecurityGroupList self = new ListEmrAvailableConfigResponseBodySecurityGroupList();
            return TeaModel.build(map, self);
        }

        public ListEmrAvailableConfigResponseBodySecurityGroupList setSecurityGroup(java.util.List<ListEmrAvailableConfigResponseBodySecurityGroupListSecurityGroup> securityGroup) {
            this.securityGroup = securityGroup;
            return this;
        }
        public java.util.List<ListEmrAvailableConfigResponseBodySecurityGroupListSecurityGroup> getSecurityGroup() {
            return this.securityGroup;
        }

    }

    public static class ListEmrAvailableConfigResponseBodyKeyPairNameList extends TeaModel {
        @NameInMap("KeyPairName")
        public java.util.List<String> keyPairName;

        public static ListEmrAvailableConfigResponseBodyKeyPairNameList build(java.util.Map<String, ?> map) throws Exception {
            ListEmrAvailableConfigResponseBodyKeyPairNameList self = new ListEmrAvailableConfigResponseBodyKeyPairNameList();
            return TeaModel.build(map, self);
        }

        public ListEmrAvailableConfigResponseBodyKeyPairNameList setKeyPairName(java.util.List<String> keyPairName) {
            this.keyPairName = keyPairName;
            return this;
        }
        public java.util.List<String> getKeyPairName() {
            return this.keyPairName;
        }

    }

    public static class ListEmrAvailableConfigResponseBodyVpcInfoListVpcInfoVswitchInfoListVswitchInfo extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("CidrBlock")
        public String cidrBlock;

        @NameInMap("Description")
        public String description;

        @NameInMap("VswitchId")
        public String vswitchId;

        @NameInMap("VswitchName")
        public String vswitchName;

        @NameInMap("AvailableIpAddressCount")
        public Long availableIpAddressCount;

        @NameInMap("ZoneId")
        public String zoneId;

        public static ListEmrAvailableConfigResponseBodyVpcInfoListVpcInfoVswitchInfoListVswitchInfo build(java.util.Map<String, ?> map) throws Exception {
            ListEmrAvailableConfigResponseBodyVpcInfoListVpcInfoVswitchInfoListVswitchInfo self = new ListEmrAvailableConfigResponseBodyVpcInfoListVpcInfoVswitchInfoListVswitchInfo();
            return TeaModel.build(map, self);
        }

        public ListEmrAvailableConfigResponseBodyVpcInfoListVpcInfoVswitchInfoListVswitchInfo setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListEmrAvailableConfigResponseBodyVpcInfoListVpcInfoVswitchInfoListVswitchInfo setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListEmrAvailableConfigResponseBodyVpcInfoListVpcInfoVswitchInfoListVswitchInfo setCidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        public ListEmrAvailableConfigResponseBodyVpcInfoListVpcInfoVswitchInfoListVswitchInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListEmrAvailableConfigResponseBodyVpcInfoListVpcInfoVswitchInfoListVswitchInfo setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

        public ListEmrAvailableConfigResponseBodyVpcInfoListVpcInfoVswitchInfoListVswitchInfo setVswitchName(String vswitchName) {
            this.vswitchName = vswitchName;
            return this;
        }
        public String getVswitchName() {
            return this.vswitchName;
        }

        public ListEmrAvailableConfigResponseBodyVpcInfoListVpcInfoVswitchInfoListVswitchInfo setAvailableIpAddressCount(Long availableIpAddressCount) {
            this.availableIpAddressCount = availableIpAddressCount;
            return this;
        }
        public Long getAvailableIpAddressCount() {
            return this.availableIpAddressCount;
        }

        public ListEmrAvailableConfigResponseBodyVpcInfoListVpcInfoVswitchInfoListVswitchInfo setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class ListEmrAvailableConfigResponseBodyVpcInfoListVpcInfoVswitchInfoList extends TeaModel {
        @NameInMap("VswitchInfo")
        public java.util.List<ListEmrAvailableConfigResponseBodyVpcInfoListVpcInfoVswitchInfoListVswitchInfo> vswitchInfo;

        public static ListEmrAvailableConfigResponseBodyVpcInfoListVpcInfoVswitchInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListEmrAvailableConfigResponseBodyVpcInfoListVpcInfoVswitchInfoList self = new ListEmrAvailableConfigResponseBodyVpcInfoListVpcInfoVswitchInfoList();
            return TeaModel.build(map, self);
        }

        public ListEmrAvailableConfigResponseBodyVpcInfoListVpcInfoVswitchInfoList setVswitchInfo(java.util.List<ListEmrAvailableConfigResponseBodyVpcInfoListVpcInfoVswitchInfoListVswitchInfo> vswitchInfo) {
            this.vswitchInfo = vswitchInfo;
            return this;
        }
        public java.util.List<ListEmrAvailableConfigResponseBodyVpcInfoListVpcInfoVswitchInfoListVswitchInfo> getVswitchInfo() {
            return this.vswitchInfo;
        }

    }

    public static class ListEmrAvailableConfigResponseBodyVpcInfoListVpcInfo extends TeaModel {
        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VpcName")
        public String vpcName;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("VRouterId")
        public String VRouterId;

        @NameInMap("CidrBlock")
        public String cidrBlock;

        @NameInMap("Description")
        public String description;

        @NameInMap("VswitchInfoList")
        public ListEmrAvailableConfigResponseBodyVpcInfoListVpcInfoVswitchInfoList vswitchInfoList;

        public static ListEmrAvailableConfigResponseBodyVpcInfoListVpcInfo build(java.util.Map<String, ?> map) throws Exception {
            ListEmrAvailableConfigResponseBodyVpcInfoListVpcInfo self = new ListEmrAvailableConfigResponseBodyVpcInfoListVpcInfo();
            return TeaModel.build(map, self);
        }

        public ListEmrAvailableConfigResponseBodyVpcInfoListVpcInfo setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListEmrAvailableConfigResponseBodyVpcInfoListVpcInfo setVpcName(String vpcName) {
            this.vpcName = vpcName;
            return this;
        }
        public String getVpcName() {
            return this.vpcName;
        }

        public ListEmrAvailableConfigResponseBodyVpcInfoListVpcInfo setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListEmrAvailableConfigResponseBodyVpcInfoListVpcInfo setVRouterId(String VRouterId) {
            this.VRouterId = VRouterId;
            return this;
        }
        public String getVRouterId() {
            return this.VRouterId;
        }

        public ListEmrAvailableConfigResponseBodyVpcInfoListVpcInfo setCidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        public ListEmrAvailableConfigResponseBodyVpcInfoListVpcInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListEmrAvailableConfigResponseBodyVpcInfoListVpcInfo setVswitchInfoList(ListEmrAvailableConfigResponseBodyVpcInfoListVpcInfoVswitchInfoList vswitchInfoList) {
            this.vswitchInfoList = vswitchInfoList;
            return this;
        }
        public ListEmrAvailableConfigResponseBodyVpcInfoListVpcInfoVswitchInfoList getVswitchInfoList() {
            return this.vswitchInfoList;
        }

    }

    public static class ListEmrAvailableConfigResponseBodyVpcInfoList extends TeaModel {
        @NameInMap("VpcInfo")
        public java.util.List<ListEmrAvailableConfigResponseBodyVpcInfoListVpcInfo> vpcInfo;

        public static ListEmrAvailableConfigResponseBodyVpcInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListEmrAvailableConfigResponseBodyVpcInfoList self = new ListEmrAvailableConfigResponseBodyVpcInfoList();
            return TeaModel.build(map, self);
        }

        public ListEmrAvailableConfigResponseBodyVpcInfoList setVpcInfo(java.util.List<ListEmrAvailableConfigResponseBodyVpcInfoListVpcInfo> vpcInfo) {
            this.vpcInfo = vpcInfo;
            return this;
        }
        public java.util.List<ListEmrAvailableConfigResponseBodyVpcInfoListVpcInfo> getVpcInfo() {
            return this.vpcInfo;
        }

    }

    public static class ListEmrAvailableConfigResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoListClusterTypeInfoClusterServiceInfoListClusterServiceInfo extends TeaModel {
        @NameInMap("ServiceDisplayName")
        public String serviceDisplayName;

        @NameInMap("ServiceVersion")
        public String serviceVersion;

        @NameInMap("Mandatory")
        public Boolean mandatory;

        @NameInMap("ServiceName")
        public String serviceName;

        public static ListEmrAvailableConfigResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoListClusterTypeInfoClusterServiceInfoListClusterServiceInfo build(java.util.Map<String, ?> map) throws Exception {
            ListEmrAvailableConfigResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoListClusterTypeInfoClusterServiceInfoListClusterServiceInfo self = new ListEmrAvailableConfigResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoListClusterTypeInfoClusterServiceInfoListClusterServiceInfo();
            return TeaModel.build(map, self);
        }

        public ListEmrAvailableConfigResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoListClusterTypeInfoClusterServiceInfoListClusterServiceInfo setServiceDisplayName(String serviceDisplayName) {
            this.serviceDisplayName = serviceDisplayName;
            return this;
        }
        public String getServiceDisplayName() {
            return this.serviceDisplayName;
        }

        public ListEmrAvailableConfigResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoListClusterTypeInfoClusterServiceInfoListClusterServiceInfo setServiceVersion(String serviceVersion) {
            this.serviceVersion = serviceVersion;
            return this;
        }
        public String getServiceVersion() {
            return this.serviceVersion;
        }

        public ListEmrAvailableConfigResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoListClusterTypeInfoClusterServiceInfoListClusterServiceInfo setMandatory(Boolean mandatory) {
            this.mandatory = mandatory;
            return this;
        }
        public Boolean getMandatory() {
            return this.mandatory;
        }

        public ListEmrAvailableConfigResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoListClusterTypeInfoClusterServiceInfoListClusterServiceInfo setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

    }

    public static class ListEmrAvailableConfigResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoListClusterTypeInfoClusterServiceInfoList extends TeaModel {
        @NameInMap("ClusterServiceInfo")
        public java.util.List<ListEmrAvailableConfigResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoListClusterTypeInfoClusterServiceInfoListClusterServiceInfo> clusterServiceInfo;

        public static ListEmrAvailableConfigResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoListClusterTypeInfoClusterServiceInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListEmrAvailableConfigResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoListClusterTypeInfoClusterServiceInfoList self = new ListEmrAvailableConfigResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoListClusterTypeInfoClusterServiceInfoList();
            return TeaModel.build(map, self);
        }

        public ListEmrAvailableConfigResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoListClusterTypeInfoClusterServiceInfoList setClusterServiceInfo(java.util.List<ListEmrAvailableConfigResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoListClusterTypeInfoClusterServiceInfoListClusterServiceInfo> clusterServiceInfo) {
            this.clusterServiceInfo = clusterServiceInfo;
            return this;
        }
        public java.util.List<ListEmrAvailableConfigResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoListClusterTypeInfoClusterServiceInfoListClusterServiceInfo> getClusterServiceInfo() {
            return this.clusterServiceInfo;
        }

    }

    public static class ListEmrAvailableConfigResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoListClusterTypeInfo extends TeaModel {
        @NameInMap("ClusterType")
        public String clusterType;

        @NameInMap("ClusterServiceInfoList")
        public ListEmrAvailableConfigResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoListClusterTypeInfoClusterServiceInfoList clusterServiceInfoList;

        public static ListEmrAvailableConfigResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoListClusterTypeInfo build(java.util.Map<String, ?> map) throws Exception {
            ListEmrAvailableConfigResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoListClusterTypeInfo self = new ListEmrAvailableConfigResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoListClusterTypeInfo();
            return TeaModel.build(map, self);
        }

        public ListEmrAvailableConfigResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoListClusterTypeInfo setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public ListEmrAvailableConfigResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoListClusterTypeInfo setClusterServiceInfoList(ListEmrAvailableConfigResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoListClusterTypeInfoClusterServiceInfoList clusterServiceInfoList) {
            this.clusterServiceInfoList = clusterServiceInfoList;
            return this;
        }
        public ListEmrAvailableConfigResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoListClusterTypeInfoClusterServiceInfoList getClusterServiceInfoList() {
            return this.clusterServiceInfoList;
        }

    }

    public static class ListEmrAvailableConfigResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoList extends TeaModel {
        @NameInMap("ClusterTypeInfo")
        public java.util.List<ListEmrAvailableConfigResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoListClusterTypeInfo> clusterTypeInfo;

        public static ListEmrAvailableConfigResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListEmrAvailableConfigResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoList self = new ListEmrAvailableConfigResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoList();
            return TeaModel.build(map, self);
        }

        public ListEmrAvailableConfigResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoList setClusterTypeInfo(java.util.List<ListEmrAvailableConfigResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoListClusterTypeInfo> clusterTypeInfo) {
            this.clusterTypeInfo = clusterTypeInfo;
            return this;
        }
        public java.util.List<ListEmrAvailableConfigResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoListClusterTypeInfo> getClusterTypeInfo() {
            return this.clusterTypeInfo;
        }

    }

    public static class ListEmrAvailableConfigResponseBodyEmrMainVersionListEmrMainVersion extends TeaModel {
        @NameInMap("OnCloudNative")
        public Boolean onCloudNative;

        @NameInMap("ExtraInfo")
        public String extraInfo;

        @NameInMap("ClusterTypeInfoList")
        public ListEmrAvailableConfigResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoList clusterTypeInfoList;

        @NameInMap("PublishType")
        public String publishType;

        @NameInMap("StackVersion")
        public String stackVersion;

        @NameInMap("StackName")
        public String stackName;

        @NameInMap("EcmVersion")
        public Boolean ecmVersion;

        @NameInMap("MainVersionName")
        public String mainVersionName;

        @NameInMap("RegionId")
        public String regionId;

        public static ListEmrAvailableConfigResponseBodyEmrMainVersionListEmrMainVersion build(java.util.Map<String, ?> map) throws Exception {
            ListEmrAvailableConfigResponseBodyEmrMainVersionListEmrMainVersion self = new ListEmrAvailableConfigResponseBodyEmrMainVersionListEmrMainVersion();
            return TeaModel.build(map, self);
        }

        public ListEmrAvailableConfigResponseBodyEmrMainVersionListEmrMainVersion setOnCloudNative(Boolean onCloudNative) {
            this.onCloudNative = onCloudNative;
            return this;
        }
        public Boolean getOnCloudNative() {
            return this.onCloudNative;
        }

        public ListEmrAvailableConfigResponseBodyEmrMainVersionListEmrMainVersion setExtraInfo(String extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public String getExtraInfo() {
            return this.extraInfo;
        }

        public ListEmrAvailableConfigResponseBodyEmrMainVersionListEmrMainVersion setClusterTypeInfoList(ListEmrAvailableConfigResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoList clusterTypeInfoList) {
            this.clusterTypeInfoList = clusterTypeInfoList;
            return this;
        }
        public ListEmrAvailableConfigResponseBodyEmrMainVersionListEmrMainVersionClusterTypeInfoList getClusterTypeInfoList() {
            return this.clusterTypeInfoList;
        }

        public ListEmrAvailableConfigResponseBodyEmrMainVersionListEmrMainVersion setPublishType(String publishType) {
            this.publishType = publishType;
            return this;
        }
        public String getPublishType() {
            return this.publishType;
        }

        public ListEmrAvailableConfigResponseBodyEmrMainVersionListEmrMainVersion setStackVersion(String stackVersion) {
            this.stackVersion = stackVersion;
            return this;
        }
        public String getStackVersion() {
            return this.stackVersion;
        }

        public ListEmrAvailableConfigResponseBodyEmrMainVersionListEmrMainVersion setStackName(String stackName) {
            this.stackName = stackName;
            return this;
        }
        public String getStackName() {
            return this.stackName;
        }

        public ListEmrAvailableConfigResponseBodyEmrMainVersionListEmrMainVersion setEcmVersion(Boolean ecmVersion) {
            this.ecmVersion = ecmVersion;
            return this;
        }
        public Boolean getEcmVersion() {
            return this.ecmVersion;
        }

        public ListEmrAvailableConfigResponseBodyEmrMainVersionListEmrMainVersion setMainVersionName(String mainVersionName) {
            this.mainVersionName = mainVersionName;
            return this;
        }
        public String getMainVersionName() {
            return this.mainVersionName;
        }

        public ListEmrAvailableConfigResponseBodyEmrMainVersionListEmrMainVersion setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class ListEmrAvailableConfigResponseBodyEmrMainVersionList extends TeaModel {
        @NameInMap("EmrMainVersion")
        public java.util.List<ListEmrAvailableConfigResponseBodyEmrMainVersionListEmrMainVersion> emrMainVersion;

        public static ListEmrAvailableConfigResponseBodyEmrMainVersionList build(java.util.Map<String, ?> map) throws Exception {
            ListEmrAvailableConfigResponseBodyEmrMainVersionList self = new ListEmrAvailableConfigResponseBodyEmrMainVersionList();
            return TeaModel.build(map, self);
        }

        public ListEmrAvailableConfigResponseBodyEmrMainVersionList setEmrMainVersion(java.util.List<ListEmrAvailableConfigResponseBodyEmrMainVersionListEmrMainVersion> emrMainVersion) {
            this.emrMainVersion = emrMainVersion;
            return this;
        }
        public java.util.List<ListEmrAvailableConfigResponseBodyEmrMainVersionListEmrMainVersion> getEmrMainVersion() {
            return this.emrMainVersion;
        }

    }

}
