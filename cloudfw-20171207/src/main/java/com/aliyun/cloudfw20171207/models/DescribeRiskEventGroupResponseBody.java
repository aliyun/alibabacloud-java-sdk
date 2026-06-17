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
         * <p>The city ID.</p>
         * 
         * <strong>example:</strong>
         * <p>510100</p>
         */
        @NameInMap("CityId")
        public String cityId;

        /**
         * <p>The city name.</p>
         * 
         * <strong>example:</strong>
         * <p>Chengdu</p>
         */
        @NameInMap("CityName")
        public String cityName;

        /**
         * <p>The country ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CN</p>
         */
        @NameInMap("CountryId")
        public String countryId;

        /**
         * <p>The country name.</p>
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
         * <p>The region ID. This parameter indicates the region ID of the private IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionNo")
        public String regionNo;

        /**
         * <p>The ID of the instance.</p>
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
         * <p>The ID of the ECS instance.</p>
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
         * <p>The ID of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf6e9a9zyokj2ywuo****</p>
         */
        @NameInMap("NetworkInstanceId")
        public String networkInstanceId;

        /**
         * <p>The name of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>VPC-SH-TX****</p>
         */
        @NameInMap("NetworkInstanceName")
        public String networkInstanceName;

        /**
         * <p>The region ID. This parameter indicates the region ID of the destination VPC.</p>
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
         * <p>The ID of the ECS instance.</p>
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
         * <p>The ID of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf6e9a9zyokj2ywuo****</p>
         */
        @NameInMap("NetworkInstanceId")
        public String networkInstanceId;

        /**
         * <p>The name of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>VPC-SH-TX****</p>
         */
        @NameInMap("NetworkInstanceName")
        public String networkInstanceName;

        /**
         * <p>The region ID. This parameter indicates the region ID of the source VPC.</p>
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
         * <p>The type of the attack. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: abnormal connection</p>
         * </li>
         * <li><p><strong>2</strong>: command execution</p>
         * </li>
         * <li><p><strong>3</strong>: brute-force attack</p>
         * </li>
         * <li><p><strong>4</strong>: scan</p>
         * </li>
         * <li><p><strong>5</strong>: other</p>
         * </li>
         * <li><p><strong>6</strong>: information leakage</p>
         * </li>
         * <li><p><strong>7</strong>: DoS attack</p>
         * </li>
         * <li><p><strong>8</strong>: overflow attack</p>
         * </li>
         * <li><p><strong>9</strong>: web attack</p>
         * </li>
         * <li><p><strong>10</strong>: backdoor trojan</p>
         * </li>
         * <li><p><strong>11</strong>: virus or worm</p>
         * </li>
         * <li><p><strong>12</strong>: mining behavior</p>
         * </li>
         * <li><p><strong>13</strong>: reverse shell</p>
         * </li>
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
         * <li><p><strong>in</strong>: inbound</p>
         * </li>
         * <li><p><strong>out</strong>: outbound</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>in</p>
         */
        @NameInMap("Direction")
        public String direction;

        /**
         * <p>The destination IP address. The intrusion prevention event contains this destination IP address.</p>
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
         * <p>The time when the intrusion event first occurred. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1534408189</p>
         */
        @NameInMap("FirstEventTime")
        public Integer firstEventTime;

        /**
         * <p>The geolocation information of the IP address. This struct contains the <strong>CityId</strong>, <strong>CityName</strong>, <strong>CountryId</strong>, and <strong>CountryName</strong> parameters.<br>
         * <strong>CityId</strong> indicates the city ID of the IP address. <strong>CityName</strong> indicates the city name of the IP address. <strong>CountryId</strong> indicates the country ID of the IP address. <strong>CountryName</strong> indicates the country name of the IP address.<br></p>
         */
        @NameInMap("IPLocationInfo")
        public DescribeRiskEventGroupResponseBodyDataListIPLocationInfo IPLocationInfo;

        /**
         * <p>The time when the intrusion prevention event last occurred. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1534408267</p>
         */
        @NameInMap("LastEventTime")
        public Integer lastEventTime;

        /**
         * <p>The information about the private IP address in the intrusion prevention event. The value is an array that consists of the <strong>RegionNo</strong>, <strong>ResourceInstanceId</strong>, <strong>ResourceInstanceName</strong>, and <strong>ResourcePrivateIP</strong> parameters.<br>
         * <strong>RegionNo</strong> indicates the region ID of the IP address. <strong>ResourceInstanceId</strong> indicates the ID of the instance to which the IP address belongs. <strong>ResourceInstanceName</strong> indicates the name of the instance to which the IP address belongs. <strong>ResourcePrivateIP</strong> indicates the IP address.<br></p>
         */
        @NameInMap("ResourcePrivateIPList")
        public java.util.List<DescribeRiskEventGroupResponseBodyDataListResourcePrivateIPList> resourcePrivateIPList;

        /**
         * <p>The type of the public IP address. Valid values:</p>
         * <ul>
         * <li><p><strong>EIP</strong>: an elastic IP address (EIP)</p>
         * </li>
         * <li><p><strong>EcsPublicIP</strong>: an ECS public IP address</p>
         * </li>
         * <li><p><strong>EcsEIP</strong>: an ECS EIP</p>
         * </li>
         * <li><p><strong>NatPublicIP</strong>: a NAT public IP address</p>
         * </li>
         * <li><p><strong>NatEIP</strong>: a NAT EIP</p>
         * </li>
         * <li><p><strong>SlbPublicIp</strong>: an SLB public IP address</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EcsPublicIP</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The ID of the rule that is used to defend against the intrusion prevention event.</p>
         * 
         * <strong>example:</strong>
         * <p>1000****</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The handling status. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: Alert</p>
         * </li>
         * <li><p><strong>2</strong>: Block</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("RuleResult")
        public Integer ruleResult;

        /**
         * <p>The source of the rule that is used to detect the intrusion prevention event. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: basic protection</p>
         * </li>
         * <li><p><strong>2</strong>: virtual patching</p>
         * </li>
         * <li><p><strong>4</strong>: threat intelligence</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RuleSource")
        public Integer ruleSource;

        /**
         * <p>The source IP address. The intrusion prevention event contains this source IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>192.0.XX.XX</p>
         */
        @NameInMap("SrcIP")
        public String srcIP;

        /**
         * <p>The tag of the source IP address. This tag is used to identify whether the IP address is a back-to-origin IP address of an Alibaba Cloud service.</p>
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
         * <p>The list of source private IP addresses in the intrusion prevention event.</p>
         */
        @NameInMap("SrcPrivateIPList")
        public java.util.List<String> srcPrivateIPList;

        /**
         * <p>The tag for major event support.</p>
         * 
         * <strong>example:</strong>
         * <p>test-tag</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The information about the destination VPC of the intrusion prevention event. This struct contains the <strong>EcsInstanceId</strong>, <strong>EcsInstanceName</strong>, <strong>NetworkInstanceId</strong>, <strong>NetworkInstanceName</strong>, and <strong>RegionNo</strong> parameters.<br>
         * <strong>EcsInstanceId</strong> indicates the ID of the ECS instance in the VPC. <strong>EcsInstanceName</strong> indicates the name of the ECS instance in the VPC. <strong>NetworkInstanceId</strong> indicates the ID of the VPC. <strong>NetworkInstanceName</strong> indicates the name of the VPC. <strong>RegionNo</strong> indicates the region ID of the VPC.<br></p>
         */
        @NameInMap("VpcDstInfo")
        public DescribeRiskEventGroupResponseBodyDataListVpcDstInfo vpcDstInfo;

        /**
         * <p>The information about the source VPC of the intrusion prevention event. This struct contains the <strong>EcsInstanceId</strong>, <strong>EcsInstanceName</strong>, <strong>NetworkInstanceId</strong>, <strong>NetworkInstanceName</strong>, and <strong>RegionNo</strong> parameters.<br>
         * <strong>EcsInstanceId</strong> indicates the ID of the ECS instance in the VPC. <strong>EcsInstanceName</strong> indicates the name of the ECS instance in the VPC. <strong>NetworkInstanceId</strong> indicates the ID of the VPC. <strong>NetworkInstanceName</strong> indicates the name of the VPC. <strong>RegionNo</strong> indicates the region ID of the VPC.<br></p>
         */
        @NameInMap("VpcSrcInfo")
        public DescribeRiskEventGroupResponseBodyDataListVpcSrcInfo vpcSrcInfo;

        /**
         * <p>The risk level of the intrusion prevention event. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: low</p>
         * </li>
         * <li><p><strong>2</strong>: medium</p>
         * </li>
         * <li><p><strong>3</strong>: high</p>
         * </li>
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
