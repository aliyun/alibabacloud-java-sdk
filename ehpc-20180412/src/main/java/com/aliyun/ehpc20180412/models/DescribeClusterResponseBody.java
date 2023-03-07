// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DescribeClusterResponseBody extends TeaModel {
    /**
     * <p>The information about the cluster.</p>
     */
    @NameInMap("ClusterInfo")
    public DescribeClusterResponseBodyClusterInfo clusterInfo;

    /**
     * <p>The ID of the request.</p>
     */
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
        /**
         * <p>The name of the software.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The tag of the software.</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The version of the software.</p>
         */
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
        /**
         * <p>The number of compute nodes.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The instance type of the compute nodes.</p>
         */
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
        /**
         * <p>The number of logon nodes.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The instance type of the logon nodes.</p>
         */
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
        /**
         * <p>The number of management nodes.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The instance type of the management nodes.</p>
         */
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

    public static class DescribeClusterResponseBodyClusterInfoEcsInfoProxyMgr extends TeaModel {
        /**
         * <p>The number of proxy nodes.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The instance type of the proxy node.</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        public static DescribeClusterResponseBodyClusterInfoEcsInfoProxyMgr build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterResponseBodyClusterInfoEcsInfoProxyMgr self = new DescribeClusterResponseBodyClusterInfoEcsInfoProxyMgr();
            return TeaModel.build(map, self);
        }

        public DescribeClusterResponseBodyClusterInfoEcsInfoProxyMgr setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeClusterResponseBodyClusterInfoEcsInfoProxyMgr setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

    }

    public static class DescribeClusterResponseBodyClusterInfoEcsInfo extends TeaModel {
        /**
         * <p>The list of compute nodes.</p>
         */
        @NameInMap("Compute")
        public DescribeClusterResponseBodyClusterInfoEcsInfoCompute compute;

        /**
         * <p>The list of logon nodes.</p>
         */
        @NameInMap("Login")
        public DescribeClusterResponseBodyClusterInfoEcsInfoLogin login;

        /**
         * <p>The list of management nodes.</p>
         */
        @NameInMap("Manager")
        public DescribeClusterResponseBodyClusterInfoEcsInfoManager manager;

        /**
         * <p>The list of proxy nodes on the cloud. </p>
         * <br>
         * <p>This parameter is returned only when the cluster is deployed across hybrid environments and the hybrid-cloud proxy mode is enabled for the cluster.</p>
         */
        @NameInMap("ProxyMgr")
        public DescribeClusterResponseBodyClusterInfoEcsInfoProxyMgr proxyMgr;

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

        public DescribeClusterResponseBodyClusterInfoEcsInfo setProxyMgr(DescribeClusterResponseBodyClusterInfoEcsInfoProxyMgr proxyMgr) {
            this.proxyMgr = proxyMgr;
            return this;
        }
        public DescribeClusterResponseBodyClusterInfoEcsInfoProxyMgr getProxyMgr() {
            return this.proxyMgr;
        }

    }

    public static class DescribeClusterResponseBodyClusterInfoOnPremiseInfoOnPremiseInfo extends TeaModel {
        /**
         * <p>The hostname of the on-premises management nodes.</p>
         */
        @NameInMap("HostName")
        public String hostName;

        /**
         * <p>The IP address of the on-premises management nodes.</p>
         */
        @NameInMap("IP")
        public String IP;

        /**
         * <p>The type of on-premises management nodes. Valid values:</p>
         * <br>
         * <p>- scheduler</p>
         * <p>- account</p>
         * <p>- account, scheduler</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeClusterResponseBodyClusterInfoOnPremiseInfoOnPremiseInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterResponseBodyClusterInfoOnPremiseInfoOnPremiseInfo self = new DescribeClusterResponseBodyClusterInfoOnPremiseInfoOnPremiseInfo();
            return TeaModel.build(map, self);
        }

        public DescribeClusterResponseBodyClusterInfoOnPremiseInfoOnPremiseInfo setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public DescribeClusterResponseBodyClusterInfoOnPremiseInfoOnPremiseInfo setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public DescribeClusterResponseBodyClusterInfoOnPremiseInfoOnPremiseInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeClusterResponseBodyClusterInfoOnPremiseInfo extends TeaModel {
        @NameInMap("OnPremiseInfo")
        public java.util.List<DescribeClusterResponseBodyClusterInfoOnPremiseInfoOnPremiseInfo> onPremiseInfo;

        public static DescribeClusterResponseBodyClusterInfoOnPremiseInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterResponseBodyClusterInfoOnPremiseInfo self = new DescribeClusterResponseBodyClusterInfoOnPremiseInfo();
            return TeaModel.build(map, self);
        }

        public DescribeClusterResponseBodyClusterInfoOnPremiseInfo setOnPremiseInfo(java.util.List<DescribeClusterResponseBodyClusterInfoOnPremiseInfoOnPremiseInfo> onPremiseInfo) {
            this.onPremiseInfo = onPremiseInfo;
            return this;
        }
        public java.util.List<DescribeClusterResponseBodyClusterInfoOnPremiseInfoOnPremiseInfo> getOnPremiseInfo() {
            return this.onPremiseInfo;
        }

    }

    public static class DescribeClusterResponseBodyClusterInfoPostInstallScriptsPostInstallScriptInfo extends TeaModel {
        /**
         * <p>The runtime parameter of the script.</p>
         */
        @NameInMap("Args")
        public String args;

        /**
         * <p>The URL that was used to download the script.</p>
         */
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
        /**
         * <p>The service type of the domain account. Valid values:</p>
         * <br>
         * <p>*   nis</p>
         * <p>*   ldap</p>
         */
        @NameInMap("AccountType")
        public String accountType;

        /**
         * <p>The array of the software in the cluster. The array contains the name and version of the software.</p>
         */
        @NameInMap("Applications")
        public DescribeClusterResponseBodyClusterInfoApplications applications;

        /**
         * <p>The image of the cluster.</p>
         */
        @NameInMap("BaseOsTag")
        public String baseOsTag;

        /**
         * <p>The version of the E-HPC client.</p>
         */
        @NameInMap("ClientVersion")
        public String clientVersion;

        /**
         * <p>The time when the cluster was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The mode in which the cluster is deployed. Valid values:</p>
         * <br>
         * <p>*   Standard: An account node, a scheduling node, a logon node, and multiple compute nodes are separately deployed.</p>
         * <p>*   Advanced: Two high availability (HA) account nodes, two HA scheduler nodes, one logon node, and multiple compute nodes are separately deployed.</p>
         * <p>*   Simple: A management node, a logon node, and multiple compute nodes are deployed. The management node consists of an account node and a scheduling node. The logon node and compute nodes are separately deployed.</p>
         * <p>*   Tiny: A management node and multiple compute nodes are deployed. The management node consists of an account node, a scheduling node, and a logon node. The compute nodes are separately deployed.</p>
         */
        @NameInMap("DeployMode")
        public String deployMode;

        /**
         * <p>The description of the cluster.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The billing method of the nodes in the cluster. Valid values:</p>
         * <br>
         * <p>*   PostPaid: pay-as-you-go</p>
         * <p>*   PrePaid: subscription</p>
         */
        @NameInMap("EcsChargeType")
        public String ecsChargeType;

        /**
         * <p>The list of ECS instance specifications and quantity.</p>
         */
        @NameInMap("EcsInfo")
        public DescribeClusterResponseBodyClusterInfoEcsInfo ecsInfo;

        /**
         * <p>Indicates whether the high availability feature is enabled.</p>
         * <br>
         * <p>>  If high availability is enabled, a primary management node and a secondary management node are used.</p>
         */
        @NameInMap("HaEnable")
        public Boolean haEnable;

        /**
         * <p>The ID of the Elastic Compute Service (ECS) instance.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The ID of the image.</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The name of the image.</p>
         */
        @NameInMap("ImageName")
        public String imageName;

        /**
         * <p>The type of the image. Valid values:</p>
         * <br>
         * <p>*   system: public image</p>
         * <p>*   self: custom image</p>
         * <p>*   others: shared image</p>
         * <p>*   marketplace: Alibaba Cloud Marketplace image</p>
         */
        @NameInMap("ImageOwnerAlias")
        public String imageOwnerAlias;

        /**
         * <p>The name of the AccessKey pair.</p>
         */
        @NameInMap("KeyPairName")
        public String keyPairName;

        /**
         * <p>The location where the cluster is deployed. Valid values:</p>
         * <br>
         * <p>*   OnPremise: The cluster is deployed on a hybrid cloud.</p>
         * <p>*   PublicCloud: The node is deployed on a public cloud.</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The name of the cluster.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The list of on-premises management nodes. </p>
         * <br>
         * <p>This parameter is returned only when the cluster is deployed across hybrid environments and the hybrid-cloud proxy mode is enabled for the cluster.</p>
         */
        @NameInMap("OnPremiseInfo")
        public DescribeClusterResponseBodyClusterInfoOnPremiseInfo onPremiseInfo;

        /**
         * <p>The image tag of the operating system.</p>
         */
        @NameInMap("OsTag")
        public String osTag;

        /**
         * <p>The list of scripts downloaded after the cluster was created.</p>
         */
        @NameInMap("PostInstallScripts")
        public DescribeClusterResponseBodyClusterInfoPostInstallScripts postInstallScripts;

        @NameInMap("RamNodeTypes")
        public String ramNodeTypes;

        @NameInMap("RamRoleName")
        public String ramRoleName;

        /**
         * <p>The region ID of the security group.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The remote directory on which the file system is mounted.</p>
         */
        @NameInMap("RemoteDirectory")
        public String remoteDirectory;

        /**
         * <p>The ID of the Super Computing Cluster (SCC) instance. If the cluster is not an SCC instance, a null string is returned.</p>
         */
        @NameInMap("SccClusterId")
        public String sccClusterId;

        /**
         * <p>The type of the scheduler. Valid values:</p>
         * <br>
         * <p>*   pbs</p>
         * <p>*   slurm</p>
         * <p>*   opengridscheduler</p>
         * <p>*   deadline</p>
         */
        @NameInMap("SchedulerType")
        public String schedulerType;

        /**
         * <p>The ID of the security group.</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The status of the cluster. Valid values:</p>
         * <br>
         * <p>*   uninit: The cluster is not initialized.</p>
         * <p>*   creating: The cluster is being created.</p>
         * <p>*   init: The cluster is being initialized.</p>
         * <p>*   running: The cluster is running.</p>
         * <p>*   exception: The cluster encounters an exception.</p>
         * <p>*   releasing: The cluster is being released.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the vSwitch. E-HPC can be deployed only in VPCs.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the Apsara File Storage NAS file system. NAS file systems cannot be automatically created.</p>
         */
        @NameInMap("VolumeId")
        public String volumeId;

        /**
         * <p>The mount target of the file system. Mount targets cannot be automatically created for NAS file systems.</p>
         */
        @NameInMap("VolumeMountpoint")
        public String volumeMountpoint;

        /**
         * <p>The type of the protocol that is used by the file system. Valid values:</p>
         * <br>
         * <p>*   nfs</p>
         * <p>*   smb</p>
         */
        @NameInMap("VolumeProtocol")
        public String volumeProtocol;

        /**
         * <p>The type of the network shared storage. Valid value: NAS.</p>
         */
        @NameInMap("VolumeType")
        public String volumeType;

        /**
         * <p>The ID of the VPC.</p>
         */
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

        public DescribeClusterResponseBodyClusterInfo setOnPremiseInfo(DescribeClusterResponseBodyClusterInfoOnPremiseInfo onPremiseInfo) {
            this.onPremiseInfo = onPremiseInfo;
            return this;
        }
        public DescribeClusterResponseBodyClusterInfoOnPremiseInfo getOnPremiseInfo() {
            return this.onPremiseInfo;
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

        public DescribeClusterResponseBodyClusterInfo setRamNodeTypes(String ramNodeTypes) {
            this.ramNodeTypes = ramNodeTypes;
            return this;
        }
        public String getRamNodeTypes() {
            return this.ramNodeTypes;
        }

        public DescribeClusterResponseBodyClusterInfo setRamRoleName(String ramRoleName) {
            this.ramRoleName = ramRoleName;
            return this;
        }
        public String getRamRoleName() {
            return this.ramRoleName;
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
