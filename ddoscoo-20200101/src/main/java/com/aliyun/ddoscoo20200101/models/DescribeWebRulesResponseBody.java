// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeWebRulesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of forwarding rules.</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    /**
     * <p>An array that consists of the configurations of the forwarding rule.</p>
     */
    @NameInMap("WebRules")
    public java.util.List<DescribeWebRulesResponseBodyWebRules> webRules;

    public static DescribeWebRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebRulesResponseBody self = new DescribeWebRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWebRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWebRulesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeWebRulesResponseBody setWebRules(java.util.List<DescribeWebRulesResponseBodyWebRules> webRules) {
        this.webRules = webRules;
        return this;
    }
    public java.util.List<DescribeWebRulesResponseBodyWebRules> getWebRules() {
        return this.webRules;
    }

    public static class DescribeWebRulesResponseBodyWebRulesGmCert extends TeaModel {
        /**
         * <p>The ID of the SM certificate.</p>
         */
        @NameInMap("CertId")
        public String certId;

        /**
         * <p>Indicates whether Enable SM Certificate-based Verification is turned on.</p>
         * <br>
         * <p>*   0: no</p>
         * <p>*   1: yes</p>
         */
        @NameInMap("GmEnable")
        public Long gmEnable;

        /**
         * <p>Indicates whether Allow Access Only from SM Certificates-based Clients is turned on.</p>
         * <br>
         * <p>*   0: no</p>
         * <p>*   1: yes</p>
         */
        @NameInMap("GmOnly")
        public Long gmOnly;

        public static DescribeWebRulesResponseBodyWebRulesGmCert build(java.util.Map<String, ?> map) throws Exception {
            DescribeWebRulesResponseBodyWebRulesGmCert self = new DescribeWebRulesResponseBodyWebRulesGmCert();
            return TeaModel.build(map, self);
        }

        public DescribeWebRulesResponseBodyWebRulesGmCert setCertId(String certId) {
            this.certId = certId;
            return this;
        }
        public String getCertId() {
            return this.certId;
        }

        public DescribeWebRulesResponseBodyWebRulesGmCert setGmEnable(Long gmEnable) {
            this.gmEnable = gmEnable;
            return this;
        }
        public Long getGmEnable() {
            return this.gmEnable;
        }

        public DescribeWebRulesResponseBodyWebRulesGmCert setGmOnly(Long gmOnly) {
            this.gmOnly = gmOnly;
            return this;
        }
        public Long getGmOnly() {
            return this.gmOnly;
        }

    }

    public static class DescribeWebRulesResponseBodyWebRulesProxyTypes extends TeaModel {
        /**
         * <p>An array that consists of ports.</p>
         */
        @NameInMap("ProxyPorts")
        public java.util.List<String> proxyPorts;

        /**
         * <p>The type of the protocol. Valid values:</p>
         * <br>
         * <p>*   **http**</p>
         * <p>*   **https**</p>
         * <p>*   **websocket**</p>
         * <p>*   **websockets**</p>
         */
        @NameInMap("ProxyType")
        public String proxyType;

        public static DescribeWebRulesResponseBodyWebRulesProxyTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeWebRulesResponseBodyWebRulesProxyTypes self = new DescribeWebRulesResponseBodyWebRulesProxyTypes();
            return TeaModel.build(map, self);
        }

        public DescribeWebRulesResponseBodyWebRulesProxyTypes setProxyPorts(java.util.List<String> proxyPorts) {
            this.proxyPorts = proxyPorts;
            return this;
        }
        public java.util.List<String> getProxyPorts() {
            return this.proxyPorts;
        }

        public DescribeWebRulesResponseBodyWebRulesProxyTypes setProxyType(String proxyType) {
            this.proxyType = proxyType;
            return this;
        }
        public String getProxyType() {
            return this.proxyType;
        }

    }

    public static class DescribeWebRulesResponseBodyWebRulesRealServers extends TeaModel {
        /**
         * <p>The address of the origin server.</p>
         */
        @NameInMap("RealServer")
        public String realServer;

        /**
         * <p>The type of the origin server address. Valid values:</p>
         * <br>
         * <p>*   **0**: IP address</p>
         * <p>*   **1**: domain name The domain name of the origin server is returned if you deploy proxies, such as Web Application Firewall (WAF), between the origin server and the instance. In this case, the address of the proxy, such as the CNAME provided by WAF, is returned.</p>
         */
        @NameInMap("RsType")
        public Integer rsType;

        public static DescribeWebRulesResponseBodyWebRulesRealServers build(java.util.Map<String, ?> map) throws Exception {
            DescribeWebRulesResponseBodyWebRulesRealServers self = new DescribeWebRulesResponseBodyWebRulesRealServers();
            return TeaModel.build(map, self);
        }

        public DescribeWebRulesResponseBodyWebRulesRealServers setRealServer(String realServer) {
            this.realServer = realServer;
            return this;
        }
        public String getRealServer() {
            return this.realServer;
        }

        public DescribeWebRulesResponseBodyWebRulesRealServers setRsType(Integer rsType) {
            this.rsType = rsType;
            return this;
        }
        public Integer getRsType() {
            return this.rsType;
        }

    }

    public static class DescribeWebRulesResponseBodyWebRules extends TeaModel {
        /**
         * <p>An array that consists of the IP addresses in the blacklist for the domain name.</p>
         */
        @NameInMap("BlackList")
        public java.util.List<String> blackList;

        /**
         * <p>Indicates whether the Frequency Control policy is enabled. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
         */
        @NameInMap("CcEnabled")
        public Boolean ccEnabled;

        /**
         * <p>Indicates whether the Custom Rule switch of the Frequency Control policy is turned on. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
         */
        @NameInMap("CcRuleEnabled")
        public Boolean ccRuleEnabled;

        /**
         * <p>The mode of the Frequency Control policy. Valid values:</p>
         * <br>
         * <p>*   **default**: the Normal mode</p>
         * <p>*   **gf_under_attack**: the Emergency mode</p>
         * <p>*   **gf_sos_verify**: the Strict mode</p>
         * <p>*   **gf_sos_verify**: the Super Strict mode</p>
         */
        @NameInMap("CcTemplate")
        public String ccTemplate;

        /**
         * <p>The name of the certificate.</p>
         */
        @NameInMap("CertName")
        public String certName;

        /**
         * <p>The CNAME provided by the Anti-DDoS Pro or Anti-DDoS Premium instance to which the domain name is added.</p>
         */
        @NameInMap("Cname")
        public String cname;

        /**
         * <p>An array that consists of custom cipher suites.</p>
         */
        @NameInMap("CustomCiphers")
        public java.util.List<String> customCiphers;

        /**
         * <p>The domain name of the website.</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The SM certificate settings.</p>
         */
        @NameInMap("GmCert")
        public DescribeWebRulesResponseBodyWebRulesGmCert gmCert;

        /**
         * <p>Indicates whether Enable HTTP/2 is turned on. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
         */
        @NameInMap("Http2Enable")
        public Boolean http2Enable;

        /**
         * <p>Indicates whether Enable HTTPS Routing is turned on. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
         */
        @NameInMap("Http2HttpsEnable")
        public Boolean http2HttpsEnable;

        /**
         * <p>Indicates whether Enable HTTP is turned on. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
         */
        @NameInMap("Https2HttpEnable")
        public Boolean https2HttpEnable;

        /**
         * <p>Indicates whether the Online Certificate Status Protocol (OCSP) feature is enabled. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
         */
        @NameInMap("OcspEnabled")
        public Boolean ocspEnabled;

        /**
         * <p>The scheduling algorithm for back-to-origin traffic. Valid values:</p>
         * <br>
         * <p>*   **ip_hash**: the IP hash algorithm. This algorithm is used to redirect the requests from the same IP address to the same origin server.</p>
         * <p>*   **rr**: the round-robin algorithm. This algorithm is used to redirect requests to origin servers in turn.</p>
         * <p>*   **least_time**: the least response time algorithm. This algorithm is used to minimize the latency when requests are forwarded from Anti-DDoS Pro or Anti-DDoS Premium instances to origin servers based on the intelligent DNS resolution feature.</p>
         */
        @NameInMap("PolicyMode")
        public String policyMode;

        /**
         * <p>Indicates whether the forwarding rule is enabled. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
         */
        @NameInMap("ProxyEnabled")
        public Boolean proxyEnabled;

        /**
         * <p>An array that consists of the details of the protocol type and port number.</p>
         */
        @NameInMap("ProxyTypes")
        public java.util.List<DescribeWebRulesResponseBodyWebRulesProxyTypes> proxyTypes;

        /**
         * <p>The reason why the domain name is invalid. Valid values:</p>
         * <br>
         * <p>*   **1**: No ICP filing is completed for the domain name.</p>
         * <p>*   **2**: The business for which you registered the domain name does not meet regulatory requirements.</p>
         * <br>
         * <p>If the two reasons are both involved, the value **2** is returned.</p>
         */
        @NameInMap("PunishReason")
        public Integer punishReason;

        /**
         * <p>Indicates whether the domain name is invalid. Valid values:</p>
         * <br>
         * <p>*   **true**: The domain name is invalid. You can view the specific reasons from the **PunishReason** parameter.</p>
         * <p>*   **false**: The domain name is valid.</p>
         */
        @NameInMap("PunishStatus")
        public Boolean punishStatus;

        /**
         * <p>An array that consists of the details of the origin server address.</p>
         */
        @NameInMap("RealServers")
        public java.util.List<DescribeWebRulesResponseBodyWebRulesRealServers> realServers;

        /**
         * <p>Indicates whether TLS 1.3 is supported. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
         */
        @NameInMap("Ssl13Enabled")
        public Boolean ssl13Enabled;

        /**
         * <p>The type of the cipher suite. Valid values:</p>
         * <br>
         * <p>*   **default**: custom cipher suite</p>
         * <p>*   **all**: all cipher suites, which contain strong and weak cipher suites</p>
         * <p>*   **strong**: strong cipher suites</p>
         */
        @NameInMap("SslCiphers")
        public String sslCiphers;

        /**
         * <p>The version of the Transport Layer Security (TLS) protocol. Valid values:</p>
         * <br>
         * <p>*   **tls1.0**: TLS 1.0 or later</p>
         * <p>*   **tls1.1**: TLS 1.1 or later</p>
         * <p>*   **tls1.2**: TLS 1.2 or later</p>
         */
        @NameInMap("SslProtocols")
        public String sslProtocols;

        /**
         * <p>An array that consists of the IP addresses in the whitelist for the domain name.</p>
         */
        @NameInMap("WhiteList")
        public java.util.List<String> whiteList;

        public static DescribeWebRulesResponseBodyWebRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeWebRulesResponseBodyWebRules self = new DescribeWebRulesResponseBodyWebRules();
            return TeaModel.build(map, self);
        }

        public DescribeWebRulesResponseBodyWebRules setBlackList(java.util.List<String> blackList) {
            this.blackList = blackList;
            return this;
        }
        public java.util.List<String> getBlackList() {
            return this.blackList;
        }

        public DescribeWebRulesResponseBodyWebRules setCcEnabled(Boolean ccEnabled) {
            this.ccEnabled = ccEnabled;
            return this;
        }
        public Boolean getCcEnabled() {
            return this.ccEnabled;
        }

        public DescribeWebRulesResponseBodyWebRules setCcRuleEnabled(Boolean ccRuleEnabled) {
            this.ccRuleEnabled = ccRuleEnabled;
            return this;
        }
        public Boolean getCcRuleEnabled() {
            return this.ccRuleEnabled;
        }

        public DescribeWebRulesResponseBodyWebRules setCcTemplate(String ccTemplate) {
            this.ccTemplate = ccTemplate;
            return this;
        }
        public String getCcTemplate() {
            return this.ccTemplate;
        }

        public DescribeWebRulesResponseBodyWebRules setCertName(String certName) {
            this.certName = certName;
            return this;
        }
        public String getCertName() {
            return this.certName;
        }

        public DescribeWebRulesResponseBodyWebRules setCname(String cname) {
            this.cname = cname;
            return this;
        }
        public String getCname() {
            return this.cname;
        }

        public DescribeWebRulesResponseBodyWebRules setCustomCiphers(java.util.List<String> customCiphers) {
            this.customCiphers = customCiphers;
            return this;
        }
        public java.util.List<String> getCustomCiphers() {
            return this.customCiphers;
        }

        public DescribeWebRulesResponseBodyWebRules setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeWebRulesResponseBodyWebRules setGmCert(DescribeWebRulesResponseBodyWebRulesGmCert gmCert) {
            this.gmCert = gmCert;
            return this;
        }
        public DescribeWebRulesResponseBodyWebRulesGmCert getGmCert() {
            return this.gmCert;
        }

        public DescribeWebRulesResponseBodyWebRules setHttp2Enable(Boolean http2Enable) {
            this.http2Enable = http2Enable;
            return this;
        }
        public Boolean getHttp2Enable() {
            return this.http2Enable;
        }

        public DescribeWebRulesResponseBodyWebRules setHttp2HttpsEnable(Boolean http2HttpsEnable) {
            this.http2HttpsEnable = http2HttpsEnable;
            return this;
        }
        public Boolean getHttp2HttpsEnable() {
            return this.http2HttpsEnable;
        }

        public DescribeWebRulesResponseBodyWebRules setHttps2HttpEnable(Boolean https2HttpEnable) {
            this.https2HttpEnable = https2HttpEnable;
            return this;
        }
        public Boolean getHttps2HttpEnable() {
            return this.https2HttpEnable;
        }

        public DescribeWebRulesResponseBodyWebRules setOcspEnabled(Boolean ocspEnabled) {
            this.ocspEnabled = ocspEnabled;
            return this;
        }
        public Boolean getOcspEnabled() {
            return this.ocspEnabled;
        }

        public DescribeWebRulesResponseBodyWebRules setPolicyMode(String policyMode) {
            this.policyMode = policyMode;
            return this;
        }
        public String getPolicyMode() {
            return this.policyMode;
        }

        public DescribeWebRulesResponseBodyWebRules setProxyEnabled(Boolean proxyEnabled) {
            this.proxyEnabled = proxyEnabled;
            return this;
        }
        public Boolean getProxyEnabled() {
            return this.proxyEnabled;
        }

        public DescribeWebRulesResponseBodyWebRules setProxyTypes(java.util.List<DescribeWebRulesResponseBodyWebRulesProxyTypes> proxyTypes) {
            this.proxyTypes = proxyTypes;
            return this;
        }
        public java.util.List<DescribeWebRulesResponseBodyWebRulesProxyTypes> getProxyTypes() {
            return this.proxyTypes;
        }

        public DescribeWebRulesResponseBodyWebRules setPunishReason(Integer punishReason) {
            this.punishReason = punishReason;
            return this;
        }
        public Integer getPunishReason() {
            return this.punishReason;
        }

        public DescribeWebRulesResponseBodyWebRules setPunishStatus(Boolean punishStatus) {
            this.punishStatus = punishStatus;
            return this;
        }
        public Boolean getPunishStatus() {
            return this.punishStatus;
        }

        public DescribeWebRulesResponseBodyWebRules setRealServers(java.util.List<DescribeWebRulesResponseBodyWebRulesRealServers> realServers) {
            this.realServers = realServers;
            return this;
        }
        public java.util.List<DescribeWebRulesResponseBodyWebRulesRealServers> getRealServers() {
            return this.realServers;
        }

        public DescribeWebRulesResponseBodyWebRules setSsl13Enabled(Boolean ssl13Enabled) {
            this.ssl13Enabled = ssl13Enabled;
            return this;
        }
        public Boolean getSsl13Enabled() {
            return this.ssl13Enabled;
        }

        public DescribeWebRulesResponseBodyWebRules setSslCiphers(String sslCiphers) {
            this.sslCiphers = sslCiphers;
            return this;
        }
        public String getSslCiphers() {
            return this.sslCiphers;
        }

        public DescribeWebRulesResponseBodyWebRules setSslProtocols(String sslProtocols) {
            this.sslProtocols = sslProtocols;
            return this;
        }
        public String getSslProtocols() {
            return this.sslProtocols;
        }

        public DescribeWebRulesResponseBodyWebRules setWhiteList(java.util.List<String> whiteList) {
            this.whiteList = whiteList;
            return this;
        }
        public java.util.List<String> getWhiteList() {
            return this.whiteList;
        }

    }

}
