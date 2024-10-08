// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ModifyHichinaDomainDNSResponseBody extends TeaModel {
    /**
     * <p>The DNS server names after modification.</p>
     */
    @NameInMap("NewDnsServers")
    public ModifyHichinaDomainDNSResponseBodyNewDnsServers newDnsServers;

    /**
     * <p>The DNS server names before modification.</p>
     */
    @NameInMap("OriginalDnsServers")
    public ModifyHichinaDomainDNSResponseBodyOriginalDnsServers originalDnsServers;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>536E9CAD-DB30-4647-AC87-AA5CC38C5382</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyHichinaDomainDNSResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyHichinaDomainDNSResponseBody self = new ModifyHichinaDomainDNSResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyHichinaDomainDNSResponseBody setNewDnsServers(ModifyHichinaDomainDNSResponseBodyNewDnsServers newDnsServers) {
        this.newDnsServers = newDnsServers;
        return this;
    }
    public ModifyHichinaDomainDNSResponseBodyNewDnsServers getNewDnsServers() {
        return this.newDnsServers;
    }

    public ModifyHichinaDomainDNSResponseBody setOriginalDnsServers(ModifyHichinaDomainDNSResponseBodyOriginalDnsServers originalDnsServers) {
        this.originalDnsServers = originalDnsServers;
        return this;
    }
    public ModifyHichinaDomainDNSResponseBodyOriginalDnsServers getOriginalDnsServers() {
        return this.originalDnsServers;
    }

    public ModifyHichinaDomainDNSResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyHichinaDomainDNSResponseBodyNewDnsServers extends TeaModel {
        @NameInMap("DnsServer")
        public java.util.List<String> dnsServer;

        public static ModifyHichinaDomainDNSResponseBodyNewDnsServers build(java.util.Map<String, ?> map) throws Exception {
            ModifyHichinaDomainDNSResponseBodyNewDnsServers self = new ModifyHichinaDomainDNSResponseBodyNewDnsServers();
            return TeaModel.build(map, self);
        }

        public ModifyHichinaDomainDNSResponseBodyNewDnsServers setDnsServer(java.util.List<String> dnsServer) {
            this.dnsServer = dnsServer;
            return this;
        }
        public java.util.List<String> getDnsServer() {
            return this.dnsServer;
        }

    }

    public static class ModifyHichinaDomainDNSResponseBodyOriginalDnsServers extends TeaModel {
        @NameInMap("DnsServer")
        public java.util.List<String> dnsServer;

        public static ModifyHichinaDomainDNSResponseBodyOriginalDnsServers build(java.util.Map<String, ?> map) throws Exception {
            ModifyHichinaDomainDNSResponseBodyOriginalDnsServers self = new ModifyHichinaDomainDNSResponseBodyOriginalDnsServers();
            return TeaModel.build(map, self);
        }

        public ModifyHichinaDomainDNSResponseBodyOriginalDnsServers setDnsServer(java.util.List<String> dnsServer) {
            this.dnsServer = dnsServer;
            return this;
        }
        public java.util.List<String> getDnsServer() {
            return this.dnsServer;
        }

    }

}
