// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainNsResponseBody extends TeaModel {
    /**
     * <p>Indicates whether all the name servers were Alibaba Cloud DNS servers.</p>
     */
    @NameInMap("AllAliDns")
    public Boolean allAliDns;

    @NameInMap("DetectFailedReasonCode")
    public String detectFailedReasonCode;

    /**
     * <p>The list of DNS servers for the domain name.</p>
     */
    @NameInMap("DnsServers")
    public DescribeDomainNsResponseBodyDnsServers dnsServers;

    /**
     * <p>The list of DNS servers assigned by Alibaba Cloud.</p>
     */
    @NameInMap("ExpectDnsServers")
    public DescribeDomainNsResponseBodyExpectDnsServers expectDnsServers;

    /**
     * <p>Indicates whether the name servers included Alibaba Cloud DNS servers.</p>
     */
    @NameInMap("IncludeAliDns")
    public Boolean includeAliDns;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDomainNsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainNsResponseBody self = new DescribeDomainNsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainNsResponseBody setAllAliDns(Boolean allAliDns) {
        this.allAliDns = allAliDns;
        return this;
    }
    public Boolean getAllAliDns() {
        return this.allAliDns;
    }

    public DescribeDomainNsResponseBody setDetectFailedReasonCode(String detectFailedReasonCode) {
        this.detectFailedReasonCode = detectFailedReasonCode;
        return this;
    }
    public String getDetectFailedReasonCode() {
        return this.detectFailedReasonCode;
    }

    public DescribeDomainNsResponseBody setDnsServers(DescribeDomainNsResponseBodyDnsServers dnsServers) {
        this.dnsServers = dnsServers;
        return this;
    }
    public DescribeDomainNsResponseBodyDnsServers getDnsServers() {
        return this.dnsServers;
    }

    public DescribeDomainNsResponseBody setExpectDnsServers(DescribeDomainNsResponseBodyExpectDnsServers expectDnsServers) {
        this.expectDnsServers = expectDnsServers;
        return this;
    }
    public DescribeDomainNsResponseBodyExpectDnsServers getExpectDnsServers() {
        return this.expectDnsServers;
    }

    public DescribeDomainNsResponseBody setIncludeAliDns(Boolean includeAliDns) {
        this.includeAliDns = includeAliDns;
        return this;
    }
    public Boolean getIncludeAliDns() {
        return this.includeAliDns;
    }

    public DescribeDomainNsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDomainNsResponseBodyDnsServers extends TeaModel {
        @NameInMap("DnsServer")
        public java.util.List<String> dnsServer;

        public static DescribeDomainNsResponseBodyDnsServers build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainNsResponseBodyDnsServers self = new DescribeDomainNsResponseBodyDnsServers();
            return TeaModel.build(map, self);
        }

        public DescribeDomainNsResponseBodyDnsServers setDnsServer(java.util.List<String> dnsServer) {
            this.dnsServer = dnsServer;
            return this;
        }
        public java.util.List<String> getDnsServer() {
            return this.dnsServer;
        }

    }

    public static class DescribeDomainNsResponseBodyExpectDnsServers extends TeaModel {
        @NameInMap("ExpectDnsServer")
        public java.util.List<String> expectDnsServer;

        public static DescribeDomainNsResponseBodyExpectDnsServers build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainNsResponseBodyExpectDnsServers self = new DescribeDomainNsResponseBodyExpectDnsServers();
            return TeaModel.build(map, self);
        }

        public DescribeDomainNsResponseBodyExpectDnsServers setExpectDnsServer(java.util.List<String> expectDnsServer) {
            this.expectDnsServer = expectDnsServer;
            return this;
        }
        public java.util.List<String> getExpectDnsServer() {
            return this.expectDnsServer;
        }

    }

}
