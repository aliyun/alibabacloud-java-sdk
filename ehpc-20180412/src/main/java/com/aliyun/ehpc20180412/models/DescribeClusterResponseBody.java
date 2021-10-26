// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DescribeClusterResponseBody extends TeaModel {
    @NameInMap("ClusterInfo")
    public DescribeClusterResponseBodyClusterInfo clusterInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterResponseBody self = new DescribeClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterResponseBody setClusterInfo(DescribeClusterResponseBodyClusterInfo clusterInfo) {
        this.clusterInfo = clusterInfo;
        return this;
    }
    public DescribeClusterResponseBodyClusterInfo getClusterInfo() {
        return this.clusterInfo;
    }

    public DescribeClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeClusterResponseBodyClusterInfoApplicationsApplicationInfo extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Tag")
        public String tag;

        @NameInMap("Version")
        public String version;

        public static DescribeClusterResponseBodyClusterInfoApplicationsApplicationInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterResponseBodyClusterInfoApplicationsApplicationInfo self = new DescribeClusterResponseBodyClusterInfoApplicationsApplicationInfo();
            return TeaModel.build(map, self);
        }

        public DescribeClusterResponseBodyClusterInfoApplicationsApplicationInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeClusterResponseBodyClusterInfoApplicationsApplicationInfo setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public DescribeClusterResponseBodyClusterInfoApplicationsApplicationInfo setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class DescribeClusterResponseBodyClusterInfoApplications extends TeaModel {
        @NameInMap("ApplicationInfo")
        public java.util.List<DescribeClusterResponseBodyClusterInfoApplicationsApplicationInfo> applicationInfo;

        public static DescribeClusterResponseBodyClusterInfoApplications build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterResponseBodyClusterInfoApplications self = new DescribeClusterResponseBodyClusterInfoApplications();
            return TeaModel.build(map, self);
        }

        public DescribeClusterResponseBodyClusterInfoApplications setApplicationInfo(java.util.List<DescribeClusterResponseBodyClusterInfoApplicationsApplicationInfo> applicationInfo) {
            this.applicationInfo = applicationInfo;
            return this;
        }
        public java.util.List<DescribeClusterResponseBodyClusterInfoApplicationsApplicationInfo> getApplicationInfo() {
            return this.applicationInfo;
        }

    }

    public static class DescribeClusterResponseBodyClusterInfoEcsInfoCompute extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("InstanceType")
        public String instanceType;

        public static DescribeClusterResponseBodyClusterInfoEcsInfoCompute build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterResponseBodyClusterInfoEcsInfoCompute self = new DescribeClusterResponseBodyClusterInfoEcsInfoCompute();
            return TeaModel.build(map, self);
        }

        public DescribeClusterResponseBodyClusterInfoEcsInfoCompute setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeClusterResponseBodyClusterInfoEcsInfoCompute setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

    }

    public static class DescribeClusterResponseBodyClusterInfoEcsInfoLogin extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("InstanceType")
        public String instanceType;

        public static DescribeClusterResponseBodyClusterInfoEcsInfoLogin build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterResponseBodyClusterInfoEcsInfoLogin self = new DescribeClusterResponseBodyClusterInfoEcsInfoLogin();
            return TeaModel.build(map, self);
        }

        public DescribeClusterResponseBodyClusterInfoEcsInfoLogin setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeClusterResponseBodyClusterInfoEcsInfoLogin setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

    }

    public static class DescribeClusterResponseBodyClusterInfoEcsInfoManager extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("InstanceType")
        public String instanceType;

        public static DescribeClusterResponseBodyClusterInfoEcsInfoManager build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterResponseBodyClusterInfoEcsInfoManager self = new DescribeClusterResponseBodyClusterInfoEcsInfoManager();
            return TeaModel.build(map, self);
        }

        public DescribeClusterResponseBodyClusterInfoEcsInfoManager setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeClusterResponseBodyClusterInfoEcsInfoManager setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

    }

    public static class DescribeClusterResponseBodyClusterInfoEcsInfo extends TeaModel {
        @NameInMap("Compute")
        public DescribeClusterResponseBodyClusterInfoEcsInfoCompute compute;

        @NameInMap("Login")
        public DescribeClusterResponseBodyClusterInfoEcsInfoLogin login;

        @NameInMap("Manager")
        public DescribeClusterResponseBodyClusterInfoEcsInfoManager manager;

        public static DescribeClusterResponseBodyClusterInfoEcsInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterResponseBodyClusterInfoEcsInfo self = new DescribeClusterResponseBodyClusterInfoEcsInfo();
            return TeaModel.build(map, self);
        }

        public DescribeClusterResponseBodyClusterInfoEcsInfo setCompute(DescribeClusterResponseBodyClusterInfoEcsInfoCompute compute) {
            this.compute = compute;
            return this;
        }
        public DescribeClusterResponseBodyClusterInfoEcsInfoCompute getCompute() {
            return this.compute;
        }

        public DescribeClusterResponseBodyClusterInfoEcsInfo setLogin(DescribeClusterResponseBodyClusterInfoEcsInfoLogin login) {
            this.login = login;
            return this;
        }
        public DescribeClusterResponseBodyClusterInfoEcsInfoLogin getLogin() {
            return this.login;
        }

        public DescribeClusterResponseBodyClusterInfoEcsInfo setManager(DescribeClusterResponseBodyClusterInfoEcsInfoManager manager) {
            this.manager = manager;
            return this;
        }
        public DescribeClusterResponseBodyClusterInfoEcsInfoManager getManager() {
            return this.manager;
        }

    }

    public static class DescribeClusterResponseBodyClusterInfoPostInstallScriptsPostInstallScriptInfo extends TeaModel {
        @NameInMap("Args")
        public String args;

        @NameInMap("Url")
        public String url;

        public static DescribeClusterResponseBodyClusterInfoPostInstallScriptsPostInstallScriptInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterResponseBodyClusterInfoPostInstallScriptsPostInstallScriptInfo self = new DescribeClusterResponseBodyClusterInfoPostInstallScriptsPostInstallScriptInfo();
            return TeaModel.build(map, self);
        }

        public DescribeClusterResponseBodyClusterInfoPostInstallScriptsPostInstallScriptInfo setArgs(String args) {
            this.args = args;
            return this;
        }
        public String getArgs() {
            return this.args;
        }

        public DescribeClusterResponseBodyClusterInfoPostInstallScriptsPostInstallScriptInfo setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class DescribeClusterResponseBodyClusterInfoPostInstallScripts extends TeaModel {
        @NameInMap("PostInstallScriptInfo")
        public java.util.List<DescribeClusterResponseBodyClusterInfoPostInstallScriptsPostInstallScriptInfo> postInstallScriptInfo;

        public static DescribeClusterResponseBodyClusterInfoPostInstallScripts build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterResponseBodyClusterInfoPostInstallScripts self = new DescribeClusterResponseBodyClusterInfoPostInstallScripts();
            return TeaModel.build(map, self);
        }

        public DescribeClusterResponseBodyClusterInfoPostInstallScripts setPostInstallScriptInfo(java.util.List<DescribeClusterResponseBodyClusterInfoPostInstallScriptsPostInstallScriptInfo> postInstallScriptInfo) {
            this.postInstallScriptInfo = postInstallScriptInfo;
            return this;
        }
        public java.util.List<DescribeClusterResponseBodyClusterInfoPostInstallScriptsPostInstallScriptInfo> getPostInstallScriptInfo() {
            return this.postInstallScriptInfo;
        }

    }

    public static class DescribeClusterResponseBodyClusterInfo extends TeaModel {
        @NameInMap("AccountType")
        public String accountType;

        @NameInMap("Applications")
        public DescribeClusterResponseBodyClusterInfoApplications applications;

        @NameInMap("BaseOsTag")
        public String baseOsTag;

        @NameInMap("ClientVersion")
        public String clientVersion;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DeployMode")
        public String deployMode;

        @NameInMap("Description")
        public String description;

        @NameInMap("EcsChargeType")
        public String ecsChargeType;

        @NameInMap("EcsInfo")
        public DescribeClusterResponseBodyClusterInfoEcsInfo ecsInfo;

        @NameInMap("HaEnable")
        public Boolean haEnable;

        @NameInMap("Id")
        public String id;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("ImageName")
        public String imageName;

        @NameInMap("ImageOwnerAlias")
        public String imageOwnerAlias;

        @NameInMap("KeyPairName")
        public String keyPairName;

        @NameInMap("Location")
        public String location;

        @NameInMap("Name")
        public String name;

        @NameInMap("OsTag")
        public String osTag;

        @NameInMap("PostInstallScripts")
        public DescribeClusterResponseBodyClusterInfoPostInstallScripts postInstallScripts;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RemoteDirectory")
        public String remoteDirectory;

        @NameInMap("SccClusterId")
        public String sccClusterId;

        @NameInMap("SchedulerType")
        public String schedulerType;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("Status")
        public String status;

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

        public static DescribeClusterResponseBodyClusterInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterResponseBodyClusterInfo self = new DescribeClusterResponseBodyClusterInfo();
            return TeaModel.build(map, self);
        }

        public DescribeClusterResponseBodyClusterInfo setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public DescribeClusterResponseBodyClusterInfo setApplications(DescribeClusterResponseBodyClusterInfoApplications applications) {
            this.applications = applications;
            return this;
        }
        public DescribeClusterResponseBodyClusterInfoApplications getApplications() {
            return this.applications;
        }

        public DescribeClusterResponseBodyClusterInfo setBaseOsTag(String baseOsTag) {
            this.baseOsTag = baseOsTag;
            return this;
        }
        public String getBaseOsTag() {
            return this.baseOsTag;
        }

        public DescribeClusterResponseBodyClusterInfo setClientVersion(String clientVersion) {
            this.clientVersion = clientVersion;
            return this;
        }
        public String getClientVersion() {
            return this.clientVersion;
        }

        public DescribeClusterResponseBodyClusterInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeClusterResponseBodyClusterInfo setDeployMode(String deployMode) {
            this.deployMode = deployMode;
            return this;
        }
        public String getDeployMode() {
            return this.deployMode;
        }

        public DescribeClusterResponseBodyClusterInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeClusterResponseBodyClusterInfo setEcsChargeType(String ecsChargeType) {
            this.ecsChargeType = ecsChargeType;
            return this;
        }
        public String getEcsChargeType() {
            return this.ecsChargeType;
        }

        public DescribeClusterResponseBodyClusterInfo setEcsInfo(DescribeClusterResponseBodyClusterInfoEcsInfo ecsInfo) {
            this.ecsInfo = ecsInfo;
            return this;
        }
        public DescribeClusterResponseBodyClusterInfoEcsInfo getEcsInfo() {
            return this.ecsInfo;
        }

        public DescribeClusterResponseBodyClusterInfo setHaEnable(Boolean haEnable) {
            this.haEnable = haEnable;
            return this;
        }
        public Boolean getHaEnable() {
            return this.haEnable;
        }

        public DescribeClusterResponseBodyClusterInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeClusterResponseBodyClusterInfo setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeClusterResponseBodyClusterInfo setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public DescribeClusterResponseBodyClusterInfo setImageOwnerAlias(String imageOwnerAlias) {
            this.imageOwnerAlias = imageOwnerAlias;
            return this;
        }
        public String getImageOwnerAlias() {
            return this.imageOwnerAlias;
        }

        public DescribeClusterResponseBodyClusterInfo setKeyPairName(String keyPairName) {
            this.keyPairName = keyPairName;
            return this;
        }
        public String getKeyPairName() {
            return this.keyPairName;
        }

        public DescribeClusterResponseBodyClusterInfo setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public DescribeClusterResponseBodyClusterInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeClusterResponseBodyClusterInfo setOsTag(String osTag) {
            this.osTag = osTag;
            return this;
        }
        public String getOsTag() {
            return this.osTag;
        }

        public DescribeClusterResponseBodyClusterInfo setPostInstallScripts(DescribeClusterResponseBodyClusterInfoPostInstallScripts postInstallScripts) {
            this.postInstallScripts = postInstallScripts;
            return this;
        }
        public DescribeClusterResponseBodyClusterInfoPostInstallScripts getPostInstallScripts() {
            return this.postInstallScripts;
        }

        public DescribeClusterResponseBodyClusterInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeClusterResponseBodyClusterInfo setRemoteDirectory(String remoteDirectory) {
            this.remoteDirectory = remoteDirectory;
            return this;
        }
        public String getRemoteDirectory() {
            return this.remoteDirectory;
        }

        public DescribeClusterResponseBodyClusterInfo setSccClusterId(String sccClusterId) {
            this.sccClusterId = sccClusterId;
            return this;
        }
        public String getSccClusterId() {
            return this.sccClusterId;
        }

        public DescribeClusterResponseBodyClusterInfo setSchedulerType(String schedulerType) {
            this.schedulerType = schedulerType;
            return this;
        }
        public String getSchedulerType() {
            return this.schedulerType;
        }

        public DescribeClusterResponseBodyClusterInfo setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DescribeClusterResponseBodyClusterInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeClusterResponseBodyClusterInfo setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeClusterResponseBodyClusterInfo setVolumeId(String volumeId) {
            this.volumeId = volumeId;
            return this;
        }
        public String getVolumeId() {
            return this.volumeId;
        }

        public DescribeClusterResponseBodyClusterInfo setVolumeMountpoint(String volumeMountpoint) {
            this.volumeMountpoint = volumeMountpoint;
            return this;
        }
        public String getVolumeMountpoint() {
            return this.volumeMountpoint;
        }

        public DescribeClusterResponseBodyClusterInfo setVolumeProtocol(String volumeProtocol) {
            this.volumeProtocol = volumeProtocol;
            return this;
        }
        public String getVolumeProtocol() {
            return this.volumeProtocol;
        }

        public DescribeClusterResponseBodyClusterInfo setVolumeType(String volumeType) {
            this.volumeType = volumeType;
            return this;
        }
        public String getVolumeType() {
            return this.volumeType;
        }

        public DescribeClusterResponseBodyClusterInfo setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
