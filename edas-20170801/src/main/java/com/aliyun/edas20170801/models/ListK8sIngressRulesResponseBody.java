// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListK8sIngressRulesResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data that is returned.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListK8sIngressRulesResponseBodyData> data;

    /**
     * <p>The message that is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListK8sIngressRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListK8sIngressRulesResponseBody self = new ListK8sIngressRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListK8sIngressRulesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListK8sIngressRulesResponseBody setData(java.util.List<ListK8sIngressRulesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListK8sIngressRulesResponseBodyData> getData() {
        return this.data;
    }

    public ListK8sIngressRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListK8sIngressRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListK8sIngressRulesResponseBodyDataIngressConfsRulesPathsBackend extends TeaModel {
        /**
         * <p>The name of the backend service.</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        /**
         * <p>The port of the backend service.</p>
         */
        @NameInMap("ServicePort")
        public String servicePort;

        public static ListK8sIngressRulesResponseBodyDataIngressConfsRulesPathsBackend build(java.util.Map<String, ?> map) throws Exception {
            ListK8sIngressRulesResponseBodyDataIngressConfsRulesPathsBackend self = new ListK8sIngressRulesResponseBodyDataIngressConfsRulesPathsBackend();
            return TeaModel.build(map, self);
        }

        public ListK8sIngressRulesResponseBodyDataIngressConfsRulesPathsBackend setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public ListK8sIngressRulesResponseBodyDataIngressConfsRulesPathsBackend setServicePort(String servicePort) {
            this.servicePort = servicePort;
            return this;
        }
        public String getServicePort() {
            return this.servicePort;
        }

    }

    public static class ListK8sIngressRulesResponseBodyDataIngressConfsRulesPaths extends TeaModel {
        /**
         * <p>The ID of the EDAS application.</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The name of the EDAS application.</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The configuration of the backend service.</p>
         */
        @NameInMap("Backend")
        public ListK8sIngressRulesResponseBodyDataIngressConfsRulesPathsBackend backend;

        /**
         * <p>The collection rate that is set based on the trace query feature. You can add a TraceID to a gateway to use the trace query feature of EDAS.</p>
         */
        @NameInMap("CollectRate")
        public Integer collectRate;

        /**
         * <p>The path to be accessed.</p>
         */
        @NameInMap("Path")
        public String path;

        @NameInMap("PathType")
        public String pathType;

        /**
         * <p>The status of the Ingress. Valid values:</p>
         * <br>
         * <p>*   **Normal**: The Ingress works properly.</p>
         * <p>*   **ServiceNotFound**: The backend service does not exist.</p>
         * <p>*   **InvalidServicePort**: The service port is invalid.</p>
         * <p>*   **NotManagedService**: The service is not managed by EDAS.</p>
         * <p>*   **Unknown**: An unknown error occurred.</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListK8sIngressRulesResponseBodyDataIngressConfsRulesPaths build(java.util.Map<String, ?> map) throws Exception {
            ListK8sIngressRulesResponseBodyDataIngressConfsRulesPaths self = new ListK8sIngressRulesResponseBodyDataIngressConfsRulesPaths();
            return TeaModel.build(map, self);
        }

        public ListK8sIngressRulesResponseBodyDataIngressConfsRulesPaths setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListK8sIngressRulesResponseBodyDataIngressConfsRulesPaths setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListK8sIngressRulesResponseBodyDataIngressConfsRulesPaths setBackend(ListK8sIngressRulesResponseBodyDataIngressConfsRulesPathsBackend backend) {
            this.backend = backend;
            return this;
        }
        public ListK8sIngressRulesResponseBodyDataIngressConfsRulesPathsBackend getBackend() {
            return this.backend;
        }

        public ListK8sIngressRulesResponseBodyDataIngressConfsRulesPaths setCollectRate(Integer collectRate) {
            this.collectRate = collectRate;
            return this;
        }
        public Integer getCollectRate() {
            return this.collectRate;
        }

        public ListK8sIngressRulesResponseBodyDataIngressConfsRulesPaths setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListK8sIngressRulesResponseBodyDataIngressConfsRulesPaths setPathType(String pathType) {
            this.pathType = pathType;
            return this;
        }
        public String getPathType() {
            return this.pathType;
        }

        public ListK8sIngressRulesResponseBodyDataIngressConfsRulesPaths setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListK8sIngressRulesResponseBodyDataIngressConfsRules extends TeaModel {
        /**
         * <p>Indicates whether TLS is enabled. Valid values:</p>
         * <br>
         * <p>*   true: TLS is enabled.</p>
         * <p>*   false: TLS is disabled.</p>
         */
        @NameInMap("EnableTls")
        public Boolean enableTls;

        /**
         * <p>The domain name to be accessed.</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The list of paths to be accessed.</p>
         */
        @NameInMap("Paths")
        public java.util.List<ListK8sIngressRulesResponseBodyDataIngressConfsRulesPaths> paths;

        /**
         * <p>The name of the Secret that stores the information about the Transport Layer Security (TLS) certificate.</p>
         */
        @NameInMap("SecretName")
        public String secretName;

        public static ListK8sIngressRulesResponseBodyDataIngressConfsRules build(java.util.Map<String, ?> map) throws Exception {
            ListK8sIngressRulesResponseBodyDataIngressConfsRules self = new ListK8sIngressRulesResponseBodyDataIngressConfsRules();
            return TeaModel.build(map, self);
        }

        public ListK8sIngressRulesResponseBodyDataIngressConfsRules setEnableTls(Boolean enableTls) {
            this.enableTls = enableTls;
            return this;
        }
        public Boolean getEnableTls() {
            return this.enableTls;
        }

        public ListK8sIngressRulesResponseBodyDataIngressConfsRules setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public ListK8sIngressRulesResponseBodyDataIngressConfsRules setPaths(java.util.List<ListK8sIngressRulesResponseBodyDataIngressConfsRulesPaths> paths) {
            this.paths = paths;
            return this;
        }
        public java.util.List<ListK8sIngressRulesResponseBodyDataIngressConfsRulesPaths> getPaths() {
            return this.paths;
        }

        public ListK8sIngressRulesResponseBodyDataIngressConfsRules setSecretName(String secretName) {
            this.secretName = secretName;
            return this;
        }
        public String getSecretName() {
            return this.secretName;
        }

    }

    public static class ListK8sIngressRulesResponseBodyDataIngressConfs extends TeaModel {
        /**
         * <p>The ID of the Application Load Balancer (ALB) instance.</p>
         */
        @NameInMap("AlbId")
        public String albId;

        /**
         * <p>The annotations.</p>
         */
        @NameInMap("Annotations")
        public String annotations;

        /**
         * <p>The time when the Ingress was created.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The monitoring URL of the Ingress.</p>
         */
        @NameInMap("DashboardUrl")
        public String dashboardUrl;

        /**
         * <p>The IP address of the Ingress.</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>The type of the Ingress. Valid values:</p>
         * <br>
         * <p>*   **NginxIngress**: NGINX Ingress controller</p>
         * <p>*   **AlbIngress**: ALB Ingress controller</p>
         * <br>
         * <p>Default value: NginxIngress.</p>
         */
        @NameInMap("IngressType")
        public String ingressType;

        /**
         * <p>The labels.</p>
         */
        @NameInMap("Labels")
        public String labels;

        /**
         * <p>The ID of the Microservices Engine (MSE) gateway.</p>
         */
        @NameInMap("MseGatewayId")
        public String mseGatewayId;

        /**
         * <p>The name of the MSE gateway.</p>
         */
        @NameInMap("MseGatewayName")
        public String mseGatewayName;

        /**
         * <p>The name of the Ingress.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The Kubernetes namespace to which the Ingress belongs.</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The URL used for basic monitoring of the open source version.</p>
         */
        @NameInMap("OfficalBasicUrl")
        public String officalBasicUrl;

        /**
         * <p>The URL used for request performance monitoring of the open source version.</p>
         */
        @NameInMap("OfficalRequestUrl")
        public String officalRequestUrl;

        /**
         * <p>The list of routing rules.</p>
         */
        @NameInMap("Rules")
        public java.util.List<ListK8sIngressRulesResponseBodyDataIngressConfsRules> rules;

        /**
         * <p>Indicates whether SSL redirect is enabled. Valid values:</p>
         * <br>
         * <p>*   true: SSL redirect is enabled.</p>
         * <p>*   false: SSL redirect is disabled.</p>
         */
        @NameInMap("SslRedirect")
        public Boolean sslRedirect;

        public static ListK8sIngressRulesResponseBodyDataIngressConfs build(java.util.Map<String, ?> map) throws Exception {
            ListK8sIngressRulesResponseBodyDataIngressConfs self = new ListK8sIngressRulesResponseBodyDataIngressConfs();
            return TeaModel.build(map, self);
        }

        public ListK8sIngressRulesResponseBodyDataIngressConfs setAlbId(String albId) {
            this.albId = albId;
            return this;
        }
        public String getAlbId() {
            return this.albId;
        }

        public ListK8sIngressRulesResponseBodyDataIngressConfs setAnnotations(String annotations) {
            this.annotations = annotations;
            return this;
        }
        public String getAnnotations() {
            return this.annotations;
        }

        public ListK8sIngressRulesResponseBodyDataIngressConfs setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListK8sIngressRulesResponseBodyDataIngressConfs setDashboardUrl(String dashboardUrl) {
            this.dashboardUrl = dashboardUrl;
            return this;
        }
        public String getDashboardUrl() {
            return this.dashboardUrl;
        }

        public ListK8sIngressRulesResponseBodyDataIngressConfs setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public ListK8sIngressRulesResponseBodyDataIngressConfs setIngressType(String ingressType) {
            this.ingressType = ingressType;
            return this;
        }
        public String getIngressType() {
            return this.ingressType;
        }

        public ListK8sIngressRulesResponseBodyDataIngressConfs setLabels(String labels) {
            this.labels = labels;
            return this;
        }
        public String getLabels() {
            return this.labels;
        }

        public ListK8sIngressRulesResponseBodyDataIngressConfs setMseGatewayId(String mseGatewayId) {
            this.mseGatewayId = mseGatewayId;
            return this;
        }
        public String getMseGatewayId() {
            return this.mseGatewayId;
        }

        public ListK8sIngressRulesResponseBodyDataIngressConfs setMseGatewayName(String mseGatewayName) {
            this.mseGatewayName = mseGatewayName;
            return this;
        }
        public String getMseGatewayName() {
            return this.mseGatewayName;
        }

        public ListK8sIngressRulesResponseBodyDataIngressConfs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListK8sIngressRulesResponseBodyDataIngressConfs setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListK8sIngressRulesResponseBodyDataIngressConfs setOfficalBasicUrl(String officalBasicUrl) {
            this.officalBasicUrl = officalBasicUrl;
            return this;
        }
        public String getOfficalBasicUrl() {
            return this.officalBasicUrl;
        }

        public ListK8sIngressRulesResponseBodyDataIngressConfs setOfficalRequestUrl(String officalRequestUrl) {
            this.officalRequestUrl = officalRequestUrl;
            return this;
        }
        public String getOfficalRequestUrl() {
            return this.officalRequestUrl;
        }

        public ListK8sIngressRulesResponseBodyDataIngressConfs setRules(java.util.List<ListK8sIngressRulesResponseBodyDataIngressConfsRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<ListK8sIngressRulesResponseBodyDataIngressConfsRules> getRules() {
            return this.rules;
        }

        public ListK8sIngressRulesResponseBodyDataIngressConfs setSslRedirect(Boolean sslRedirect) {
            this.sslRedirect = sslRedirect;
            return this;
        }
        public Boolean getSslRedirect() {
            return this.sslRedirect;
        }

    }

    public static class ListK8sIngressRulesResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the Kubernetes cluster.</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The name of the Kubernetes cluster.</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <p>The Ingresses.</p>
         */
        @NameInMap("IngressConfs")
        public java.util.List<ListK8sIngressRulesResponseBodyDataIngressConfs> ingressConfs;

        /**
         * <p>The ID of the region where the cluster resides.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static ListK8sIngressRulesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListK8sIngressRulesResponseBodyData self = new ListK8sIngressRulesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListK8sIngressRulesResponseBodyData setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListK8sIngressRulesResponseBodyData setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public ListK8sIngressRulesResponseBodyData setIngressConfs(java.util.List<ListK8sIngressRulesResponseBodyDataIngressConfs> ingressConfs) {
            this.ingressConfs = ingressConfs;
            return this;
        }
        public java.util.List<ListK8sIngressRulesResponseBodyDataIngressConfs> getIngressConfs() {
            return this.ingressConfs;
        }

        public ListK8sIngressRulesResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
