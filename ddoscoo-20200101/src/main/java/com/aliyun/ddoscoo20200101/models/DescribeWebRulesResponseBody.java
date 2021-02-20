// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeWebRulesResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("WebRules")
    public java.util.List<DescribeWebRulesResponseBodyWebRules> webRules;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeWebRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebRulesResponseBody self = new DescribeWebRulesResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeWebRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeWebRulesResponseBodyWebRulesRealServers extends TeaModel {
        @NameInMap("RsType")
        public Integer rsType;

        @NameInMap("RealServer")
        public String realServer;

        public static DescribeWebRulesResponseBodyWebRulesRealServers build(java.util.Map<String, ?> map) throws Exception {
            DescribeWebRulesResponseBodyWebRulesRealServers self = new DescribeWebRulesResponseBodyWebRulesRealServers();
            return TeaModel.build(map, self);
        }

        public DescribeWebRulesResponseBodyWebRulesRealServers setRsType(Integer rsType) {
            this.rsType = rsType;
            return this;
        }
        public Integer getRsType() {
            return this.rsType;
        }

        public DescribeWebRulesResponseBodyWebRulesRealServers setRealServer(String realServer) {
            this.realServer = realServer;
            return this;
        }
        public String getRealServer() {
            return this.realServer;
        }

    }

    public static class DescribeWebRulesResponseBodyWebRulesProxyTypes extends TeaModel {
        @NameInMap("ProxyPorts")
        public java.util.List<String> proxyPorts;

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

    public static class DescribeWebRulesResponseBodyWebRules extends TeaModel {
        @NameInMap("Domain")
        public String domain;

        @NameInMap("Http2HttpsEnable")
        public Boolean http2HttpsEnable;

        @NameInMap("CustomCiphers")
        public java.util.List<String> customCiphers;

        @NameInMap("BlackList")
        public java.util.List<String> blackList;

        @NameInMap("WhiteList")
        public java.util.List<String> whiteList;

        @NameInMap("RealServers")
        public java.util.List<DescribeWebRulesResponseBodyWebRulesRealServers> realServers;

        @NameInMap("ProxyTypes")
        public java.util.List<DescribeWebRulesResponseBodyWebRulesProxyTypes> proxyTypes;

        @NameInMap("SslProtocols")
        public String sslProtocols;

        @NameInMap("CcTemplate")
        public String ccTemplate;

        @NameInMap("CcEnabled")
        public Boolean ccEnabled;

        @NameInMap("SslCiphers")
        public String sslCiphers;

        @NameInMap("CcRuleEnabled")
        public Boolean ccRuleEnabled;

        @NameInMap("Ssl13Enabled")
        public Boolean ssl13Enabled;

        @NameInMap("ProxyEnabled")
        public Boolean proxyEnabled;

        @NameInMap("CertName")
        public String certName;

        @NameInMap("PolicyMode")
        public String policyMode;

        @NameInMap("Cname")
        public String cname;

        @NameInMap("Http2Enable")
        public Boolean http2Enable;

        @NameInMap("Https2HttpEnable")
        public Boolean https2HttpEnable;

        public static DescribeWebRulesResponseBodyWebRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeWebRulesResponseBodyWebRules self = new DescribeWebRulesResponseBodyWebRules();
            return TeaModel.build(map, self);
        }

        public DescribeWebRulesResponseBodyWebRules setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeWebRulesResponseBodyWebRules setHttp2HttpsEnable(Boolean http2HttpsEnable) {
            this.http2HttpsEnable = http2HttpsEnable;
            return this;
        }
        public Boolean getHttp2HttpsEnable() {
            return this.http2HttpsEnable;
        }

        public DescribeWebRulesResponseBodyWebRules setCustomCiphers(java.util.List<String> customCiphers) {
            this.customCiphers = customCiphers;
            return this;
        }
        public java.util.List<String> getCustomCiphers() {
            return this.customCiphers;
        }

        public DescribeWebRulesResponseBodyWebRules setBlackList(java.util.List<String> blackList) {
            this.blackList = blackList;
            return this;
        }
        public java.util.List<String> getBlackList() {
            return this.blackList;
        }

        public DescribeWebRulesResponseBodyWebRules setWhiteList(java.util.List<String> whiteList) {
            this.whiteList = whiteList;
            return this;
        }
        public java.util.List<String> getWhiteList() {
            return this.whiteList;
        }

        public DescribeWebRulesResponseBodyWebRules setRealServers(java.util.List<DescribeWebRulesResponseBodyWebRulesRealServers> realServers) {
            this.realServers = realServers;
            return this;
        }
        public java.util.List<DescribeWebRulesResponseBodyWebRulesRealServers> getRealServers() {
            return this.realServers;
        }

        public DescribeWebRulesResponseBodyWebRules setProxyTypes(java.util.List<DescribeWebRulesResponseBodyWebRulesProxyTypes> proxyTypes) {
            this.proxyTypes = proxyTypes;
            return this;
        }
        public java.util.List<DescribeWebRulesResponseBodyWebRulesProxyTypes> getProxyTypes() {
            return this.proxyTypes;
        }

        public DescribeWebRulesResponseBodyWebRules setSslProtocols(String sslProtocols) {
            this.sslProtocols = sslProtocols;
            return this;
        }
        public String getSslProtocols() {
            return this.sslProtocols;
        }

        public DescribeWebRulesResponseBodyWebRules setCcTemplate(String ccTemplate) {
            this.ccTemplate = ccTemplate;
            return this;
        }
        public String getCcTemplate() {
            return this.ccTemplate;
        }

        public DescribeWebRulesResponseBodyWebRules setCcEnabled(Boolean ccEnabled) {
            this.ccEnabled = ccEnabled;
            return this;
        }
        public Boolean getCcEnabled() {
            return this.ccEnabled;
        }

        public DescribeWebRulesResponseBodyWebRules setSslCiphers(String sslCiphers) {
            this.sslCiphers = sslCiphers;
            return this;
        }
        public String getSslCiphers() {
            return this.sslCiphers;
        }

        public DescribeWebRulesResponseBodyWebRules setCcRuleEnabled(Boolean ccRuleEnabled) {
            this.ccRuleEnabled = ccRuleEnabled;
            return this;
        }
        public Boolean getCcRuleEnabled() {
            return this.ccRuleEnabled;
        }

        public DescribeWebRulesResponseBodyWebRules setSsl13Enabled(Boolean ssl13Enabled) {
            this.ssl13Enabled = ssl13Enabled;
            return this;
        }
        public Boolean getSsl13Enabled() {
            return this.ssl13Enabled;
        }

        public DescribeWebRulesResponseBodyWebRules setProxyEnabled(Boolean proxyEnabled) {
            this.proxyEnabled = proxyEnabled;
            return this;
        }
        public Boolean getProxyEnabled() {
            return this.proxyEnabled;
        }

        public DescribeWebRulesResponseBodyWebRules setCertName(String certName) {
            this.certName = certName;
            return this;
        }
        public String getCertName() {
            return this.certName;
        }

        public DescribeWebRulesResponseBodyWebRules setPolicyMode(String policyMode) {
            this.policyMode = policyMode;
            return this;
        }
        public String getPolicyMode() {
            return this.policyMode;
        }

        public DescribeWebRulesResponseBodyWebRules setCname(String cname) {
            this.cname = cname;
            return this;
        }
        public String getCname() {
            return this.cname;
        }

        public DescribeWebRulesResponseBodyWebRules setHttp2Enable(Boolean http2Enable) {
            this.http2Enable = http2Enable;
            return this;
        }
        public Boolean getHttp2Enable() {
            return this.http2Enable;
        }

        public DescribeWebRulesResponseBodyWebRules setHttps2HttpEnable(Boolean https2HttpEnable) {
            this.https2HttpEnable = https2HttpEnable;
            return this;
        }
        public Boolean getHttps2HttpEnable() {
            return this.https2HttpEnable;
        }

    }

}
