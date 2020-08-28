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

    public static class DescribeDomainNsResponseDnsServers extends TeaModel {
        @NameInMap("DnsServer")
        @Validation(required = true)
        public java.util.List<String> dnsServer;

        public static DescribeDomainNsResponseDnsServers build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainNsResponseDnsServers self = new DescribeDomainNsResponseDnsServers();
            return TeaModel.build(map, self);
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

    }

}
