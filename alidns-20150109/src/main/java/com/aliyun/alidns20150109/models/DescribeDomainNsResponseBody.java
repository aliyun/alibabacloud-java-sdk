// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainNsResponseBody extends TeaModel {
    @NameInMap("AllAliDns")
    public Boolean allAliDns;

    /**
     * <p>检测失败原因编码</p>
     */
    @NameInMap("DetectFailedReasonCode")
    public String detectFailedReasonCode;

    @NameInMap("DnsServers")
    public DescribeDomainNsResponseBodyDnsServers dnsServers;

    @NameInMap("ExpectDnsServers")
    public DescribeDomainNsResponseBodyExpectDnsServers expectDnsServers;

    @NameInMap("IncludeAliDns")
    public Boolean includeAliDns;

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
