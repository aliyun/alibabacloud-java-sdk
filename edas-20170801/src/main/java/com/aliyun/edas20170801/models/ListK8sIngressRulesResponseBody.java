// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListK8sIngressRulesResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("IngressConfigs")
    public java.util.List<ListK8sIngressRulesResponseBodyIngressConfigs> ingressConfigs;

    @NameInMap("Code")
    public Integer code;

    public static ListK8sIngressRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListK8sIngressRulesResponseBody self = new ListK8sIngressRulesResponseBody();
        return TeaModel.build(map, self);
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

    public ListK8sIngressRulesResponseBody setIngressConfigs(java.util.List<ListK8sIngressRulesResponseBodyIngressConfigs> ingressConfigs) {
        this.ingressConfigs = ingressConfigs;
        return this;
    }
    public java.util.List<ListK8sIngressRulesResponseBodyIngressConfigs> getIngressConfigs() {
        return this.ingressConfigs;
    }

    public ListK8sIngressRulesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public static class ListK8sIngressRulesResponseBodyIngressConfigsIngressRulesIngressPaths extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("Host")
        public String host;

        @NameInMap("ServicePort")
        public Integer servicePort;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("Path")
        public String path;

        @NameInMap("ServiceName")
        public String serviceName;

        public static ListK8sIngressRulesResponseBodyIngressConfigsIngressRulesIngressPaths build(java.util.Map<String, ?> map) throws Exception {
            ListK8sIngressRulesResponseBodyIngressConfigsIngressRulesIngressPaths self = new ListK8sIngressRulesResponseBodyIngressConfigsIngressRulesIngressPaths();
            return TeaModel.build(map, self);
        }

        public ListK8sIngressRulesResponseBodyIngressConfigsIngressRulesIngressPaths setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListK8sIngressRulesResponseBodyIngressConfigsIngressRulesIngressPaths setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListK8sIngressRulesResponseBodyIngressConfigsIngressRulesIngressPaths setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public ListK8sIngressRulesResponseBodyIngressConfigsIngressRulesIngressPaths setServicePort(Integer servicePort) {
            this.servicePort = servicePort;
            return this;
        }
        public Integer getServicePort() {
            return this.servicePort;
        }

        public ListK8sIngressRulesResponseBodyIngressConfigsIngressRulesIngressPaths setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListK8sIngressRulesResponseBodyIngressConfigsIngressRulesIngressPaths setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListK8sIngressRulesResponseBodyIngressConfigsIngressRulesIngressPaths setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

    }

    public static class ListK8sIngressRulesResponseBodyIngressConfigsIngressRules extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("IngressPaths")
        public java.util.List<ListK8sIngressRulesResponseBodyIngressConfigsIngressRulesIngressPaths> ingressPaths;

        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("Name")
        public String name;

        public static ListK8sIngressRulesResponseBodyIngressConfigsIngressRules build(java.util.Map<String, ?> map) throws Exception {
            ListK8sIngressRulesResponseBodyIngressConfigsIngressRules self = new ListK8sIngressRulesResponseBodyIngressConfigsIngressRules();
            return TeaModel.build(map, self);
        }

        public ListK8sIngressRulesResponseBodyIngressConfigsIngressRules setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListK8sIngressRulesResponseBodyIngressConfigsIngressRules setIngressPaths(java.util.List<ListK8sIngressRulesResponseBodyIngressConfigsIngressRulesIngressPaths> ingressPaths) {
            this.ingressPaths = ingressPaths;
            return this;
        }
        public java.util.List<ListK8sIngressRulesResponseBodyIngressConfigsIngressRulesIngressPaths> getIngressPaths() {
            return this.ingressPaths;
        }

        public ListK8sIngressRulesResponseBodyIngressConfigsIngressRules setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public ListK8sIngressRulesResponseBodyIngressConfigsIngressRules setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListK8sIngressRulesResponseBodyIngressConfigsIngressRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListK8sIngressRulesResponseBodyIngressConfigs extends TeaModel {
        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("IngressRules")
        public java.util.List<ListK8sIngressRulesResponseBodyIngressConfigsIngressRules> ingressRules;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("RegionId")
        public String regionId;

        public static ListK8sIngressRulesResponseBodyIngressConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListK8sIngressRulesResponseBodyIngressConfigs self = new ListK8sIngressRulesResponseBodyIngressConfigs();
            return TeaModel.build(map, self);
        }

        public ListK8sIngressRulesResponseBodyIngressConfigs setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public ListK8sIngressRulesResponseBodyIngressConfigs setIngressRules(java.util.List<ListK8sIngressRulesResponseBodyIngressConfigsIngressRules> ingressRules) {
            this.ingressRules = ingressRules;
            return this;
        }
        public java.util.List<ListK8sIngressRulesResponseBodyIngressConfigsIngressRules> getIngressRules() {
            return this.ingressRules;
        }

        public ListK8sIngressRulesResponseBodyIngressConfigs setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListK8sIngressRulesResponseBodyIngressConfigs setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
