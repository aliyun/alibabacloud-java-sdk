// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class TrafficPolicy extends TeaModel {
    @NameInMap("LoadBalancerSettings")
    public TrafficPolicyLoadBalancerSettings loadBalancerSettings;

    @NameInMap("TlsSetting")
    public TrafficPolicyTlsSetting tlsSetting;

    public static TrafficPolicy build(java.util.Map<String, ?> map) throws Exception {
        TrafficPolicy self = new TrafficPolicy();
        return TeaModel.build(map, self);
    }

    public TrafficPolicy setLoadBalancerSettings(TrafficPolicyLoadBalancerSettings loadBalancerSettings) {
        this.loadBalancerSettings = loadBalancerSettings;
        return this;
    }
    public TrafficPolicyLoadBalancerSettings getLoadBalancerSettings() {
        return this.loadBalancerSettings;
    }

    public TrafficPolicy setTlsSetting(TrafficPolicyTlsSetting tlsSetting) {
        this.tlsSetting = tlsSetting;
        return this;
    }
    public TrafficPolicyTlsSetting getTlsSetting() {
        return this.tlsSetting;
    }

    public static class TrafficPolicyLoadBalancerSettingsConsistentHashLBConfigHttpCookie extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Path")
        public String path;

        @NameInMap("TTL")
        public String TTL;

        public static TrafficPolicyLoadBalancerSettingsConsistentHashLBConfigHttpCookie build(java.util.Map<String, ?> map) throws Exception {
            TrafficPolicyLoadBalancerSettingsConsistentHashLBConfigHttpCookie self = new TrafficPolicyLoadBalancerSettingsConsistentHashLBConfigHttpCookie();
            return TeaModel.build(map, self);
        }

        public TrafficPolicyLoadBalancerSettingsConsistentHashLBConfigHttpCookie setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public TrafficPolicyLoadBalancerSettingsConsistentHashLBConfigHttpCookie setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public TrafficPolicyLoadBalancerSettingsConsistentHashLBConfigHttpCookie setTTL(String TTL) {
            this.TTL = TTL;
            return this;
        }
        public String getTTL() {
            return this.TTL;
        }

    }

    public static class TrafficPolicyLoadBalancerSettingsConsistentHashLBConfig extends TeaModel {
        @NameInMap("ConsistentHashLBType")
        public String consistentHashLBType;

        @NameInMap("HttpCookie")
        public TrafficPolicyLoadBalancerSettingsConsistentHashLBConfigHttpCookie httpCookie;

        @NameInMap("ParameterName")
        public String parameterName;

        public static TrafficPolicyLoadBalancerSettingsConsistentHashLBConfig build(java.util.Map<String, ?> map) throws Exception {
            TrafficPolicyLoadBalancerSettingsConsistentHashLBConfig self = new TrafficPolicyLoadBalancerSettingsConsistentHashLBConfig();
            return TeaModel.build(map, self);
        }

        public TrafficPolicyLoadBalancerSettingsConsistentHashLBConfig setConsistentHashLBType(String consistentHashLBType) {
            this.consistentHashLBType = consistentHashLBType;
            return this;
        }
        public String getConsistentHashLBType() {
            return this.consistentHashLBType;
        }

        public TrafficPolicyLoadBalancerSettingsConsistentHashLBConfig setHttpCookie(TrafficPolicyLoadBalancerSettingsConsistentHashLBConfigHttpCookie httpCookie) {
            this.httpCookie = httpCookie;
            return this;
        }
        public TrafficPolicyLoadBalancerSettingsConsistentHashLBConfigHttpCookie getHttpCookie() {
            return this.httpCookie;
        }

        public TrafficPolicyLoadBalancerSettingsConsistentHashLBConfig setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

    }

    public static class TrafficPolicyLoadBalancerSettings extends TeaModel {
        @NameInMap("ConsistentHashLBConfig")
        public TrafficPolicyLoadBalancerSettingsConsistentHashLBConfig consistentHashLBConfig;

        @NameInMap("LoadbalancerType")
        public String loadbalancerType;

        @NameInMap("WarmupDuration")
        public Long warmupDuration;

        public static TrafficPolicyLoadBalancerSettings build(java.util.Map<String, ?> map) throws Exception {
            TrafficPolicyLoadBalancerSettings self = new TrafficPolicyLoadBalancerSettings();
            return TeaModel.build(map, self);
        }

        public TrafficPolicyLoadBalancerSettings setConsistentHashLBConfig(TrafficPolicyLoadBalancerSettingsConsistentHashLBConfig consistentHashLBConfig) {
            this.consistentHashLBConfig = consistentHashLBConfig;
            return this;
        }
        public TrafficPolicyLoadBalancerSettingsConsistentHashLBConfig getConsistentHashLBConfig() {
            return this.consistentHashLBConfig;
        }

        public TrafficPolicyLoadBalancerSettings setLoadbalancerType(String loadbalancerType) {
            this.loadbalancerType = loadbalancerType;
            return this;
        }
        public String getLoadbalancerType() {
            return this.loadbalancerType;
        }

        public TrafficPolicyLoadBalancerSettings setWarmupDuration(Long warmupDuration) {
            this.warmupDuration = warmupDuration;
            return this;
        }
        public Long getWarmupDuration() {
            return this.warmupDuration;
        }

    }

    public static class TrafficPolicyTlsSetting extends TeaModel {
        @NameInMap("CaCertContent")
        public String caCertContent;

        @NameInMap("CertId")
        public String certId;

        @NameInMap("Sni")
        public String sni;

        @NameInMap("TlsMode")
        public String tlsMode;

        public static TrafficPolicyTlsSetting build(java.util.Map<String, ?> map) throws Exception {
            TrafficPolicyTlsSetting self = new TrafficPolicyTlsSetting();
            return TeaModel.build(map, self);
        }

        public TrafficPolicyTlsSetting setCaCertContent(String caCertContent) {
            this.caCertContent = caCertContent;
            return this;
        }
        public String getCaCertContent() {
            return this.caCertContent;
        }

        public TrafficPolicyTlsSetting setCertId(String certId) {
            this.certId = certId;
            return this;
        }
        public String getCertId() {
            return this.certId;
        }

        public TrafficPolicyTlsSetting setSni(String sni) {
            this.sni = sni;
            return this;
        }
        public String getSni() {
            return this.sni;
        }

        public TrafficPolicyTlsSetting setTlsMode(String tlsMode) {
            this.tlsMode = tlsMode;
            return this;
        }
        public String getTlsMode() {
            return this.tlsMode;
        }

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

}
