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

        /**
         * <strong>example:</strong>
         * <p>0s</p>
         */
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

        /**
         * <strong>example:</strong>
         * <p>RANDOM</p>
         */
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

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SIMPLE</p>
         */
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
