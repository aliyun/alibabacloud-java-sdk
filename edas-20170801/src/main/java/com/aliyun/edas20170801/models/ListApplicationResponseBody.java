// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListApplicationResponseBody extends TeaModel {
    /**
     * <p>The applications that are queried.</p>
     */
    @NameInMap("ApplicationList")
    public ListApplicationResponseBodyApplicationList applicationList;

    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The message that is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationResponseBody self = new ListApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApplicationResponseBody setApplicationList(ListApplicationResponseBodyApplicationList applicationList) {
        this.applicationList = applicationList;
        return this;
    }
    public ListApplicationResponseBodyApplicationList getApplicationList() {
        return this.applicationList;
    }

    public ListApplicationResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListApplicationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListApplicationResponseBodyApplicationListApplication extends TeaModel {
        /**
         * <p>The application ID.</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The deployment type of the application. Valid values:</p>
         * <br>
         * <p>*   War: The application is deployed by using a WAR package.</p>
         * <p>*   FatJar: The application is deployed by using a JAR package.</p>
         * <p>*   Image: The application is deployed by using an image.</p>
         * <p>*   If this parameter is empty, the application is not deployed.</p>
         */
        @NameInMap("ApplicationType")
        public String applicationType;

        /**
         * <p>The build package number of Enterprise Distributed Application Service (EDAS) Container.</p>
         */
        @NameInMap("BuildPackageId")
        public Long buildPackageId;

        /**
         * <p>The cluster ID.</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The type of the cluster in which the application is deployed. Valid values:</p>
         * <br>
         * <p>*   **2**: Elastic Compute Service (ECS) cluster</p>
         * <p>*   **3**: self-managed Kubernetes cluster in EDAS</p>
         * <p>*   **5**: Container Service for Kubernetes (ACK) cluster</p>
         */
        @NameInMap("ClusterType")
        public Integer clusterType;

        /**
         * <p>The time when the application was created.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The IP address of the Internet-facing SLB instance.</p>
         */
        @NameInMap("ExtSlbIp")
        public String extSlbIp;

        /**
         * <p>The listener port of the Internet-facing SLB instance.</p>
         */
        @NameInMap("ExtSlbListenerPort")
        public Integer extSlbListenerPort;

        /**
         * <p>The number of application instances.</p>
         */
        @NameInMap("Instances")
        public Integer instances;

        /**
         * <p>The namespace of the Kubernetes cluster.</p>
         */
        @NameInMap("K8sNamespace")
        public String k8sNamespace;

        /**
         * <p>The name of the application.</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("NamespaceId")
        public String namespaceId;

        /**
         * <p>The service port of the application.</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The region ID.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The number of running application instances.</p>
         */
        @NameInMap("RunningInstanceCount")
        public Integer runningInstanceCount;

        /**
         * <p>The IP address of the internal-facing Server Load Balancer (SLB) instance.</p>
         */
        @NameInMap("SlbIp")
        public String slbIp;

        /**
         * <p>The listener port of the internal-facing SLB instance.</p>
         */
        @NameInMap("SlbListenerPort")
        public Integer slbListenerPort;

        /**
         * <p>The port of the internal-facing SLB instance.</p>
         */
        @NameInMap("SlbPort")
        public Integer slbPort;

        /**
         * <p>The state of the application. Valid values:</p>
         * <br>
         * <p>*   RUNNING: The application is running.</p>
         * <p>*   STOPPED: The application is stopped.</p>
         * <p>*   DEPLOYING: The application is being deployed.</p>
         * <p>*   DELETING: The application is being deleted.</p>
         */
        @NameInMap("State")
        public String state;

        public static ListApplicationResponseBodyApplicationListApplication build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationResponseBodyApplicationListApplication self = new ListApplicationResponseBodyApplicationListApplication();
            return TeaModel.build(map, self);
        }

        public ListApplicationResponseBodyApplicationListApplication setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListApplicationResponseBodyApplicationListApplication setApplicationType(String applicationType) {
            this.applicationType = applicationType;
            return this;
        }
        public String getApplicationType() {
            return this.applicationType;
        }

        public ListApplicationResponseBodyApplicationListApplication setBuildPackageId(Long buildPackageId) {
            this.buildPackageId = buildPackageId;
            return this;
        }
        public Long getBuildPackageId() {
            return this.buildPackageId;
        }

        public ListApplicationResponseBodyApplicationListApplication setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListApplicationResponseBodyApplicationListApplication setClusterType(Integer clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public Integer getClusterType() {
            return this.clusterType;
        }

        public ListApplicationResponseBodyApplicationListApplication setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListApplicationResponseBodyApplicationListApplication setExtSlbIp(String extSlbIp) {
            this.extSlbIp = extSlbIp;
            return this;
        }
        public String getExtSlbIp() {
            return this.extSlbIp;
        }

        public ListApplicationResponseBodyApplicationListApplication setExtSlbListenerPort(Integer extSlbListenerPort) {
            this.extSlbListenerPort = extSlbListenerPort;
            return this;
        }
        public Integer getExtSlbListenerPort() {
            return this.extSlbListenerPort;
        }

        public ListApplicationResponseBodyApplicationListApplication setInstances(Integer instances) {
            this.instances = instances;
            return this;
        }
        public Integer getInstances() {
            return this.instances;
        }

        public ListApplicationResponseBodyApplicationListApplication setK8sNamespace(String k8sNamespace) {
            this.k8sNamespace = k8sNamespace;
            return this;
        }
        public String getK8sNamespace() {
            return this.k8sNamespace;
        }

        public ListApplicationResponseBodyApplicationListApplication setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListApplicationResponseBodyApplicationListApplication setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

        public ListApplicationResponseBodyApplicationListApplication setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public ListApplicationResponseBodyApplicationListApplication setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListApplicationResponseBodyApplicationListApplication setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListApplicationResponseBodyApplicationListApplication setRunningInstanceCount(Integer runningInstanceCount) {
            this.runningInstanceCount = runningInstanceCount;
            return this;
        }
        public Integer getRunningInstanceCount() {
            return this.runningInstanceCount;
        }

        public ListApplicationResponseBodyApplicationListApplication setSlbIp(String slbIp) {
            this.slbIp = slbIp;
            return this;
        }
        public String getSlbIp() {
            return this.slbIp;
        }

        public ListApplicationResponseBodyApplicationListApplication setSlbListenerPort(Integer slbListenerPort) {
            this.slbListenerPort = slbListenerPort;
            return this;
        }
        public Integer getSlbListenerPort() {
            return this.slbListenerPort;
        }

        public ListApplicationResponseBodyApplicationListApplication setSlbPort(Integer slbPort) {
            this.slbPort = slbPort;
            return this;
        }
        public Integer getSlbPort() {
            return this.slbPort;
        }

        public ListApplicationResponseBodyApplicationListApplication setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class ListApplicationResponseBodyApplicationList extends TeaModel {
        @NameInMap("Application")
        public java.util.List<ListApplicationResponseBodyApplicationListApplication> application;

        public static ListApplicationResponseBodyApplicationList build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationResponseBodyApplicationList self = new ListApplicationResponseBodyApplicationList();
            return TeaModel.build(map, self);
        }

        public ListApplicationResponseBodyApplicationList setApplication(java.util.List<ListApplicationResponseBodyApplicationListApplication> application) {
            this.application = application;
            return this;
        }
        public java.util.List<ListApplicationResponseBodyApplicationListApplication> getApplication() {
            return this.application;
        }

    }

}
