// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainNsResponseBody extends TeaModel {
    @NameInMap("AllAliDns")
    public Boolean allAliDns;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ExpectDnsServers")
    public java.util.List<String> expectDnsServers;

    @NameInMap("DnsServers")
    public java.util.List<String> dnsServers;

    @NameInMap("IncludeAliDns")
    public Boolean includeAliDns;

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

    public DescribeDomainNsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainNsResponseBody setExpectDnsServers(java.util.List<String> expectDnsServers) {
        this.expectDnsServers = expectDnsServers;
        return this;
    }
    public java.util.List<String> getExpectDnsServers() {
        return this.expectDnsServers;
    }

    public DescribeDomainNsResponseBody setDnsServers(java.util.List<String> dnsServers) {
        this.dnsServers = dnsServers;
        return this;
    }
    public java.util.List<String> getDnsServers() {
        return this.dnsServers;
    }

    public DescribeDomainNsResponseBody setIncludeAliDns(Boolean includeAliDns) {
        this.includeAliDns = includeAliDns;
        return this;
    }
    public Boolean getIncludeAliDns() {
        return this.includeAliDns;
    }

}
