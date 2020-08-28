// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ModifyHichinaDomainDNSResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("OriginalDnsServers")
    @Validation(required = true)
    public ModifyHichinaDomainDNSResponseOriginalDnsServers originalDnsServers;

    @NameInMap("NewDnsServers")
    @Validation(required = true)
    public ModifyHichinaDomainDNSResponseNewDnsServers newDnsServers;

    public static ModifyHichinaDomainDNSResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyHichinaDomainDNSResponse self = new ModifyHichinaDomainDNSResponse();
        return TeaModel.build(map, self);
    }

    public static class ModifyHichinaDomainDNSResponseOriginalDnsServers extends TeaModel {
        @NameInMap("DnsServer")
        @Validation(required = true)
        public java.util.List<String> dnsServer;

        public static ModifyHichinaDomainDNSResponseOriginalDnsServers build(java.util.Map<String, ?> map) throws Exception {
            ModifyHichinaDomainDNSResponseOriginalDnsServers self = new ModifyHichinaDomainDNSResponseOriginalDnsServers();
            return TeaModel.build(map, self);
        }

    }

    public static class ModifyHichinaDomainDNSResponseNewDnsServers extends TeaModel {
        @NameInMap("DnsServer")
        @Validation(required = true)
        public java.util.List<String> dnsServer;

        public static ModifyHichinaDomainDNSResponseNewDnsServers build(java.util.Map<String, ?> map) throws Exception {
            ModifyHichinaDomainDNSResponseNewDnsServers self = new ModifyHichinaDomainDNSResponseNewDnsServers();
            return TeaModel.build(map, self);
        }

    }

}
