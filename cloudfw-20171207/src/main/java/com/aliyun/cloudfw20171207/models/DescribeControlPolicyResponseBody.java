// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeControlPolicyResponseBody extends TeaModel {
    // The page number of the returned page.
    @NameInMap("PageNo")
    public String pageNo;

    // The number of entries returned per page.
    @NameInMap("PageSize")
    public String pageSize;

    // The details about the access control policy.
    @NameInMap("Policys")
    public java.util.List<DescribeControlPolicyResponseBodyPolicys> policys;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The total number of the returned access control policies.
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
        // The action that Cloud Firewall performs on the traffic. Valid values:
        // 
        // *   **accept**: allows the traffic.
        // *   **drop**: denies the traffic.
        // *   **log**: monitors the traffic.
        @NameInMap("AclAction")
        public String aclAction;

        // The unique ID of the access control policy.
        @NameInMap("AclUuid")
        public String aclUuid;

        // The application ID in the access control policy.
        @NameInMap("ApplicationId")
        public String applicationId;

        // The type of the application that the access control policy supports. Valid values:
        // 
        // *   **FTP**
        // *   **HTTP**
        // *   **HTTPS**
        // *   **Memcache**
        // *   **MongoDB**
        // *   **MQTT**
        // *   **MySQL**
        // *   **RDP**
        // *   **Redis**
        // *   **SMTP**
        // *   **SMTPS**
        // *   **SSH**
        // *   **SSL**
        // *   **VNC**
        // *   **ANY**: all types of applications
        @NameInMap("ApplicationName")
        public String applicationName;

        // The names of applications.
        @NameInMap("ApplicationNameList")
        public java.util.List<String> applicationNameList;

        // The time at which the access control policy was created.
        @NameInMap("CreateTime")
        public Long createTime;

        // The description of the access control policy.
        @NameInMap("Description")
        public String description;

        // The destination port in the access control policy.
        @NameInMap("DestPort")
        public String destPort;

        // The name of the destination port address book in the access control policy.
        @NameInMap("DestPortGroup")
        public String destPortGroup;

        // The ports in the destination port address book.
        @NameInMap("DestPortGroupPorts")
        public java.util.List<String> destPortGroupPorts;

        // The type of the destination port in the access control policy. Valid values:
        // 
        // *   **port**: port
        // *   **group**: port address book
        @NameInMap("DestPortType")
        public String destPortType;

        // The destination address in the access control policy. The value of this parameter depends on the value of the DestinationType parameter. Valid values:
        // 
        // *   If **DestinationType** is set to **net**, the value of Destination is a CIDR block. Example: 192.0.XX.XX/24.
        // *   If **DestinationType** is set to **domain**, the value of Destination is a domain name. Example: aliyuncs.com.
        // *   If **DestinationType** is set to **group**, the value of Destination is the name of an address book. Example: db_group.
        // *   If **DestinationType** is set to **location**, the value of Destination is a location. For more information about location codes, see [AddControlPolicy](~~138867~~). Example: \["BJ11", "ZB"].
        @NameInMap("Destination")
        public String destination;

        // The CIDR blocks in the destination address book.
        @NameInMap("DestinationGroupCidrs")
        public java.util.List<String> destinationGroupCidrs;

        // The type of the destination address book in the access control policy. Valid values:
        // 
        // *   **ip**: an address book that includes one or more IP addresses
        // *   **tag**: an ECS tag-based address book that includes the IP addresses of the ECS instances with one or more specific tags
        // *   **domain**: an address book that includes one or more domain names
        // *   **threat**: an address book that includes one or more malicious IP addresses or domain names
        // *   **backsrc**: an address book that includes one or more back-to-origin addresses of Anti-DDoS Pro or Anti-DDoS Premium instances or WAF instances
        @NameInMap("DestinationGroupType")
        public String destinationGroupType;

        // The type of the destination address in the access control policy. Valid values:
        // 
        // *   **net**: destination CIDR block
        // *   **group**: destination address book
        // *   **domain**: destination domain name
        // *   **location**: destination location
        @NameInMap("DestinationType")
        public String destinationType;

        // The direction of the traffic to which the access control policy applies. Valid values:
        // 
        // *   **in**: inbound traffic
        // *   **out**: outbound traffic
        @NameInMap("Direction")
        public String direction;

        // The DNS resolution result.
        @NameInMap("DnsResult")
        public String dnsResult;

        // The timestamp of the DNS resolution result. The value is a UNIX timestamp. Unit: seconds.
        @NameInMap("DnsResultTime")
        public Long dnsResultTime;

        // The timestamp when the access control policy was last hit. The value is a UNIX timestamp. Unit: seconds.
        @NameInMap("HitLastTime")
        public Long hitLastTime;

        // The number of hits for the access control policy.
        @NameInMap("HitTimes")
        public Long hitTimes;

        // The IP version of the address in the access control policy. Valid values:
        // 
        // *   **4**: IPv4
        // *   **6**: IPv6
        @NameInMap("IpVersion")
        public Integer ipVersion;

        // The time at which the access control policy was modified.
        @NameInMap("ModifyTime")
        public Long modifyTime;

        // The priority of the access control policy.
        // 
        // The priority value starts from 1. A small priority value indicates a high priority.
        @NameInMap("Order")
        public Integer order;

        // The type of the protocol in the access control policy. Valid values:
        // 
        // *   **ANY**
        // *   **TCP**
        // *   **UDP**
        // *   **ICMP**
        @NameInMap("Proto")
        public String proto;

        // Indicates whether the access control policy is enabled. By default, an access control policy is enabled after it is created. Valid values:
        // 
        // *   **true**: The access control policy is enabled.
        // *   **false**: The access control policy is disabled.
        @NameInMap("Release")
        public String release;

        // The source address in the access control policy. Valid values:
        // 
        // *   If **SourceType** is set to `net`, the value of Source is a CIDR block. Example: 192.0.XX.XX/24.
        // *   If **SourceType** is set to `group`, the value of Source is the name of an address book. Example: db_group.
        // *   If **SourceType** is set to `location`, the value of Source is a location. For more information about location codes, see [AddControlPolicy](~~138867~~). Example: \["BJ11", "ZB"].
        @NameInMap("Source")
        public String source;

        // The CIDR blocks in the source address book.
        @NameInMap("SourceGroupCidrs")
        public java.util.List<String> sourceGroupCidrs;

        // The type of the source address book in the access control policy. Valid values:
        // 
        // *   **ip**: an address book that includes one or more IP addresses
        // *   **tag**: an Elastic Compute Service (ECS) tag-based address book that includes the IP addresses of the ECS instances with one or more specific tags
        // *   **domain**: an address book that includes one or more domain names
        // *   **threat**: an address book that includes one or more malicious IP addresses or domain names
        // *   **backsrc**: an address book that includes one or more back-to-origin addresses of Anti-DDoS Pro or Anti-DDoS Premium instances or Web Application Firewall (WAF) instances
        @NameInMap("SourceGroupType")
        public String sourceGroupType;

        // The type of the source address in the access control policy. Valid values:
        // 
        // *   **net**: source CIDR block
        // *   **group**: source address book
        // *   **location**: source location
        @NameInMap("SourceType")
        public String sourceType;

        // The total quota consumed by the returned access control policies, which is the sum of the quota consumed by each policy.
        // 
        // Quota that is consumed by an access control policy = Number of source CIDR blocks × Number of destination CIDR blocks, destination locations, or IP addresses that are resolved from destination domain names × Number of applications × Number of ports.
        @NameInMap("SpreadCnt")
        public Integer spreadCnt;

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

    }

}
