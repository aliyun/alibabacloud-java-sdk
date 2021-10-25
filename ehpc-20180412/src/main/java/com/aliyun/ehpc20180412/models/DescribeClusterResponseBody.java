// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DescribeClusterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ClusterInfo")
    public DescribeClusterResponseBodyClusterInfo clusterInfo;

    public static DescribeClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterResponseBody self = new DescribeClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeClusterResponseBody setClusterInfo(DescribeClusterResponseBodyClusterInfo clusterInfo) {
        this.clusterInfo = clusterInfo;
        return this;
    }
    public DescribeClusterResponseBodyClusterInfo getClusterInfo() {
        return this.clusterInfo;
    }

    public static class DescribeClusterResponseBodyClusterInfoApplicationsApplicationInfo extends TeaModel {
        @NameInMap("Tag")
        public String tag;

        @NameInMap("Name")
        public String name;

        @NameInMap("Version")
        public String version;

        public static DescribeClusterResponseBodyClusterInfoApplicationsApplicationInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterResponseBodyClusterInfoApplicationsApplicationInfo self = new DescribeClusterResponseBodyClusterInfoApplicationsApplicationInfo();
            return TeaModel.build(map, self);
        }

        public DescribeClusterResponseBodyClusterInfoApplicationsApplicationInfo setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public DescribeClusterResponseBodyClusterInfoApplicationsApplicationInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
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

    public static class DescribeClusterResponseBodyClusterInfoPostInstallScriptsPostInstallScriptInfo extends TeaModel {
        @NameInMap("Url")
        public String url;

        @NameInMap("Args")
        public String args;

        public static DescribeClusterResponseBodyClusterInfoPostInstallScriptsPostInstallScriptInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterResponseBodyClusterInfoPostInstallScriptsPostInstallScriptInfo self = new DescribeClusterResponseBodyClusterInfoPostInstallScriptsPostInstallScriptInfo();
            return TeaModel.build(map, self);
        }

        public DescribeClusterResponseBodyClusterInfoPostInstallScriptsPostInstallScriptInfo setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public DescribeClusterResponseBodyClusterInfoPostInstallScriptsPostInstallScriptInfo setArgs(String args) {
            this.args = args;
            return this;
        }
        public String getArgs() {
            return this.args;
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

    public static class DescribeClusterResponseBodyClusterInfoEcsInfoManager extends TeaModel {
        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("Count")
        public Integer count;

        public static DescribeClusterResponseBodyClusterInfoEcsInfoManager build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterResponseBodyClusterInfoEcsInfoManager self = new DescribeClusterResponseBodyClusterInfoEcsInfoManager();
            return TeaModel.build(map, self);
        }

        public DescribeClusterResponseBodyClusterInfoEcsInfoManager setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeClusterResponseBodyClusterInfoEcsInfoManager setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

    public static class DescribeClusterResponseBodyClusterInfoEcsInfoCompute extends TeaModel {
        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("Count")
        public Integer count;

        public static DescribeClusterResponseBodyClusterInfoEcsInfoCompute build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterResponseBodyClusterInfoEcsInfoCompute self = new DescribeClusterResponseBodyClusterInfoEcsInfoCompute();
            return TeaModel.build(map, self);
        }

        public DescribeClusterResponseBodyClusterInfoEcsInfoCompute setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeClusterResponseBodyClusterInfoEcsInfoCompute setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

    public static class DescribeClusterResponseBodyClusterInfoEcsInfoLogin extends TeaModel {
        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("Count")
        public Integer count;

        public static DescribeClusterResponseBodyClusterInfoEcsInfoLogin build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterResponseBodyClusterInfoEcsInfoLogin self = new DescribeClusterResponseBodyClusterInfoEcsInfoLogin();
            return TeaModel.build(map, self);
        }

        public DescribeClusterResponseBodyClusterInfoEcsInfoLogin setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeClusterResponseBodyClusterInfoEcsInfoLogin setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

    public static class DescribeClusterResponseBodyClusterInfoEcsInfo extends TeaModel {
        @NameInMap("Manager")
        public DescribeClusterResponseBodyClusterInfoEcsInfoManager manager;

        @NameInMap("Compute")
        public DescribeClusterResponseBodyClusterInfoEcsInfoCompute compute;

        @NameInMap("Login")
        public DescribeClusterResponseBodyClusterInfoEcsInfoLogin login;

        public static DescribeClusterResponseBodyClusterInfoEcsInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterResponseBodyClusterInfoEcsInfo self = new DescribeClusterResponseBodyClusterInfoEcsInfo();
            return TeaModel.build(map, self);
        }

        public DescribeClusterResponseBodyClusterInfoEcsInfo setManager(DescribeClusterResponseBodyClusterInfoEcsInfoManager manager) {
            this.manager = manager;
            return this;
        }
        public DescribeClusterResponseBodyClusterInfoEcsInfoManager getManager() {
            return this.manager;
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

    }

    public static class DescribeClusterResponseBodyClusterInfo extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("KeyPairName")
        public String keyPairName;

        @NameInMap("EcsChargeType")
        public String ecsChargeType;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("SccClusterId")
        public String sccClusterId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("AccountType")
        public String accountType;

        @NameInMap("VolumeProtocol")
        public String volumeProtocol;

        @NameInMap("Description")
        public String description;

        @NameInMap("VolumeId")
        public String volumeId;

        @NameInMap("HaEnable")
        public Boolean haEnable;

        @NameInMap("BaseOsTag")
        public String baseOsTag;

        @NameInMap("Name")
        public String name;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("SchedulerType")
        public String schedulerType;

        @NameInMap("DeployMode")
        public String deployMode;

        @NameInMap("ImageOwnerAlias")
        public String imageOwnerAlias;

        @NameInMap("OsTag")
        public String osTag;

        @NameInMap("VolumeMountpoint")
        public String volumeMountpoint;

        @NameInMap("RemoteDirectory")
        public String remoteDirectory;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("ImageName")
        public String imageName;

        @NameInMap("VolumeType")
        public String volumeType;

        @NameInMap("Location")
        public String location;

        @NameInMap("Id")
        public String id;

        @NameInMap("ClientVersion")
        public String clientVersion;

        @NameInMap("Applications")
        public DescribeClusterResponseBodyClusterInfoApplications applications;

        @NameInMap("PostInstallScripts")
        public DescribeClusterResponseBodyClusterInfoPostInstallScripts postInstallScripts;

        @NameInMap("EcsInfo")
        public DescribeClusterResponseBodyClusterInfoEcsInfo ecsInfo;

        public static DescribeClusterResponseBodyClusterInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterResponseBodyClusterInfo self = new DescribeClusterResponseBodyClusterInfo();
            return TeaModel.build(map, self);
        }

        public DescribeClusterResponseBodyClusterInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeClusterResponseBodyClusterInfo setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeClusterResponseBodyClusterInfo setKeyPairName(String keyPairName) {
            this.keyPairName = keyPairName;
            return this;
        }
        public String getKeyPairName() {
            return this.keyPairName;
        }

        public DescribeClusterResponseBodyClusterInfo setEcsChargeType(String ecsChargeType) {
            this.ecsChargeType = ecsChargeType;
            return this;
        }
        public String getEcsChargeType() {
            return this.ecsChargeType;
        }

        public DescribeClusterResponseBodyClusterInfo setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DescribeClusterResponseBodyClusterInfo setSccClusterId(String sccClusterId) {
            this.sccClusterId = sccClusterId;
            return this;
        }
        public String getSccClusterId() {
            return this.sccClusterId;
        }

        public DescribeClusterResponseBodyClusterInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeClusterResponseBodyClusterInfo setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public DescribeClusterResponseBodyClusterInfo setVolumeProtocol(String volumeProtocol) {
            this.volumeProtocol = volumeProtocol;
            return this;
        }
        public String getVolumeProtocol() {
            return this.volumeProtocol;
        }

        public DescribeClusterResponseBodyClusterInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeClusterResponseBodyClusterInfo setVolumeId(String volumeId) {
            this.volumeId = volumeId;
            return this;
        }
        public String getVolumeId() {
            return this.volumeId;
        }

        public DescribeClusterResponseBodyClusterInfo setHaEnable(Boolean haEnable) {
            this.haEnable = haEnable;
            return this;
        }
        public Boolean getHaEnable() {
            return this.haEnable;
        }

        public DescribeClusterResponseBodyClusterInfo setBaseOsTag(String baseOsTag) {
            this.baseOsTag = baseOsTag;
            return this;
        }
        public String getBaseOsTag() {
            return this.baseOsTag;
        }

        public DescribeClusterResponseBodyClusterInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeClusterResponseBodyClusterInfo setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeClusterResponseBodyClusterInfo setSchedulerType(String schedulerType) {
            this.schedulerType = schedulerType;
            return this;
        }
        public String getSchedulerType() {
            return this.schedulerType;
        }

        public DescribeClusterResponseBodyClusterInfo setDeployMode(String deployMode) {
            this.deployMode = deployMode;
            return this;
        }
        public String getDeployMode() {
            return this.deployMode;
        }

        public DescribeClusterResponseBodyClusterInfo setImageOwnerAlias(String imageOwnerAlias) {
            this.imageOwnerAlias = imageOwnerAlias;
            return this;
        }
        public String getImageOwnerAlias() {
            return this.imageOwnerAlias;
        }

        public DescribeClusterResponseBodyClusterInfo setOsTag(String osTag) {
            this.osTag = osTag;
            return this;
        }
        public String getOsTag() {
            return this.osTag;
        }

        public DescribeClusterResponseBodyClusterInfo setVolumeMountpoint(String volumeMountpoint) {
            this.volumeMountpoint = volumeMountpoint;
            return this;
        }
        public String getVolumeMountpoint() {
            return this.volumeMountpoint;
        }

        public DescribeClusterResponseBodyClusterInfo setRemoteDirectory(String remoteDirectory) {
            this.remoteDirectory = remoteDirectory;
            return this;
        }
        public String getRemoteDirectory() {
            return this.remoteDirectory;
        }

        public DescribeClusterResponseBodyClusterInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeClusterResponseBodyClusterInfo setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeClusterResponseBodyClusterInfo setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public DescribeClusterResponseBodyClusterInfo setVolumeType(String volumeType) {
            this.volumeType = volumeType;
            return this;
        }
        public String getVolumeType() {
            return this.volumeType;
        }

        public DescribeClusterResponseBodyClusterInfo setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public DescribeClusterResponseBodyClusterInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeClusterResponseBodyClusterInfo setClientVersion(String clientVersion) {
            this.clientVersion = clientVersion;
            return this;
        }
        public String getClientVersion() {
            return this.clientVersion;
        }

        public DescribeClusterResponseBodyClusterInfo setApplications(DescribeClusterResponseBodyClusterInfoApplications applications) {
            this.applications = applications;
            return this;
        }
        public DescribeClusterResponseBodyClusterInfoApplications getApplications() {
            return this.applications;
        }

        public DescribeClusterResponseBodyClusterInfo setPostInstallScripts(DescribeClusterResponseBodyClusterInfoPostInstallScripts postInstallScripts) {
            this.postInstallScripts = postInstallScripts;
            return this;
        }
        public DescribeClusterResponseBodyClusterInfoPostInstallScripts getPostInstallScripts() {
            return this.postInstallScripts;
        }

        public DescribeClusterResponseBodyClusterInfo setEcsInfo(DescribeClusterResponseBodyClusterInfoEcsInfo ecsInfo) {
            this.ecsInfo = ecsInfo;
            return this;
        }
        public DescribeClusterResponseBodyClusterInfoEcsInfo getEcsInfo() {
            return this.ecsInfo;
        }

    }

}
