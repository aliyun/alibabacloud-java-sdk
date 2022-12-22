// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeRiskEventGroupResponseBody extends TeaModel {
    // An array that consists of the details of the intrusion events.
    @NameInMap("DataList")
    public java.util.List<DescribeRiskEventGroupResponseBodyDataList> dataList;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The total number of risk events.
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeRiskEventGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRiskEventGroupResponseBody self = new DescribeRiskEventGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRiskEventGroupResponseBody setDataList(java.util.List<DescribeRiskEventGroupResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<DescribeRiskEventGroupResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public DescribeRiskEventGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRiskEventGroupResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeRiskEventGroupResponseBodyDataListIPLocationInfo extends TeaModel {
        // The ID of the city to which the IP address belongs.
        @NameInMap("CityId")
        public String cityId;

        // The name of the city to which the IP address belongs.
        @NameInMap("CityName")
        public String cityName;

        // The ID of the country to which the IP address belongs.
        @NameInMap("CountryId")
        public String countryId;

        // The name of the country to which the IP address belongs.
        @NameInMap("CountryName")
        public String countryName;

        public static DescribeRiskEventGroupResponseBodyDataListIPLocationInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeRiskEventGroupResponseBodyDataListIPLocationInfo self = new DescribeRiskEventGroupResponseBodyDataListIPLocationInfo();
            return TeaModel.build(map, self);
        }

        public DescribeRiskEventGroupResponseBodyDataListIPLocationInfo setCityId(String cityId) {
            this.cityId = cityId;
            return this;
        }
        public String getCityId() {
            return this.cityId;
        }

        public DescribeRiskEventGroupResponseBodyDataListIPLocationInfo setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public DescribeRiskEventGroupResponseBodyDataListIPLocationInfo setCountryId(String countryId) {
            this.countryId = countryId;
            return this;
        }
        public String getCountryId() {
            return this.countryId;
        }

        public DescribeRiskEventGroupResponseBodyDataListIPLocationInfo setCountryName(String countryName) {
            this.countryName = countryName;
            return this;
        }
        public String getCountryName() {
            return this.countryName;
        }

    }

    public static class DescribeRiskEventGroupResponseBodyDataListResourcePrivateIPList extends TeaModel {
        // The ID of the region to which the private IP address belongs.
        @NameInMap("RegionNo")
        public String regionNo;

        // The ID of the instance that uses the private IP address.
        @NameInMap("ResourceInstanceId")
        public String resourceInstanceId;

        // The name of the instance that uses the private IP address.
        @NameInMap("ResourceInstanceName")
        public String resourceInstanceName;

        // The private IP address.
        @NameInMap("ResourcePrivateIP")
        public String resourcePrivateIP;

        public static DescribeRiskEventGroupResponseBodyDataListResourcePrivateIPList build(java.util.Map<String, ?> map) throws Exception {
            DescribeRiskEventGroupResponseBodyDataListResourcePrivateIPList self = new DescribeRiskEventGroupResponseBodyDataListResourcePrivateIPList();
            return TeaModel.build(map, self);
        }

        public DescribeRiskEventGroupResponseBodyDataListResourcePrivateIPList setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

        public DescribeRiskEventGroupResponseBodyDataListResourcePrivateIPList setResourceInstanceId(String resourceInstanceId) {
            this.resourceInstanceId = resourceInstanceId;
            return this;
        }
        public String getResourceInstanceId() {
            return this.resourceInstanceId;
        }

        public DescribeRiskEventGroupResponseBodyDataListResourcePrivateIPList setResourceInstanceName(String resourceInstanceName) {
            this.resourceInstanceName = resourceInstanceName;
            return this;
        }
        public String getResourceInstanceName() {
            return this.resourceInstanceName;
        }

        public DescribeRiskEventGroupResponseBodyDataListResourcePrivateIPList setResourcePrivateIP(String resourcePrivateIP) {
            this.resourcePrivateIP = resourcePrivateIP;
            return this;
        }
        public String getResourcePrivateIP() {
            return this.resourcePrivateIP;
        }

    }

    public static class DescribeRiskEventGroupResponseBodyDataListVpcDstInfo extends TeaModel {
        // The ID of the ECS instance.
        @NameInMap("EcsInstanceId")
        public String ecsInstanceId;

        // The name of the ECS instance.
        @NameInMap("EcsInstanceName")
        public String ecsInstanceName;

        // The ID of the VPC.
        @NameInMap("NetworkInstanceId")
        public String networkInstanceId;

        // The name of the VPC.
        @NameInMap("NetworkInstanceName")
        public String networkInstanceName;

        // The ID of the region in which the destination VPC resides.
        @NameInMap("RegionNo")
        public String regionNo;

        public static DescribeRiskEventGroupResponseBodyDataListVpcDstInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeRiskEventGroupResponseBodyDataListVpcDstInfo self = new DescribeRiskEventGroupResponseBodyDataListVpcDstInfo();
            return TeaModel.build(map, self);
        }

        public DescribeRiskEventGroupResponseBodyDataListVpcDstInfo setEcsInstanceId(String ecsInstanceId) {
            this.ecsInstanceId = ecsInstanceId;
            return this;
        }
        public String getEcsInstanceId() {
            return this.ecsInstanceId;
        }

        public DescribeRiskEventGroupResponseBodyDataListVpcDstInfo setEcsInstanceName(String ecsInstanceName) {
            this.ecsInstanceName = ecsInstanceName;
            return this;
        }
        public String getEcsInstanceName() {
            return this.ecsInstanceName;
        }

        public DescribeRiskEventGroupResponseBodyDataListVpcDstInfo setNetworkInstanceId(String networkInstanceId) {
            this.networkInstanceId = networkInstanceId;
            return this;
        }
        public String getNetworkInstanceId() {
            return this.networkInstanceId;
        }

        public DescribeRiskEventGroupResponseBodyDataListVpcDstInfo setNetworkInstanceName(String networkInstanceName) {
            this.networkInstanceName = networkInstanceName;
            return this;
        }
        public String getNetworkInstanceName() {
            return this.networkInstanceName;
        }

        public DescribeRiskEventGroupResponseBodyDataListVpcDstInfo setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

    }

    public static class DescribeRiskEventGroupResponseBodyDataListVpcSrcInfo extends TeaModel {
        // The ID of the ECS instance.
        @NameInMap("EcsInstanceId")
        public String ecsInstanceId;

        // The name of the ECS instance.
        @NameInMap("EcsInstanceName")
        public String ecsInstanceName;

        // The ID of the VPC.
        @NameInMap("NetworkInstanceId")
        public String networkInstanceId;

        // The name of the VPC.
        @NameInMap("NetworkInstanceName")
        public String networkInstanceName;

        // The ID of the region in which the source VPC resides.
        @NameInMap("RegionNo")
        public String regionNo;

        public static DescribeRiskEventGroupResponseBodyDataListVpcSrcInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeRiskEventGroupResponseBodyDataListVpcSrcInfo self = new DescribeRiskEventGroupResponseBodyDataListVpcSrcInfo();
            return TeaModel.build(map, self);
        }

        public DescribeRiskEventGroupResponseBodyDataListVpcSrcInfo setEcsInstanceId(String ecsInstanceId) {
            this.ecsInstanceId = ecsInstanceId;
            return this;
        }
        public String getEcsInstanceId() {
            return this.ecsInstanceId;
        }

        public DescribeRiskEventGroupResponseBodyDataListVpcSrcInfo setEcsInstanceName(String ecsInstanceName) {
            this.ecsInstanceName = ecsInstanceName;
            return this;
        }
        public String getEcsInstanceName() {
            return this.ecsInstanceName;
        }

        public DescribeRiskEventGroupResponseBodyDataListVpcSrcInfo setNetworkInstanceId(String networkInstanceId) {
            this.networkInstanceId = networkInstanceId;
            return this;
        }
        public String getNetworkInstanceId() {
            return this.networkInstanceId;
        }

        public DescribeRiskEventGroupResponseBodyDataListVpcSrcInfo setNetworkInstanceName(String networkInstanceName) {
            this.networkInstanceName = networkInstanceName;
            return this;
        }
        public String getNetworkInstanceName() {
            return this.networkInstanceName;
        }

        public DescribeRiskEventGroupResponseBodyDataListVpcSrcInfo setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

    }

    public static class DescribeRiskEventGroupResponseBodyDataList extends TeaModel {
        // The name of the attacked application.
        @NameInMap("AttackApp")
        public String attackApp;

        // The attack type of the intrusion event. Valid values:
        // 
        // * **1**: suspicious connection
        // * **2**: command execution
        // * **3**: brute-force attack
        // * **4**: scanning
        // * **5**: others
        // * **6**: information leak
        // * **7**: DoS attack
        // * **8**: buffer overflow attack
        // * **9**: web attack
        // * **10**: trojan backdoor
        // * **11**: computer worm
        // * **12**: mining
        // * **13**: reverse shell
        @NameInMap("AttackType")
        public Integer attackType;

        // The description of the intrusion event.
        @NameInMap("Description")
        public String description;

        // The direction of the traffic for the intrusion events. Valid values:
        // 
        // *   **in**: inbound
        // *   **out**: outbound
        @NameInMap("Direction")
        public String direction;

        // The destination IP address that is included in the intrusion event.
        @NameInMap("DstIP")
        public String dstIP;

        // The number of intrusion events.
        @NameInMap("EventCount")
        public Integer eventCount;

        // The ID of the intrusion event.
        @NameInMap("EventId")
        public String eventId;

        // The name of the intrusion event.
        @NameInMap("EventName")
        public String eventName;

        // The time when the intrusion event was first detected. The value is a UNIX timestamp. Unit: seconds.
        @NameInMap("FirstEventTime")
        public Integer firstEventTime;

        // The information about the geographical location of the IP address. The value is a struct that contains the following parameters: **CityId**, **CityName**, **CountryId**, and **CountryName**.
        @NameInMap("IPLocationInfo")
        public DescribeRiskEventGroupResponseBodyDataListIPLocationInfo IPLocationInfo;

        // The time when the intrusion event was last detected. The value is a UNIX timestamp. Unit: seconds.
        @NameInMap("LastEventTime")
        public Integer lastEventTime;

        // The information about the private IP address of the intrusion event. The value is an array that contains the following parameters: **RegionNo**, **ResourceInstanceId**, **ResourceInstanceName**, and **ResourcePrivateIP**.
        @NameInMap("ResourcePrivateIPList")
        public java.util.List<DescribeRiskEventGroupResponseBodyDataListResourcePrivateIPList> resourcePrivateIPList;

        // The type of the public IP address in the intrusion event. Valid values:
        // 
        // *   **EIP**: the elastic IP address (EIP)
        // *   **EcsPublicIP**: the public IP address of an Elastic Compute Service (ECS) instance
        // *   **EcsEIP**: the EIP of an ECS instance
        // *   **NatPublicIP**: the public IP address of a NAT gateway
        // *   **NatEIP**: the EIP of a NAT gateway
        @NameInMap("ResourceType")
        public String resourceType;

        // The ID of the rule that is used to detect the intrusion event.
        @NameInMap("RuleId")
        public String ruleId;

        // The status of the firewall. Valid values:
        // 
        // *   **1**: alerting
        // *   **2**: blocking
        @NameInMap("RuleResult")
        public Integer ruleResult;

        // The module of the rule that is used to detect the intrusion event. Valid values:
        // 
        // *   **1**: basic protection
        // *   **2**: virtual patching
        // *   **4**: threat intelligence
        @NameInMap("RuleSource")
        public Integer ruleSource;

        // The source IP address that is included in the intrusion event.
        @NameInMap("SrcIP")
        public String srcIP;

        // The source IP tag. It is used to identify whether it is the cloud product back to the source IP.
        @NameInMap("SrcIPTag")
        public String srcIPTag;

        // The source private IP addresses of the intrusion event.
        // 
        // >  The value of this parameter is returned only when you set Direction to out.
        @NameInMap("SrcPrivateIPList")
        public java.util.List<String> srcPrivateIPList;

        // The tag added to the threat intelligence that is provided for major events.
        @NameInMap("Tag")
        public String tag;

        // The information about the destination VPC of the intrusion event. The value is a struct that contains the following parameters: **EcsInstanceId**, **EcsInstanceName**, **NetworkInstanceId**, **NetworkInstanceName**, and **RegionNo**.
        @NameInMap("VpcDstInfo")
        public DescribeRiskEventGroupResponseBodyDataListVpcDstInfo vpcDstInfo;

        // The information about the source VPC of the intrusion event. The value is a struct that contains the following parameters: **EcsInstanceId**, **EcsInstanceName**, **NetworkInstanceId**, **NetworkInstanceName**, and **RegionNo**.
        @NameInMap("VpcSrcInfo")
        public DescribeRiskEventGroupResponseBodyDataListVpcSrcInfo vpcSrcInfo;

        // The risk level of the intrusion event. Valid values:
        // 
        // *   **1**: low
        // *   **2**: medium
        // *   **3**: high
        @NameInMap("VulLevel")
        public Integer vulLevel;

        public static DescribeRiskEventGroupResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeRiskEventGroupResponseBodyDataList self = new DescribeRiskEventGroupResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public DescribeRiskEventGroupResponseBodyDataList setAttackApp(String attackApp) {
            this.attackApp = attackApp;
            return this;
        }
        public String getAttackApp() {
            return this.attackApp;
        }

        public DescribeRiskEventGroupResponseBodyDataList setAttackType(Integer attackType) {
            this.attackType = attackType;
            return this;
        }
        public Integer getAttackType() {
            return this.attackType;
        }

        public DescribeRiskEventGroupResponseBodyDataList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeRiskEventGroupResponseBodyDataList setDirection(String direction) {
            this.direction = direction;
            return this;
        }
        public String getDirection() {
            return this.direction;
        }

        public DescribeRiskEventGroupResponseBodyDataList setDstIP(String dstIP) {
            this.dstIP = dstIP;
            return this;
        }
        public String getDstIP() {
            return this.dstIP;
        }

        public DescribeRiskEventGroupResponseBodyDataList setEventCount(Integer eventCount) {
            this.eventCount = eventCount;
            return this;
        }
        public Integer getEventCount() {
            return this.eventCount;
        }

        public DescribeRiskEventGroupResponseBodyDataList setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public DescribeRiskEventGroupResponseBodyDataList setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public DescribeRiskEventGroupResponseBodyDataList setFirstEventTime(Integer firstEventTime) {
            this.firstEventTime = firstEventTime;
            return this;
        }
        public Integer getFirstEventTime() {
            return this.firstEventTime;
        }

        public DescribeRiskEventGroupResponseBodyDataList setIPLocationInfo(DescribeRiskEventGroupResponseBodyDataListIPLocationInfo IPLocationInfo) {
            this.IPLocationInfo = IPLocationInfo;
            return this;
        }
        public DescribeRiskEventGroupResponseBodyDataListIPLocationInfo getIPLocationInfo() {
            return this.IPLocationInfo;
        }

        public DescribeRiskEventGroupResponseBodyDataList setLastEventTime(Integer lastEventTime) {
            this.lastEventTime = lastEventTime;
            return this;
        }
        public Integer getLastEventTime() {
            return this.lastEventTime;
        }

        public DescribeRiskEventGroupResponseBodyDataList setResourcePrivateIPList(java.util.List<DescribeRiskEventGroupResponseBodyDataListResourcePrivateIPList> resourcePrivateIPList) {
            this.resourcePrivateIPList = resourcePrivateIPList;
            return this;
        }
        public java.util.List<DescribeRiskEventGroupResponseBodyDataListResourcePrivateIPList> getResourcePrivateIPList() {
            return this.resourcePrivateIPList;
        }

        public DescribeRiskEventGroupResponseBodyDataList setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeRiskEventGroupResponseBodyDataList setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DescribeRiskEventGroupResponseBodyDataList setRuleResult(Integer ruleResult) {
            this.ruleResult = ruleResult;
            return this;
        }
        public Integer getRuleResult() {
            return this.ruleResult;
        }

        public DescribeRiskEventGroupResponseBodyDataList setRuleSource(Integer ruleSource) {
            this.ruleSource = ruleSource;
            return this;
        }
        public Integer getRuleSource() {
            return this.ruleSource;
        }

        public DescribeRiskEventGroupResponseBodyDataList setSrcIP(String srcIP) {
            this.srcIP = srcIP;
            return this;
        }
        public String getSrcIP() {
            return this.srcIP;
        }

        public DescribeRiskEventGroupResponseBodyDataList setSrcIPTag(String srcIPTag) {
            this.srcIPTag = srcIPTag;
            return this;
        }
        public String getSrcIPTag() {
            return this.srcIPTag;
        }

        public DescribeRiskEventGroupResponseBodyDataList setSrcPrivateIPList(java.util.List<String> srcPrivateIPList) {
            this.srcPrivateIPList = srcPrivateIPList;
            return this;
        }
        public java.util.List<String> getSrcPrivateIPList() {
            return this.srcPrivateIPList;
        }

        public DescribeRiskEventGroupResponseBodyDataList setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public DescribeRiskEventGroupResponseBodyDataList setVpcDstInfo(DescribeRiskEventGroupResponseBodyDataListVpcDstInfo vpcDstInfo) {
            this.vpcDstInfo = vpcDstInfo;
            return this;
        }
        public DescribeRiskEventGroupResponseBodyDataListVpcDstInfo getVpcDstInfo() {
            return this.vpcDstInfo;
        }

        public DescribeRiskEventGroupResponseBodyDataList setVpcSrcInfo(DescribeRiskEventGroupResponseBodyDataListVpcSrcInfo vpcSrcInfo) {
            this.vpcSrcInfo = vpcSrcInfo;
            return this;
        }
        public DescribeRiskEventGroupResponseBodyDataListVpcSrcInfo getVpcSrcInfo() {
            return this.vpcSrcInfo;
        }

        public DescribeRiskEventGroupResponseBodyDataList setVulLevel(Integer vulLevel) {
            this.vulLevel = vulLevel;
            return this;
        }
        public Integer getVulLevel() {
            return this.vulLevel;
        }

    }

}
