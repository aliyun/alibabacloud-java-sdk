// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddDomainResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DomainId")
    @Validation(required = true)
    public String domainId;

    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    @NameInMap("PunyCode")
    @Validation(required = true)
    public String punyCode;

    @NameInMap("GroupId")
    @Validation(required = true)
    public String groupId;

    @NameInMap("GroupName")
    @Validation(required = true)
    public String groupName;

    @NameInMap("DnsServers")
    @Validation(required = true)
    public AddDomainResponseDnsServers dnsServers;

    public static AddDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDomainResponse self = new AddDomainResponse();
        return TeaModel.build(map, self);
    }

    public static class AddDomainResponseDnsServers extends TeaModel {
        @NameInMap("DnsServer")
        @Validation(required = true)
        public java.util.List<String> dnsServer;

        public static AddDomainResponseDnsServers build(java.util.Map<String, ?> map) throws Exception {
            AddDomainResponseDnsServers self = new AddDomainResponseDnsServers();
            return TeaModel.build(map, self);
        }

    }

}
