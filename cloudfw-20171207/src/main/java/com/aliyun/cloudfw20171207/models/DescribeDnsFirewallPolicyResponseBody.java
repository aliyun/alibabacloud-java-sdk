// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeDnsFirewallPolicyResponseBody extends TeaModel {
    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public String pageNo;

    /**
     * <p>The number of entries to return in the current query.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The information about the access control policy of the DNS firewall.</p>
     */
    @NameInMap("Policys")
    public java.util.List<DescribeDnsFirewallPolicyResponseBodyPolicys> policys;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0A4ACDE9-9F9F-56C1-B3B7-60971BA1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static DescribeDnsFirewallPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsFirewallPolicyResponseBody self = new DescribeDnsFirewallPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDnsFirewallPolicyResponseBody setPageNo(String pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public String getPageNo() {
        return this.pageNo;
    }

    public DescribeDnsFirewallPolicyResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeDnsFirewallPolicyResponseBody setPolicys(java.util.List<DescribeDnsFirewallPolicyResponseBodyPolicys> policys) {
        this.policys = policys;
        return this;
    }
    public java.util.List<DescribeDnsFirewallPolicyResponseBodyPolicys> getPolicys() {
        return this.policys;
    }

    public DescribeDnsFirewallPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDnsFirewallPolicyResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDnsFirewallPolicyResponseBodyPolicys extends TeaModel {
        /**
         * <p>The action that Cloud Firewall performs on the traffic in the access control policy. Valid values:</p>
         * <ul>
         * <li><strong>accept</strong>: Allow</li>
         * <li><strong>drop</strong>: Deny</li>
         * <li><strong>log</strong>: Monitor</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>accept</p>
         */
        @NameInMap("AclAction")
        public String aclAction;

        /**
         * <p>The unique ID of the access control policy.</p>
         * 
         * <strong>example:</strong>
         * <p>01281255-d220-4db1-8f4f-c4df221a****</p>
         */
        @NameInMap("AclUuid")
        public String aclUuid;

        /**
         * <p>The description of the access control policy of the DNS border firewall.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The destination address in the access control policy of the DNS border firewall. Valid values:</p>
         * <ul>
         * <li><p>If <strong>DestinationType</strong> is set to <code>net</code>, the value of Destination is the destination CIDR block.</p>
         * </li>
         * <li><p>If <strong>DestinationType</strong> is set to <code>domain</code>, the value of Destination is the destination domain name.</p>
         * </li>
         * <li><p>If <strong>DestinationType</strong> is set to <code>group</code>, the value of Destination is the name of the destination address book.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>x.x.x.x/32</p>
         */
        @NameInMap("Destination")
        public String destination;

        /**
         * <p>The list of addresses in the destination address book.</p>
         */
        @NameInMap("DestinationAddrs")
        public java.util.List<String> destinationAddrs;

        /**
         * <p>The type of the destination address book in the access control policy. Valid values:</p>
         * <ul>
         * <li><strong>ip</strong>: IP address book, which contains one or more CIDR blocks</li>
         * <li><strong>domain</strong>: domain name address book, which contains one or more domain names</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ip</p>
         */
        @NameInMap("DestinationGroupType")
        public String destinationGroupType;

        /**
         * <p>The type of the destination address in the access control policy. Valid values:</p>
         * <ul>
         * <li><strong>net</strong>: destination CIDR block</li>
         * <li><strong>group</strong>: destination address book</li>
         * <li><strong>domain</strong>: destination domain name</li>
         * <li><strong>location</strong>: destination region</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>net</p>
         */
        @NameInMap("DestinationType")
        public String destinationType;

        /**
         * <p>The traffic direction of the access control policy. Valid values:</p>
         * <ul>
         * <li><strong>in</strong>: inbound traffic</li>
         * <li><strong>out</strong>: outbound traffic</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>in</p>
         */
        @NameInMap("Direction")
        public String direction;

        /**
         * <p>The latest hit UNIX timestamp. The value is a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1579261141</p>
         */
        @NameInMap("HitLastTime")
        public Long hitLastTime;

        /**
         * <p>The number of hits for the access control policy.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("HitTimes")
        public Long hitTimes;

        /**
         * <p>The IP address version. Valid values:</p>
         * <ul>
         * <li><strong>4</strong>: IPv4</li>
         * <li><strong>6</strong>: IPv6</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("IpVersion")
        public Integer ipVersion;

        /**
         * <p>The priority of the access control policy. A smaller value indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>110</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The status of the access control policy. By default, the policy is enabled after it is created. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Enabled</p>
         * </li>
         * <li><p><strong>false</strong>: Disabled</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Release")
        public String release;

        /**
         * <p>The source address in the access control policy. Valid values:</p>
         * <ul>
         * <li>If <strong>SourceType</strong> is set to <code>net</code>, the source address is a CIDR block. Example: 192.0.XX.XX/24.</li>
         * <li>If <strong>SourceType</strong> is set to <code>group</code>, the source address is the name of the source address book. Example: db_group.</li>
         * <li>If <strong>SourceType</strong> is set to <code>location</code>, the source address is an area. For more information about the specific area positional encoding, see <a href="https://help.aliyun.com/document_detail/138867.html">AddControlPolicy</a>. Example: [&quot;BJ11&quot;, &quot;ZB&quot;\].</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>192.0.XX.XX/24</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The source addresses.</p>
         */
        @NameInMap("SourceAddrs")
        public java.util.List<String> sourceAddrs;

        /**
         * <p>The type of the source address book in the access control policy. Valid values:</p>
         * <ul>
         * <li><p><strong>ip</strong>: IP address book, which contains one or more CIDR blocks.</p>
         * </li>
         * <li><p><strong>tag</strong>: ECS tag-based address book, which contains the IP addresses of one or more ECS tags.</p>
         * </li>
         * <li><p><strong>domain</strong>: domain name address book, which contains one or more domain names.</p>
         * </li>
         * <li><p><strong>threat</strong>: threat intelligence address book, which contains one or more malicious IP addresses or domain names.</p>
         * </li>
         * <li><p><strong>backsrc</strong>: back-to-origin address book, which contains the back-to-origin IP addresses of one or more Anti-DDoS or WAF instances.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ip</p>
         */
        @NameInMap("SourceGroupType")
        public String sourceGroupType;

        /**
         * <p>The type of the source address in the access control policy of the DNS border firewall. Valid values:</p>
         * <ul>
         * <li><strong>net</strong>: source CIDR block</li>
         * <li><strong>group</strong>: source address book</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>net</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        public static DescribeDnsFirewallPolicyResponseBodyPolicys build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsFirewallPolicyResponseBodyPolicys self = new DescribeDnsFirewallPolicyResponseBodyPolicys();
            return TeaModel.build(map, self);
        }

        public DescribeDnsFirewallPolicyResponseBodyPolicys setAclAction(String aclAction) {
            this.aclAction = aclAction;
            return this;
        }
        public String getAclAction() {
            return this.aclAction;
        }

        public DescribeDnsFirewallPolicyResponseBodyPolicys setAclUuid(String aclUuid) {
            this.aclUuid = aclUuid;
            return this;
        }
        public String getAclUuid() {
            return this.aclUuid;
        }

        public DescribeDnsFirewallPolicyResponseBodyPolicys setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDnsFirewallPolicyResponseBodyPolicys setDestination(String destination) {
            this.destination = destination;
            return this;
        }
        public String getDestination() {
            return this.destination;
        }

        public DescribeDnsFirewallPolicyResponseBodyPolicys setDestinationAddrs(java.util.List<String> destinationAddrs) {
            this.destinationAddrs = destinationAddrs;
            return this;
        }
        public java.util.List<String> getDestinationAddrs() {
            return this.destinationAddrs;
        }

        public DescribeDnsFirewallPolicyResponseBodyPolicys setDestinationGroupType(String destinationGroupType) {
            this.destinationGroupType = destinationGroupType;
            return this;
        }
        public String getDestinationGroupType() {
            return this.destinationGroupType;
        }

        public DescribeDnsFirewallPolicyResponseBodyPolicys setDestinationType(String destinationType) {
            this.destinationType = destinationType;
            return this;
        }
        public String getDestinationType() {
            return this.destinationType;
        }

        public DescribeDnsFirewallPolicyResponseBodyPolicys setDirection(String direction) {
            this.direction = direction;
            return this;
        }
        public String getDirection() {
            return this.direction;
        }

        public DescribeDnsFirewallPolicyResponseBodyPolicys setHitLastTime(Long hitLastTime) {
            this.hitLastTime = hitLastTime;
            return this;
        }
        public Long getHitLastTime() {
            return this.hitLastTime;
        }

        public DescribeDnsFirewallPolicyResponseBodyPolicys setHitTimes(Long hitTimes) {
            this.hitTimes = hitTimes;
            return this;
        }
        public Long getHitTimes() {
            return this.hitTimes;
        }

        public DescribeDnsFirewallPolicyResponseBodyPolicys setIpVersion(Integer ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }
        public Integer getIpVersion() {
            return this.ipVersion;
        }

        public DescribeDnsFirewallPolicyResponseBodyPolicys setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public DescribeDnsFirewallPolicyResponseBodyPolicys setRelease(String release) {
            this.release = release;
            return this;
        }
        public String getRelease() {
            return this.release;
        }

        public DescribeDnsFirewallPolicyResponseBodyPolicys setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public DescribeDnsFirewallPolicyResponseBodyPolicys setSourceAddrs(java.util.List<String> sourceAddrs) {
            this.sourceAddrs = sourceAddrs;
            return this;
        }
        public java.util.List<String> getSourceAddrs() {
            return this.sourceAddrs;
        }

        public DescribeDnsFirewallPolicyResponseBodyPolicys setSourceGroupType(String sourceGroupType) {
            this.sourceGroupType = sourceGroupType;
            return this;
        }
        public String getSourceGroupType() {
            return this.sourceGroupType;
        }

        public DescribeDnsFirewallPolicyResponseBodyPolicys setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

    }

}
