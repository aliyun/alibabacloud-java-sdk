// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddDomainResponseBody extends TeaModel {
    @NameInMap("DnsServers")
    public AddDomainResponseBodyDnsServers dnsServers;

    /**
     * <p>The ID of the domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx6615cf240c697f9f7e207xxxxxx</p>
     */
    @NameInMap("DomainId")
    public String domainId;

    /**
     * <p>The domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The ID of the domain name group.</p>
     * 
     * <strong>example:</strong>
     * <p>defaultGroup</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The name of the domain name group.</p>
     * 
     * <strong>example:</strong>
     * <p>MyGroup</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The Punycode for the Chinese domain name. This parameter is returned only for Chinese domain names.</p>
     * 
     * <strong>example:</strong>
     * <p>xn--fsq270a.com</p>
     */
    @NameInMap("PunyCode")
    public String punyCode;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx508EF-00FD-xxx9-95A4-1E10BACxxxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddDomainResponseBody self = new AddDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public AddDomainResponseBody setDnsServers(AddDomainResponseBodyDnsServers dnsServers) {
        this.dnsServers = dnsServers;
        return this;
    }
    public AddDomainResponseBodyDnsServers getDnsServers() {
        return this.dnsServers;
    }

    public AddDomainResponseBody setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public AddDomainResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public AddDomainResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public AddDomainResponseBody setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public AddDomainResponseBody setPunyCode(String punyCode) {
        this.punyCode = punyCode;
        return this;
    }
    public String getPunyCode() {
        return this.punyCode;
    }

    public AddDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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
