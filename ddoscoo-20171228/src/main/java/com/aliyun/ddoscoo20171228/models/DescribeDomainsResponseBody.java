// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeDomainsResponseBody extends TeaModel {
    @NameInMap("Domains")
    public java.util.List<DescribeDomainsResponseBodyDomains> domains;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Long total;

    public static DescribeDomainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainsResponseBody self = new DescribeDomainsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainsResponseBody setDomains(java.util.List<DescribeDomainsResponseBodyDomains> domains) {
        this.domains = domains;
        return this;
    }
    public java.util.List<DescribeDomainsResponseBodyDomains> getDomains() {
        return this.domains;
    }

    public DescribeDomainsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainsResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class DescribeDomainsResponseBodyDomainsProxyTypeList extends TeaModel {
        @NameInMap("ProxyPorts")
        public java.util.List<String> proxyPorts;

        @NameInMap("ProxyType")
        public String proxyType;

        public static DescribeDomainsResponseBodyDomainsProxyTypeList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainsResponseBodyDomainsProxyTypeList self = new DescribeDomainsResponseBodyDomainsProxyTypeList();
            return TeaModel.build(map, self);
        }

        public DescribeDomainsResponseBodyDomainsProxyTypeList setProxyPorts(java.util.List<String> proxyPorts) {
            this.proxyPorts = proxyPorts;
            return this;
        }
        public java.util.List<String> getProxyPorts() {
            return this.proxyPorts;
        }

        public DescribeDomainsResponseBodyDomainsProxyTypeList setProxyType(String proxyType) {
            this.proxyType = proxyType;
            return this;
        }
        public String getProxyType() {
            return this.proxyType;
        }

    }

    public static class DescribeDomainsResponseBodyDomainsRealServers extends TeaModel {
        @NameInMap("RealServer")
        public String realServer;

        @NameInMap("RsType")
        public Integer rsType;

        public static DescribeDomainsResponseBodyDomainsRealServers build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainsResponseBodyDomainsRealServers self = new DescribeDomainsResponseBodyDomainsRealServers();
            return TeaModel.build(map, self);
        }

        public DescribeDomainsResponseBodyDomainsRealServers setRealServer(String realServer) {
            this.realServer = realServer;
            return this;
        }
        public String getRealServer() {
            return this.realServer;
        }

        public DescribeDomainsResponseBodyDomainsRealServers setRsType(Integer rsType) {
            this.rsType = rsType;
            return this;
        }
        public Integer getRsType() {
            return this.rsType;
        }

    }

    public static class DescribeDomainsResponseBodyDomains extends TeaModel {
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

        @NameInMap("Domain")
        public String domain;

        @NameInMap("Http2Enable")
        public Boolean http2Enable;

        @NameInMap("ProxyTypeList")
        public java.util.List<DescribeDomainsResponseBodyDomainsProxyTypeList> proxyTypeList;

        @NameInMap("RealServers")
        public java.util.List<DescribeDomainsResponseBodyDomainsRealServers> realServers;

        @NameInMap("SslCiphers")
        public String sslCiphers;

        @NameInMap("SslProtocols")
        public String sslProtocols;

        @NameInMap("WhiteList")
        public java.util.List<String> whiteList;

        public static DescribeDomainsResponseBodyDomains build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainsResponseBodyDomains self = new DescribeDomainsResponseBodyDomains();
            return TeaModel.build(map, self);
        }

        public DescribeDomainsResponseBodyDomains setBlackList(java.util.List<String> blackList) {
            this.blackList = blackList;
            return this;
        }
        public java.util.List<String> getBlackList() {
            return this.blackList;
        }

        public DescribeDomainsResponseBodyDomains setCcEnabled(Boolean ccEnabled) {
            this.ccEnabled = ccEnabled;
            return this;
        }
        public Boolean getCcEnabled() {
            return this.ccEnabled;
        }

        public DescribeDomainsResponseBodyDomains setCcRuleEnabled(Boolean ccRuleEnabled) {
            this.ccRuleEnabled = ccRuleEnabled;
            return this;
        }
        public Boolean getCcRuleEnabled() {
            return this.ccRuleEnabled;
        }

        public DescribeDomainsResponseBodyDomains setCcTemplate(String ccTemplate) {
            this.ccTemplate = ccTemplate;
            return this;
        }
        public String getCcTemplate() {
            return this.ccTemplate;
        }

        public DescribeDomainsResponseBodyDomains setCertName(String certName) {
            this.certName = certName;
            return this;
        }
        public String getCertName() {
            return this.certName;
        }

        public DescribeDomainsResponseBodyDomains setCname(String cname) {
            this.cname = cname;
            return this;
        }
        public String getCname() {
            return this.cname;
        }

        public DescribeDomainsResponseBodyDomains setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeDomainsResponseBodyDomains setHttp2Enable(Boolean http2Enable) {
            this.http2Enable = http2Enable;
            return this;
        }
        public Boolean getHttp2Enable() {
            return this.http2Enable;
        }

        public DescribeDomainsResponseBodyDomains setProxyTypeList(java.util.List<DescribeDomainsResponseBodyDomainsProxyTypeList> proxyTypeList) {
            this.proxyTypeList = proxyTypeList;
            return this;
        }
        public java.util.List<DescribeDomainsResponseBodyDomainsProxyTypeList> getProxyTypeList() {
            return this.proxyTypeList;
        }

        public DescribeDomainsResponseBodyDomains setRealServers(java.util.List<DescribeDomainsResponseBodyDomainsRealServers> realServers) {
            this.realServers = realServers;
            return this;
        }
        public java.util.List<DescribeDomainsResponseBodyDomainsRealServers> getRealServers() {
            return this.realServers;
        }

        public DescribeDomainsResponseBodyDomains setSslCiphers(String sslCiphers) {
            this.sslCiphers = sslCiphers;
            return this;
        }
        public String getSslCiphers() {
            return this.sslCiphers;
        }

        public DescribeDomainsResponseBodyDomains setSslProtocols(String sslProtocols) {
            this.sslProtocols = sslProtocols;
            return this;
        }
        public String getSslProtocols() {
            return this.sslProtocols;
        }

        public DescribeDomainsResponseBodyDomains setWhiteList(java.util.List<String> whiteList) {
            this.whiteList = whiteList;
            return this;
        }
        public java.util.List<String> getWhiteList() {
            return this.whiteList;
        }

    }

}
