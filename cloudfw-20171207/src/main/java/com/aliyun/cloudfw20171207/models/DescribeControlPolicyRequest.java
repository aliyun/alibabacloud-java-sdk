// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeControlPolicyRequest extends TeaModel {
    // The action that Cloud Firewall performs on the traffic. Valid values:
    // 
    // *   **accept**: allows the traffic.
    // *   **drop**: denies the traffic.
    // *   **log**: monitors the traffic.
    // 
    // >  If you do not specify this parameter, access control policies of all action types are queried.
    @NameInMap("AclAction")
    public String aclAction;

    // The unique ID of the access control policy.
    @NameInMap("AclUuid")
    public String aclUuid;

    // The number of the page to return.
    // 
    // Default value: 1.
    @NameInMap("CurrentPage")
    public String currentPage;

    // The description of the access control policy. Fuzzy match is supported.
    // 
    // >  If you do not specify this parameter, access control policies that have descriptions are queried.
    @NameInMap("Description")
    public String description;

    // The destination address in the access control policy. Fuzzy match is supported. The value of this parameter depends on the value of the DestinationType parameter.
    // 
    // *   If DestinationType is set to `net`, the value of Destination must be a CIDR block. Example: 10.0.3.0/24.
    // *   If DestinationType is set to `domain`, the value of Destination must be a domain name. Example: aliyun.
    // *   If DestinationType is set to `group`, the value of Destination must be the name of an address book. Example: db_group.
    // *   If DestinationType is set to `location`, the value of Destination must be a location. Example: beijing.
    // 
    // >  If you do not specify this parameter, access control policies of all destination address types are queried.
    @NameInMap("Destination")
    public String destination;

    // The direction of the traffic to which the access control policy applies. Valid values:
    // 
    // *   **in**: inbound traffic
    // *   **out**: outbound traffic
    @NameInMap("Direction")
    public String direction;

    // The IP version of the address in the access control policy. Valid values:
    // 
    // *   **4**: IPv4 (default)
    // *   **6**: IPv6
    @NameInMap("IpVersion")
    public String ipVersion;

    // The language of the content within the response. Valid values:
    // 
    // *   **zh**: Chinese (default)
    // *   **en**: English
    @NameInMap("Lang")
    public String lang;

    // The number of entries to return on each page.
    @NameInMap("PageSize")
    public String pageSize;

    // The type of the protocol in the access control policy. Valid values:
    // 
    // * **TCP**
    // * **UDP**
    // * **ICMP**
    // * **ANY**: all types of protocols
    // 
    // >  If you do not specify this parameter, access control policies of all protocol types are queried.
    @NameInMap("Proto")
    public String proto;

    // Specifies whether the access control policy is enabled. By default, an access control policy is enabled after it is created. Valid values:
    // 
    // *   **true**: The access control policy is enabled.
    // *   **false**: The access control policy is disabled.
    @NameInMap("Release")
    public String release;

    // The source address in the access control policy. Fuzzy match is supported. The value of this parameter depends on the value of the SourceType parameter.
    // 
    // *   If SourceType is set to `net`, the value of Source must be a CIDR block. Example: 192.0.XX.XX/24.
    // *   If SourceType is set to `group`, the value of Source must be the name of an address book. Example: db_group. If the db_group address book does not contain addresses, all source addresses are queried.
    // *   If SourceType is set to `location`, the value of Source must be a location. Example: beijing.
    // 
    // >  If you do not specify this parameter, access control policies of all source address types are queried.
    @NameInMap("Source")
    public String source;

    public static DescribeControlPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeControlPolicyRequest self = new DescribeControlPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeControlPolicyRequest setAclAction(String aclAction) {
        this.aclAction = aclAction;
        return this;
    }
    public String getAclAction() {
        return this.aclAction;
    }

    public DescribeControlPolicyRequest setAclUuid(String aclUuid) {
        this.aclUuid = aclUuid;
        return this;
    }
    public String getAclUuid() {
        return this.aclUuid;
    }

    public DescribeControlPolicyRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeControlPolicyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeControlPolicyRequest setDestination(String destination) {
        this.destination = destination;
        return this;
    }
    public String getDestination() {
        return this.destination;
    }

    public DescribeControlPolicyRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public DescribeControlPolicyRequest setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }
    public String getIpVersion() {
        return this.ipVersion;
    }

    public DescribeControlPolicyRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeControlPolicyRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeControlPolicyRequest setProto(String proto) {
        this.proto = proto;
        return this;
    }
    public String getProto() {
        return this.proto;
    }

    public DescribeControlPolicyRequest setRelease(String release) {
        this.release = release;
        return this;
    }
    public String getRelease() {
        return this.release;
    }

    public DescribeControlPolicyRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
