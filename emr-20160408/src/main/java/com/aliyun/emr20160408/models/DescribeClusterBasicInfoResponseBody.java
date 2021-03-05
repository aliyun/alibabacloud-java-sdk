// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DescribeClusterBasicInfoResponseBody extends TeaModel {
    @NameInMap("ClusterInfo")
    public DescribeClusterBasicInfoResponseBodyClusterInfo clusterInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeClusterBasicInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterBasicInfoResponseBody self = new DescribeClusterBasicInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterBasicInfoResponseBody setClusterInfo(DescribeClusterBasicInfoResponseBodyClusterInfo clusterInfo) {
        this.clusterInfo = clusterInfo;
        return this;
    }
    public DescribeClusterBasicInfoResponseBodyClusterInfo getClusterInfo() {
        return this.clusterInfo;
    }

    public DescribeClusterBasicInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeClusterBasicInfoResponseBodyClusterInfoRelateClusterInfo extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("ClusterType")
        public String clusterType;

        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("ClusterId")
        public String clusterId;

        public static DescribeClusterBasicInfoResponseBodyClusterInfoRelateClusterInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterBasicInfoResponseBodyClusterInfoRelateClusterInfo self = new DescribeClusterBasicInfoResponseBodyClusterInfoRelateClusterInfo();
            return TeaModel.build(map, self);
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfoRelateClusterInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfoRelateClusterInfo setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfoRelateClusterInfo setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfoRelateClusterInfo setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

    }

    public static class DescribeClusterBasicInfoResponseBodyClusterInfoFailReason extends TeaModel {
        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMsg")
        public String errorMsg;

        public static DescribeClusterBasicInfoResponseBodyClusterInfoFailReason build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterBasicInfoResponseBodyClusterInfoFailReason self = new DescribeClusterBasicInfoResponseBodyClusterInfoFailReason();
            return TeaModel.build(map, self);
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfoFailReason setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfoFailReason setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfoFailReason setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

    }

    public static class DescribeClusterBasicInfoResponseBodyClusterInfoSoftwareInfoSoftwaresSoftware extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("StartTpe")
        public Integer startTpe;

        @NameInMap("Version")
        public String version;

        @NameInMap("OnlyDisplay")
        public Boolean onlyDisplay;

        @NameInMap("Name")
        public String name;

        public static DescribeClusterBasicInfoResponseBodyClusterInfoSoftwareInfoSoftwaresSoftware build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterBasicInfoResponseBodyClusterInfoSoftwareInfoSoftwaresSoftware self = new DescribeClusterBasicInfoResponseBodyClusterInfoSoftwareInfoSoftwaresSoftware();
            return TeaModel.build(map, self);
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfoSoftwareInfoSoftwaresSoftware setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfoSoftwareInfoSoftwaresSoftware setStartTpe(Integer startTpe) {
            this.startTpe = startTpe;
            return this;
        }
        public Integer getStartTpe() {
            return this.startTpe;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfoSoftwareInfoSoftwaresSoftware setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfoSoftwareInfoSoftwaresSoftware setOnlyDisplay(Boolean onlyDisplay) {
            this.onlyDisplay = onlyDisplay;
            return this;
        }
        public Boolean getOnlyDisplay() {
            return this.onlyDisplay;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfoSoftwareInfoSoftwaresSoftware setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeClusterBasicInfoResponseBodyClusterInfoSoftwareInfoSoftwares extends TeaModel {
        @NameInMap("Software")
        public java.util.List<DescribeClusterBasicInfoResponseBodyClusterInfoSoftwareInfoSoftwaresSoftware> software;

        public static DescribeClusterBasicInfoResponseBodyClusterInfoSoftwareInfoSoftwares build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterBasicInfoResponseBodyClusterInfoSoftwareInfoSoftwares self = new DescribeClusterBasicInfoResponseBodyClusterInfoSoftwareInfoSoftwares();
            return TeaModel.build(map, self);
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfoSoftwareInfoSoftwares setSoftware(java.util.List<DescribeClusterBasicInfoResponseBodyClusterInfoSoftwareInfoSoftwaresSoftware> software) {
            this.software = software;
            return this;
        }
        public java.util.List<DescribeClusterBasicInfoResponseBodyClusterInfoSoftwareInfoSoftwaresSoftware> getSoftware() {
            return this.software;
        }

    }

    public static class DescribeClusterBasicInfoResponseBodyClusterInfoSoftwareInfo extends TeaModel {
        @NameInMap("EmrVer")
        public String emrVer;

        @NameInMap("ClusterType")
        public String clusterType;

        @NameInMap("Softwares")
        public DescribeClusterBasicInfoResponseBodyClusterInfoSoftwareInfoSoftwares softwares;

        public static DescribeClusterBasicInfoResponseBodyClusterInfoSoftwareInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterBasicInfoResponseBodyClusterInfoSoftwareInfo self = new DescribeClusterBasicInfoResponseBodyClusterInfoSoftwareInfo();
            return TeaModel.build(map, self);
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfoSoftwareInfo setEmrVer(String emrVer) {
            this.emrVer = emrVer;
            return this;
        }
        public String getEmrVer() {
            return this.emrVer;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfoSoftwareInfo setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfoSoftwareInfo setSoftwares(DescribeClusterBasicInfoResponseBodyClusterInfoSoftwareInfoSoftwares softwares) {
            this.softwares = softwares;
            return this;
        }
        public DescribeClusterBasicInfoResponseBodyClusterInfoSoftwareInfoSoftwares getSoftwares() {
            return this.softwares;
        }

    }

    public static class DescribeClusterBasicInfoResponseBodyClusterInfoAccessInfoZKLinksZKLink extends TeaModel {
        @NameInMap("Link")
        public String link;

        @NameInMap("Port")
        public String port;

        public static DescribeClusterBasicInfoResponseBodyClusterInfoAccessInfoZKLinksZKLink build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterBasicInfoResponseBodyClusterInfoAccessInfoZKLinksZKLink self = new DescribeClusterBasicInfoResponseBodyClusterInfoAccessInfoZKLinksZKLink();
            return TeaModel.build(map, self);
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfoAccessInfoZKLinksZKLink setLink(String link) {
            this.link = link;
            return this;
        }
        public String getLink() {
            return this.link;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfoAccessInfoZKLinksZKLink setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

    }

    public static class DescribeClusterBasicInfoResponseBodyClusterInfoAccessInfoZKLinks extends TeaModel {
        @NameInMap("ZKLink")
        public java.util.List<DescribeClusterBasicInfoResponseBodyClusterInfoAccessInfoZKLinksZKLink> ZKLink;

        public static DescribeClusterBasicInfoResponseBodyClusterInfoAccessInfoZKLinks build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterBasicInfoResponseBodyClusterInfoAccessInfoZKLinks self = new DescribeClusterBasicInfoResponseBodyClusterInfoAccessInfoZKLinks();
            return TeaModel.build(map, self);
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfoAccessInfoZKLinks setZKLink(java.util.List<DescribeClusterBasicInfoResponseBodyClusterInfoAccessInfoZKLinksZKLink> ZKLink) {
            this.ZKLink = ZKLink;
            return this;
        }
        public java.util.List<DescribeClusterBasicInfoResponseBodyClusterInfoAccessInfoZKLinksZKLink> getZKLink() {
            return this.ZKLink;
        }

    }

    public static class DescribeClusterBasicInfoResponseBodyClusterInfoAccessInfo extends TeaModel {
        @NameInMap("ZKLinks")
        public DescribeClusterBasicInfoResponseBodyClusterInfoAccessInfoZKLinks ZKLinks;

        public static DescribeClusterBasicInfoResponseBodyClusterInfoAccessInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterBasicInfoResponseBodyClusterInfoAccessInfo self = new DescribeClusterBasicInfoResponseBodyClusterInfoAccessInfo();
            return TeaModel.build(map, self);
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfoAccessInfo setZKLinks(DescribeClusterBasicInfoResponseBodyClusterInfoAccessInfoZKLinks ZKLinks) {
            this.ZKLinks = ZKLinks;
            return this;
        }
        public DescribeClusterBasicInfoResponseBodyClusterInfoAccessInfoZKLinks getZKLinks() {
            return this.ZKLinks;
        }

    }

    public static class DescribeClusterBasicInfoResponseBodyClusterInfoBootstrapActionListBootstrapAction extends TeaModel {
        @NameInMap("Arg")
        public String arg;

        @NameInMap("Path")
        public String path;

        @NameInMap("Name")
        public String name;

        public static DescribeClusterBasicInfoResponseBodyClusterInfoBootstrapActionListBootstrapAction build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterBasicInfoResponseBodyClusterInfoBootstrapActionListBootstrapAction self = new DescribeClusterBasicInfoResponseBodyClusterInfoBootstrapActionListBootstrapAction();
            return TeaModel.build(map, self);
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfoBootstrapActionListBootstrapAction setArg(String arg) {
            this.arg = arg;
            return this;
        }
        public String getArg() {
            return this.arg;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfoBootstrapActionListBootstrapAction setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfoBootstrapActionListBootstrapAction setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeClusterBasicInfoResponseBodyClusterInfoBootstrapActionList extends TeaModel {
        @NameInMap("BootstrapAction")
        public java.util.List<DescribeClusterBasicInfoResponseBodyClusterInfoBootstrapActionListBootstrapAction> bootstrapAction;

        public static DescribeClusterBasicInfoResponseBodyClusterInfoBootstrapActionList build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterBasicInfoResponseBodyClusterInfoBootstrapActionList self = new DescribeClusterBasicInfoResponseBodyClusterInfoBootstrapActionList();
            return TeaModel.build(map, self);
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfoBootstrapActionList setBootstrapAction(java.util.List<DescribeClusterBasicInfoResponseBodyClusterInfoBootstrapActionListBootstrapAction> bootstrapAction) {
            this.bootstrapAction = bootstrapAction;
            return this;
        }
        public java.util.List<DescribeClusterBasicInfoResponseBodyClusterInfoBootstrapActionListBootstrapAction> getBootstrapAction() {
            return this.bootstrapAction;
        }

    }

    public static class DescribeClusterBasicInfoResponseBodyClusterInfoGatewayClusterInfoListGatewayClusterInfo extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("ClusterId")
        public String clusterId;

        public static DescribeClusterBasicInfoResponseBodyClusterInfoGatewayClusterInfoListGatewayClusterInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterBasicInfoResponseBodyClusterInfoGatewayClusterInfoListGatewayClusterInfo self = new DescribeClusterBasicInfoResponseBodyClusterInfoGatewayClusterInfoListGatewayClusterInfo();
            return TeaModel.build(map, self);
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfoGatewayClusterInfoListGatewayClusterInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfoGatewayClusterInfoListGatewayClusterInfo setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfoGatewayClusterInfoListGatewayClusterInfo setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

    }

    public static class DescribeClusterBasicInfoResponseBodyClusterInfoGatewayClusterInfoList extends TeaModel {
        @NameInMap("GatewayClusterInfo")
        public java.util.List<DescribeClusterBasicInfoResponseBodyClusterInfoGatewayClusterInfoListGatewayClusterInfo> gatewayClusterInfo;

        public static DescribeClusterBasicInfoResponseBodyClusterInfoGatewayClusterInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterBasicInfoResponseBodyClusterInfoGatewayClusterInfoList self = new DescribeClusterBasicInfoResponseBodyClusterInfoGatewayClusterInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfoGatewayClusterInfoList setGatewayClusterInfo(java.util.List<DescribeClusterBasicInfoResponseBodyClusterInfoGatewayClusterInfoListGatewayClusterInfo> gatewayClusterInfo) {
            this.gatewayClusterInfo = gatewayClusterInfo;
            return this;
        }
        public java.util.List<DescribeClusterBasicInfoResponseBodyClusterInfoGatewayClusterInfoListGatewayClusterInfo> getGatewayClusterInfo() {
            return this.gatewayClusterInfo;
        }

    }

    public static class DescribeClusterBasicInfoResponseBodyClusterInfoHostPoolInfo extends TeaModel {
        @NameInMap("HpBizId")
        public String hpBizId;

        @NameInMap("HpName")
        public String hpName;

        public static DescribeClusterBasicInfoResponseBodyClusterInfoHostPoolInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterBasicInfoResponseBodyClusterInfoHostPoolInfo self = new DescribeClusterBasicInfoResponseBodyClusterInfoHostPoolInfo();
            return TeaModel.build(map, self);
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfoHostPoolInfo setHpBizId(String hpBizId) {
            this.hpBizId = hpBizId;
            return this;
        }
        public String getHpBizId() {
            return this.hpBizId;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfoHostPoolInfo setHpName(String hpName) {
            this.hpName = hpName;
            return this;
        }
        public String getHpName() {
            return this.hpName;
        }

    }

    public static class DescribeClusterBasicInfoResponseBodyClusterInfo extends TeaModel {
        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("LogEnable")
        public Boolean logEnable;

        @NameInMap("TaskNodeInService")
        public Integer taskNodeInService;

        @NameInMap("AutoScalingSpotWithLimitAllowed")
        public Boolean autoScalingSpotWithLimitAllowed;

        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("StopTime")
        public Long stopTime;

        @NameInMap("CreateType")
        public String createType;

        @NameInMap("DepositType")
        public String depositType;

        @NameInMap("RelateClusterInfo")
        public DescribeClusterBasicInfoResponseBodyClusterInfoRelateClusterInfo relateClusterInfo;

        @NameInMap("RelateClusterId")
        public String relateClusterId;

        @NameInMap("SecurityGroupName")
        public String securityGroupName;

        @NameInMap("ResizeDiskEnable")
        public Boolean resizeDiskEnable;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("FailReason")
        public DescribeClusterBasicInfoResponseBodyClusterInfoFailReason failReason;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("UserDefinedEmrEcsRole")
        public String userDefinedEmrEcsRole;

        @NameInMap("MetaStoreType")
        public String metaStoreType;

        @NameInMap("SoftwareInfo")
        public DescribeClusterBasicInfoResponseBodyClusterInfoSoftwareInfo softwareInfo;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Configurations")
        public String configurations;

        @NameInMap("LogPath")
        public String logPath;

        @NameInMap("AutoScalingVersion")
        public String autoScalingVersion;

        @NameInMap("NetType")
        public String netType;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("AccessInfo")
        public DescribeClusterBasicInfoResponseBodyClusterInfoAccessInfo accessInfo;

        @NameInMap("CreateResource")
        public String createResource;

        @NameInMap("Status")
        public String status;

        @NameInMap("RunningTime")
        public Integer runningTime;

        @NameInMap("HighAvailabilityEnable")
        public Boolean highAvailabilityEnable;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("AutoScalingAllowed")
        public Boolean autoScalingAllowed;

        @NameInMap("MasterNodeInService")
        public Integer masterNodeInService;

        @NameInMap("AutoScalingEnable")
        public Boolean autoScalingEnable;

        @NameInMap("OperationId")
        public String operationId;

        @NameInMap("AutoScalingWithGraceAllowed")
        public Boolean autoScalingWithGraceAllowed;

        @NameInMap("ShowSoftwareInterface")
        public Boolean showSoftwareInterface;

        @NameInMap("CoreNodeInService")
        public Integer coreNodeInService;

        @NameInMap("AutoScalingByLoadAllowed")
        public Boolean autoScalingByLoadAllowed;

        @NameInMap("K8sClusterId")
        public String k8sClusterId;

        @NameInMap("LocalMetaDb")
        public Boolean localMetaDb;

        @NameInMap("BootstrapActionList")
        public DescribeClusterBasicInfoResponseBodyClusterInfoBootstrapActionList bootstrapActionList;

        @NameInMap("GatewayClusterInfoList")
        public DescribeClusterBasicInfoResponseBodyClusterInfoGatewayClusterInfoList gatewayClusterInfoList;

        @NameInMap("InstanceGeneration")
        public String instanceGeneration;

        @NameInMap("Name")
        public String name;

        @NameInMap("EasEnable")
        public Boolean easEnable;

        @NameInMap("MachineType")
        public String machineType;

        @NameInMap("HostPoolInfo")
        public DescribeClusterBasicInfoResponseBodyClusterInfoHostPoolInfo hostPoolInfo;

        @NameInMap("MasterNodeTotal")
        public Integer masterNodeTotal;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Period")
        public Integer period;

        @NameInMap("ExtraInfo")
        public String extraInfo;

        @NameInMap("IoOptimized")
        public Boolean ioOptimized;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("ExpiredTime")
        public Long expiredTime;

        @NameInMap("CoreNodeTotal")
        public Integer coreNodeTotal;

        @NameInMap("GatewayClusterIds")
        public String gatewayClusterIds;

        @NameInMap("BootstrapFailed")
        public Boolean bootstrapFailed;

        @NameInMap("TaskNodeTotal")
        public Integer taskNodeTotal;

        public static DescribeClusterBasicInfoResponseBodyClusterInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterBasicInfoResponseBodyClusterInfo self = new DescribeClusterBasicInfoResponseBodyClusterInfo();
            return TeaModel.build(map, self);
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setLogEnable(Boolean logEnable) {
            this.logEnable = logEnable;
            return this;
        }
        public Boolean getLogEnable() {
            return this.logEnable;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setTaskNodeInService(Integer taskNodeInService) {
            this.taskNodeInService = taskNodeInService;
            return this;
        }
        public Integer getTaskNodeInService() {
            return this.taskNodeInService;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setAutoScalingSpotWithLimitAllowed(Boolean autoScalingSpotWithLimitAllowed) {
            this.autoScalingSpotWithLimitAllowed = autoScalingSpotWithLimitAllowed;
            return this;
        }
        public Boolean getAutoScalingSpotWithLimitAllowed() {
            return this.autoScalingSpotWithLimitAllowed;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setStopTime(Long stopTime) {
            this.stopTime = stopTime;
            return this;
        }
        public Long getStopTime() {
            return this.stopTime;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setCreateType(String createType) {
            this.createType = createType;
            return this;
        }
        public String getCreateType() {
            return this.createType;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setDepositType(String depositType) {
            this.depositType = depositType;
            return this;
        }
        public String getDepositType() {
            return this.depositType;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setRelateClusterInfo(DescribeClusterBasicInfoResponseBodyClusterInfoRelateClusterInfo relateClusterInfo) {
            this.relateClusterInfo = relateClusterInfo;
            return this;
        }
        public DescribeClusterBasicInfoResponseBodyClusterInfoRelateClusterInfo getRelateClusterInfo() {
            return this.relateClusterInfo;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setRelateClusterId(String relateClusterId) {
            this.relateClusterId = relateClusterId;
            return this;
        }
        public String getRelateClusterId() {
            return this.relateClusterId;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setSecurityGroupName(String securityGroupName) {
            this.securityGroupName = securityGroupName;
            return this;
        }
        public String getSecurityGroupName() {
            return this.securityGroupName;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setResizeDiskEnable(Boolean resizeDiskEnable) {
            this.resizeDiskEnable = resizeDiskEnable;
            return this;
        }
        public Boolean getResizeDiskEnable() {
            return this.resizeDiskEnable;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setFailReason(DescribeClusterBasicInfoResponseBodyClusterInfoFailReason failReason) {
            this.failReason = failReason;
            return this;
        }
        public DescribeClusterBasicInfoResponseBodyClusterInfoFailReason getFailReason() {
            return this.failReason;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setUserDefinedEmrEcsRole(String userDefinedEmrEcsRole) {
            this.userDefinedEmrEcsRole = userDefinedEmrEcsRole;
            return this;
        }
        public String getUserDefinedEmrEcsRole() {
            return this.userDefinedEmrEcsRole;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setMetaStoreType(String metaStoreType) {
            this.metaStoreType = metaStoreType;
            return this;
        }
        public String getMetaStoreType() {
            return this.metaStoreType;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setSoftwareInfo(DescribeClusterBasicInfoResponseBodyClusterInfoSoftwareInfo softwareInfo) {
            this.softwareInfo = softwareInfo;
            return this;
        }
        public DescribeClusterBasicInfoResponseBodyClusterInfoSoftwareInfo getSoftwareInfo() {
            return this.softwareInfo;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setConfigurations(String configurations) {
            this.configurations = configurations;
            return this;
        }
        public String getConfigurations() {
            return this.configurations;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setLogPath(String logPath) {
            this.logPath = logPath;
            return this;
        }
        public String getLogPath() {
            return this.logPath;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setAutoScalingVersion(String autoScalingVersion) {
            this.autoScalingVersion = autoScalingVersion;
            return this;
        }
        public String getAutoScalingVersion() {
            return this.autoScalingVersion;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setAccessInfo(DescribeClusterBasicInfoResponseBodyClusterInfoAccessInfo accessInfo) {
            this.accessInfo = accessInfo;
            return this;
        }
        public DescribeClusterBasicInfoResponseBodyClusterInfoAccessInfo getAccessInfo() {
            return this.accessInfo;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setCreateResource(String createResource) {
            this.createResource = createResource;
            return this;
        }
        public String getCreateResource() {
            return this.createResource;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setRunningTime(Integer runningTime) {
            this.runningTime = runningTime;
            return this;
        }
        public Integer getRunningTime() {
            return this.runningTime;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setHighAvailabilityEnable(Boolean highAvailabilityEnable) {
            this.highAvailabilityEnable = highAvailabilityEnable;
            return this;
        }
        public Boolean getHighAvailabilityEnable() {
            return this.highAvailabilityEnable;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setAutoScalingAllowed(Boolean autoScalingAllowed) {
            this.autoScalingAllowed = autoScalingAllowed;
            return this;
        }
        public Boolean getAutoScalingAllowed() {
            return this.autoScalingAllowed;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setMasterNodeInService(Integer masterNodeInService) {
            this.masterNodeInService = masterNodeInService;
            return this;
        }
        public Integer getMasterNodeInService() {
            return this.masterNodeInService;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setAutoScalingEnable(Boolean autoScalingEnable) {
            this.autoScalingEnable = autoScalingEnable;
            return this;
        }
        public Boolean getAutoScalingEnable() {
            return this.autoScalingEnable;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setOperationId(String operationId) {
            this.operationId = operationId;
            return this;
        }
        public String getOperationId() {
            return this.operationId;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setAutoScalingWithGraceAllowed(Boolean autoScalingWithGraceAllowed) {
            this.autoScalingWithGraceAllowed = autoScalingWithGraceAllowed;
            return this;
        }
        public Boolean getAutoScalingWithGraceAllowed() {
            return this.autoScalingWithGraceAllowed;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setShowSoftwareInterface(Boolean showSoftwareInterface) {
            this.showSoftwareInterface = showSoftwareInterface;
            return this;
        }
        public Boolean getShowSoftwareInterface() {
            return this.showSoftwareInterface;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setCoreNodeInService(Integer coreNodeInService) {
            this.coreNodeInService = coreNodeInService;
            return this;
        }
        public Integer getCoreNodeInService() {
            return this.coreNodeInService;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setAutoScalingByLoadAllowed(Boolean autoScalingByLoadAllowed) {
            this.autoScalingByLoadAllowed = autoScalingByLoadAllowed;
            return this;
        }
        public Boolean getAutoScalingByLoadAllowed() {
            return this.autoScalingByLoadAllowed;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setK8sClusterId(String k8sClusterId) {
            this.k8sClusterId = k8sClusterId;
            return this;
        }
        public String getK8sClusterId() {
            return this.k8sClusterId;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setLocalMetaDb(Boolean localMetaDb) {
            this.localMetaDb = localMetaDb;
            return this;
        }
        public Boolean getLocalMetaDb() {
            return this.localMetaDb;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setBootstrapActionList(DescribeClusterBasicInfoResponseBodyClusterInfoBootstrapActionList bootstrapActionList) {
            this.bootstrapActionList = bootstrapActionList;
            return this;
        }
        public DescribeClusterBasicInfoResponseBodyClusterInfoBootstrapActionList getBootstrapActionList() {
            return this.bootstrapActionList;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setGatewayClusterInfoList(DescribeClusterBasicInfoResponseBodyClusterInfoGatewayClusterInfoList gatewayClusterInfoList) {
            this.gatewayClusterInfoList = gatewayClusterInfoList;
            return this;
        }
        public DescribeClusterBasicInfoResponseBodyClusterInfoGatewayClusterInfoList getGatewayClusterInfoList() {
            return this.gatewayClusterInfoList;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setInstanceGeneration(String instanceGeneration) {
            this.instanceGeneration = instanceGeneration;
            return this;
        }
        public String getInstanceGeneration() {
            return this.instanceGeneration;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setEasEnable(Boolean easEnable) {
            this.easEnable = easEnable;
            return this;
        }
        public Boolean getEasEnable() {
            return this.easEnable;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setMachineType(String machineType) {
            this.machineType = machineType;
            return this;
        }
        public String getMachineType() {
            return this.machineType;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setHostPoolInfo(DescribeClusterBasicInfoResponseBodyClusterInfoHostPoolInfo hostPoolInfo) {
            this.hostPoolInfo = hostPoolInfo;
            return this;
        }
        public DescribeClusterBasicInfoResponseBodyClusterInfoHostPoolInfo getHostPoolInfo() {
            return this.hostPoolInfo;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setMasterNodeTotal(Integer masterNodeTotal) {
            this.masterNodeTotal = masterNodeTotal;
            return this;
        }
        public Integer getMasterNodeTotal() {
            return this.masterNodeTotal;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setExtraInfo(String extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public String getExtraInfo() {
            return this.extraInfo;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setIoOptimized(Boolean ioOptimized) {
            this.ioOptimized = ioOptimized;
            return this;
        }
        public Boolean getIoOptimized() {
            return this.ioOptimized;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setExpiredTime(Long expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public Long getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setCoreNodeTotal(Integer coreNodeTotal) {
            this.coreNodeTotal = coreNodeTotal;
            return this;
        }
        public Integer getCoreNodeTotal() {
            return this.coreNodeTotal;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setGatewayClusterIds(String gatewayClusterIds) {
            this.gatewayClusterIds = gatewayClusterIds;
            return this;
        }
        public String getGatewayClusterIds() {
            return this.gatewayClusterIds;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setBootstrapFailed(Boolean bootstrapFailed) {
            this.bootstrapFailed = bootstrapFailed;
            return this;
        }
        public Boolean getBootstrapFailed() {
            return this.bootstrapFailed;
        }

        public DescribeClusterBasicInfoResponseBodyClusterInfo setTaskNodeTotal(Integer taskNodeTotal) {
            this.taskNodeTotal = taskNodeTotal;
            return this;
        }
        public Integer getTaskNodeTotal() {
            return this.taskNodeTotal;
        }

    }

}
