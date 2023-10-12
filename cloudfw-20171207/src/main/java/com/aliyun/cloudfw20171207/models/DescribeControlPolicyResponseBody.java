// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeControlPolicyResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNo")
    public String pageNo;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The details about the access control policy.</p>
     */
    @NameInMap("Policys")
    public java.util.List<DescribeControlPolicyResponseBodyPolicys> policys;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of the returned access control policies.</p>
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
         * <br>
         * <p>*   **accept**: allows the traffic.</p>
         * <p>*   **drop**: denies the traffic.</p>
         * <p>*   **log**: monitors the traffic.</p>
         */
        @NameInMap("AclAction")
        public String aclAction;

        /**
         * <p>The unique ID of the access control policy.</p>
         */
        @NameInMap("AclUuid")
        public String aclUuid;

        /**
         * <p>The application ID in the access control policy.</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        /**
         * <p>The type of the application that the access control policy supports. Valid values:</p>
         * <br>
         * <p>*   **FTP**</p>
         * <p>*   **HTTP**</p>
         * <p>*   **HTTPS**</p>
         * <p>*   **Memcache**</p>
         * <p>*   **MongoDB**</p>
         * <p>*   **MQTT**</p>
         * <p>*   **MySQL**</p>
         * <p>*   **RDP**</p>
         * <p>*   **Redis**</p>
         * <p>*   **SMTP**</p>
         * <p>*   **SMTPS**</p>
         * <p>*   **SSH**</p>
         * <p>*   **SSL**</p>
         * <p>*   **VNC**</p>
         * <p>*   **ANY**: all types of applications</p>
         */
        @NameInMap("ApplicationName")
        public String applicationName;

        /**
         * <p>The names of applications.</p>
         */
        @NameInMap("ApplicationNameList")
        public java.util.List<String> applicationNameList;

        /**
         * <p>The time at which the access control policy was created.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The description of the access control policy.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The destination port in the access control policy.</p>
         */
        @NameInMap("DestPort")
        public String destPort;

        /**
         * <p>The name of the destination port address book in the access control policy.</p>
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
         * <br>
         * <p>*   **port**: port</p>
         * <p>*   **group**: port address book</p>
         */
        @NameInMap("DestPortType")
        public String destPortType;

        /**
         * <p>The destination address in the access control policy. The value of this parameter depends on the value of the DestinationType parameter. Valid values:</p>
         * <br>
         * <p>*   If **DestinationType** is set to **net**, the value of Destination is a CIDR block. Example: 192.0.XX.XX/24.</p>
         * <p>*   If **DestinationType** is set to **domain**, the value of Destination is a domain name. Example: aliyuncs.com.</p>
         * <p>*   If **DestinationType** is set to **group**, the value of Destination is the name of an address book. Example: db_group.</p>
         * <p>*   If **DestinationType** is set to **location**, the value of Destination is a location. For more information about location codes, see [AddControlPolicy](~~138867~~). Example: \["BJ11", "ZB"].</p>
         */
        @NameInMap("Destination")
        public String destination;

        /**
         * <p>The CIDR blocks in the destination address book.</p>
         */
        @NameInMap("DestinationGroupCidrs")
        public java.util.List<String> destinationGroupCidrs;

        /**
         * <p>The type of the destination address book in the access control policy. Valid values:</p>
         * <br>
         * <p>*   **ip**: an address book that includes one or more IP addresses</p>
         * <p>*   **tag**: an ECS tag-based address book that includes the IP addresses of the ECS instances with one or more specific tags</p>
         * <p>*   **domain**: an address book that includes one or more domain names</p>
         * <p>*   **threat**: an address book that includes one or more malicious IP addresses or domain names</p>
         * <p>*   **backsrc**: an address book that includes one or more back-to-origin addresses of Anti-DDoS Pro or Anti-DDoS Premium instances or WAF instances</p>
         */
        @NameInMap("DestinationGroupType")
        public String destinationGroupType;

        /**
         * <p>The type of the destination address in the access control policy. Valid values:</p>
         * <br>
         * <p>*   **net**: destination CIDR block</p>
         * <p>*   **group**: destination address book</p>
         * <p>*   **domain**: destination domain name</p>
         * <p>*   **location**: destination location</p>
         */
        @NameInMap("DestinationType")
        public String destinationType;

        /**
         * <p>The direction of the traffic to which the access control policy applies. Valid values:</p>
         * <br>
         * <p>*   **in**: inbound traffic</p>
         * <p>*   **out**: outbound traffic</p>
         */
        @NameInMap("Direction")
        public String direction;

        /**
         * <p>The DNS resolution result.</p>
         */
        @NameInMap("DnsResult")
        public String dnsResult;

        /**
         * <p>The timestamp of the DNS resolution result. The value is a UNIX timestamp. Unit: seconds.</p>
         */
        @NameInMap("DnsResultTime")
        public Long dnsResultTime;

        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The timestamp when the access control policy was last hit. The value is a UNIX timestamp. Unit: seconds.</p>
         */
        @NameInMap("HitLastTime")
        public Long hitLastTime;

        /**
         * <p>The number of hits for the access control policy.</p>
         */
        @NameInMap("HitTimes")
        public Long hitTimes;

        /**
         * <p>The IP version of the address in the access control policy. Valid values:</p>
         * <br>
         * <p>*   **4**: IPv4</p>
         * <p>*   **6**: IPv6</p>
         */
        @NameInMap("IpVersion")
        public Integer ipVersion;

        /**
         * <p>The time at which the access control policy was modified.</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The priority of the access control policy.</p>
         * <br>
         * <p>The priority value starts from 1. A small priority value indicates a high priority.</p>
         */
        @NameInMap("Order")
        public Integer order;

        /**
         * <p>The type of the protocol in the access control policy. Valid values:</p>
         * <br>
         * <p>*   **ANY**</p>
         * <p>*   **TCP**</p>
         * <p>*   **UDP**</p>
         * <p>*   **ICMP**</p>
         */
        @NameInMap("Proto")
        public String proto;

        /**
         * <p>Indicates whether the access control policy is enabled. By default, an access control policy is enabled after it is created. Valid values:</p>
         * <br>
         * <p>*   **true**: The access control policy is enabled.</p>
         * <p>*   **false**: The access control policy is disabled.</p>
         */
        @NameInMap("Release")
        public String release;

        @NameInMap("RepeatDays")
        public java.util.List<Long> repeatDays;

        @NameInMap("RepeatEndTime")
        public String repeatEndTime;

        @NameInMap("RepeatStartTime")
        public String repeatStartTime;

        @NameInMap("RepeatType")
        public String repeatType;

        /**
         * <p>The source address in the access control policy. Valid values:</p>
         * <br>
         * <p>*   If **SourceType** is set to `net`, the value of Source is a CIDR block. Example: 192.0.XX.XX/24.</p>
         * <p>*   If **SourceType** is set to `group`, the value of Source is the name of an address book. Example: db_group.</p>
         * <p>*   If **SourceType** is set to `location`, the value of Source is a location. For more information about location codes, see [AddControlPolicy](~~138867~~). Example: \["BJ11", "ZB"].</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The CIDR blocks in the source address book.</p>
         */
        @NameInMap("SourceGroupCidrs")
        public java.util.List<String> sourceGroupCidrs;

        /**
         * <p>The type of the source address book in the access control policy. Valid values:</p>
         * <br>
         * <p>*   **ip**: an address book that includes one or more IP addresses</p>
         * <p>*   **tag**: an Elastic Compute Service (ECS) tag-based address book that includes the IP addresses of the ECS instances with one or more specific tags</p>
         * <p>*   **domain**: an address book that includes one or more domain names</p>
         * <p>*   **threat**: an address book that includes one or more malicious IP addresses or domain names</p>
         * <p>*   **backsrc**: an address book that includes one or more back-to-origin addresses of Anti-DDoS Pro or Anti-DDoS Premium instances or Web Application Firewall (WAF) instances</p>
         */
        @NameInMap("SourceGroupType")
        public String sourceGroupType;

        /**
         * <p>The type of the source address in the access control policy. Valid values:</p>
         * <br>
         * <p>*   **net**: source CIDR block</p>
         * <p>*   **group**: source address book</p>
         * <p>*   **location**: source location</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The total quota consumed by the returned access control policies, which is the sum of the quota consumed by each policy.</p>
         * <br>
         * <p>Quota that is consumed by an access control policy = Number of source CIDR blocks × Number of destination CIDR blocks, destination locations, or IP addresses that are resolved from destination domain names × Number of applications × Number of ports.</p>
         */
        @NameInMap("SpreadCnt")
        public Integer spreadCnt;

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
