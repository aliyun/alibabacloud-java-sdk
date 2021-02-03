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

    public AddDomainResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddDomainResponse setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public AddDomainResponse setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public AddDomainResponse setPunyCode(String punyCode) {
        this.punyCode = punyCode;
        return this;
    }
    public String getPunyCode() {
        return this.punyCode;
    }

    public AddDomainResponse setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public AddDomainResponse setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public AddDomainResponse setDnsServers(AddDomainResponseDnsServers dnsServers) {
        this.dnsServers = dnsServers;
        return this;
    }
    public AddDomainResponseDnsServers getDnsServers() {
        return this.dnsServers;
    }

    public static class AddDomainResponseDnsServers extends TeaModel {
        @NameInMap("DnsServer")
        @Validation(required = true)
        public java.util.List<String> dnsServer;

        public static AddDomainResponseDnsServers build(java.util.Map<String, ?> map) throws Exception {
            AddDomainResponseDnsServers self = new AddDomainResponseDnsServers();
            return TeaModel.build(map, self);
        }

        public AddDomainResponseDnsServers setDnsServer(java.util.List<String> dnsServer) {
            this.dnsServer = dnsServer;
            return this;
        }
        public java.util.List<String> getDnsServer() {
            return this.dnsServer;
        }

    }

}
