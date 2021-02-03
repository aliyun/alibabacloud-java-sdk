// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainNsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AllAliDns")
    @Validation(required = true)
    public Boolean allAliDns;

    @NameInMap("IncludeAliDns")
    @Validation(required = true)
    public Boolean includeAliDns;

    @NameInMap("DnsServers")
    @Validation(required = true)
    public DescribeDomainNsResponseDnsServers dnsServers;

    @NameInMap("ExpectDnsServers")
    @Validation(required = true)
    public DescribeDomainNsResponseExpectDnsServers expectDnsServers;

    public static DescribeDomainNsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainNsResponse self = new DescribeDomainNsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainNsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainNsResponse setAllAliDns(Boolean allAliDns) {
        this.allAliDns = allAliDns;
        return this;
    }
    public Boolean getAllAliDns() {
        return this.allAliDns;
    }

    public DescribeDomainNsResponse setIncludeAliDns(Boolean includeAliDns) {
        this.includeAliDns = includeAliDns;
        return this;
    }
    public Boolean getIncludeAliDns() {
        return this.includeAliDns;
    }

    public DescribeDomainNsResponse setDnsServers(DescribeDomainNsResponseDnsServers dnsServers) {
        this.dnsServers = dnsServers;
        return this;
    }
    public DescribeDomainNsResponseDnsServers getDnsServers() {
        return this.dnsServers;
    }

    public DescribeDomainNsResponse setExpectDnsServers(DescribeDomainNsResponseExpectDnsServers expectDnsServers) {
        this.expectDnsServers = expectDnsServers;
        return this;
    }
    public DescribeDomainNsResponseExpectDnsServers getExpectDnsServers() {
        return this.expectDnsServers;
    }

    public static class DescribeDomainNsResponseDnsServers extends TeaModel {
        @NameInMap("DnsServer")
        @Validation(required = true)
        public java.util.List<String> dnsServer;

        public static DescribeDomainNsResponseDnsServers build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainNsResponseDnsServers self = new DescribeDomainNsResponseDnsServers();
            return TeaModel.build(map, self);
        }

        public DescribeDomainNsResponseDnsServers setDnsServer(java.util.List<String> dnsServer) {
            this.dnsServer = dnsServer;
            return this;
        }
        public java.util.List<String> getDnsServer() {
            return this.dnsServer;
        }

    }

    public static class DescribeDomainNsResponseExpectDnsServers extends TeaModel {
        @NameInMap("ExpectDnsServer")
        @Validation(required = true)
        public java.util.List<String> expectDnsServer;

        public static DescribeDomainNsResponseExpectDnsServers build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainNsResponseExpectDnsServers self = new DescribeDomainNsResponseExpectDnsServers();
            return TeaModel.build(map, self);
        }

        public DescribeDomainNsResponseExpectDnsServers setExpectDnsServer(java.util.List<String> expectDnsServer) {
            this.expectDnsServer = expectDnsServer;
            return this;
        }
        public java.util.List<String> getExpectDnsServer() {
            return this.expectDnsServer;
        }

    }

}
