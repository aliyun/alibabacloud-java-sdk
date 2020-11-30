// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeDomainsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Total")
    @Validation(required = true)
    public Long total;

    @NameInMap("Domains")
    @Validation(required = true)
    public java.util.List<DescribeDomainsResponseDomains> domains;

    public static DescribeDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainsResponse self = new DescribeDomainsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainsResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public DescribeDomainsResponse setDomains(java.util.List<DescribeDomainsResponseDomains> domains) {
        this.domains = domains;
        return this;
    }
    public java.util.List<DescribeDomainsResponseDomains> getDomains() {
        return this.domains;
    }

    public static class DescribeDomainsResponseDomainsProxyTypeList extends TeaModel {
        @NameInMap("ProxyType")
        @Validation(required = true)
        public String proxyType;

        @NameInMap("ProxyPorts")
        @Validation(required = true)
        public java.util.List<String> proxyPorts;

        public static DescribeDomainsResponseDomainsProxyTypeList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainsResponseDomainsProxyTypeList self = new DescribeDomainsResponseDomainsProxyTypeList();
            return TeaModel.build(map, self);
        }

        public DescribeDomainsResponseDomainsProxyTypeList setProxyType(String proxyType) {
            this.proxyType = proxyType;
            return this;
        }
        public String getProxyType() {
            return this.proxyType;
        }

        public DescribeDomainsResponseDomainsProxyTypeList setProxyPorts(java.util.List<String> proxyPorts) {
            this.proxyPorts = proxyPorts;
            return this;
        }
        public java.util.List<String> getProxyPorts() {
            return this.proxyPorts;
        }

    }

    public static class DescribeDomainsResponseDomainsRealServers extends TeaModel {
        @NameInMap("RsType")
        @Validation(required = true)
        public Integer rsType;

        @NameInMap("RealServer")
        @Validation(required = true)
        public String realServer;

        public static DescribeDomainsResponseDomainsRealServers build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainsResponseDomainsRealServers self = new DescribeDomainsResponseDomainsRealServers();
            return TeaModel.build(map, self);
        }

        public DescribeDomainsResponseDomainsRealServers setRsType(Integer rsType) {
            this.rsType = rsType;
            return this;
        }
        public Integer getRsType() {
            return this.rsType;
        }

        public DescribeDomainsResponseDomainsRealServers setRealServer(String realServer) {
            this.realServer = realServer;
            return this;
        }
        public String getRealServer() {
            return this.realServer;
        }

    }

    public static class DescribeDomainsResponseDomains extends TeaModel {
        @NameInMap("Domain")
        @Validation(required = true)
        public String domain;

        @NameInMap("CcEnabled")
        @Validation(required = true)
        public Boolean ccEnabled;

        @NameInMap("CcRuleEnabled")
        @Validation(required = true)
        public Boolean ccRuleEnabled;

        @NameInMap("CcTemplate")
        @Validation(required = true)
        public String ccTemplate;

        @NameInMap("SslProtocols")
        @Validation(required = true)
        public String sslProtocols;

        @NameInMap("SslCiphers")
        @Validation(required = true)
        public String sslCiphers;

        @NameInMap("Http2Enable")
        @Validation(required = true)
        public Boolean http2Enable;

        @NameInMap("Cname")
        @Validation(required = true)
        public String cname;

        @NameInMap("CertName")
        @Validation(required = true)
        public String certName;

        @NameInMap("ProxyTypeList")
        @Validation(required = true)
        public java.util.List<DescribeDomainsResponseDomainsProxyTypeList> proxyTypeList;

        @NameInMap("RealServers")
        @Validation(required = true)
        public java.util.List<DescribeDomainsResponseDomainsRealServers> realServers;

        @NameInMap("WhiteList")
        @Validation(required = true)
        public java.util.List<String> whiteList;

        @NameInMap("BlackList")
        @Validation(required = true)
        public java.util.List<String> blackList;

        public static DescribeDomainsResponseDomains build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainsResponseDomains self = new DescribeDomainsResponseDomains();
            return TeaModel.build(map, self);
        }

        public DescribeDomainsResponseDomains setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeDomainsResponseDomains setCcEnabled(Boolean ccEnabled) {
            this.ccEnabled = ccEnabled;
            return this;
        }
        public Boolean getCcEnabled() {
            return this.ccEnabled;
        }

        public DescribeDomainsResponseDomains setCcRuleEnabled(Boolean ccRuleEnabled) {
            this.ccRuleEnabled = ccRuleEnabled;
            return this;
        }
        public Boolean getCcRuleEnabled() {
            return this.ccRuleEnabled;
        }

        public DescribeDomainsResponseDomains setCcTemplate(String ccTemplate) {
            this.ccTemplate = ccTemplate;
            return this;
        }
        public String getCcTemplate() {
            return this.ccTemplate;
        }

        public DescribeDomainsResponseDomains setSslProtocols(String sslProtocols) {
            this.sslProtocols = sslProtocols;
            return this;
        }
        public String getSslProtocols() {
            return this.sslProtocols;
        }

        public DescribeDomainsResponseDomains setSslCiphers(String sslCiphers) {
            this.sslCiphers = sslCiphers;
            return this;
        }
        public String getSslCiphers() {
            return this.sslCiphers;
        }

        public DescribeDomainsResponseDomains setHttp2Enable(Boolean http2Enable) {
            this.http2Enable = http2Enable;
            return this;
        }
        public Boolean getHttp2Enable() {
            return this.http2Enable;
        }

        public DescribeDomainsResponseDomains setCname(String cname) {
            this.cname = cname;
            return this;
        }
        public String getCname() {
            return this.cname;
        }

        public DescribeDomainsResponseDomains setCertName(String certName) {
            this.certName = certName;
            return this;
        }
        public String getCertName() {
            return this.certName;
        }

        public DescribeDomainsResponseDomains setProxyTypeList(java.util.List<DescribeDomainsResponseDomainsProxyTypeList> proxyTypeList) {
            this.proxyTypeList = proxyTypeList;
            return this;
        }
        public java.util.List<DescribeDomainsResponseDomainsProxyTypeList> getProxyTypeList() {
            return this.proxyTypeList;
        }

        public DescribeDomainsResponseDomains setRealServers(java.util.List<DescribeDomainsResponseDomainsRealServers> realServers) {
            this.realServers = realServers;
            return this;
        }
        public java.util.List<DescribeDomainsResponseDomainsRealServers> getRealServers() {
            return this.realServers;
        }

        public DescribeDomainsResponseDomains setWhiteList(java.util.List<String> whiteList) {
            this.whiteList = whiteList;
            return this;
        }
        public java.util.List<String> getWhiteList() {
            return this.whiteList;
        }

        public DescribeDomainsResponseDomains setBlackList(java.util.List<String> blackList) {
            this.blackList = blackList;
            return this;
        }
        public java.util.List<String> getBlackList() {
            return this.blackList;
        }

    }

}
