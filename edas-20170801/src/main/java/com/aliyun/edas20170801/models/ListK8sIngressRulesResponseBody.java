// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListK8sIngressRulesResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<ListK8sIngressRulesResponseBodyData> data;

    @NameInMap("Message")
    public String message;

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
        @NameInMap("ServiceName")
        public String serviceName;

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
        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("Backend")
        public ListK8sIngressRulesResponseBodyDataIngressConfsRulesPathsBackend backend;

        @NameInMap("Path")
        public String path;

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

        public ListK8sIngressRulesResponseBodyDataIngressConfsRulesPaths setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
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
        @NameInMap("EnableTls")
        public Boolean enableTls;

        @NameInMap("Host")
        public String host;

        @NameInMap("Paths")
        public java.util.List<ListK8sIngressRulesResponseBodyDataIngressConfsRulesPaths> paths;

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
        @NameInMap("AlbId")
        public String albId;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("DashboardUrl")
        public String dashboardUrl;

        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("IngressType")
        public String ingressType;

        @NameInMap("Name")
        public String name;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("Rules")
        public java.util.List<ListK8sIngressRulesResponseBodyDataIngressConfsRules> rules;

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
        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("IngressConfs")
        public java.util.List<ListK8sIngressRulesResponseBodyDataIngressConfs> ingressConfs;

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
