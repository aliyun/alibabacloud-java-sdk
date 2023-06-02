// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeWebRulesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

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
        @NameInMap("CertId")
        public String certId;

        @NameInMap("GmEnable")
        public Long gmEnable;

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

    public static class DescribeWebRulesResponseBodyWebRulesRealServers extends TeaModel {
        @NameInMap("RealServer")
        public String realServer;

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
        @NameInMap("BlackList")
        public java.util.List<String> blackList;

        @NameInMap("CcEnabled")
        public Boolean ccEnabled;

        @NameInMap("CcRuleEnabled")
        public Boolean ccRuleEnabled;

        @NameInMap("CcTemplate")
        public String ccTemplate;

        @NameInMap("CertName")
        public String certName;

        @NameInMap("Cname")
        public String cname;

        @NameInMap("CustomCiphers")
        public java.util.List<String> customCiphers;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("GmCert")
        public DescribeWebRulesResponseBodyWebRulesGmCert gmCert;

        @NameInMap("Http2Enable")
        public Boolean http2Enable;

        @NameInMap("Http2HttpsEnable")
        public Boolean http2HttpsEnable;

        @NameInMap("Https2HttpEnable")
        public Boolean https2HttpEnable;

        @NameInMap("OcspEnabled")
        public Boolean ocspEnabled;

        @NameInMap("PolicyMode")
        public String policyMode;

        @NameInMap("ProxyEnabled")
        public Boolean proxyEnabled;

        @NameInMap("ProxyTypes")
        public java.util.List<DescribeWebRulesResponseBodyWebRulesProxyTypes> proxyTypes;

        @NameInMap("PunishReason")
        public Integer punishReason;

        @NameInMap("PunishStatus")
        public Boolean punishStatus;

        @NameInMap("RealServers")
        public java.util.List<DescribeWebRulesResponseBodyWebRulesRealServers> realServers;

        @NameInMap("Ssl13Enabled")
        public Boolean ssl13Enabled;

        @NameInMap("SslCiphers")
        public String sslCiphers;

        @NameInMap("SslProtocols")
        public String sslProtocols;

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
