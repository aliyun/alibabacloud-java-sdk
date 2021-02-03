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

    public ModifyHichinaDomainDNSResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyHichinaDomainDNSResponse setOriginalDnsServers(ModifyHichinaDomainDNSResponseOriginalDnsServers originalDnsServers) {
        this.originalDnsServers = originalDnsServers;
        return this;
    }
    public ModifyHichinaDomainDNSResponseOriginalDnsServers getOriginalDnsServers() {
        return this.originalDnsServers;
    }

    public ModifyHichinaDomainDNSResponse setNewDnsServers(ModifyHichinaDomainDNSResponseNewDnsServers newDnsServers) {
        this.newDnsServers = newDnsServers;
        return this;
    }
    public ModifyHichinaDomainDNSResponseNewDnsServers getNewDnsServers() {
        return this.newDnsServers;
    }

    public static class ModifyHichinaDomainDNSResponseOriginalDnsServers extends TeaModel {
        @NameInMap("DnsServer")
        @Validation(required = true)
        public java.util.List<String> dnsServer;

        public static ModifyHichinaDomainDNSResponseOriginalDnsServers build(java.util.Map<String, ?> map) throws Exception {
            ModifyHichinaDomainDNSResponseOriginalDnsServers self = new ModifyHichinaDomainDNSResponseOriginalDnsServers();
            return TeaModel.build(map, self);
        }

        public ModifyHichinaDomainDNSResponseOriginalDnsServers setDnsServer(java.util.List<String> dnsServer) {
            this.dnsServer = dnsServer;
            return this;
        }
        public java.util.List<String> getDnsServer() {
            return this.dnsServer;
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

        public ModifyHichinaDomainDNSResponseNewDnsServers setDnsServer(java.util.List<String> dnsServer) {
            this.dnsServer = dnsServer;
            return this;
        }
        public java.util.List<String> getDnsServer() {
            return this.dnsServer;
        }

    }

}
