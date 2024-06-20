// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDomainResourceResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>39499F01-19D9-4EA4-A0E9-C6014BA5CDBE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of forwarding rules.</p>
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
    public java.util.List<DescribeDomainResourceResponseBodyWebRules> webRules;

    public static DescribeDomainResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainResourceResponseBody self = new DescribeDomainResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainResourceResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeDomainResourceResponseBody setWebRules(java.util.List<DescribeDomainResourceResponseBodyWebRules> webRules) {
        this.webRules = webRules;
        return this;
    }
    public java.util.List<DescribeDomainResourceResponseBodyWebRules> getWebRules() {
        return this.webRules;
    }

    public static class DescribeDomainResourceResponseBodyWebRulesProxyTypes extends TeaModel {
        /**
         * <p>The port numbers.</p>
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
         * <p>http</p>
         */
        @NameInMap("ProxyType")
        public String proxyType;

        public static DescribeDomainResourceResponseBodyWebRulesProxyTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainResourceResponseBodyWebRulesProxyTypes self = new DescribeDomainResourceResponseBodyWebRulesProxyTypes();
            return TeaModel.build(map, self);
        }

        public DescribeDomainResourceResponseBodyWebRulesProxyTypes setProxyPorts(java.util.List<String> proxyPorts) {
            this.proxyPorts = proxyPorts;
            return this;
        }
        public java.util.List<String> getProxyPorts() {
            return this.proxyPorts;
        }

        public DescribeDomainResourceResponseBodyWebRulesProxyTypes setProxyType(String proxyType) {
            this.proxyType = proxyType;
            return this;
        }
        public String getProxyType() {
            return this.proxyType;
        }

    }

    public static class DescribeDomainResourceResponseBodyWebRules extends TeaModel {
        /**
         * <p>The IP addresses that are included in the blacklist of the domain name.</p>
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
         * <p>true</p>
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

        /**
         * <p>The name of the SSL certificate used by the domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>49944XX.pem</p>
         */
        @NameInMap("CertName")
        public String certName;

        /**
         * <p>The CNAME provided by the instance to which the domain name is added.</p>
         * 
         * <strong>example:</strong>
         * <p>0ekb69x3j9wvXXXX.aliyunddosXXXX.com</p>
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
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>Indicates whether Enable HTTP/2 is turned on. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Http2Enable")
        public Boolean http2Enable;

        /**
         * <p>Indicates whether Enforce HTTPS Routing is turned on. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Http2HttpsEnable")
        public Boolean http2HttpsEnable;

        /**
         * <p>Indicates whether Enable HTTP is turned on. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Https2HttpEnable")
        public Boolean https2HttpEnable;

        /**
         * <p>The advanced HTTPS settings. This parameter takes effect only when the value of the <strong>ProxyType</strong> parameter includes <strong>https</strong>. The value is a string that consists of a JSON struct. The JSON struct contains the following fields:</p>
         * <ul>
         * <li><strong>Http2https</strong>: indicates whether the feature of redirecting HTTP requests to HTTPS requests is enabled. Data type: integer. Valid values: <strong>0</strong> and <strong>1</strong>. The value 0 indicates that the feature is disabled. The value 1 indicates that the feature is enabled.</li>
         * <li><strong>Https2http</strong>: indicates whether the feature of redirecting HTTPS requests to HTTP requests is enabled. Data type: integer. Valid values: <strong>0</strong> and <strong>1</strong>. The value 0 indicates that the feature is disabled. The value 1 indicates that the feature is enabled.</li>
         * <li><strong>Http2</strong>: indicates whether HTTP/2 is supported. Data type: integer. Valid values: <strong>0</strong> and <strong>1</strong>. The value 0 indicates that HTTP/2 is not supported. The value 1 indicates that HTTP/2 is supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Https2http&quot;:0,&quot;Http2&quot;:0,&quot;Http2https&quot;:0}</p>
         */
        @NameInMap("HttpsExt")
        public String httpsExt;

        /**
         * <p>The IDs of the instances to which the domain name is added.</p>
         */
        @NameInMap("InstanceIds")
        public java.util.List<String> instanceIds;

        /**
         * <p>Indicates whether the Online Certificate Status Protocol (OCSP) feature is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
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
         * <p>Indicates whether the instance forwards the traffic that is destined for the website. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Anti-DDoS Pro or Anti-DDoS Premium forwards the traffic that is destined for the website.</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ProxyEnabled")
        public Boolean proxyEnabled;

        /**
         * <p>The details about the protocol type and port number.</p>
         */
        @NameInMap("ProxyTypes")
        public java.util.List<DescribeDomainResourceResponseBodyWebRulesProxyTypes> proxyTypes;

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
         * <li><strong>true</strong>: The domain name is invalid. You can view the specific reasons from the <strong>PunishReason</strong> parameter.</li>
         * <li><strong>false</strong>: The domain name is valid.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("PunishStatus")
        public Boolean punishStatus;

        /**
         * <p>The addresses of origin servers.</p>
         */
        @NameInMap("RealServers")
        public java.util.List<String> realServers;

        /**
         * <p>The address type of the origin server. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: IP address</li>
         * <li><strong>1</strong>: domain name</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RsType")
        public Integer rsType;

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
         * <li><strong>default</strong>: custom cipher suite</li>
         * <li><strong>all</strong>: all cipher suites</li>
         * <li><strong>strong</strong>: strong cipher suites</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("SslCiphers")
        public String sslCiphers;

        /**
         * <p>The version of the TLS protocol. Valid values:</p>
         * <ul>
         * <li><strong>tls1.0</strong>: TLS 1.0 or later</li>
         * <li><strong>tls1.1</strong>: TLS 1.1 or later</li>
         * <li><strong>tls1.2</strong>: TLS 1.2 or later</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>tls1.0</p>
         */
        @NameInMap("SslProtocols")
        public String sslProtocols;

        /**
         * <p>The IP addresses that are included in the whitelist of the domain name.</p>
         */
        @NameInMap("WhiteList")
        public java.util.List<String> whiteList;

        public static DescribeDomainResourceResponseBodyWebRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainResourceResponseBodyWebRules self = new DescribeDomainResourceResponseBodyWebRules();
            return TeaModel.build(map, self);
        }

        public DescribeDomainResourceResponseBodyWebRules setBlackList(java.util.List<String> blackList) {
            this.blackList = blackList;
            return this;
        }
        public java.util.List<String> getBlackList() {
            return this.blackList;
        }

        public DescribeDomainResourceResponseBodyWebRules setCcEnabled(Boolean ccEnabled) {
            this.ccEnabled = ccEnabled;
            return this;
        }
        public Boolean getCcEnabled() {
            return this.ccEnabled;
        }

        public DescribeDomainResourceResponseBodyWebRules setCcRuleEnabled(Boolean ccRuleEnabled) {
            this.ccRuleEnabled = ccRuleEnabled;
            return this;
        }
        public Boolean getCcRuleEnabled() {
            return this.ccRuleEnabled;
        }

        public DescribeDomainResourceResponseBodyWebRules setCcTemplate(String ccTemplate) {
            this.ccTemplate = ccTemplate;
            return this;
        }
        public String getCcTemplate() {
            return this.ccTemplate;
        }

        public DescribeDomainResourceResponseBodyWebRules setCertName(String certName) {
            this.certName = certName;
            return this;
        }
        public String getCertName() {
            return this.certName;
        }

        public DescribeDomainResourceResponseBodyWebRules setCname(String cname) {
            this.cname = cname;
            return this;
        }
        public String getCname() {
            return this.cname;
        }

        public DescribeDomainResourceResponseBodyWebRules setCustomCiphers(java.util.List<String> customCiphers) {
            this.customCiphers = customCiphers;
            return this;
        }
        public java.util.List<String> getCustomCiphers() {
            return this.customCiphers;
        }

        public DescribeDomainResourceResponseBodyWebRules setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeDomainResourceResponseBodyWebRules setHttp2Enable(Boolean http2Enable) {
            this.http2Enable = http2Enable;
            return this;
        }
        public Boolean getHttp2Enable() {
            return this.http2Enable;
        }

        public DescribeDomainResourceResponseBodyWebRules setHttp2HttpsEnable(Boolean http2HttpsEnable) {
            this.http2HttpsEnable = http2HttpsEnable;
            return this;
        }
        public Boolean getHttp2HttpsEnable() {
            return this.http2HttpsEnable;
        }

        public DescribeDomainResourceResponseBodyWebRules setHttps2HttpEnable(Boolean https2HttpEnable) {
            this.https2HttpEnable = https2HttpEnable;
            return this;
        }
        public Boolean getHttps2HttpEnable() {
            return this.https2HttpEnable;
        }

        public DescribeDomainResourceResponseBodyWebRules setHttpsExt(String httpsExt) {
            this.httpsExt = httpsExt;
            return this;
        }
        public String getHttpsExt() {
            return this.httpsExt;
        }

        public DescribeDomainResourceResponseBodyWebRules setInstanceIds(java.util.List<String> instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }
        public java.util.List<String> getInstanceIds() {
            return this.instanceIds;
        }

        public DescribeDomainResourceResponseBodyWebRules setOcspEnabled(Boolean ocspEnabled) {
            this.ocspEnabled = ocspEnabled;
            return this;
        }
        public Boolean getOcspEnabled() {
            return this.ocspEnabled;
        }

        public DescribeDomainResourceResponseBodyWebRules setPolicyMode(String policyMode) {
            this.policyMode = policyMode;
            return this;
        }
        public String getPolicyMode() {
            return this.policyMode;
        }

        public DescribeDomainResourceResponseBodyWebRules setProxyEnabled(Boolean proxyEnabled) {
            this.proxyEnabled = proxyEnabled;
            return this;
        }
        public Boolean getProxyEnabled() {
            return this.proxyEnabled;
        }

        public DescribeDomainResourceResponseBodyWebRules setProxyTypes(java.util.List<DescribeDomainResourceResponseBodyWebRulesProxyTypes> proxyTypes) {
            this.proxyTypes = proxyTypes;
            return this;
        }
        public java.util.List<DescribeDomainResourceResponseBodyWebRulesProxyTypes> getProxyTypes() {
            return this.proxyTypes;
        }

        public DescribeDomainResourceResponseBodyWebRules setPunishReason(Integer punishReason) {
            this.punishReason = punishReason;
            return this;
        }
        public Integer getPunishReason() {
            return this.punishReason;
        }

        public DescribeDomainResourceResponseBodyWebRules setPunishStatus(Boolean punishStatus) {
            this.punishStatus = punishStatus;
            return this;
        }
        public Boolean getPunishStatus() {
            return this.punishStatus;
        }

        public DescribeDomainResourceResponseBodyWebRules setRealServers(java.util.List<String> realServers) {
            this.realServers = realServers;
            return this;
        }
        public java.util.List<String> getRealServers() {
            return this.realServers;
        }

        public DescribeDomainResourceResponseBodyWebRules setRsType(Integer rsType) {
            this.rsType = rsType;
            return this;
        }
        public Integer getRsType() {
            return this.rsType;
        }

        public DescribeDomainResourceResponseBodyWebRules setSsl13Enabled(Boolean ssl13Enabled) {
            this.ssl13Enabled = ssl13Enabled;
            return this;
        }
        public Boolean getSsl13Enabled() {
            return this.ssl13Enabled;
        }

        public DescribeDomainResourceResponseBodyWebRules setSslCiphers(String sslCiphers) {
            this.sslCiphers = sslCiphers;
            return this;
        }
        public String getSslCiphers() {
            return this.sslCiphers;
        }

        public DescribeDomainResourceResponseBodyWebRules setSslProtocols(String sslProtocols) {
            this.sslProtocols = sslProtocols;
            return this;
        }
        public String getSslProtocols() {
            return this.sslProtocols;
        }

        public DescribeDomainResourceResponseBodyWebRules setWhiteList(java.util.List<String> whiteList) {
            this.whiteList = whiteList;
            return this;
        }
        public java.util.List<String> getWhiteList() {
            return this.whiteList;
        }

    }

}
