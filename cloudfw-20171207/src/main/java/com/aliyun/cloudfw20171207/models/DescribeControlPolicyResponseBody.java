// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeControlPolicyResponseBody extends TeaModel {
    /**
     * <p>The page number of the current page returned for a paged query during paging.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public String pageNo;

    /**
     * <p>The maximum number of entries to return on each page for a paged query during paging.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The information about each access control policy.</p>
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
     * <p>The total number of access control policy entries.</p>
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
         * <p>The action that Cloud Firewall performs on the traffic that matches the access control policy. Valid values:</p>
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
         * <p>00281255-d220-4db1-8f4f-c4df221a****</p>
         */
        @NameInMap("AclUuid")
        public String aclUuid;

        /**
         * <p>The ID of the application for the traffic in the access control policy.</p>
         * 
         * <strong>example:</strong>
         * <p>10***</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        /**
         * <p>The application type supported by the access control policy. ApplicationNameList is recommended. Valid values:</p>
         * <ul>
         * <li><strong>FTP</strong></li>
         * <li><strong>HTTP</strong></li>
         * <li><strong>HTTPS</strong></li>
         * <li><strong>Memcache</strong></li>
         * <li><strong>MongoDB</strong></li>
         * <li><strong>MQTT</strong></li>
         * <li><strong>MySQL</strong></li>
         * <li><strong>RDP</strong></li>
         * <li><strong>Redis</strong></li>
         * <li><strong>SMTP</strong></li>
         * <li><strong>SMTPS</strong></li>
         * <li><strong>SSH</strong></li>
         * <li><strong>SSL</strong></li>
         * <li><strong>VNC</strong></li>
         * <li><strong>ANY</strong> (all application types)</li>
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
         * <p>The time when the policy was created. The value is a UNIX timestamp in seconds, which indicates the number of seconds that have elapsed since January 1, 1970 (UTC).</p>
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
         * <p>Allow access to the office CIDR block</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The destination port of the traffic in the access control policy.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("DestPort")
        public String destPort;

        /**
         * <p>The name of the destination port address book in the access control policy.</p>
         * 
         * <strong>example:</strong>
         * <p>my_port_group</p>
         */
        @NameInMap("DestPortGroup")
        public String destPortGroup;

        /**
         * <p>The ports in the destination port address book.</p>
         */
        @NameInMap("DestPortGroupPorts")
        public java.util.List<String> destPortGroupPorts;

        /**
         * <p>The type of the destination port in the access control policy. Valid values:</p>
         * <ul>
         * <li><strong>port</strong>: Port</li>
         * <li><strong>group</strong>: Port address book</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>port</p>
         */
        @NameInMap("DestPortType")
        public String destPortType;

        /**
         * <p>The destination address in the access control policy. The value of Destination varies based on the destination type (DestinationType). Valid values:</p>
         * <ul>
         * <li>If <strong>DestinationType</strong> is set to <strong>net</strong>, the destination address is a CIDR block. Example: 192.0.XX.XX/24.</li>
         * <li>If <strong>DestinationType</strong> is set to <strong>domain</strong>, the destination address is a domain name. Example: aliyuncs.com.</li>
         * <li>If <strong>DestinationType</strong> is set to <strong>group</strong>, the destination address is the name of an address book. Example: db_group.</li>
         * <li>If <strong>DestinationType</strong> is set to <strong>location</strong>, the destination address is an area name. For more information about the area positional encoding, see AddControlPolicy. Example: [&quot;BJ11&quot;, &quot;ZB&quot;\].</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>192.0.XX.XX/24</p>
         */
        @NameInMap("Destination")
        public String destination;

        /**
         * <p>The CIDR blocks in the destination address book of the access control policy.</p>
         */
        @NameInMap("DestinationGroupCidrs")
        public java.util.List<String> destinationGroupCidrs;

        /**
         * <p>The type of the destination address book in the access control policy. Valid values:</p>
         * <ul>
         * <li><p><strong>ip</strong>: IP address book, which contains one or more CIDR blocks.</p>
         * </li>
         * <li><p><strong>tag</strong>: ECS tag-based address book, which contains the IP addresses of one or more ECS tags.</p>
         * </li>
         * <li><p><strong>domain</strong>: Domain name address book, which contains one or more domain names.</p>
         * </li>
         * <li><p><strong>threat</strong>: Threat intelligence address book, which contains one or more malicious IP addresses or domain names.</p>
         * </li>
         * <li><p><strong>backsrc</strong>: Back-to-origin address book, which contains the back-to-origin IP addresses of one or more Anti-DDoS or WAF instances.</p>
         * </li>
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
         * <li><strong>net</strong>: Destination CIDR block</li>
         * <li><strong>group</strong>: Destination address book</li>
         * <li><strong>domain</strong>: Destination domain name</li>
         * <li><strong>location</strong>: Destination region</li>
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
         * <li><strong>in</strong>: Inbound traffic</li>
         * <li><strong>out</strong>: Outbound traffic</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>in</p>
         */
        @NameInMap("Direction")
        public String direction;

        /**
         * <p>The DNS resolution result.</p>
         * 
         * <strong>example:</strong>
         * <p>192.0.XX.XX,192.0.XX.XX</p>
         */
        @NameInMap("DnsResult")
        @Deprecated
        public String dnsResult;

        /**
         * <p>The timestamp of the DNS resolution. The value is a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1579261141</p>
         */
        @NameInMap("DnsResultTime")
        public Long dnsResultTime;

        /**
         * <p>The domain name resolution mode of the access control policy. Valid values:</p>
         * <ul>
         * <li><strong>FQDN</strong>: FQDN-based</li>
         * <li><strong>DNS</strong>: DNS-based dynamic resolution</li>
         * <li><strong>FQDN_AND_DNS</strong>: FQDN- and DNS-based dynamic resolution</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FQDN</p>
         */
        @NameInMap("DomainResolveType")
        public String domainResolveType;

        /**
         * <p>The end time of the Policy Validity Period for the access control policy. The value is in the UNIX timestamp format in seconds. The time must be on the hour or half-hour, and must be at least 30 minutes later than the start time.</p>
         * <blockquote>
         * <p>If RepeatType is Permanent, EndTime is empty. If RepeatType is None, Daily, Weekly, or Monthly, EndTime is required, and you must configure the Settings for the end time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1694764800</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The latest time of hits. The value is in the UNIX timestamp format in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1579261141</p>
         */
        @NameInMap("HitLastTime")
        public Long hitLastTime;

        /**
         * <p>The number of times the access control policy is hit.</p>
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
         * <p>The time when the policy was modified. The value is a UNIX timestamp in seconds, which indicates the number of seconds that have elapsed since January 1, 1970 (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>1761062400</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The priority of the access control policy.</p>
         * <p>The priority value starts from 1 and increments. A smaller value indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Order")
        public Integer order;

        /**
         * <p>The protocol type of the traffic in the access control policy. Valid values:</p>
         * <ul>
         * <li><strong>ANY</strong></li>
         * <li><strong>TCP</strong></li>
         * <li><strong>UDP</strong></li>
         * <li><strong>ICMP</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        @NameInMap("Proto")
        public String proto;

        /**
         * <p>Specifies whether the access control policy is enabled. By default, a policy is enabled after it is created. Valid values:</p>
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
         * <p>The recurrence days of the Policy Validity Period for the access control policy.</p>
         * <ul>
         * <li>If RepeatType is set to <code>Permanent</code>, <code>None</code>, or <code>Daily</code>, RepeatDays is an empty set.
         * Example: []</li>
         * <li>When the Settings specify Weekly for RepeatType, RepeatDays cannot be empty.
         * Example: [0, 6]<blockquote>
         * <p>When the Settings specify Weekly for RepeatType, the values in RepeatDays must be unique.</p>
         * </blockquote>
         * </li>
         * <li>If RepeatType is set to <code>Monthly</code>, RepeatDays cannot be empty.
         * Example: [1, 31]<blockquote>
         * <p>When the Settings specify Monthly for RepeatType, the values in RepeatDays must be unique.</p>
         * </blockquote>
         * </li>
         * </ul>
         */
        @NameInMap("RepeatDays")
        public java.util.List<Long> repeatDays;

        /**
         * <p>The recurrence end time of the Policy Validity Period for the access control policy. Example: 23:30. The time must be on the hour or half-hour, and must be at least 30 minutes later than the recurrence start time.</p>
         * <blockquote>
         * <p>If RepeatType is Permanent or None, RepeatEndTime is empty. If RepeatType is Daily, Weekly, or Monthly, RepeatEndTime is required, and you must configure the Settings for the recurrence end time.
         * The time is in the HH:mm format (24-hour clock). Example: 08:00 or 23:30.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>23:30</p>
         */
        @NameInMap("RepeatEndTime")
        public String repeatEndTime;

        /**
         * <p>The recurrence start time of the Policy Validity Period for the access control policy. Example: 08:00. The time must be on the hour or half-hour, and must be at least 30 minutes earlier than the recurrence end time.</p>
         * <blockquote>
         * <p>If RepeatType is Permanent or None, RepeatStartTime is empty. If RepeatType is Daily, Weekly, or Monthly, RepeatStartTime is required, and you must configure the Settings for the recurrence start time.
         * The time is in the HH:mm format (24-hour clock). Example: 08:00 or 23:30.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>08:00</p>
         */
        @NameInMap("RepeatStartTime")
        public String repeatStartTime;

        /**
         * <p>The recurrence type of the Policy Validity Period for the access control policy. Valid values:</p>
         * <ul>
         * <li><strong>Permanent</strong> (default): Always</li>
         * <li><strong>None</strong>: One-time</li>
         * <li><strong>Daily</strong>: Daily</li>
         * <li><strong>Weekly</strong>: Weekly</li>
         * <li><strong>Monthly</strong>: Monthly</li>
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
         * <li>If <strong>SourceType</strong> is set to <code>net</code>, the source address is a CIDR block. Example: 192.0.XX.XX/24.</li>
         * <li>If <strong>SourceType</strong> is set to <code>group</code>, the source address is the name of a source address book. Example: db_group.</li>
         * <li>If <strong>SourceType</strong> is set to <code>location</code>, the source address is an area. For more information about the area positional encoding, see <a href="https://help.aliyun.com/document_detail/138867.html">AddControlPolicy</a>. Example: [&quot;BJ11&quot;, &quot;ZB&quot;\].</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>192.0.XX.XX/24</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The CIDR blocks in the source address book of the access control policy.</p>
         */
        @NameInMap("SourceGroupCidrs")
        public java.util.List<String> sourceGroupCidrs;

        /**
         * <p>The type of the source address book in the access control policy. Valid values:</p>
         * <ul>
         * <li><p><strong>ip</strong>: IP address book, which contains one or more CIDR blocks.</p>
         * </li>
         * <li><p><strong>tag</strong>: ECS tag-based address book, which contains the IP addresses of one or more ECS tags.</p>
         * </li>
         * <li><p><strong>domain</strong>: Domain name address book, which contains one or more domain names.</p>
         * </li>
         * <li><p><strong>threat</strong>: Threat intelligence address book, which contains one or more malicious IP addresses or domain names.</p>
         * </li>
         * <li><p><strong>backsrc</strong>: Back-to-origin address book, which contains the back-to-origin IP addresses of one or more Anti-DDoS or WAF instances.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ip</p>
         */
        @NameInMap("SourceGroupType")
        public String sourceGroupType;

        /**
         * <p>The type of the source address in the access control policy. Valid values:</p>
         * <ul>
         * <li><strong>net</strong>: Source CIDR block</li>
         * <li><strong>group</strong>: Source address book</li>
         * <li><strong>location</strong>: Source region</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>net</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The quota consumed by the access control policy, which is the sum of the quota consumed by each policy.
         * Quota consumed by a single policy = Number of source addresses (number of CIDR blocks or area) \* Number of destination addresses (number of CIDR blocks, area, or domain names) \* Number of port ranges \* Number of applications.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("SpreadCnt")
        public Integer spreadCnt;

        /**
         * <p>The start time of the Policy Validity Period for the access control policy. The value is in the UNIX timestamp format in seconds. The time must be on the hour or half-hour, and must be at least 30 minutes earlier than the end time.</p>
         * <blockquote>
         * <p>If RepeatType is Permanent, StartTime is empty. If RepeatType is None, Daily, Weekly, or Monthly, StartTime is required, and you must configure the Settings for the start time.</p>
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
