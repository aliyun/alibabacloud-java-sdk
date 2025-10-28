// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListK8sIngressRulesResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListK8sIngressRulesResponseBodyData> data;

    /**
     * <p>The message that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5C1C9DE7-88FF-4B56-A47B-3DBBCEB******</p>
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
         * <p>The name of the backend Service.</p>
         * 
         * <strong>example:</strong>
         * <p>http-service</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        /**
         * <p>The port of the backend Service.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
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
         * 
         * <strong>example:</strong>
         * <p>43d30ba5-c568-460c-8080-d447ed1a****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The name of the EDAS application.</p>
         * 
         * <strong>example:</strong>
         * <p>my-app</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The configurations of the backend Service.</p>
         */
        @NameInMap("Backend")
        public ListK8sIngressRulesResponseBodyDataIngressConfsRulesPathsBackend backend;

        /**
         * <p>The collection rate that is set based on the trace query feature. You can add a trace ID to a gateway to use the trace query feature of EDAS.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CollectRate")
        public Integer collectRate;

        /**
         * <p>The path to be accessed.</p>
         * 
         * <strong>example:</strong>
         * <p>/foo/bar</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The path type that determines how a path is matched.</p>
         * <ul>
         * <li>ImplementationSpecific (default)</li>
         * <li>Exact</li>
         * <li>Prefix</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ImplementationSpecific</p>
         */
        @NameInMap("PathType")
        public String pathType;

        /**
         * <p>The state of the Ingress. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong>: The Ingress works as expected.</li>
         * <li><strong>ServiceNotFound</strong>: The backend Service does not exist.</li>
         * <li><strong>InvalidServicePort</strong>: The Service port is invalid.</li>
         * <li><strong>NotManagedService</strong>: The Service is not managed by EDAS.</li>
         * <li><strong>Unknown</strong>: An unknown error occurred.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
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
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableTls")
        public Boolean enableTls;

        /**
         * <p>The domain name to be accessed.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The paths to be accessed.</p>
         */
        @NameInMap("Paths")
        public java.util.List<ListK8sIngressRulesResponseBodyDataIngressConfsRulesPaths> paths;

        /**
         * <p>The name of the Secret that stores the Transport Layer Security (TLS) certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>my-secret</p>
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
         * <p>The ID of the ALB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>alb-5sde0tq62r********</p>
         */
        @NameInMap("AlbId")
        public String albId;

        /**
         * <p>The annotations.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;test-annotation&quot;:&quot;test-annotation-value&quot;}</p>
         */
        @NameInMap("Annotations")
        public String annotations;

        /**
         * <p>The time when the Ingress was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-04-27 20:16:52</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The monitoring URL of the Ingress.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://grafana.console.aliyun.com/d/10xxxx/ingress">http://grafana.console.aliyun.com/d/10xxxx/ingress</a></p>
         */
        @NameInMap("DashboardUrl")
        public String dashboardUrl;

        /**
         * <p>The IP address of the Ingress.</p>
         * 
         * <strong>example:</strong>
         * <p>47.11x.xx.xx</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>The Ingress type. Valid values:</p>
         * <ul>
         * <li><strong>NginxIngress</strong>: NGINX Ingress controller</li>
         * <li><strong>AlbIngress</strong>: ALB Ingress controller</li>
         * </ul>
         * <p>Default value: NginxIngress.</p>
         * 
         * <strong>example:</strong>
         * <p>NginxIngress</p>
         */
        @NameInMap("IngressType")
        public String ingressType;

        /**
         * <p>The tags.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;test-label&quot;: &quot;test-labels&quot;}</p>
         */
        @NameInMap("Labels")
        public String labels;

        /**
         * <p>The ID of the MSE gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-xxxxxxxx</p>
         */
        @NameInMap("MseGatewayId")
        public String mseGatewayId;

        /**
         * <p>The name of the MSE gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-test-name</p>
         */
        @NameInMap("MseGatewayName")
        public String mseGatewayName;

        /**
         * <p>The Ingress name.</p>
         * 
         * <strong>example:</strong>
         * <p>my-ingress</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The Kubernetes namespace to which the Ingress belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The URL used for basic monitoring of the open source version.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://g.console.aliyun.com/d/xxxxxx/nginx-ingress-dashboard-official">https://g.console.aliyun.com/d/xxxxxx/nginx-ingress-dashboard-official</a></p>
         */
        @NameInMap("OfficalBasicUrl")
        public String officalBasicUrl;

        /**
         * <p>The URL used for request performance monitoring of the open source version.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://g.console.aliyun.com/d/xxxxxx/request-handling-performance-official">https://g.console.aliyun.com/d/xxxxxx/request-handling-performance-official</a></p>
         */
        @NameInMap("OfficalRequestUrl")
        public String officalRequestUrl;

        /**
         * <p>The routing rules.</p>
         */
        @NameInMap("Rules")
        public java.util.List<ListK8sIngressRulesResponseBodyDataIngressConfsRules> rules;

        /**
         * <p>Indicates whether SSL redirection is enabled. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5b2b4ab4-efbc-4a81-9c45-a5942881****</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The cluster name.</p>
         * 
         * <strong>example:</strong>
         * <p>my-dev-cluster</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <p>The Ingresses.</p>
         */
        @NameInMap("IngressConfs")
        public java.util.List<ListK8sIngressRulesResponseBodyDataIngressConfs> ingressConfs;

        /**
         * <p>The ID of the Alibaba Cloud region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
