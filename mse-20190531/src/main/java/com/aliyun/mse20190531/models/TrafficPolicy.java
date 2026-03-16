// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class TrafficPolicy extends TeaModel {
    /**
     * <p>The load balancing settings.</p>
     */
    @NameInMap("LoadBalancerSettings")
    public TrafficPolicyLoadBalancerSettings loadBalancerSettings;

    /**
     * <p>The data structure.</p>
     */
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
        /**
         * <p>The name of the cookie.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The path of the cookie.</p>
         * 
         * <strong>example:</strong>
         * <p>/path</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The lifecycle of the cookie.</p>
         * 
         * <strong>example:</strong>
         * <p>10s</p>
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
        /**
         * <p>The type of the object based on which consistent hashing is performed. Valid values:</p>
         * <ul>
         * <li>QUERY_PARAMETER: request parameter</li>
         * <li>COOKIE: cookie</li>
         * <li>SOURCE_IP: the source IP address</li>
         * <li>HEADER: request header</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>QUERY_PARAMETER</p>
         */
        @NameInMap("ConsistentHashLBType")
        public String consistentHashLBType;

        /**
         * <p>You must specify this parameter only if ConsistentHashLBType is set to COOKIE.</p>
         */
        @NameInMap("HttpCookie")
        public TrafficPolicyLoadBalancerSettingsConsistentHashLBConfigHttpCookie httpCookie;

        /**
         * <p>The name of the object based on which consistent hashing is performed. If consistent hashing is performed based on a parameter, set the value to the parameter name. If consistent hashing is performed based on a header, set the value to the header name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
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
        /**
         * <p>The data structure.</p>
         */
        @NameInMap("ConsistentHashLBConfig")
        public TrafficPolicyLoadBalancerSettingsConsistentHashLBConfig consistentHashLBConfig;

        /**
         * <p>The load balancing type. Valid values:</p>
         * <ul>
         * <li><pre><code>  ROUND_ROBIN: round robin 
         * </code></pre>
         * </li>
         * <li><pre><code>  LEAST_CONN: least connection load balancing 
         * </code></pre>
         * </li>
         * <li><pre><code>  RANDOM: random load balancing 
         * </code></pre>
         * </li>
         * <li><pre><code>  CONSISTENT_HASH: consistent hashing load balancing
         * </code></pre>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RANDOM</p>
         */
        @NameInMap("LoadbalancerType")
        public String loadbalancerType;

        /**
         * <p>The prefetch duration. Unit: seconds.</p>
         */
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
        /**
         * <p>The trusted CA certificate chain. In mTLS, if the backend service certificate is issued by a private certificate authority (CA), you must add its CA certificate to the trusted CA certificate chain.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE----- MIIH0zCCBbugAwIBAgIIXsO3pkN/pOAwDQYJKoZIhvcNAQEFBQAwQjESMBAGA1UE AwwJQUNDVlJBSVoxMRAwDgYDVQQLDAdQS0lBQ0NWMQ0wCwYDVQQKDARBQ0NWMQsw CQYDVQQGEwJFUzAeFw0xMTA1MDUwOTM3MzdaFw0zMDEyMzEwOTM3MzdaMEIxEjAQ BgNVBAMMCUFDQ1ZSQUlaMTEQMA4GA1UECwwHUEtJQUNDVjENMAsGA1UECgwEQUND VjELMAkGA1UEBhMCRVMwggIiMA0GCSqGSIb3DQEBAQUAA4ICDwAwggIKAoICAQCb qau/YUqXry+XZpp0X9DZlv3P4uRm7x8fRzPCRKPfmt4ftVTdFXxpNRFvu8gMjmoY HtiP2Ra8EEg2XPBjs5BaXCQ316PWywlxufEBcoSwfdtNgM3802/J+Nq2DoLSRYWo G2ioPej0RGy9ocLLA76MPhMAhN9KSMDjIgro6TenGEyxCQ0jVn8ETdkXhBilyNpA lHPrzg5XPAOBOp0KoVdDaaxXbXmQeOW1tDvYvEyNKKGno6e6Ak4l0Squ7a4DIrhr IA8wKFSVf+DuzgpmndFALW4ir50awQUZ0m/A8p/4e7MCQvtQqR0tkw8jq8bBD5L/ 0KIV9VMJcRz/RROE5iZe+OCIHAr8Fraocwa48GOEAqDGWuzndN9wrqODJerWx5eH k6fGioozl2A3ED6XPm4pFdahD9GILBKfb6qkxkLrQaLjlUPTAYVtjrs78yM2x/47 4KElB0iryYl0/wiPgL/AlmXz7uxLaL2diMMxs0Dx6M/2OLuc5NF/1OVYm3z61PMO m3WR5LpSLhl+0fXNWhn8ugb2+1KoS5kE3fj5tItQo05iifCHJPqDQsGH+tUtKSpa cXpkatcnYGMN285J9Y0fkIkyF/hzQ7jSWpOGYdbhdQrqeWZ2iE9x6wQl1gpaepPl uUsXQA+xtrn13k/c4LOsOxFwYIRKQ26ZIMApcQrAZQIDAQABo4ICyzCCAscwfQYI KwYBBQUHAQEEcTBvMEwGCCsGAQUFBzAChkBodHRwOi8vd3d3LmFjY3YuZXMvZmls ZWFkbWluL0FyY2hpdm9zL2NlcnRpZmljYWRvcy9yYWl6YWNjdjEuY3J0MB8GCCsG AQUFBzABhhNodHRwOi8vb2NzcC5hY2N2LmVzMB0GA1UdDgQWBBTSh7Tj3zcnk1X2 VuqB5TbMjB4/vTAPBgNVHRMBAf8EBTADAQH/MB8GA1UdIwQYMBaAFNKHtOPfNyeT VfZW6oHlNsyMHj+9MIIBcwYDVR0gBIIBajCCAWYwggFiBgRVHSAAMIIBWDCCASIG CCsGAQUFBwICMIIBFB6CARAAQQB1AHQAbwByAGkAZABhAGQAIABkAGUAIABDAGUA cgB0AGkAZgBpAGMAYQBjAGkA8wBuACAAUgBhAO0AegAgAGQAZQAgAGwAYQAgAEEA QwBDAFYAIAAoAEEAZwBlAG4AYwBpAGEAIABkAGUAIABUAGUAYwBuAG8AbABvAGcA 7QBhACAAeQAgAEMAZQByAHQAaQBmAGkAYwBhAGMAaQDzAG4AIABFAGwAZQBjAHQA cgDzAG4AaQBjAGEALAAgAEMASQBGACAAUQA0ADYAMAAxADEANQA2AEUAKQAuACAA QwBQAFMAIABlAG4AIABoAHQAdABwADoALwAvAHcAdwB3AC4AYQBjAGMAdgAuAGUA czAwBggrBgEFBQcCARYkaHR0cDovL3d3dy5hY2N2LmVzL2xlZ2lzbGFjaW9uX2Mu aHRtMFUGA1UdHwROMEwwSqBIoEaGRGh0dHA6Ly93d3cuYWNjdi5lcy9maWxlYWRt aW4vQXJjaGl2b3MvY2VydGlmaWNhZG9zL3JhaXphY2N2MV9kZXIuY3JsMA4GA1Ud DwEB/wQEAwIBBjAXBgNVHREEEDAOgQxhY2N2QGFjY3YuZXMwDQYJKoZIhvcNAQEF BQADggIBAJcxAp/n/UNnSEQU5CmH7UwoZtCPNdpNYbdKl02125DgBS4OxnnQ8pdp D70ER9m+27Up2pvZrqmZ1dM8MJP1jaGo/AaNRPTKFpV8M9xii6g3+CfYCS0b78gU JyCpZET/LtZ1qmxNYEAZSUNUY9rizLpm5U9EelvZaoErQNV/+QEnWCzI7UiRfD+m AM/EKXMRNt6GGT6d7hmKG9Ww7Y49nCrADdg9ZuM8Db3VlFzi4qc1GwQA9j9ajepD vV+JHanBsMyZ4k0ACtrJJ1vnE5Bc5PUzolVt3OAJTS+xJlsndQAJxGJ3KQhfnlms tn6tn1QwIgPBHnFk/vk4CpYY3QIUrCPLBhwepH2NDd4nQeit2hW3sCPdK6jT2iWH 7ehVRE2I9DZ+hJp4rPcOVkkO1jMl1oRQQmwgEh0q1b688nCBpHBgvgW1m54ERL5h I6zppSSMEYCUWqKiuUnSwdzRp+0xESyeGabu4VXhwOrPDYTkF7eifKXeVSUG7szA h1xA2syVP1XgNce4hL60Xc16gwFy7ofmXx2utYXGJt/mwZrpHgJHnyqobalbz+xF d3+YJ5oyXSrjhO7FmGYvliAd3djDJ9ew+f7Zfc3Qn48LFFhRny+Lwzgt3uiP1o2H pPVWQxaZLPSkVrQ0uGE3ycJYgBugl6H8WY3pEfbRD0tVNEYqi4Y7 -----END CERTIFICATE-----</p>
         */
        @NameInMap("CaCertContent")
        public String caCertContent;

        /**
         * <p>The ID of the certificate that is managed in Alibaba Cloud Security.</p>
         * 
         * <strong>example:</strong>
         * <p>6456988-cn-hangzhou</p>
         */
        @NameInMap("CertId")
        public String certId;

        /**
         * <p>The server name indication (SNI) that is used to establish TLS links.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
         */
        @NameInMap("Sni")
        public String sni;

        /**
         * <p>The Transport Layer Security (TLS) mode that is used to distribute traffic to backend services. Valid values:</p>
         * <ul>
         * <li>DISABLE: TLS is disabled. Plaintext is used.</li>
         * <li>SIMPLE: TLS is enabled.</li>
         * <li>MUTUAL: Mutual Transport Layer Security (mTLS) is enabled.</li>
         * </ul>
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
