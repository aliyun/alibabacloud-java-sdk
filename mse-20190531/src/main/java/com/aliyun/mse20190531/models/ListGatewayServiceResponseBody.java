// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListGatewayServiceResponseBody extends TeaModel {
    // The status code returned.
    @NameInMap("Code")
    public Integer code;

    // The returned data.
    @NameInMap("Data")
    public ListGatewayServiceResponseBodyData data;

    // The HTTP status code returned.
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // The error message.
    @NameInMap("Message")
    public String message;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request was successful. Valid values:
    // 
    // *   `true`: The request was successful.
    // *   `false`: The request failed.
    @NameInMap("Success")
    public Boolean success;

    public static ListGatewayServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayServiceResponseBody self = new ListGatewayServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGatewayServiceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListGatewayServiceResponseBody setData(ListGatewayServiceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListGatewayServiceResponseBodyData getData() {
        return this.data;
    }

    public ListGatewayServiceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListGatewayServiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListGatewayServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListGatewayServiceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListGatewayServiceResponseBodyDataResultGatewayTrafficPolicyLoadBalancerSettingsConsistentHashLBConfigHttpCookie extends TeaModel {
        // The name of the cookie.
        @NameInMap("Name")
        public String name;

        // The path of the cookie.
        @NameInMap("Path")
        public String path;

        // The lifecycle of the cookie.
        @NameInMap("Ttl")
        public String ttl;

        public static ListGatewayServiceResponseBodyDataResultGatewayTrafficPolicyLoadBalancerSettingsConsistentHashLBConfigHttpCookie build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayServiceResponseBodyDataResultGatewayTrafficPolicyLoadBalancerSettingsConsistentHashLBConfigHttpCookie self = new ListGatewayServiceResponseBodyDataResultGatewayTrafficPolicyLoadBalancerSettingsConsistentHashLBConfigHttpCookie();
            return TeaModel.build(map, self);
        }

        public ListGatewayServiceResponseBodyDataResultGatewayTrafficPolicyLoadBalancerSettingsConsistentHashLBConfigHttpCookie setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListGatewayServiceResponseBodyDataResultGatewayTrafficPolicyLoadBalancerSettingsConsistentHashLBConfigHttpCookie setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListGatewayServiceResponseBodyDataResultGatewayTrafficPolicyLoadBalancerSettingsConsistentHashLBConfigHttpCookie setTtl(String ttl) {
            this.ttl = ttl;
            return this;
        }
        public String getTtl() {
            return this.ttl;
        }

    }

    public static class ListGatewayServiceResponseBodyDataResultGatewayTrafficPolicyLoadBalancerSettingsConsistentHashLBConfig extends TeaModel {
        // The type based on which consistent hashing load balancing is performed.
        // 
        // *   HEADER
        // *   COOKIE
        // *   SOURCE_IP
        // *   QUERY_PARAMETER
        @NameInMap("ConsistentHashLBType")
        public String consistentHashLBType;

        // The cookie-based load balancing parameters.
        @NameInMap("HttpCookie")
        public ListGatewayServiceResponseBodyDataResultGatewayTrafficPolicyLoadBalancerSettingsConsistentHashLBConfigHttpCookie httpCookie;

        // The minimum value of the hash ring.
        @NameInMap("MinimumRingSize")
        public Long minimumRingSize;

        // The name of the parameter.
        @NameInMap("ParameterName")
        public String parameterName;

        public static ListGatewayServiceResponseBodyDataResultGatewayTrafficPolicyLoadBalancerSettingsConsistentHashLBConfig build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayServiceResponseBodyDataResultGatewayTrafficPolicyLoadBalancerSettingsConsistentHashLBConfig self = new ListGatewayServiceResponseBodyDataResultGatewayTrafficPolicyLoadBalancerSettingsConsistentHashLBConfig();
            return TeaModel.build(map, self);
        }

        public ListGatewayServiceResponseBodyDataResultGatewayTrafficPolicyLoadBalancerSettingsConsistentHashLBConfig setConsistentHashLBType(String consistentHashLBType) {
            this.consistentHashLBType = consistentHashLBType;
            return this;
        }
        public String getConsistentHashLBType() {
            return this.consistentHashLBType;
        }

        public ListGatewayServiceResponseBodyDataResultGatewayTrafficPolicyLoadBalancerSettingsConsistentHashLBConfig setHttpCookie(ListGatewayServiceResponseBodyDataResultGatewayTrafficPolicyLoadBalancerSettingsConsistentHashLBConfigHttpCookie httpCookie) {
            this.httpCookie = httpCookie;
            return this;
        }
        public ListGatewayServiceResponseBodyDataResultGatewayTrafficPolicyLoadBalancerSettingsConsistentHashLBConfigHttpCookie getHttpCookie() {
            return this.httpCookie;
        }

        public ListGatewayServiceResponseBodyDataResultGatewayTrafficPolicyLoadBalancerSettingsConsistentHashLBConfig setMinimumRingSize(Long minimumRingSize) {
            this.minimumRingSize = minimumRingSize;
            return this;
        }
        public Long getMinimumRingSize() {
            return this.minimumRingSize;
        }

        public ListGatewayServiceResponseBodyDataResultGatewayTrafficPolicyLoadBalancerSettingsConsistentHashLBConfig setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

    }

    public static class ListGatewayServiceResponseBodyDataResultGatewayTrafficPolicyLoadBalancerSettings extends TeaModel {
        // The consistent hashing settings.
        @NameInMap("ConsistentHashLBConfig")
        public ListGatewayServiceResponseBodyDataResultGatewayTrafficPolicyLoadBalancerSettingsConsistentHashLBConfig consistentHashLBConfig;

        // The load balancing type.
        // 
        // *   ROUND_ROBIN
        // *   LEAST_CONN
        // *   RANDOM
        // *   CONSISTENT_HASH
        @NameInMap("LoadbalancerType")
        public String loadbalancerType;

        // The prefetch time of least connection load balancing.
        @NameInMap("WarmupDuration")
        public Integer warmupDuration;

        public static ListGatewayServiceResponseBodyDataResultGatewayTrafficPolicyLoadBalancerSettings build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayServiceResponseBodyDataResultGatewayTrafficPolicyLoadBalancerSettings self = new ListGatewayServiceResponseBodyDataResultGatewayTrafficPolicyLoadBalancerSettings();
            return TeaModel.build(map, self);
        }

        public ListGatewayServiceResponseBodyDataResultGatewayTrafficPolicyLoadBalancerSettings setConsistentHashLBConfig(ListGatewayServiceResponseBodyDataResultGatewayTrafficPolicyLoadBalancerSettingsConsistentHashLBConfig consistentHashLBConfig) {
            this.consistentHashLBConfig = consistentHashLBConfig;
            return this;
        }
        public ListGatewayServiceResponseBodyDataResultGatewayTrafficPolicyLoadBalancerSettingsConsistentHashLBConfig getConsistentHashLBConfig() {
            return this.consistentHashLBConfig;
        }

        public ListGatewayServiceResponseBodyDataResultGatewayTrafficPolicyLoadBalancerSettings setLoadbalancerType(String loadbalancerType) {
            this.loadbalancerType = loadbalancerType;
            return this;
        }
        public String getLoadbalancerType() {
            return this.loadbalancerType;
        }

        public ListGatewayServiceResponseBodyDataResultGatewayTrafficPolicyLoadBalancerSettings setWarmupDuration(Integer warmupDuration) {
            this.warmupDuration = warmupDuration;
            return this;
        }
        public Integer getWarmupDuration() {
            return this.warmupDuration;
        }

    }

    public static class ListGatewayServiceResponseBodyDataResultGatewayTrafficPolicyTls extends TeaModel {
        // The public key of the CA certificate .
        @NameInMap("CaCertContent")
        public String caCertContent;

        // The ID of the certification authority (CA) certificate.
        @NameInMap("CaCertId")
        public String caCertId;

        // The ID of the certificate.
        @NameInMap("CertId")
        public String certId;

        // The TLS mode.
        // 
        // *   DISABLE
        // *   SIMPLE
        // *   MUTUAL
        // *   ISTIO_MUTUAL
        @NameInMap("Mode")
        public String mode;

        // The Server Name Indication (SNI) value.
        @NameInMap("Sni")
        public String sni;

        // The array of subject aliases.
        @NameInMap("SubjectAltNames")
        public java.util.List<String> subjectAltNames;

        public static ListGatewayServiceResponseBodyDataResultGatewayTrafficPolicyTls build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayServiceResponseBodyDataResultGatewayTrafficPolicyTls self = new ListGatewayServiceResponseBodyDataResultGatewayTrafficPolicyTls();
            return TeaModel.build(map, self);
        }

        public ListGatewayServiceResponseBodyDataResultGatewayTrafficPolicyTls setCaCertContent(String caCertContent) {
            this.caCertContent = caCertContent;
            return this;
        }
        public String getCaCertContent() {
            return this.caCertContent;
        }

        public ListGatewayServiceResponseBodyDataResultGatewayTrafficPolicyTls setCaCertId(String caCertId) {
            this.caCertId = caCertId;
            return this;
        }
        public String getCaCertId() {
            return this.caCertId;
        }

        public ListGatewayServiceResponseBodyDataResultGatewayTrafficPolicyTls setCertId(String certId) {
            this.certId = certId;
            return this;
        }
        public String getCertId() {
            return this.certId;
        }

        public ListGatewayServiceResponseBodyDataResultGatewayTrafficPolicyTls setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public ListGatewayServiceResponseBodyDataResultGatewayTrafficPolicyTls setSni(String sni) {
            this.sni = sni;
            return this;
        }
        public String getSni() {
            return this.sni;
        }

        public ListGatewayServiceResponseBodyDataResultGatewayTrafficPolicyTls setSubjectAltNames(java.util.List<String> subjectAltNames) {
            this.subjectAltNames = subjectAltNames;
            return this;
        }
        public java.util.List<String> getSubjectAltNames() {
            return this.subjectAltNames;
        }

    }

    public static class ListGatewayServiceResponseBodyDataResultGatewayTrafficPolicy extends TeaModel {
        // The load balancing settings.
        @NameInMap("LoadBalancerSettings")
        public ListGatewayServiceResponseBodyDataResultGatewayTrafficPolicyLoadBalancerSettings loadBalancerSettings;

        // TLS.
        @NameInMap("Tls")
        public ListGatewayServiceResponseBodyDataResultGatewayTrafficPolicyTls tls;

        public static ListGatewayServiceResponseBodyDataResultGatewayTrafficPolicy build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayServiceResponseBodyDataResultGatewayTrafficPolicy self = new ListGatewayServiceResponseBodyDataResultGatewayTrafficPolicy();
            return TeaModel.build(map, self);
        }

        public ListGatewayServiceResponseBodyDataResultGatewayTrafficPolicy setLoadBalancerSettings(ListGatewayServiceResponseBodyDataResultGatewayTrafficPolicyLoadBalancerSettings loadBalancerSettings) {
            this.loadBalancerSettings = loadBalancerSettings;
            return this;
        }
        public ListGatewayServiceResponseBodyDataResultGatewayTrafficPolicyLoadBalancerSettings getLoadBalancerSettings() {
            return this.loadBalancerSettings;
        }

        public ListGatewayServiceResponseBodyDataResultGatewayTrafficPolicy setTls(ListGatewayServiceResponseBodyDataResultGatewayTrafficPolicyTls tls) {
            this.tls = tls;
            return this;
        }
        public ListGatewayServiceResponseBodyDataResultGatewayTrafficPolicyTls getTls() {
            return this.tls;
        }

    }

    public static class ListGatewayServiceResponseBodyDataResultHealthCheckInfo extends TeaModel {
        // Indicates whether checks are performed.
        @NameInMap("Check")
        public Boolean check;

        // The expected status of the health check.
        @NameInMap("ExpectedStatuses")
        public java.util.List<Integer> expectedStatuses;

        // The threshold for healthy instances.
        @NameInMap("HealthyThreshold")
        public Integer healthyThreshold;

        // The URL of the HTTP request for the health check.
        @NameInMap("HttpHost")
        public String httpHost;

        // The path to which the HTTP request for the health check is sent.
        @NameInMap("HttpPath")
        public String httpPath;

        // The health check interval.
        @NameInMap("Interval")
        public Integer interval;

        // The network protocol.
        @NameInMap("Protocol")
        public String protocol;

        // The timeout period.
        @NameInMap("Timeout")
        public Integer timeout;

        // The threshold for unhealthy instances.
        @NameInMap("UnhealthyThreshold")
        public Integer unhealthyThreshold;

        public static ListGatewayServiceResponseBodyDataResultHealthCheckInfo build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayServiceResponseBodyDataResultHealthCheckInfo self = new ListGatewayServiceResponseBodyDataResultHealthCheckInfo();
            return TeaModel.build(map, self);
        }

        public ListGatewayServiceResponseBodyDataResultHealthCheckInfo setCheck(Boolean check) {
            this.check = check;
            return this;
        }
        public Boolean getCheck() {
            return this.check;
        }

        public ListGatewayServiceResponseBodyDataResultHealthCheckInfo setExpectedStatuses(java.util.List<Integer> expectedStatuses) {
            this.expectedStatuses = expectedStatuses;
            return this;
        }
        public java.util.List<Integer> getExpectedStatuses() {
            return this.expectedStatuses;
        }

        public ListGatewayServiceResponseBodyDataResultHealthCheckInfo setHealthyThreshold(Integer healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }
        public Integer getHealthyThreshold() {
            return this.healthyThreshold;
        }

        public ListGatewayServiceResponseBodyDataResultHealthCheckInfo setHttpHost(String httpHost) {
            this.httpHost = httpHost;
            return this;
        }
        public String getHttpHost() {
            return this.httpHost;
        }

        public ListGatewayServiceResponseBodyDataResultHealthCheckInfo setHttpPath(String httpPath) {
            this.httpPath = httpPath;
            return this;
        }
        public String getHttpPath() {
            return this.httpPath;
        }

        public ListGatewayServiceResponseBodyDataResultHealthCheckInfo setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public ListGatewayServiceResponseBodyDataResultHealthCheckInfo setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public ListGatewayServiceResponseBodyDataResultHealthCheckInfo setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public ListGatewayServiceResponseBodyDataResultHealthCheckInfo setUnhealthyThreshold(Integer unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }
        public Integer getUnhealthyThreshold() {
            return this.unhealthyThreshold;
        }

    }

    public static class ListGatewayServiceResponseBodyDataResultVersions extends TeaModel {
        // The version number.
        @NameInMap("Name")
        public String name;

        public static ListGatewayServiceResponseBodyDataResultVersions build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayServiceResponseBodyDataResultVersions self = new ListGatewayServiceResponseBodyDataResultVersions();
            return TeaModel.build(map, self);
        }

        public ListGatewayServiceResponseBodyDataResultVersions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListGatewayServiceResponseBodyDataResult extends TeaModel {
        // The ID of the gateway.
        @NameInMap("GatewayId")
        public Long gatewayId;

        // The traffic management policy.
        @NameInMap("GatewayTrafficPolicy")
        public ListGatewayServiceResponseBodyDataResultGatewayTrafficPolicy gatewayTrafficPolicy;

        // The unique ID of the gateway.
        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        // The time when the service was created.
        @NameInMap("GmtCreate")
        public String gmtCreate;

        // The time when the service was last modified.
        @NameInMap("GmtModified")
        public String gmtModified;

        // The group.
        @NameInMap("GroupName")
        public String groupName;

        // The health status.
        // 
        // *   Health
        // *   Unhealthy
        // *   Unknown
        @NameInMap("HealehStatus")
        public String healehStatus;

        // Indicates whether health checks are performed.
        @NameInMap("HealthCheck")
        public Boolean healthCheck;

        // The information about health checks.
        @NameInMap("HealthCheckInfo")
        public ListGatewayServiceResponseBodyDataResultHealthCheckInfo healthCheckInfo;

        // The health status.
        // 
        // *   Health
        // *   Unhealthy
        // *   Unknown
        @NameInMap("HealthStatus")
        public String healthStatus;

        // ID.
        @NameInMap("Id")
        public Long id;

        // The IP addresses of the service.
        @NameInMap("Ips")
        public java.util.List<String> ips;

        // The metadata or IP addresses of the service.
        @NameInMap("MetaInfo")
        public String metaInfo;

        // The name of the service.
        @NameInMap("Name")
        public String name;

        // The namespace.
        @NameInMap("Namespace")
        public String namespace;

        // The port array.
        @NameInMap("Ports")
        public java.util.List<Integer> ports;

        // The name of the service registered with the service registry.
        @NameInMap("ServiceNameInRegistry")
        public String serviceNameInRegistry;

        // The service port.
        @NameInMap("ServicePort")
        public Long servicePort;

        // The protocol of the service.
        @NameInMap("ServiceProtocol")
        public String serviceProtocol;

        // The ID of the service source.
        @NameInMap("SourceId")
        public Long sourceId;

        // The type of the service source.
        @NameInMap("SourceType")
        public String sourceType;

        // The array of unhealthy endpoints.
        @NameInMap("UnhealthyEndpoints")
        public java.util.List<String> unhealthyEndpoints;

        // The version of the service.
        @NameInMap("Versions")
        public java.util.List<ListGatewayServiceResponseBodyDataResultVersions> versions;

        public static ListGatewayServiceResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayServiceResponseBodyDataResult self = new ListGatewayServiceResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public ListGatewayServiceResponseBodyDataResult setGatewayId(Long gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public Long getGatewayId() {
            return this.gatewayId;
        }

        public ListGatewayServiceResponseBodyDataResult setGatewayTrafficPolicy(ListGatewayServiceResponseBodyDataResultGatewayTrafficPolicy gatewayTrafficPolicy) {
            this.gatewayTrafficPolicy = gatewayTrafficPolicy;
            return this;
        }
        public ListGatewayServiceResponseBodyDataResultGatewayTrafficPolicy getGatewayTrafficPolicy() {
            return this.gatewayTrafficPolicy;
        }

        public ListGatewayServiceResponseBodyDataResult setGatewayUniqueId(String gatewayUniqueId) {
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        public ListGatewayServiceResponseBodyDataResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListGatewayServiceResponseBodyDataResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListGatewayServiceResponseBodyDataResult setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ListGatewayServiceResponseBodyDataResult setHealehStatus(String healehStatus) {
            this.healehStatus = healehStatus;
            return this;
        }
        public String getHealehStatus() {
            return this.healehStatus;
        }

        public ListGatewayServiceResponseBodyDataResult setHealthCheck(Boolean healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }
        public Boolean getHealthCheck() {
            return this.healthCheck;
        }

        public ListGatewayServiceResponseBodyDataResult setHealthCheckInfo(ListGatewayServiceResponseBodyDataResultHealthCheckInfo healthCheckInfo) {
            this.healthCheckInfo = healthCheckInfo;
            return this;
        }
        public ListGatewayServiceResponseBodyDataResultHealthCheckInfo getHealthCheckInfo() {
            return this.healthCheckInfo;
        }

        public ListGatewayServiceResponseBodyDataResult setHealthStatus(String healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }
        public String getHealthStatus() {
            return this.healthStatus;
        }

        public ListGatewayServiceResponseBodyDataResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListGatewayServiceResponseBodyDataResult setIps(java.util.List<String> ips) {
            this.ips = ips;
            return this;
        }
        public java.util.List<String> getIps() {
            return this.ips;
        }

        public ListGatewayServiceResponseBodyDataResult setMetaInfo(String metaInfo) {
            this.metaInfo = metaInfo;
            return this;
        }
        public String getMetaInfo() {
            return this.metaInfo;
        }

        public ListGatewayServiceResponseBodyDataResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListGatewayServiceResponseBodyDataResult setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListGatewayServiceResponseBodyDataResult setPorts(java.util.List<Integer> ports) {
            this.ports = ports;
            return this;
        }
        public java.util.List<Integer> getPorts() {
            return this.ports;
        }

        public ListGatewayServiceResponseBodyDataResult setServiceNameInRegistry(String serviceNameInRegistry) {
            this.serviceNameInRegistry = serviceNameInRegistry;
            return this;
        }
        public String getServiceNameInRegistry() {
            return this.serviceNameInRegistry;
        }

        public ListGatewayServiceResponseBodyDataResult setServicePort(Long servicePort) {
            this.servicePort = servicePort;
            return this;
        }
        public Long getServicePort() {
            return this.servicePort;
        }

        public ListGatewayServiceResponseBodyDataResult setServiceProtocol(String serviceProtocol) {
            this.serviceProtocol = serviceProtocol;
            return this;
        }
        public String getServiceProtocol() {
            return this.serviceProtocol;
        }

        public ListGatewayServiceResponseBodyDataResult setSourceId(Long sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public Long getSourceId() {
            return this.sourceId;
        }

        public ListGatewayServiceResponseBodyDataResult setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public ListGatewayServiceResponseBodyDataResult setUnhealthyEndpoints(java.util.List<String> unhealthyEndpoints) {
            this.unhealthyEndpoints = unhealthyEndpoints;
            return this;
        }
        public java.util.List<String> getUnhealthyEndpoints() {
            return this.unhealthyEndpoints;
        }

        public ListGatewayServiceResponseBodyDataResult setVersions(java.util.List<ListGatewayServiceResponseBodyDataResultVersions> versions) {
            this.versions = versions;
            return this;
        }
        public java.util.List<ListGatewayServiceResponseBodyDataResultVersions> getVersions() {
            return this.versions;
        }

    }

    public static class ListGatewayServiceResponseBodyData extends TeaModel {
        // The page number of the returned page.
        @NameInMap("PageNumber")
        public Integer pageNumber;

        // The maximum number of entries returned per page. Default value: 10.
        @NameInMap("PageSize")
        public Integer pageSize;

        // The returned information.
        @NameInMap("Result")
        public java.util.List<ListGatewayServiceResponseBodyDataResult> result;

        // The total number of entries returned.
        @NameInMap("TotalSize")
        public Long totalSize;

        public static ListGatewayServiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayServiceResponseBodyData self = new ListGatewayServiceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListGatewayServiceResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListGatewayServiceResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListGatewayServiceResponseBodyData setResult(java.util.List<ListGatewayServiceResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<ListGatewayServiceResponseBodyDataResult> getResult() {
            return this.result;
        }

        public ListGatewayServiceResponseBodyData setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

    }

}
