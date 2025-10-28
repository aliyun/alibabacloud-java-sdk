// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListApplicationResponseBody extends TeaModel {
    /**
     * <p>The information about applications.</p>
     */
    @NameInMap("ApplicationList")
    public ListApplicationResponseBodyApplicationList applicationList;

    /**
     * <p>The HTTP status code that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The message that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5d6fa0bc-cc3**********</p>
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
         * <p>The ID of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>00ee517d-dd7d-4d4e-<strong><strong>-</strong></strong>********</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The deployment type of the application. Valid values:</p>
         * <ul>
         * <li>War: The application is deployed by using a WAR package.</li>
         * <li>FatJar: The application is deployed by using a JAR package.</li>
         * <li>Image: The application is deployed by using an image.</li>
         * <li>If this parameter is empty, the application is not deployed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FatJar</p>
         */
        @NameInMap("ApplicationType")
        public String applicationType;

        /**
         * <p>The build package number of Enterprise Distributed Application Service (EDAS) Container.</p>
         * 
         * <strong>example:</strong>
         * <p>58</p>
         */
        @NameInMap("BuildPackageId")
        public Long buildPackageId;

        /**
         * <p>The ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>c37aec2a-bcca-4ec1-<strong><strong>-</strong></strong>********</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The type of the cluster in which the application is deployed. Valid values:</p>
         * <ul>
         * <li><strong>2</strong>: Elastic Compute Service (ECS) cluster</li>
         * <li><strong>3</strong>: self-managed Kubernetes cluster in EDAS</li>
         * <li><strong>5</strong>: Container Service for Kubernetes (ACK) cluster</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ClusterType")
        public Integer clusterType;

        /**
         * <p>The time when the application was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1664208000000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The IP address of the Internet-facing SLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>100.100.70.***</p>
         */
        @NameInMap("ExtSlbIp")
        public String extSlbIp;

        /**
         * <p>The listener port of the Internet-facing SLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("ExtSlbListenerPort")
        public Integer extSlbListenerPort;

        /**
         * <p>The number of application instances.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Instances")
        public Integer instances;

        /**
         * <p>The namespace of the Kubernetes cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("K8sNamespace")
        public String k8sNamespace;

        /**
         * <p>The name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>doc-test-consumer</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the microservices namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou:test</p>
         */
        @NameInMap("NamespaceId")
        public String namespaceId;

        /**
         * <p>The service port of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The region ID of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing:docTes</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek24j4s4b*****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The number of running application instances.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RunningInstanceCount")
        public Integer runningInstanceCount;

        /**
         * <p>The IP address of the internal-facing Server Load Balancer (SLB) instance.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.***</p>
         */
        @NameInMap("SlbIp")
        public String slbIp;

        /**
         * <p>The listener port of the internal-facing SLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>8088</p>
         */
        @NameInMap("SlbListenerPort")
        public Integer slbListenerPort;

        /**
         * <p>The port of the internal-facing SLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("SlbPort")
        public Integer slbPort;

        /**
         * <p>The state of the application. Valid values:</p>
         * <ul>
         * <li>RUNNING: The application is running.</li>
         * <li>STOPPED: The application is stopped.</li>
         * <li>DEPLOYING: The application is being deployed.</li>
         * <li>DELETING: The application is being deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
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
