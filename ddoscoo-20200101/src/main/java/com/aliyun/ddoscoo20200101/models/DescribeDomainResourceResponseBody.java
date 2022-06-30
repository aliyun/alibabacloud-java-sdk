// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDomainResourceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

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
        @NameInMap("ProxyPorts")
        public java.util.List<String> proxyPorts;

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

        @NameInMap("Http2Enable")
        public Boolean http2Enable;

        @NameInMap("Http2HttpsEnable")
        public Boolean http2HttpsEnable;

        @NameInMap("Https2HttpEnable")
        public Boolean https2HttpEnable;

        @NameInMap("HttpsExt")
        public String httpsExt;

        @NameInMap("InstanceIds")
        public java.util.List<String> instanceIds;

        @NameInMap("PolicyMode")
        public String policyMode;

        @NameInMap("ProxyEnabled")
        public Boolean proxyEnabled;

        @NameInMap("ProxyTypes")
        public java.util.List<DescribeDomainResourceResponseBodyWebRulesProxyTypes> proxyTypes;

        @NameInMap("PunishReason")
        public Integer punishReason;

        @NameInMap("PunishStatus")
        public Boolean punishStatus;

        @NameInMap("RealServers")
        public java.util.List<String> realServers;

        @NameInMap("RsType")
        public Integer rsType;

        @NameInMap("Ssl13Enabled")
        public Boolean ssl13Enabled;

        @NameInMap("SslCiphers")
        public String sslCiphers;

        @NameInMap("SslProtocols")
        public String sslProtocols;

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
