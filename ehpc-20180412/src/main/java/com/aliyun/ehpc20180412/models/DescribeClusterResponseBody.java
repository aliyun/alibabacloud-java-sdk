// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DescribeClusterResponseBody extends TeaModel {
    /**
     * <p>The mount target of the file system. Mount targets cannot be automatically created for NAS file systems.</p>
     */
    @NameInMap("ClusterInfo")
    public DescribeClusterResponseBodyClusterInfo clusterInfo;

    /**
     * <p>The image tag of the operating system.</p>
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

    public static class DescribeClusterResponseBodyClusterInfoAddOnsInfoAddOnsInfo extends TeaModel {
        @NameInMap("DeployMode")
        public String deployMode;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("SoftwareId")
        public String softwareId;

        @NameInMap("Status")
        public String status;

        @NameInMap("URL")
        public String URL;

        public static DescribeClusterResponseBodyClusterInfoAddOnsInfoAddOnsInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterResponseBodyClusterInfoAddOnsInfoAddOnsInfo self = new DescribeClusterResponseBodyClusterInfoAddOnsInfoAddOnsInfo();
            return TeaModel.build(map, self);
        }

        public DescribeClusterResponseBodyClusterInfoAddOnsInfoAddOnsInfo setDeployMode(String deployMode) {
            this.deployMode = deployMode;
            return this;
        }
        public String getDeployMode() {
            return this.deployMode;
        }

        public DescribeClusterResponseBodyClusterInfoAddOnsInfoAddOnsInfo setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeClusterResponseBodyClusterInfoAddOnsInfoAddOnsInfo setSoftwareId(String softwareId) {
            this.softwareId = softwareId;
            return this;
        }
        public String getSoftwareId() {
            return this.softwareId;
        }

        public DescribeClusterResponseBodyClusterInfoAddOnsInfoAddOnsInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeClusterResponseBodyClusterInfoAddOnsInfoAddOnsInfo setURL(String URL) {
            this.URL = URL;
            return this;
        }
        public String getURL() {
            return this.URL;
        }

    }

    public static class DescribeClusterResponseBodyClusterInfoAddOnsInfo extends TeaModel {
        @NameInMap("AddOnsInfo")
        public java.util.List<DescribeClusterResponseBodyClusterInfoAddOnsInfoAddOnsInfo> addOnsInfo;

        public static DescribeClusterResponseBodyClusterInfoAddOnsInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterResponseBodyClusterInfoAddOnsInfo self = new DescribeClusterResponseBodyClusterInfoAddOnsInfo();
            return TeaModel.build(map, self);
        }

        public DescribeClusterResponseBodyClusterInfoAddOnsInfo setAddOnsInfo(java.util.List<DescribeClusterResponseBodyClusterInfoAddOnsInfoAddOnsInfo> addOnsInfo) {
            this.addOnsInfo = addOnsInfo;
            return this;
        }
        public java.util.List<DescribeClusterResponseBodyClusterInfoAddOnsInfoAddOnsInfo> getAddOnsInfo() {
            return this.addOnsInfo;
        }

    }

    public static class DescribeClusterResponseBodyClusterInfoApplicationsApplicationInfo extends TeaModel {
        /**
         * <p>The hostname of the on-premises management nodes.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of on-premises management nodes. Valid values:</p>
         * <br>
         * <p>- scheduler</p>
         * <p>- account</p>
         * <p>- account, scheduler</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The IP address of the on-premises management nodes.</p>
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

    public static class DescribeClusterResponseBodyClusterInfoEcsInfoProxyMgr extends TeaModel {
        @NameInMap("Count")
        public Integer count;

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
        @NameInMap("Compute")
        public DescribeClusterResponseBodyClusterInfoEcsInfoCompute compute;

        @NameInMap("Login")
        public DescribeClusterResponseBodyClusterInfoEcsInfoLogin login;

        @NameInMap("Manager")
        public DescribeClusterResponseBodyClusterInfoEcsInfoManager manager;

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

    public static class DescribeClusterResponseBodyClusterInfoInitialImage extends TeaModel {
        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("ImageOwnerAlias")
        public String imageOwnerAlias;

        @NameInMap("OsTag")
        public String osTag;

        public static DescribeClusterResponseBodyClusterInfoInitialImage build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterResponseBodyClusterInfoInitialImage self = new DescribeClusterResponseBodyClusterInfoInitialImage();
            return TeaModel.build(map, self);
        }

        public DescribeClusterResponseBodyClusterInfoInitialImage setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeClusterResponseBodyClusterInfoInitialImage setImageOwnerAlias(String imageOwnerAlias) {
            this.imageOwnerAlias = imageOwnerAlias;
            return this;
        }
        public String getImageOwnerAlias() {
            return this.imageOwnerAlias;
        }

        public DescribeClusterResponseBodyClusterInfoInitialImage setOsTag(String osTag) {
            this.osTag = osTag;
            return this;
        }
        public String getOsTag() {
            return this.osTag;
        }

    }

    public static class DescribeClusterResponseBodyClusterInfoNodesNodesInfo extends TeaModel {
        @NameInMap("AccountType")
        public String accountType;

        @NameInMap("Dir")
        public String dir;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("IpAddress")
        public String ipAddress;

        @NameInMap("Role")
        public String role;

        @NameInMap("SchedulerType")
        public String schedulerType;

        public static DescribeClusterResponseBodyClusterInfoNodesNodesInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterResponseBodyClusterInfoNodesNodesInfo self = new DescribeClusterResponseBodyClusterInfoNodesNodesInfo();
            return TeaModel.build(map, self);
        }

        public DescribeClusterResponseBodyClusterInfoNodesNodesInfo setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public DescribeClusterResponseBodyClusterInfoNodesNodesInfo setDir(String dir) {
            this.dir = dir;
            return this;
        }
        public String getDir() {
            return this.dir;
        }

        public DescribeClusterResponseBodyClusterInfoNodesNodesInfo setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public DescribeClusterResponseBodyClusterInfoNodesNodesInfo setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public DescribeClusterResponseBodyClusterInfoNodesNodesInfo setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public DescribeClusterResponseBodyClusterInfoNodesNodesInfo setSchedulerType(String schedulerType) {
            this.schedulerType = schedulerType;
            return this;
        }
        public String getSchedulerType() {
            return this.schedulerType;
        }

    }

    public static class DescribeClusterResponseBodyClusterInfoNodes extends TeaModel {
        @NameInMap("NodesInfo")
        public java.util.List<DescribeClusterResponseBodyClusterInfoNodesNodesInfo> nodesInfo;

        public static DescribeClusterResponseBodyClusterInfoNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterResponseBodyClusterInfoNodes self = new DescribeClusterResponseBodyClusterInfoNodes();
            return TeaModel.build(map, self);
        }

        public DescribeClusterResponseBodyClusterInfoNodes setNodesInfo(java.util.List<DescribeClusterResponseBodyClusterInfoNodesNodesInfo> nodesInfo) {
            this.nodesInfo = nodesInfo;
            return this;
        }
        public java.util.List<DescribeClusterResponseBodyClusterInfoNodesNodesInfo> getNodesInfo() {
            return this.nodesInfo;
        }

    }

    public static class DescribeClusterResponseBodyClusterInfoOnPremiseInfoOnPremiseInfo extends TeaModel {
        @NameInMap("HostName")
        public String hostName;

        @NameInMap("IP")
        public String IP;

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
        /**
         * <p>The version of the E-HPC client.</p>
         */
        @NameInMap("AccountType")
        public String accountType;

        @NameInMap("AddOnsInfo")
        public DescribeClusterResponseBodyClusterInfoAddOnsInfo addOnsInfo;

        /**
         * <p>The list of on-premises management nodes. </p>
         * <br>
         * <p>This parameter is returned only when the cluster is deployed across hybrid environments and the hybrid-cloud proxy mode is enabled for the cluster.</p>
         */
        @NameInMap("Applications")
        public DescribeClusterResponseBodyClusterInfoApplications applications;

        @NameInMap("AutoRenew")
        public String autoRenew;

        @NameInMap("AutoRenewPeriod")
        public String autoRenewPeriod;

        /**
         * <p>The list of scripts downloaded after the cluster was created.</p>
         */
        @NameInMap("BaseOsTag")
        public String baseOsTag;

        /**
         * <p>The number of proxy nodes.</p>
         */
        @NameInMap("ClientVersion")
        public String clientVersion;

        @NameInMap("ClusterVersion")
        public String clusterVersion;

        @NameInMap("ComputeSpotPriceLimit")
        public String computeSpotPriceLimit;

        @NameInMap("ComputeSpotStrategy")
        public String computeSpotStrategy;

        /**
         * <p>The ID of the Elastic Compute Service (ECS) instance.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The list of management nodes.</p>
         */
        @NameInMap("DeployMode")
        public String deployMode;

        /**
         * <p>The tag of the software.</p>
         */
        @NameInMap("Description")
        public String description;

        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The name of the image.</p>
         */
        @NameInMap("EcsChargeType")
        public String ecsChargeType;

        @NameInMap("EcsInfo")
        public DescribeClusterResponseBodyClusterInfoEcsInfo ecsInfo;

        /**
         * <p>The version of the software.</p>
         */
        @NameInMap("HaEnable")
        public Boolean haEnable;

        /**
         * <p>The instance type of the proxy node.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The runtime parameter of the script.</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The instance type of the logon nodes.</p>
         */
        @NameInMap("ImageName")
        public String imageName;

        /**
         * <p>The instance type of the management nodes.</p>
         */
        @NameInMap("ImageOwnerAlias")
        public String imageOwnerAlias;

        @NameInMap("InitialImage")
        public DescribeClusterResponseBodyClusterInfoInitialImage initialImage;

        /**
         * <p>The ID of the vSwitch. E-HPC can be deployed only in VPCs.</p>
         */
        @NameInMap("KeyPairName")
        public String keyPairName;

        /**
         * <p>The list of proxy nodes on the cloud. </p>
         * <br>
         * <p>This parameter is returned only when the cluster is deployed across hybrid environments and the hybrid-cloud proxy mode is enabled for the cluster.</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The URL that was used to download the script.</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("Nodes")
        public DescribeClusterResponseBodyClusterInfoNodes nodes;

        @NameInMap("OnPremiseInfo")
        public DescribeClusterResponseBodyClusterInfoOnPremiseInfo onPremiseInfo;

        @NameInMap("OpenldapPar")
        public String openldapPar;

        /**
         * <p>The number of management nodes.</p>
         */
        @NameInMap("OsTag")
        public String osTag;

        @NameInMap("Period")
        public String period;

        @NameInMap("PeriodUnit")
        public String periodUnit;

        @NameInMap("Plugin")
        public String plugin;

        @NameInMap("PostInstallScripts")
        public DescribeClusterResponseBodyClusterInfoPostInstallScripts postInstallScripts;

        @NameInMap("RamNodeTypes")
        public String ramNodeTypes;

        @NameInMap("RamRoleName")
        public String ramRoleName;

        /**
         * <p>The number of compute nodes.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The instance type of the compute nodes.</p>
         */
        @NameInMap("RemoteDirectory")
        public String remoteDirectory;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The location where the cluster is deployed. Valid values:</p>
         * <br>
         * <p>*   OnPremise: The cluster is deployed on a hybrid cloud.</p>
         * <p>*   PublicCloud: The node is deployed on a public cloud.</p>
         */
        @NameInMap("SccClusterId")
        public String sccClusterId;

        @NameInMap("SchedulerPreInstall")
        public Integer schedulerPreInstall;

        /**
         * <p>The list of ECS instance specifications and quantity.</p>
         */
        @NameInMap("SchedulerType")
        public String schedulerType;

        /**
         * <p>The type of the network shared storage. Valid value: NAS.</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The remote directory on which the file system is mounted.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The list of logon nodes.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The name of the software.</p>
         */
        @NameInMap("VolumeId")
        public String volumeId;

        /**
         * <p>The list of compute nodes.</p>
         */
        @NameInMap("VolumeMountpoint")
        public String volumeMountpoint;

        /**
         * <p>The array of the software in the cluster. The array contains the name and version of the software.</p>
         */
        @NameInMap("VolumeProtocol")
        public String volumeProtocol;

        /**
         * <p>The number of logon nodes.</p>
         */
        @NameInMap("VolumeType")
        public String volumeType;

        /**
         * <p>The region ID of the security group.</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("WinAdPar")
        public String winAdPar;

        @NameInMap("WithoutAgent")
        public Integer withoutAgent;

        @NameInMap("ZoneId")
        public String zoneId;

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

        public DescribeClusterResponseBodyClusterInfo setAddOnsInfo(DescribeClusterResponseBodyClusterInfoAddOnsInfo addOnsInfo) {
            this.addOnsInfo = addOnsInfo;
            return this;
        }
        public DescribeClusterResponseBodyClusterInfoAddOnsInfo getAddOnsInfo() {
            return this.addOnsInfo;
        }

        public DescribeClusterResponseBodyClusterInfo setApplications(DescribeClusterResponseBodyClusterInfoApplications applications) {
            this.applications = applications;
            return this;
        }
        public DescribeClusterResponseBodyClusterInfoApplications getApplications() {
            return this.applications;
        }

        public DescribeClusterResponseBodyClusterInfo setAutoRenew(String autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }
        public String getAutoRenew() {
            return this.autoRenew;
        }

        public DescribeClusterResponseBodyClusterInfo setAutoRenewPeriod(String autoRenewPeriod) {
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }
        public String getAutoRenewPeriod() {
            return this.autoRenewPeriod;
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

        public DescribeClusterResponseBodyClusterInfo setClusterVersion(String clusterVersion) {
            this.clusterVersion = clusterVersion;
            return this;
        }
        public String getClusterVersion() {
            return this.clusterVersion;
        }

        public DescribeClusterResponseBodyClusterInfo setComputeSpotPriceLimit(String computeSpotPriceLimit) {
            this.computeSpotPriceLimit = computeSpotPriceLimit;
            return this;
        }
        public String getComputeSpotPriceLimit() {
            return this.computeSpotPriceLimit;
        }

        public DescribeClusterResponseBodyClusterInfo setComputeSpotStrategy(String computeSpotStrategy) {
            this.computeSpotStrategy = computeSpotStrategy;
            return this;
        }
        public String getComputeSpotStrategy() {
            return this.computeSpotStrategy;
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

        public DescribeClusterResponseBodyClusterInfo setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
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

        public DescribeClusterResponseBodyClusterInfo setInitialImage(DescribeClusterResponseBodyClusterInfoInitialImage initialImage) {
            this.initialImage = initialImage;
            return this;
        }
        public DescribeClusterResponseBodyClusterInfoInitialImage getInitialImage() {
            return this.initialImage;
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

        public DescribeClusterResponseBodyClusterInfo setNodes(DescribeClusterResponseBodyClusterInfoNodes nodes) {
            this.nodes = nodes;
            return this;
        }
        public DescribeClusterResponseBodyClusterInfoNodes getNodes() {
            return this.nodes;
        }

        public DescribeClusterResponseBodyClusterInfo setOnPremiseInfo(DescribeClusterResponseBodyClusterInfoOnPremiseInfo onPremiseInfo) {
            this.onPremiseInfo = onPremiseInfo;
            return this;
        }
        public DescribeClusterResponseBodyClusterInfoOnPremiseInfo getOnPremiseInfo() {
            return this.onPremiseInfo;
        }

        public DescribeClusterResponseBodyClusterInfo setOpenldapPar(String openldapPar) {
            this.openldapPar = openldapPar;
            return this;
        }
        public String getOpenldapPar() {
            return this.openldapPar;
        }

        public DescribeClusterResponseBodyClusterInfo setOsTag(String osTag) {
            this.osTag = osTag;
            return this;
        }
        public String getOsTag() {
            return this.osTag;
        }

        public DescribeClusterResponseBodyClusterInfo setPeriod(String period) {
            this.period = period;
            return this;
        }
        public String getPeriod() {
            return this.period;
        }

        public DescribeClusterResponseBodyClusterInfo setPeriodUnit(String periodUnit) {
            this.periodUnit = periodUnit;
            return this;
        }
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        public DescribeClusterResponseBodyClusterInfo setPlugin(String plugin) {
            this.plugin = plugin;
            return this;
        }
        public String getPlugin() {
            return this.plugin;
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

        public DescribeClusterResponseBodyClusterInfo setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeClusterResponseBodyClusterInfo setSccClusterId(String sccClusterId) {
            this.sccClusterId = sccClusterId;
            return this;
        }
        public String getSccClusterId() {
            return this.sccClusterId;
        }

        public DescribeClusterResponseBodyClusterInfo setSchedulerPreInstall(Integer schedulerPreInstall) {
            this.schedulerPreInstall = schedulerPreInstall;
            return this;
        }
        public Integer getSchedulerPreInstall() {
            return this.schedulerPreInstall;
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

        public DescribeClusterResponseBodyClusterInfo setWinAdPar(String winAdPar) {
            this.winAdPar = winAdPar;
            return this;
        }
        public String getWinAdPar() {
            return this.winAdPar;
        }

        public DescribeClusterResponseBodyClusterInfo setWithoutAgent(Integer withoutAgent) {
            this.withoutAgent = withoutAgent;
            return this;
        }
        public Integer getWithoutAgent() {
            return this.withoutAgent;
        }

        public DescribeClusterResponseBodyClusterInfo setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
