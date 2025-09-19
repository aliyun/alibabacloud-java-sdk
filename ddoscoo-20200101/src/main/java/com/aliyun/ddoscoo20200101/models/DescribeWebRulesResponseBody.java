// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeWebRulesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0F5B72DD-96F4-423A-B12B-A5151DD746B8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of queried website business forwarding rules.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    /**
     * <p>The configurations of the forwarding rule.</p>
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
         * 
         * <strong>example:</strong>
         * <p>725****</p>
         */
        @NameInMap("CertId")
        public String certId;

        /**
         * <p>Indicates whether Enable SM Certificate-based Verification is turned on.</p>
         * <ul>
         * <li>0: no</li>
         * <li>1: yes</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("GmEnable")
        public Long gmEnable;

        /**
         * <p>Indicates whether Allow Access Only from SM Certificates-based Clients is turned on.</p>
         * <ul>
         * <li>0: no</li>
         * <li>1: yes</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>The ports.</p>
         */
        @NameInMap("ProxyPorts")
        public java.util.List<String> proxyPorts;

        /**
         * <p>The type of the protocol. Valid values:</p>
         * <ul>
         * <li><strong>http</strong></li>
         * <li><strong>https</strong></li>
         * <li><strong>websocket</strong></li>
         * <li><strong>websockets</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>https</p>
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
         * 
         * <strong>example:</strong>
         * <p>192.0.XX.XX</p>
         */
        @NameInMap("RealServer")
        public String realServer;

        /**
         * <p>The type of the origin server address. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: IP address</li>
         * <li><strong>1</strong>: domain name The domain name of the origin server is returned if you deploy proxies, such as Web Application Firewall (WAF), between the origin server and the instance. In this case, the address of the proxy, such as the CNAME provided by WAF, is returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
         * <p>The IP addresses in the blacklist for the domain name.</p>
         */
        @NameInMap("BlackList")
        public java.util.List<String> blackList;

        /**
         * <p>Indicates whether the Frequency Control policy is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CcEnabled")
        public Boolean ccEnabled;

        /**
         * <p>Indicates whether the Custom Rule switch of the Frequency Control policy is turned on. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("CcRuleEnabled")
        public Boolean ccRuleEnabled;

        /**
         * <p>The mode of the Frequency Control policy. Valid values:</p>
         * <ul>
         * <li><strong>default</strong>: the Normal mode</li>
         * <li><strong>gf_under_attack</strong>: the Emergency mode</li>
         * <li><strong>gf_sos_verify</strong>: the Strict mode</li>
         * <li><strong>gf_sos_verify</strong>: the Super Strict mode</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("CcTemplate")
        public String ccTemplate;

        @NameInMap("CertExpireTime")
        public Long certExpireTime;

        /**
         * <p>The name of the SSL certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>testcert</p>
         */
        @NameInMap("CertName")
        public String certName;

        /**
         * <p>The region where the certificate is used. Valid values:</p>
         * <ul>
         * <li>cn-hangzhou (default): the Chinese mainland</li>
         * <li>ap-southeast-1: outside the Chinese mainland</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("CertRegion")
        public String certRegion;

        /**
         * <p>The CNAME provided by the Anti-DDoS Pro or Anti-DDoS Premium instance to which the domain name is added.</p>
         * 
         * <strong>example:</strong>
         * <p>kzmk7b8tt351****.aliyunddos1014****</p>
         */
        @NameInMap("Cname")
        public String cname;

        /**
         * <p>The custom cipher suites.</p>
         */
        @NameInMap("CustomCiphers")
        public java.util.List<String> customCiphers;

        /**
         * <p>The domain name of the website.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
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
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Http2Enable")
        public Boolean http2Enable;

        /**
         * <p>Indicates whether Enable HTTPS Redirection was turned on. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Http2HttpsEnable")
        public Boolean http2HttpsEnable;

        /**
         * <p>Indicates whether Enable HTTP Redirection of Back-to-origin Requests is turned on. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Https2HttpEnable")
        public Boolean https2HttpEnable;

        /**
         * <p>Indicates whether the Online Certificate Status Protocol (OCSP) feature is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("OcspEnabled")
        public Boolean ocspEnabled;

        /**
         * <p>The load balancing algorithm for back-to-origin traffic. Valid values:</p>
         * <ul>
         * <li><strong>ip_hash</strong>: the IP hash algorithm. This algorithm is used to redirect the requests from the same IP address to the same origin server.</li>
         * <li><strong>rr</strong>: the round-robin algorithm. This algorithm is used to redirect requests to origin servers in turn.</li>
         * <li><strong>least_time</strong>: the least response time algorithm. This algorithm is used to minimize the latency when requests are forwarded from Anti-DDoS Pro or Anti-DDoS Premium instances to origin servers based on the intelligent DNS resolution feature.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ip_hash</p>
         */
        @NameInMap("PolicyMode")
        public String policyMode;

        /**
         * <p>Indicates whether the forwarding rule is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ProxyEnabled")
        public Boolean proxyEnabled;

        /**
         * <p>The details of the protocol type and port number.</p>
         */
        @NameInMap("ProxyTypes")
        public java.util.List<DescribeWebRulesResponseBodyWebRulesProxyTypes> proxyTypes;

        /**
         * <p>The reason why the domain name is invalid. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: No Content Provider (ICP) filing is completed for the domain name.</li>
         * <li><strong>2</strong>: The business for which you registered the domain name does not meet regulatory requirements.</li>
         * </ul>
         * <p>If the two reasons are both involved, the value <strong>2</strong> is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PunishReason")
        public Integer punishReason;

        /**
         * <p>Indicates whether the domain name is invalid. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: You can view the specific reasons from the <strong>PunishReason</strong> parameter.</li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("PunishStatus")
        public Boolean punishStatus;

        /**
         * <p>The details of the origin server address.</p>
         */
        @NameInMap("RealServers")
        public java.util.List<DescribeWebRulesResponseBodyWebRulesRealServers> realServers;

        /**
         * <p>Indicates whether TLS 1.3 is supported. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Ssl13Enabled")
        public Boolean ssl13Enabled;

        /**
         * <p>The type of the cipher suite. Valid values:</p>
         * <ul>
         * <li><strong>default</strong>: custom cipher suites</li>
         * <li><strong>all</strong>: all cipher suites, which contain strong and weak cipher suites</li>
         * <li><strong>strong</strong>: strong cipher suites</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("SslCiphers")
        public String sslCiphers;

        /**
         * <p>The version of the Transport Layer Security (TLS) protocol. Valid values:</p>
         * <ul>
         * <li><strong>tls1.0</strong>: TLS 1.0 or later</li>
         * <li><strong>tls1.1</strong>: TLS 1.1 or later</li>
         * <li><strong>tls1.2</strong>: TLS 1.2 or later</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>tls1.1</p>
         */
        @NameInMap("SslProtocols")
        public String sslProtocols;

        @NameInMap("Tls13CustomCiphers")
        public java.util.List<String> tls13CustomCiphers;

        /**
         * <p>The name of the certificate uploaded by the user to the certificate center.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("UserCertName")
        public String userCertName;

        /**
         * <p>The IP addresses in the whitelist for the domain name.</p>
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

        public DescribeWebRulesResponseBodyWebRules setCertExpireTime(Long certExpireTime) {
            this.certExpireTime = certExpireTime;
            return this;
        }
        public Long getCertExpireTime() {
            return this.certExpireTime;
        }

        public DescribeWebRulesResponseBodyWebRules setCertName(String certName) {
            this.certName = certName;
            return this;
        }
        public String getCertName() {
            return this.certName;
        }

        public DescribeWebRulesResponseBodyWebRules setCertRegion(String certRegion) {
            this.certRegion = certRegion;
            return this;
        }
        public String getCertRegion() {
            return this.certRegion;
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

        public DescribeWebRulesResponseBodyWebRules setTls13CustomCiphers(java.util.List<String> tls13CustomCiphers) {
            this.tls13CustomCiphers = tls13CustomCiphers;
            return this;
        }
        public java.util.List<String> getTls13CustomCiphers() {
            return this.tls13CustomCiphers;
        }

        public DescribeWebRulesResponseBodyWebRules setUserCertName(String userCertName) {
            this.userCertName = userCertName;
            return this;
        }
        public String getUserCertName() {
            return this.userCertName;
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
