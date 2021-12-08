// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class TrafficPolicy extends TeaModel {
    // 负载均衡相关配置
    @NameInMap("LoadBalancerSettings")
    public TrafficPolicyLoadBalancerSettings loadBalancerSettings;

    // tls相关配置
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
        // cookie名
        @NameInMap("Name")
        public String name;

        // cookie path
        @NameInMap("Path")
        public String path;

        // cookie生命周期
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
        // HEADER, COOKIE, SOURCE_IP, QUERY_PARAMETER
        @NameInMap("ConsistentHashLBType")
        public String consistentHashLBType;

        // 使用cookie时配置
        @NameInMap("HttpCookie")
        public TrafficPolicyLoadBalancerSettingsConsistentHashLBConfigHttpCookie httpCookie;

        // 使用根据header和参数路由时生效
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
        // 一致性hash相关配置
        @NameInMap("ConsistentHashLBConfig")
        public TrafficPolicyLoadBalancerSettingsConsistentHashLBConfig consistentHashLBConfig;

        // 负载均衡类型，枚举类可为ROUND_ROBIN, LEAST_CONN,RANDOM, CONSISTENT_HASH
        @NameInMap("LoadbalancerType")
        public String loadbalancerType;

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

    }

    public static class TrafficPolicyTlsSetting extends TeaModel {
        // ca证书内容
        @NameInMap("CaCertContent")
        public String caCertContent;

        // 使用的证书id，仅当为mutual时需要填写
        @NameInMap("CertId")
        public String certId;

        // 到后端服务些带
        @NameInMap("Sni")
        public String sni;

        // tls模式。为枚举类，可为NONE, SIMPLE, MUITUAL
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

}
