// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddDomainResponseBody extends TeaModel {
    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("DomainId")
    public String domainId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("PunyCode")
    public String punyCode;

    @NameInMap("DnsServers")
    public AddDomainResponseBodyDnsServers dnsServers;

    @NameInMap("GroupId")
    public String groupId;

    public static AddDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddDomainResponseBody self = new AddDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public AddDomainResponseBody setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public AddDomainResponseBody setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public AddDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddDomainResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public AddDomainResponseBody setPunyCode(String punyCode) {
        this.punyCode = punyCode;
        return this;
    }
    public String getPunyCode() {
        return this.punyCode;
    }

    public AddDomainResponseBody setDnsServers(AddDomainResponseBodyDnsServers dnsServers) {
        this.dnsServers = dnsServers;
        return this;
    }
    public AddDomainResponseBodyDnsServers getDnsServers() {
        return this.dnsServers;
    }

    public AddDomainResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public static class AddDomainResponseBodyDnsServers extends TeaModel {
        @NameInMap("DnsServer")
        public java.util.List<String> dnsServer;

        public static AddDomainResponseBodyDnsServers build(java.util.Map<String, ?> map) throws Exception {
            AddDomainResponseBodyDnsServers self = new AddDomainResponseBodyDnsServers();
            return TeaModel.build(map, self);
        }

        public AddDomainResponseBodyDnsServers setDnsServer(java.util.List<String> dnsServer) {
            this.dnsServer = dnsServer;
            return this;
        }
        public java.util.List<String> getDnsServer() {
            return this.dnsServer;
        }

    }

}
