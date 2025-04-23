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
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
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
        /**
         * <p>The deployment mode of the custom component. Valid values:</p>
         * <ul>
         * <li>local</li>
         * <li>ecs</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>local</p>
         */
        @NameInMap("DeployMode")
        public String deployMode;

        /**
         * <p>The TCP port number of the custom component.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The software ID of the component.</p>
         * 
         * <strong>example:</strong>
         * <p>CROMWELL_85</p>
         */
        @NameInMap("SoftwareId")
        public String softwareId;

        /**
         * <p>The running status of the custom component. Valid values:</p>
         * <ul>
         * <li>running</li>
         * <li>stopped</li>
         * <li>exception</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The URL of the custom component service.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://172.16.10.12:10000/">http://172.16.10.12:10000/</a></p>
         */
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
         * <p>The name of the software.</p>
         * 
         * <strong>example:</strong>
         * <p>openmpi</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The tag of the software.</p>
         * 
         * <strong>example:</strong>
         * <p>OpenMPI_1.8.7</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The version of the software.</p>
         * 
         * <strong>example:</strong>
         * <p>1.10</p>
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
         * <p>The number of compute nodes in the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The instance type of the compute nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.n1.tiny</p>
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
         * <p>The number of logon nodes in the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The instance type of the logon nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.n1.tiny</p>
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
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The instance type of the management nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.n1.tiny</p>
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
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The instance type of the proxy node.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.n1.tiny</p>
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
         * <p>The information of management nodes.</p>
         */
        @NameInMap("Manager")
        public DescribeClusterResponseBodyClusterInfoEcsInfoManager manager;

        /**
         * <p>The list of proxy nodes on the cloud.</p>
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

    public static class DescribeClusterResponseBodyClusterInfoInitialImage extends TeaModel {
        /**
         * <p>The image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>centos_7_6_x64_20G_alibase_20211130.vhd</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The type of the image. Valid values:</p>
         * <ul>
         * <li>system: public image</li>
         * <li>self: custom image</li>
         * <li>others: shared image</li>
         * <li>marketplace: Alibaba Cloud Marketplace image</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>system</p>
         */
        @NameInMap("ImageOwnerAlias")
        public String imageOwnerAlias;

        /**
         * <p>An array of OS images that are supported by E-HPC.</p>
         * 
         * <strong>example:</strong>
         * <p>CentOS_7.6_64</p>
         */
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
        /**
         * <p>The service type of the domain account to which the node in the on-premises cluster belongs. Valid values:</p>
         * <ul>
         * <li>nis</li>
         * <li>ldap</li>
         * </ul>
         * <p>Default value: nis.</p>
         * 
         * <strong>example:</strong>
         * <p>nis</p>
         */
        @NameInMap("AccountType")
        public String accountType;

        /**
         * <p>The directory of the node in the on-premises cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>/opt/sge/default/</p>
         */
        @NameInMap("Dir")
        public String dir;

        /**
         * <p>The hostname of the node in the on-premises cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>compute000</p>
         */
        @NameInMap("HostName")
        public String hostName;

        /**
         * <p>The IP address of the node in the on-premises cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("IpAddress")
        public String ipAddress;

        /**
         * <p>The role of the node in the on-premises cluster. Valid values:</p>
         * <ul>
         * <li>Manager: management node</li>
         * <li>Login: logon node</li>
         * <li>Compute: compute node</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Compute</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>The scheduler type of the node in the on-premises cluster. Valid values:</p>
         * <ul>
         * <li>pbs</li>
         * <li>slurm</li>
         * <li>opengridscheduler</li>
         * <li>deadline</li>
         * </ul>
         * <p>Default value: pbs.</p>
         * 
         * <strong>example:</strong>
         * <p>pbs</p>
         */
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
        /**
         * <p>The hostname of the management node in the on-premises cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>testecs</p>
         */
        @NameInMap("HostName")
        public String hostName;

        /**
         * <p>The IP address of the management node in the on-premises cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.<em>.</em></p>
         */
        @NameInMap("IP")
        public String IP;

        /**
         * <p>The type of the management node in the on-premises cluster. Valid values:</p>
         * <ul>
         * <li>scheduler</li>
         * <li>account</li>
         * <li>account, scheduler</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>scheduler</p>
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
         * <p>The parameter used to run the script.</p>
         * 
         * <strong>example:</strong>
         * <p>bash file.sh</p>
         */
        @NameInMap("Args")
        public String args;

        /**
         * <p>The URL used to download the script.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
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
         * <p>The server type of the account. Valid values:</p>
         * <ul>
         * <li>nis</li>
         * <li>ldap</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>nis</p>
         */
        @NameInMap("AccountType")
        public String accountType;

        /**
         * <p>The information about the custom component service.</p>
         */
        @NameInMap("AddOnsInfo")
        public DescribeClusterResponseBodyClusterInfoAddOnsInfo addOnsInfo;

        /**
         * <p>The array of the software in the cluster. The array contains the name and version of the software.</p>
         */
        @NameInMap("Applications")
        public DescribeClusterResponseBodyClusterInfoApplications applications;

        /**
         * <p>Specifies whether to enable auto-renewal. The parameter takes effect only when EcsChargeType is set to PrePaid. Valid values:</p>
         * <ul>
         * <li>true: enables auto-renewal.</li>
         * <li>false: disables auto-renewal.</li>
         * </ul>
         * <p>Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AutoRenew")
        public String autoRenew;

        /**
         * <p>The auto-renewal period of the subscription compute nodes. The parameter takes effect when AutoRenew is set to true.</p>
         * <ul>
         * <li>If PeriodUnit is set to Week, the valid values of the AutoRenewPeriod parameter are 1, 2, and 3.</li>
         * <li>If PeriodUnit is set to Month, the valid values of the AutoRenewPeriod parameter are 1, 2, 3, 6, and 12.</li>
         * </ul>
         * <p>Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AutoRenewPeriod")
        public String autoRenewPeriod;

        /**
         * <p>The image of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>CentOS_7.2_64</p>
         */
        @NameInMap("BaseOsTag")
        public String baseOsTag;

        /**
         * <p>The version of the E-HPC client.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.1</p>
         */
        @NameInMap("ClientVersion")
        public String clientVersion;

        /**
         * <p>The version of the E-HPC cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("ClusterVersion")
        public String clusterVersion;

        /**
         * <p>The maximum hourly price of the compute nodes. A maximum of three decimal places can be used in the value of the parameter. The parameter is valid only when the ComputeSpotStrategy parameter is set to SpotWithPriceLimit.</p>
         * 
         * <strong>example:</strong>
         * <p>0.56</p>
         */
        @NameInMap("ComputeSpotPriceLimit")
        public String computeSpotPriceLimit;

        /**
         * <p>The bidding method of the compute node. Valid values:</p>
         * <ul>
         * <li>NoSpot: The instance is created as a pay-as-you-go instance.</li>
         * <li>SpotWithPriceLimit: The instance is created as a preemptible instance with a user-defined maximum hourly price.</li>
         * <li>SpotAsPriceGo: The instance is a preemptible instance for which the market price at the time of purchase is automatically used as the bidding price.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NoSpot</p>
         */
        @NameInMap("ComputeSpotStrategy")
        public String computeSpotStrategy;

        /**
         * <p>The time at which the instance is created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-24T03:18:23.000Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The mode in which the cluster is deployed. Valid values:</p>
         * <ul>
         * <li>Standard: An account node, a scheduling node, a logon node, and multiple compute nodes are separately deployed.</li>
         * <li>Advanced: Two high availability (HA) account nodes, two HA scheduler nodes, one logon node, and multiple compute nodes are separately deployed.</li>
         * <li>Simple: A management node, a logon node, and multiple compute nodes are deployed. The management node consists of an account node and a scheduling node. The logon node and compute nodes are separately deployed.</li>
         * <li>Tiny: The account node, scheduling node, and logon node are deployed on one node. The compute node is separately deployed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Simple</p>
         */
        @NameInMap("DeployMode")
        public String deployMode;

        /**
         * <p>The description of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>cluster</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The domain name of the on-premises E-HPC cluster.</p>
         * <p>This parameter takes effect only when the AccoutType parameter is set to Idap.</p>
         * 
         * <strong>example:</strong>
         * <p>ldap</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The billing method of the nodes in the cluster. Valid values:</p>
         * <ul>
         * <li>PostPaid: pay-as-you-go</li>
         * <li>PrePaid: subscription</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        @NameInMap("EcsChargeType")
        public String ecsChargeType;

        /**
         * <p>The list of ECS instance specifications and quantity.</p>
         */
        @NameInMap("EcsInfo")
        public DescribeClusterResponseBodyClusterInfoEcsInfo ecsInfo;

        /**
         * <p>Specifies whether to enable the high availability feature.</p>
         * <blockquote>
         * <p> If high availability is enabled, each management role in the cluster uses both primary and secondary instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HaEnable")
        public Boolean haEnable;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp15de54eet1c43f****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>centos_7_02_64_20G_alibase_20170818****</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The image name.</p>
         * 
         * <strong>example:</strong>
         * <p>test_for_Image</p>
         */
        @NameInMap("ImageName")
        public String imageName;

        /**
         * <p>The image type. Valid values:</p>
         * <ul>
         * <li>system: public image</li>
         * <li>self: custom image</li>
         * <li>others: shared image</li>
         * <li>marketplace: Alibaba Cloud Marketplace image</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>system</p>
         */
        @NameInMap("ImageOwnerAlias")
        public String imageOwnerAlias;

        /**
         * <p>The image information of the operating systems.</p>
         */
        @NameInMap("InitialImage")
        public DescribeClusterResponseBodyClusterInfoInitialImage initialImage;

        /**
         * <p>The name of the AccessKey pair.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("KeyPairName")
        public String keyPairName;

        /**
         * <p>The location where the cluster is deployed. Valid values:</p>
         * <ul>
         * <li>OnPremise: The node is deployed on a hybrid cloud.</li>
         * <li>PublicCloud: The cluster is deployed on a public cloud.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PublicCloud</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The name of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>cluster</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The information of the on-premises node in the cluster.</p>
         */
        @NameInMap("Nodes")
        public DescribeClusterResponseBodyClusterInfoNodes nodes;

        /**
         * <p>The list of on-premises management nodes.</p>
         * <p>This parameter is returned only when the cluster is deployed across hybrid environments and the hybrid-cloud proxy mode is enabled for the cluster.</p>
         */
        @NameInMap("OnPremiseInfo")
        public DescribeClusterResponseBodyClusterInfoOnPremiseInfo onPremiseInfo;

        /**
         * <p>The parameter that is used to connect to the OpenLDAP server.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;LdapServerIp&quot;: &quot;192.168.XX.XX&quot;,
         *     &quot;BaseDn&quot;: &quot;ehpctest&quot;,
         *     &quot;FallbackHomeDir&quot;: &quot;/home&quot;
         * }</p>
         */
        @NameInMap("OpenldapPar")
        public String openldapPar;

        /**
         * <p>The operating system tag of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>CentOS_7.2_64</p>
         */
        @NameInMap("OsTag")
        public String osTag;

        /**
         * <p>The duration of the subscription. The unit of the duration is specified by the <code>PeriodUnit</code> parameter.</p>
         * <ul>
         * <li>If you set PriceUnit to Year, the valid values of the Period parameter are 1, 2, and 3.</li>
         * <li>If you set PriceUnit to Month, the valid values of the Period parameter are 1, 2, 3, 4, 5, 6, 7, 8, and 9.</li>
         * <li>If you set PriceUnit to Hour, the valid value of the Period parameter is 1.</li>
         * </ul>
         * <p>Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Period")
        public String period;

        /**
         * <p>The unit of the subscription duration. Valid value:</p>
         * <ul>
         * <li>Year</li>
         * <li>Month</li>
         * <li>Hour</li>
         * </ul>
         * <p>Default value: Month.</p>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        @NameInMap("PeriodUnit")
        public String periodUnit;

        /**
         * <p>The mode configurations of the plug-in. This parameter takes effect only when the SchedulerType parameter is set to custom.</p>
         * <p>The value must be a JSON string. The parameter contains the following parameters: pluginMod, pluginLocalPath, and pluginOssPath.</p>
         * <ul>
         * <li><p>pluginMod: the mode of the plug-in. The following modes are supported:</p>
         * <ul>
         * <li>oss: The plug-in is downloaded and decompressed from OSS to a local path that is specified by the pluginLocalPath parameter.</li>
         * <li>image: By default, the plug-in is stored in a pre-defined local path that is specified by the pluginLocalPath parameter.</li>
         * </ul>
         * </li>
         * <li><p>pluginLocalPath: the local path where the plug-in is stored. We recommend that you select a shared directory in the oss mode and a non-shared directory in the image mode.</p>
         * </li>
         * <li><p>pluginOssPath: the remote path where the plug-in is stored in OSS. This parameter takes effect only if you set the pluginMod parameter to oss.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;pluginMod\&quot;:\&quot;image\&quot;,\&quot;pluginLocalPath\&quot;:\&quot;/opt/plugin\&quot;}</p>
         */
        @NameInMap("Plugin")
        public String plugin;

        /**
         * <p>The list of post-installation scripts</p>
         */
        @NameInMap("PostInstallScripts")
        public DescribeClusterResponseBodyClusterInfoPostInstallScripts postInstallScripts;

        /**
         * <p>The node type details of the instance RAM role.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;manager&quot;, &quot;compute&quot;]</p>
         */
        @NameInMap("RamNodeTypes")
        public String ramNodeTypes;

        /**
         * <p>The name of the instance Resource Access Management (RAM) role.</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunEHPCFullAccess</p>
         */
        @NameInMap("RamRoleName")
        public String ramRoleName;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The remote directory on which the file system is mounted.</p>
         * 
         * <strong>example:</strong>
         * <p>NasMountpoint:/RemoteDirectory</p>
         */
        @NameInMap("RemoteDirectory")
        public String remoteDirectory;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek23szz5i2****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The ID of the Super Computing Cluster (SCC) instance. If the cluster is not an SCC instance, a null string is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>00b648b****</p>
         */
        @NameInMap("SccClusterId")
        public String sccClusterId;

        /**
         * <p>Specifies whether the scheduler is preinstalled for the image. Valid values:</p>
         * <ul>
         * <li>true: The scheduler is preinstalled. When you create a node or scale out a cluster, you do not need to install the scheduler.</li>
         * <li>false: The scheduler is not preinstalled. When you create or add a cluster, you must install the scheduler.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SchedulerPreInstall")
        public Integer schedulerPreInstall;

        /**
         * <p>The type of the scheduler. Valid values:</p>
         * <ul>
         * <li>pbs</li>
         * <li>slurm</li>
         * <li>opengridscheduler</li>
         * <li>deadline</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pbs</p>
         */
        @NameInMap("SchedulerType")
        public String schedulerType;

        /**
         * <p>The version of the scheduler.</p>
         * 
         * <strong>example:</strong>
         * <p>18.1.1</p>
         */
        @NameInMap("SchedulerVersion")
        public String schedulerVersion;

        /**
         * <p>The ID of the security group.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-bp1asugr34gzn****</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The status of the cluster. Valid values:</p>
         * <ul>
         * <li>uninit: The cluster is not initialized.</li>
         * <li>creating: The cluster is being created.</li>
         * <li>init: The cluster is being initialized.</li>
         * <li>running: The cluster is running.</li>
         * <li>exception: The cluster encounters an exception.</li>
         * <li>releasing: The cluster is being released.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>creating</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The vSwitch ID. E-HPC can be deployed only in VPCs.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1e47optm9g58zcu****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the File Storage NAS file system. NAS file systems cannot be automatically created.</p>
         * 
         * <strong>example:</strong>
         * <p>008b64****</p>
         */
        @NameInMap("VolumeId")
        public String volumeId;

        /**
         * <p>The mount target of the NAS file system. The mount target is of the VPC type. Mount targets cannot be automatically created for NAS file systems.</p>
         * 
         * <strong>example:</strong>
         * <p>008b648bcb-s****.cn-hangzhou.nas.aliyuncs.com</p>
         */
        @NameInMap("VolumeMountpoint")
        public String volumeMountpoint;

        /**
         * <p>The type of the protocol that is used by the file system. Valid values:</p>
         * <ul>
         * <li>nfs</li>
         * <li>smb</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>nfs</p>
         */
        @NameInMap("VolumeProtocol")
        public String volumeProtocol;

        /**
         * <p>The type of the network shared storage. Valid value: NAS.</p>
         * 
         * <strong>example:</strong>
         * <p>NAS</p>
         */
        @NameInMap("VolumeType")
        public String volumeType;

        /**
         * <p>The VPC ID of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1pxkcvmmz53ki89****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The parameter that is used to connect to the Windows AD server.</p>
         * 
         * <strong>example:</strong>
         * <p>{	&quot;AdUser&quot;: &quot;Administrator&quot;,	&quot;AdUserPasswd&quot;: &quot;xxxxxx&quot;,	&quot;AdDc&quot;: &quot;ad-hybrid001.ehpcad.com&quot;,	&quot;AdIp&quot;: &quot;192.168.XX.XX&quot;}</p>
         */
        @NameInMap("WinAdPar")
        public String winAdPar;

        /**
         * <p>Specifies whether to not install the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("WithoutAgent")
        public Integer withoutAgent;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-k</p>
         */
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

        public DescribeClusterResponseBodyClusterInfo setSchedulerVersion(String schedulerVersion) {
            this.schedulerVersion = schedulerVersion;
            return this;
        }
        public String getSchedulerVersion() {
            return this.schedulerVersion;
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
