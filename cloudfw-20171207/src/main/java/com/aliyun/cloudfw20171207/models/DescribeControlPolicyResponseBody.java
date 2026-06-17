// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeControlPolicyResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public String pageNo;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The information about the access control policies.</p>
     */
    @NameInMap("Policys")
    public java.util.List<DescribeControlPolicyResponseBodyPolicys> policys;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CBF1E9B7-D6A0-4E9E-AD3E-2B47E6C2****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of access control policies.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static DescribeControlPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeControlPolicyResponseBody self = new DescribeControlPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeControlPolicyResponseBody setPageNo(String pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public String getPageNo() {
        return this.pageNo;
    }

    public DescribeControlPolicyResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeControlPolicyResponseBody setPolicys(java.util.List<DescribeControlPolicyResponseBodyPolicys> policys) {
        this.policys = policys;
        return this;
    }
    public java.util.List<DescribeControlPolicyResponseBodyPolicys> getPolicys() {
        return this.policys;
    }

    public DescribeControlPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeControlPolicyResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeControlPolicyResponseBodyPolicys extends TeaModel {
        /**
         * <p>The action that Cloud Firewall performs on the traffic. Valid values:</p>
         * <ul>
         * <li><p><strong>accept</strong>: Allow</p>
         * </li>
         * <li><p><strong>drop</strong>: Deny</p>
         * </li>
         * <li><p><strong>log</strong>: Monitor</p>
         * </li>
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
         * <p>00281255-d220-4db1-8f4f-c4df221a****</p>
         */
        @NameInMap("AclUuid")
        public String aclUuid;

        /**
         * <p>The application ID for the traffic in the access control policy.</p>
         * 
         * <strong>example:</strong>
         * <p>10***</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        /**
         * <p>The application type supported by the access control policy. Use \<code>ApplicationNameList\\</code> instead. Valid values:</p>
         * <ul>
         * <li><p><strong>FTP</strong></p>
         * </li>
         * <li><p><strong>HTTP</strong></p>
         * </li>
         * <li><p><strong>HTTPS</strong></p>
         * </li>
         * <li><p><strong>Memcache</strong></p>
         * </li>
         * <li><p><strong>MongoDB</strong></p>
         * </li>
         * <li><p><strong>MQTT</strong></p>
         * </li>
         * <li><p><strong>MySQL</strong></p>
         * </li>
         * <li><p><strong>RDP</strong></p>
         * </li>
         * <li><p><strong>Redis</strong></p>
         * </li>
         * <li><p><strong>SMTP</strong></p>
         * </li>
         * <li><p><strong>SMTPS</strong></p>
         * </li>
         * <li><p><strong>SSH</strong></p>
         * </li>
         * <li><p><strong>SSL</strong></p>
         * </li>
         * <li><p><strong>VNC</strong></p>
         * </li>
         * <li><p><strong>ANY</strong> (all application types)</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("ApplicationName")
        public String applicationName;

        /**
         * <p>The list of application names.</p>
         */
        @NameInMap("ApplicationNameList")
        public java.util.List<String> applicationNameList;

        /**
         * <p>The time when the policy was created. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1761062400</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The description of the access control policy.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The destination port for the traffic in the access control policy.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("DestPort")
        public String destPort;

        /**
         * <p>The name of the destination port address book for the traffic in the access control policy.</p>
         * 
         * <strong>example:</strong>
         * <p>my_port_group</p>
         */
        @NameInMap("DestPortGroup")
        public String destPortGroup;

        /**
         * <p>The list of ports in the destination port address book.</p>
         */
        @NameInMap("DestPortGroupPorts")
        public java.util.List<String> destPortGroupPorts;

        /**
         * <p>The destination port type for the traffic in the access control policy. Valid values:</p>
         * <ul>
         * <li><p><strong>port</strong>: port</p>
         * </li>
         * <li><p><strong>group</strong>: port address book</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>port</p>
         */
        @NameInMap("DestPortType")
        public String destPortType;

        /**
         * <p>The destination address in the access control policy. The value of this parameter varies based on the value of the \<code>DestinationType\\</code> parameter. Valid values:</p>
         * <ul>
         * <li><p>If <strong>DestinationType</strong> is <strong>net</strong>, the destination address is a CIDR block. Example: 192.0.XX.XX/24.</p>
         * </li>
         * <li><p>If <strong>DestinationType</strong> is <strong>domain</strong>, the destination address is a domain name. Example: aliyuncs.com.</p>
         * </li>
         * <li><p>If <strong>DestinationType</strong> is <strong>group</strong>, the destination address is the name of an address book. Example: db_group.</p>
         * </li>
         * <li><p>If <strong>DestinationType</strong> is <strong>location</strong>, the destination address is a region name. For more information about region codes, see AddControlPolicy. Example: [&quot;BJ11&quot;, &quot;ZB&quot;].</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>192.0.XX.XX/24</p>
         */
        @NameInMap("Destination")
        public String destination;

        /**
         * <p>The list of CIDR blocks in the destination address book of the access control policy.</p>
         */
        @NameInMap("DestinationGroupCidrs")
        public java.util.List<String> destinationGroupCidrs;

        /**
         * <p>The type of the destination address book in the access control policy. Valid values:</p>
         * <ul>
         * <li><p><strong>ip</strong>: An IP address book that contains one or more CIDR blocks.</p>
         * </li>
         * <li><p><strong>tag</strong>: An ECS tag-based address book that contains the IP addresses of the ECS instances with one or more tags.</p>
         * </li>
         * <li><p><strong>domain</strong>: A domain name address book that contains one or more domain names.</p>
         * </li>
         * <li><p><strong>threat</strong>: A threat intelligence address book that contains one or more malicious IP addresses or domain names.</p>
         * </li>
         * <li><p><strong>backsrc</strong>: An origin URL address book that contains the origin URLs of one or more Anti-DDoS or WAF instances.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ip</p>
         */
        @NameInMap("DestinationGroupType")
        public String destinationGroupType;

        /**
         * <p>The destination address type in the access control policy. Valid values:</p>
         * <ul>
         * <li><p><strong>net</strong>: destination CIDR block</p>
         * </li>
         * <li><p><strong>group</strong>: destination address book</p>
         * </li>
         * <li><p><strong>domain</strong>: destination domain name</p>
         * </li>
         * <li><p><strong>location</strong>: destination region</p>
         * </li>
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
         * <li><p><strong>in</strong>: inbound traffic</p>
         * </li>
         * <li><p><strong>out</strong>: outbound traffic</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>in</p>
         */
        @NameInMap("Direction")
        public String direction;

        /**
         * <p>The result of the DNS resolution.</p>
         * 
         * <strong>example:</strong>
         * <p>192.0.XX.XX,192.0.XX.XX</p>
         */
        @NameInMap("DnsResult")
        @Deprecated
        public String dnsResult;

        /**
         * <p>The timestamp of the DNS resolution. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1579261141</p>
         */
        @NameInMap("DnsResultTime")
        public Long dnsResultTime;

        /**
         * <p>The domain name resolution method of the access control policy. Valid values:</p>
         * <ul>
         * <li><p><strong>FQDN</strong>: FQDN-based</p>
         * </li>
         * <li><p><strong>DNS</strong>: DNS-based dynamic resolution</p>
         * </li>
         * <li><p><strong>FQDN_AND_DNS</strong>: FQDN- and DNS-based dynamic resolution</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FQDN</p>
         */
        @NameInMap("DomainResolveType")
        public String domainResolveType;

        /**
         * <p>The end time of the policy validity period for the access control policy. The value is a UNIX timestamp. The time must be on the hour or half-hour, and at least 30 minutes later than the start time.</p>
         * <blockquote>
         * <p>If \<code>RepeatType\\</code> is \<code>Permanent\\</code>, \<code>EndTime\\</code> is empty. If \<code>RepeatType\\</code> is \<code>None\\</code>, \<code>Daily\\</code>, \<code>Weekly\\</code>, or \<code>Monthly\\</code>, this parameter is required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1694764800</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The timestamp of the last hit. The value is a UNIX timestamp. Unit: seconds.</p>
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
         * <p>The IP version supported. Valid values:</p>
         * <ul>
         * <li><p><strong>4</strong>: IPv4 address</p>
         * </li>
         * <li><p><strong>6</strong>: IPv6 address</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("IpVersion")
        public Integer ipVersion;

        /**
         * <p>The time when the policy was last modified. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1761062400</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The priority of the access control policy.</p>
         * <p>The priority value starts from 1 and increases sequentially. A smaller value indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Order")
        public Integer order;

        /**
         * <p>The protocol type of the traffic in the access control policy. Valid values:</p>
         * <ul>
         * <li><p><strong>ANY</strong></p>
         * </li>
         * <li><p><strong>TCP</strong></p>
         * </li>
         * <li><p><strong>UDP</strong></p>
         * </li>
         * <li><p><strong>ICMP</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        @NameInMap("Proto")
        public String proto;

        /**
         * <p>The status of the access control policy. The policy is enabled by default after it is created. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: The access control policy is enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: The access control policy is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Release")
        public String release;

        /**
         * <p>The collection of recurring dates for the policy validity period of the access control policy.</p>
         * <ul>
         * <li><p>If \<code>RepeatType\\</code> is \<code>Permanent\\</code>, \<code>None\\</code>, or \<code>Daily\\</code>, \<code>RepeatDays\\</code> is an empty collection.
         * Example: []</p>
         * </li>
         * <li><p>If \<code>RepeatType\\</code> is \<code>Weekly\\</code>, \<code>RepeatDays\\</code> cannot be empty.
         * Example: [0, 6]</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If \<code>RepeatType\\</code> is set to \<code>Weekly\\</code>, \<code>RepeatDays\\</code> cannot contain duplicate values.</p>
         * </blockquote>
         * <ul>
         * <li>If \<code>RepeatType\\</code> is \<code>Monthly\\</code>, \<code>RepeatDays\\</code> cannot be empty.
         * Example: [1, 31]</li>
         * </ul>
         * <blockquote>
         * <p>If \<code>RepeatType\\</code> is set to \<code>Monthly\\</code>, \<code>RepeatDays\\</code> cannot contain duplicate values.</p>
         * </blockquote>
         */
        @NameInMap("RepeatDays")
        public java.util.List<Long> repeatDays;

        /**
         * <p>The recurring end time for the policy validity period of the access control policy. Example: \<code>23:30\\</code>. The time must be on the hour or half-hour, and at least 30 minutes later than the recurring start time.</p>
         * <blockquote>
         * <p>If \<code>RepeatType\\</code> is \<code>Permanent\\</code> or \<code>None\\</code>, \<code>RepeatEndTime\\</code> is empty. If \<code>RepeatType\\</code> is \<code>Daily\\</code>, \<code>Weekly\\</code>, or \<code>Monthly\\</code>, this parameter is required.
         * The time is in the HH:mm format (24-hour). Examples: \<code>08:00\\</code> and \<code>23:30\\</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>23:30</p>
         */
        @NameInMap("RepeatEndTime")
        public String repeatEndTime;

        /**
         * <p>The recurring start time for the policy validity period of the access control policy. Example: \<code>08:00\\</code>. The time must be on the hour or half-hour, and at least 30 minutes earlier than the recurring end time.</p>
         * <blockquote>
         * <p>If \<code>RepeatType\\</code> is \<code>Permanent\\</code> or \<code>None\\</code>, \<code>RepeatStartTime\\</code> is empty. If \<code>RepeatType\\</code> is \<code>Daily\\</code>, \<code>Weekly\\</code>, or \<code>Monthly\\</code>, this parameter is required.
         * The time is in the HH:mm format (24-hour). Examples: \<code>08:00\\</code> and \<code>23:30\\</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>08:00</p>
         */
        @NameInMap("RepeatStartTime")
        public String repeatStartTime;

        /**
         * <p>The recurrence type for the policy validity period of the access control policy. Valid values:</p>
         * <ul>
         * <li><p><strong>Permanent</strong> (default): Always</p>
         * </li>
         * <li><p><strong>None</strong>: One-time</p>
         * </li>
         * <li><p><strong>Daily</strong>: Daily</p>
         * </li>
         * <li><p><strong>Weekly</strong>: Weekly</p>
         * </li>
         * <li><p><strong>Monthly</strong>: Monthly</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Permanent</p>
         */
        @NameInMap("RepeatType")
        public String repeatType;

        /**
         * <p>The source address in the access control policy. Valid values:</p>
         * <ul>
         * <li><p>If <strong>SourceType</strong> is <code>net</code>, the source address is a CIDR block. Example: 192.0.XX.XX/24.</p>
         * </li>
         * <li><p>If <strong>SourceType</strong> is <code>group</code>, the source address is the name of a source address book. Example: db_group.</p>
         * </li>
         * <li><p>If <strong>SourceType</strong> is <code>location</code>, the source address is a region. For more information about region codes, see <a href="https://help.aliyun.com/document_detail/138867.html">AddControlPolicy</a>. Example: [&quot;BJ11&quot;, &quot;ZB&quot;].</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>192.0.XX.XX/24</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The list of CIDR blocks in the source address book of the access control policy.</p>
         */
        @NameInMap("SourceGroupCidrs")
        public java.util.List<String> sourceGroupCidrs;

        /**
         * <p>The type of the source address book in the access control policy. Valid values:</p>
         * <ul>
         * <li><p><strong>ip</strong>: An IP address book that contains one or more CIDR blocks.</p>
         * </li>
         * <li><p><strong>tag</strong>: An ECS tag-based address book that contains the IP addresses of the ECS instances with one or more tags.</p>
         * </li>
         * <li><p><strong>domain</strong>: A domain name address book that contains one or more domain names.</p>
         * </li>
         * <li><p><strong>threat</strong>: A threat intelligence address book that contains one or more malicious IP addresses or domain names.</p>
         * </li>
         * <li><p><strong>backsrc</strong>: An origin URL address book that contains the origin URLs of one or more Anti-DDoS or WAF instances.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ip</p>
         */
        @NameInMap("SourceGroupType")
        public String sourceGroupType;

        /**
         * <p>The source address type in the access control policy. Valid values:</p>
         * <ul>
         * <li><p><strong>net</strong>: source CIDR block</p>
         * </li>
         * <li><p><strong>group</strong>: source address book</p>
         * </li>
         * <li><p><strong>location</strong>: source region</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>net</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The number of specification entries that the access control policy consumes. This is the sum of entries consumed by each policy.
         * The number of entries for a single policy is calculated as: Number of source addresses (CIDR blocks or regions) × Number of destination addresses (CIDR blocks, regions, or domain names) × Number of port ranges × Number of applications.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("SpreadCnt")
        public Integer spreadCnt;

        /**
         * <p>The start time of the policy validity period for the access control policy. The value is a UNIX timestamp. The time must be on the hour or half-hour, and at least 30 minutes earlier than the end time.</p>
         * <blockquote>
         * <p>If \<code>RepeatType\\</code> is \<code>Permanent\\</code>, \<code>StartTime\\</code> is empty. If \<code>RepeatType\\</code> is \<code>None\\</code>, \<code>Daily\\</code>, \<code>Weekly\\</code>, or \<code>Monthly\\</code>, this parameter is required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1694761200</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        public static DescribeControlPolicyResponseBodyPolicys build(java.util.Map<String, ?> map) throws Exception {
            DescribeControlPolicyResponseBodyPolicys self = new DescribeControlPolicyResponseBodyPolicys();
            return TeaModel.build(map, self);
        }

        public DescribeControlPolicyResponseBodyPolicys setAclAction(String aclAction) {
            this.aclAction = aclAction;
            return this;
        }
        public String getAclAction() {
            return this.aclAction;
        }

        public DescribeControlPolicyResponseBodyPolicys setAclUuid(String aclUuid) {
            this.aclUuid = aclUuid;
            return this;
        }
        public String getAclUuid() {
            return this.aclUuid;
        }

        public DescribeControlPolicyResponseBodyPolicys setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public DescribeControlPolicyResponseBodyPolicys setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public String getApplicationName() {
            return this.applicationName;
        }

        public DescribeControlPolicyResponseBodyPolicys setApplicationNameList(java.util.List<String> applicationNameList) {
            this.applicationNameList = applicationNameList;
            return this;
        }
        public java.util.List<String> getApplicationNameList() {
            return this.applicationNameList;
        }

        public DescribeControlPolicyResponseBodyPolicys setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeControlPolicyResponseBodyPolicys setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeControlPolicyResponseBodyPolicys setDestPort(String destPort) {
            this.destPort = destPort;
            return this;
        }
        public String getDestPort() {
            return this.destPort;
        }

        public DescribeControlPolicyResponseBodyPolicys setDestPortGroup(String destPortGroup) {
            this.destPortGroup = destPortGroup;
            return this;
        }
        public String getDestPortGroup() {
            return this.destPortGroup;
        }

        public DescribeControlPolicyResponseBodyPolicys setDestPortGroupPorts(java.util.List<String> destPortGroupPorts) {
            this.destPortGroupPorts = destPortGroupPorts;
            return this;
        }
        public java.util.List<String> getDestPortGroupPorts() {
            return this.destPortGroupPorts;
        }

        public DescribeControlPolicyResponseBodyPolicys setDestPortType(String destPortType) {
            this.destPortType = destPortType;
            return this;
        }
        public String getDestPortType() {
            return this.destPortType;
        }

        public DescribeControlPolicyResponseBodyPolicys setDestination(String destination) {
            this.destination = destination;
            return this;
        }
        public String getDestination() {
            return this.destination;
        }

        public DescribeControlPolicyResponseBodyPolicys setDestinationGroupCidrs(java.util.List<String> destinationGroupCidrs) {
            this.destinationGroupCidrs = destinationGroupCidrs;
            return this;
        }
        public java.util.List<String> getDestinationGroupCidrs() {
            return this.destinationGroupCidrs;
        }

        public DescribeControlPolicyResponseBodyPolicys setDestinationGroupType(String destinationGroupType) {
            this.destinationGroupType = destinationGroupType;
            return this;
        }
        public String getDestinationGroupType() {
            return this.destinationGroupType;
        }

        public DescribeControlPolicyResponseBodyPolicys setDestinationType(String destinationType) {
            this.destinationType = destinationType;
            return this;
        }
        public String getDestinationType() {
            return this.destinationType;
        }

        public DescribeControlPolicyResponseBodyPolicys setDirection(String direction) {
            this.direction = direction;
            return this;
        }
        public String getDirection() {
            return this.direction;
        }

        @Deprecated
        public DescribeControlPolicyResponseBodyPolicys setDnsResult(String dnsResult) {
            this.dnsResult = dnsResult;
            return this;
        }
        public String getDnsResult() {
            return this.dnsResult;
        }

        public DescribeControlPolicyResponseBodyPolicys setDnsResultTime(Long dnsResultTime) {
            this.dnsResultTime = dnsResultTime;
            return this;
        }
        public Long getDnsResultTime() {
            return this.dnsResultTime;
        }

        public DescribeControlPolicyResponseBodyPolicys setDomainResolveType(String domainResolveType) {
            this.domainResolveType = domainResolveType;
            return this;
        }
        public String getDomainResolveType() {
            return this.domainResolveType;
        }

        public DescribeControlPolicyResponseBodyPolicys setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeControlPolicyResponseBodyPolicys setHitLastTime(Long hitLastTime) {
            this.hitLastTime = hitLastTime;
            return this;
        }
        public Long getHitLastTime() {
            return this.hitLastTime;
        }

        public DescribeControlPolicyResponseBodyPolicys setHitTimes(Long hitTimes) {
            this.hitTimes = hitTimes;
            return this;
        }
        public Long getHitTimes() {
            return this.hitTimes;
        }

        public DescribeControlPolicyResponseBodyPolicys setIpVersion(Integer ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }
        public Integer getIpVersion() {
            return this.ipVersion;
        }

        public DescribeControlPolicyResponseBodyPolicys setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public DescribeControlPolicyResponseBodyPolicys setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public DescribeControlPolicyResponseBodyPolicys setProto(String proto) {
            this.proto = proto;
            return this;
        }
        public String getProto() {
            return this.proto;
        }

        public DescribeControlPolicyResponseBodyPolicys setRelease(String release) {
            this.release = release;
            return this;
        }
        public String getRelease() {
            return this.release;
        }

        public DescribeControlPolicyResponseBodyPolicys setRepeatDays(java.util.List<Long> repeatDays) {
            this.repeatDays = repeatDays;
            return this;
        }
        public java.util.List<Long> getRepeatDays() {
            return this.repeatDays;
        }

        public DescribeControlPolicyResponseBodyPolicys setRepeatEndTime(String repeatEndTime) {
            this.repeatEndTime = repeatEndTime;
            return this;
        }
        public String getRepeatEndTime() {
            return this.repeatEndTime;
        }

        public DescribeControlPolicyResponseBodyPolicys setRepeatStartTime(String repeatStartTime) {
            this.repeatStartTime = repeatStartTime;
            return this;
        }
        public String getRepeatStartTime() {
            return this.repeatStartTime;
        }

        public DescribeControlPolicyResponseBodyPolicys setRepeatType(String repeatType) {
            this.repeatType = repeatType;
            return this;
        }
        public String getRepeatType() {
            return this.repeatType;
        }

        public DescribeControlPolicyResponseBodyPolicys setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public DescribeControlPolicyResponseBodyPolicys setSourceGroupCidrs(java.util.List<String> sourceGroupCidrs) {
            this.sourceGroupCidrs = sourceGroupCidrs;
            return this;
        }
        public java.util.List<String> getSourceGroupCidrs() {
            return this.sourceGroupCidrs;
        }

        public DescribeControlPolicyResponseBodyPolicys setSourceGroupType(String sourceGroupType) {
            this.sourceGroupType = sourceGroupType;
            return this;
        }
        public String getSourceGroupType() {
            return this.sourceGroupType;
        }

        public DescribeControlPolicyResponseBodyPolicys setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DescribeControlPolicyResponseBodyPolicys setSpreadCnt(Integer spreadCnt) {
            this.spreadCnt = spreadCnt;
            return this;
        }
        public Integer getSpreadCnt() {
            return this.spreadCnt;
        }

        public DescribeControlPolicyResponseBodyPolicys setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

}
