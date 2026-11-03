// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeRiskEventGroupResponseBody extends TeaModel {
    /**
     * <p>The list of returned data.</p>
     */
    @NameInMap("DataList")
    public java.util.List<DescribeRiskEventGroupResponseBodyDataList> dataList;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>B14757D0-4640-4B44-AC67-7F558FE7E6EF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of risk events.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
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
        /**
         * <p>The ID of the city.</p>
         * 
         * <strong>example:</strong>
         * <p>510100</p>
         */
        @NameInMap("CityId")
        public String cityId;

        /**
         * <p>The name of the city.</p>
         * 
         * <strong>example:</strong>
         * <p>Chengdu</p>
         */
        @NameInMap("CityName")
        public String cityName;

        /**
         * <p>The ID of the country.</p>
         * 
         * <strong>example:</strong>
         * <p>CN</p>
         */
        @NameInMap("CountryId")
        public String countryId;

        /**
         * <p>The name of the country.</p>
         * 
         * <strong>example:</strong>
         * <p>China</p>
         */
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
        /**
         * <p>The region ID. This parameter indicates the ID of the region to which the private IP address belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionNo")
        public String regionNo;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-wz92jf4scg2zb74p****</p>
         */
        @NameInMap("ResourceInstanceId")
        public String resourceInstanceId;

        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>LD-shenzhen-zy****</p>
         */
        @NameInMap("ResourceInstanceName")
        public String resourceInstanceName;

        /**
         * <p>The private IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>10.255.XX.XX</p>
         */
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
        /**
         * <p>The instance ID of the ECS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>i-wz92jf4scg2zb74p****</p>
         */
        @NameInMap("EcsInstanceId")
        public String ecsInstanceId;

        /**
         * <p>The name of the ECS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>LD-shenzhen-zy****</p>
         */
        @NameInMap("EcsInstanceName")
        public String ecsInstanceName;

        /**
         * <p>The instance ID of the VPC-connected instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf6e9a9zyokj2ywuo****</p>
         */
        @NameInMap("NetworkInstanceId")
        public String networkInstanceId;

        /**
         * <p>The name of the VPC-connected instance.</p>
         * 
         * <strong>example:</strong>
         * <p>VPC-SH-TX****</p>
         */
        @NameInMap("NetworkInstanceName")
        public String networkInstanceName;

        /**
         * <p>The region ID. This parameter indicates the ID of the region to which the destination VPC-connected instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
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
        /**
         * <p>The instance ID of the ECS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>i-wz92jf4scg2zb74p****</p>
         */
        @NameInMap("EcsInstanceId")
        public String ecsInstanceId;

        /**
         * <p>The name of the ECS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>LD-shenzhen-zy****</p>
         */
        @NameInMap("EcsInstanceName")
        public String ecsInstanceName;

        /**
         * <p>The instance ID of the VPC-connected instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf6e9a9zyokj2ywuo****</p>
         */
        @NameInMap("NetworkInstanceId")
        public String networkInstanceId;

        /**
         * <p>The name of the VPC-connected instance.</p>
         * 
         * <strong>example:</strong>
         * <p>VPC-SH-TX****</p>
         */
        @NameInMap("NetworkInstanceName")
        public String networkInstanceName;

        /**
         * <p>The region ID. This parameter indicates the ID of the region to which the source VPC-connected instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
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
        /**
         * <p>The name of the attacked application.</p>
         * 
         * <strong>example:</strong>
         * <p>MySql</p>
         */
        @NameInMap("AttackApp")
        public String attackApp;

        /**
         * <p>The attack type of the intrusion prevention event. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Abnormal connection.</li>
         * <li><strong>2</strong>: Execute commands.</li>
         * <li><strong>3</strong>: Brute-force attacks.</li>
         * <li><strong>4</strong>: Scan.</li>
         * <li><strong>5</strong>: Other.</li>
         * <li><strong>6</strong>: Information leak.</li>
         * <li><strong>7</strong>: DoS attack.</li>
         * <li><strong>8</strong>: Overflow attack.</li>
         * <li><strong>9</strong>: Web attack.</li>
         * <li><strong>10</strong>: Trojan backdoor.</li>
         * <li><strong>11</strong>: Virus and worm.</li>
         * <li><strong>12</strong>: Mining behavior.</li>
         * <li><strong>13</strong>: Reverse shell.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AttackType")
        public Integer attackType;

        /**
         * <p>The description of the intrusion prevention event.</p>
         * 
         * <strong>example:</strong>
         * <p>A directory traversal attack was detected in Web access for HTTP requests</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The traffic direction of the intrusion prevention event. Valid values:</p>
         * <ul>
         * <li><strong>in</strong>: Inbound.</li>
         * <li><strong>out</strong>: Outbound.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>in</p>
         */
        @NameInMap("Direction")
        public String direction;

        /**
         * <p>The queried destination IP address. This indicates that the intrusion prevention event includes this destination IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>192.0.XX.XX</p>
         */
        @NameInMap("DstIP")
        public String dstIP;

        /**
         * <p>The number of intrusion prevention events.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("EventCount")
        public Integer eventCount;

        /**
         * <p>The ID of the intrusion prevention event.</p>
         * 
         * <strong>example:</strong>
         * <p>2b58efae-4c4b-4d96-9544-a586fb1f****</p>
         */
        @NameInMap("EventId")
        public String eventId;

        /**
         * <p>The name of the intrusion prevention event.</p>
         * 
         * <strong>example:</strong>
         * <p>Web Directory Traversal Attack</p>
         */
        @NameInMap("EventName")
        public String eventName;

        /**
         * <p>The time when the intrusion event first occurred. The value is a UNIX timestamp accurate to seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1534408189</p>
         */
        @NameInMap("FirstEventTime")
        public Integer firstEventTime;

        /**
         * <p>The IP geolocation information. The struct includes the <strong>CityId</strong>, <strong>CityName</strong>, <strong>CountryId</strong>, and <strong>CountryName</strong> parameters.<br><strong>CityId</strong> indicates the ID of the city to which the IP address belongs. <strong>CityName</strong> indicates the name of the city to which the IP address belongs. <strong>CountryId</strong> indicates the ID of the country to which the IP address belongs. <strong>CountryName</strong> indicates the name of the country to which the IP address belongs.</p>
         */
        @NameInMap("IPLocationInfo")
        public DescribeRiskEventGroupResponseBodyDataListIPLocationInfo IPLocationInfo;

        /**
         * <p>The time when the intrusion prevention event last occurred. The value is a UNIX timestamp accurate to seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1534408267</p>
         */
        @NameInMap("LastEventTime")
        public Integer lastEventTime;

        /**
         * <p>The private IP address information of the intrusion prevention event. The IP address information is returned as an array that includes the <strong>RegionNo</strong>, <strong>ResourceInstanceId</strong>, <strong>ResourceInstanceName</strong>, and <strong>ResourcePrivateIP</strong> parameters.<br><strong>RegionNo</strong> indicates instance ID of the region to which the IP address belongs. <strong>ResourceInstanceId</strong> indicates instance ID of the instance to which the IP address belongs. <strong>ResourceInstanceName</strong> indicates the name of the instance to which the IP address belongs. <strong>ResourcePrivateIP</strong> indicates the IP address.</p>
         */
        @NameInMap("ResourcePrivateIPList")
        public java.util.List<DescribeRiskEventGroupResponseBodyDataListResourcePrivateIPList> resourcePrivateIPList;

        /**
         * <p>The public IP address type of the intrusion prevention event. Valid values:</p>
         * <ul>
         * <li><strong>EIP</strong>: Elastic IP address.</li>
         * <li><strong>EcsPublicIP</strong>: The public IP addresses of Elastic Compute Service (ECS) instances.</li>
         * <li><strong>EcsEIP</strong>: EIP of an ECS instance.</li>
         * <li><strong>NatPublicIP</strong>: Public IP address of a NAT gateway.</li>
         * <li><strong>NatEIP</strong>: EIP of a NAT gateway.</li>
         * <li><strong>SlbPublicIp</strong>: Public IP address of an SLB instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EcsPublicIP</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The ID of the protection rule for the intrusion prevention event.</p>
         * 
         * <strong>example:</strong>
         * <p>1000****</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The defense status. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Alert.</li>
         * <li><strong>2</strong>: Block.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("RuleResult")
        public Integer ruleResult;

        /**
         * <p>The source of the detection rule for the intrusion prevention event. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Basic protection.</li>
         * <li><strong>2</strong>: Virtual Patches.</li>
         * <li><strong>4</strong>: Threat intelligence.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RuleSource")
        public Integer ruleSource;

        /**
         * <p>The queried source IP address. This indicates that the intrusion prevention event includes this source IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>192.0.XX.XX</p>
         */
        @NameInMap("SrcIP")
        public String srcIP;

        /**
         * <p>The source IP address label, which serves as the identity indicating whether the IP address is one of the back-to-origin IP addresses of a cloud service.</p>
         * 
         * <strong>example:</strong>
         * <p>WAF Back-to-origin Address</p>
         */
        @NameInMap("SrcIPTag")
        @Deprecated
        public String srcIPTag;

        /**
         * <p>The list of IP address tags.</p>
         */
        @NameInMap("SrcIPTags")
        public java.util.List<String> srcIPTags;

        /**
         * <p>The list of source private IP addresses for the intrusion prevention event.</p>
         */
        @NameInMap("SrcPrivateIPList")
        public java.util.List<String> srcPrivateIPList;

        /**
         * <p>The label of intelligence tags for critical event protection.</p>
         * 
         * <strong>example:</strong>
         * <p>test-tag</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The destination VPC information of the intrusion prevention event. The structure includes the <strong>EcsInstanceId</strong>, <strong>EcsInstanceName</strong>, <strong>NetworkInstanceId</strong>, <strong>NetworkInstanceName</strong>, and <strong>RegionNo</strong> parameters.<br><strong>EcsInstanceId</strong> indicates the instance ID of the ECS instance in the VPC. <strong>EcsInstanceName</strong> indicates the name of the ECS instance in the VPC. <strong>NetworkInstanceId</strong> indicates the instance ID of the VPC-connected instance. <strong>NetworkInstanceName</strong> indicates the name of the VPC-connected instance. <strong>RegionNo</strong> indicates the ID of the region to which the VPC-connected instance belongs.</p>
         */
        @NameInMap("VpcDstInfo")
        public DescribeRiskEventGroupResponseBodyDataListVpcDstInfo vpcDstInfo;

        /**
         * <p>The source VPC information of the intrusion prevention event. The structure includes the <strong>EcsInstanceId</strong>, <strong>EcsInstanceName</strong>, <strong>NetworkInstanceId</strong>, <strong>NetworkInstanceName</strong>, and <strong>RegionNo</strong> parameters.<br><strong>EcsInstanceId</strong> indicates the instance ID of the ECS instance in the VPC. <strong>EcsInstanceName</strong> indicates the name of the ECS instance in the VPC. <strong>NetworkInstanceId</strong> indicates the instance ID of the VPC-connected instance. <strong>NetworkInstanceName</strong> indicates the name of the VPC-connected instance. <strong>RegionNo</strong> indicates the ID of the region to which the VPC-connected instance belongs.</p>
         */
        @NameInMap("VpcSrcInfo")
        public DescribeRiskEventGroupResponseBodyDataListVpcSrcInfo vpcSrcInfo;

        /**
         * <p>The security level of the intrusion prevention event. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Low-risk.</li>
         * <li><strong>2</strong>: Medium-risk.</li>
         * <li><strong>3</strong>: High-risk.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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

        @Deprecated
        public DescribeRiskEventGroupResponseBodyDataList setSrcIPTag(String srcIPTag) {
            this.srcIPTag = srcIPTag;
            return this;
        }
        public String getSrcIPTag() {
            return this.srcIPTag;
        }

        public DescribeRiskEventGroupResponseBodyDataList setSrcIPTags(java.util.List<String> srcIPTags) {
            this.srcIPTags = srcIPTags;
            return this;
        }
        public java.util.List<String> getSrcIPTags() {
            return this.srcIPTags;
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
