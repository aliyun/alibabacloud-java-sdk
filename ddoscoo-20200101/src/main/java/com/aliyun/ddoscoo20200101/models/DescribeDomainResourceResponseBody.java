// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDomainResourceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>39499F01-19D9-4EA4-A0E9-C6014BA5CDBE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of web rules returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    /**
     * <p>An array of web rule configurations.</p>
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
         * <p>The array of ports associated with the protocol.</p>
         */
        @NameInMap("ProxyPorts")
        public java.util.List<String> proxyPorts;

        /**
         * <p>The proxy protocol. Valid values:</p>
         * <ul>
         * <li><p><strong>http</strong>: HTTP</p>
         * </li>
         * <li><p><strong>https</strong>: HTTPS</p>
         * </li>
         * <li><p><strong>websocket</strong>: WebSocket</p>
         * </li>
         * <li><p><strong>websockets</strong>: WebSockets</p>
         * </li>
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
         * <p>An array of IP addresses on the blocklist for the domain.</p>
         */
        @NameInMap("BlackList")
        public java.util.List<String> blackList;

        /**
         * <p>Whether CC protection is enabled. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CcEnabled")
        public Boolean ccEnabled;

        /**
         * <p>Whether custom CC protection rules are enabled. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CcRuleEnabled")
        public Boolean ccRuleEnabled;

        /**
         * <p>The CC protection mode. Valid values:</p>
         * <ul>
         * <li><p><strong>default</strong>: normal mode</p>
         * </li>
         * <li><p><strong>gf_under_attack</strong>: Emergency mode</p>
         * </li>
         * <li><p><strong>gf_sos_verify</strong>: Strict mode</p>
         * </li>
         * <li><p><strong>gf_sos_enhance</strong>: Super Strict mode</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("CcTemplate")
        public String ccTemplate;

        /**
         * <p>The name of the SSL certificate used by the domain.</p>
         * 
         * <strong>example:</strong>
         * <p>49944XX.pem</p>
         */
        @NameInMap("CertName")
        public String certName;

        /**
         * <p>The CNAME assigned to the domain by Anti-DDoS Pro.</p>
         * 
         * <strong>example:</strong>
         * <p>0ekb69x3j9wvXXXX.aliyunddosXXXX.com</p>
         */
        @NameInMap("Cname")
        public String cname;

        /**
         * <p>An array of custom cipher suites.</p>
         */
        @NameInMap("CustomCiphers")
        public java.util.List<String> customCiphers;

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>Whether HTTP/2 is enabled. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Http2Enable")
        public Boolean http2Enable;

        /**
         * <p>Whether forced HTTPS redirect is enabled. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Http2HttpsEnable")
        public Boolean http2HttpsEnable;

        /**
         * <p>Whether HTTP back-to-source is enabled. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Https2HttpEnable")
        public Boolean https2HttpEnable;

        /**
         * <p>The advanced HTTPS settings, formatted as a JSON string. These settings apply only when the domain uses HTTPS (the <code>ProxyType</code> value includes <code>https</code>). The string contains the following fields:</p>
         * <ul>
         * <li><p><strong>Http2https</strong>: integer. Specifies whether to enable forced HTTPS redirect. Valid values: <strong>0</strong> (disabled) and <strong>1</strong> (enabled).</p>
         * </li>
         * <li><p><strong>Https2http</strong>: integer. Specifies whether to enable HTTP back-to-source. Valid values: <strong>0</strong> (disabled) and <strong>1</strong> (enabled).</p>
         * </li>
         * <li><p><strong>Http2</strong>: integer. Specifies whether to enable HTTP/2. Valid values: <strong>0</strong> (disabled) and <strong>1</strong> (enabled).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Https2http&quot;:0,&quot;Http2&quot;:0,&quot;Http2https&quot;:0}</p>
         */
        @NameInMap("HttpsExt")
        public String httpsExt;

        /**
         * <p>An array of IDs for the Anti-DDoS Pro instances associated with the domain.</p>
         */
        @NameInMap("InstanceIds")
        public java.util.List<String> instanceIds;

        /**
         * <p>Whether Online Certificate Status Protocol (OCSP) is enabled. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("OcspEnabled")
        public Boolean ocspEnabled;

        /**
         * <p>The back-to-source load balancing algorithm. This algorithm determines how traffic is distributed to origin servers. Valid values:</p>
         * <ul>
         * <li><p><strong>ip_hash</strong>: IP Hash. This algorithm hashes the source IP address and routes all requests from the same IP address to the same origin server.</p>
         * </li>
         * <li><p><strong>rr</strong>: Round Robin. This algorithm distributes requests across origin servers in turn.</p>
         * </li>
         * <li><p><strong>least_time</strong>: Least Time. This algorithm uses intelligent DNS resolution to minimize end-to-end latency from the protection node to the origin server.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ip_hash</p>
         */
        @NameInMap("PolicyMode")
        public String policyMode;

        /**
         * <p>Whether Anti-DDoS Pro forwards traffic for the domain. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Forwarding is enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: Forwarding is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ProxyEnabled")
        public Boolean proxyEnabled;

        /**
         * <p>An array of proxy configurations for the domain, each specifying a protocol and its associated ports.</p>
         */
        @NameInMap("ProxyTypes")
        public java.util.List<DescribeDomainResourceResponseBodyWebRulesProxyTypes> proxyTypes;

        /**
         * <p>The reason the domain is penalized. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: The domain does not have an ICP filing.</p>
         * </li>
         * <li><p><strong>2</strong>: The business hosted on the domain does not meet regulatory requirements.</p>
         * </li>
         * </ul>
         * <p>If both reasons apply, this parameter returns <strong>2</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PunishReason")
        public Integer punishReason;

        /**
         * <p>Whether the domain is penalized. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: The domain is penalized. For more information, see the <code>PunishReason</code> parameter.</p>
         * </li>
         * <li><p><strong>false</strong>: The domain is not penalized.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("PunishStatus")
        public Boolean punishStatus;

        /**
         * <p>An array of origin server addresses.</p>
         */
        @NameInMap("RealServers")
        public java.util.List<String> realServers;

        /**
         * <p>The address type of the origin server. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: IP address</p>
         * </li>
         * <li><p><strong>1</strong>: domain</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RsType")
        public Integer rsType;

        /**
         * <p>Whether TLS 1.3 is enabled. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Ssl13Enabled")
        public Boolean ssl13Enabled;

        /**
         * <p>The cipher suite configuration type. Valid values:</p>
         * <ul>
         * <li><p><strong>default</strong>: Custom</p>
         * </li>
         * <li><p><strong>all</strong>: All</p>
         * </li>
         * <li><p><strong>strong</strong>: Strong</p>
         * </li>
         * <li><p><strong>improved</strong>: Improved</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("SslCiphers")
        public String sslCiphers;

        /**
         * <p>The minimum TLS protocol version. Valid values:</p>
         * <ul>
         * <li><p><strong>tls1.0</strong>: TLS 1.0 and later versions.</p>
         * </li>
         * <li><p><strong>tls1.1</strong>: TLS 1.1 and later versions.</p>
         * </li>
         * <li><p><strong>tls1.2</strong>: TLS 1.2 and later versions.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>tls1.0</p>
         */
        @NameInMap("SslProtocols")
        public String sslProtocols;

        /**
         * <p>An array of IP addresses on the allowlist for the domain.</p>
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
