// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeRiskEventGroupResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the details of the intrusion events.</p>
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
         * <p>The ID of the city to which the IP address belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>510100</p>
         */
        @NameInMap("CityId")
        public String cityId;

        /**
         * <p>The name of the city to which the IP address belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>Chengdu, Sichuan Province</p>
         */
        @NameInMap("CityName")
        public String cityName;

        /**
         * <p>The ID of the country to which the IP address belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>CN</p>
         */
        @NameInMap("CountryId")
        public String countryId;

        /**
         * <p>The name of the country to which the IP address belongs.</p>
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
         * <p>The ID of the region to which the private IP address belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionNo")
        public String regionNo;

        /**
         * <p>The ID of the instance that uses the private IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>i-wz92jf4scg2zb74p****</p>
         */
        @NameInMap("ResourceInstanceId")
        public String resourceInstanceId;

        /**
         * <p>The name of the instance that uses the private IP address.</p>
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
         * <p>The ID of the region in which the destination VPC resides.</p>
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
         * <p>The ID of the region in which the source VPC resides.</p>
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
         * <p>The attack type of the intrusion event. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: suspicious connection</li>
         * <li><strong>2</strong>: command execution</li>
         * <li><strong>3</strong>: brute-force attack</li>
         * <li><strong>4</strong>: scanning</li>
         * <li><strong>5</strong>: others</li>
         * <li><strong>6</strong>: information leak</li>
         * <li><strong>7</strong>: DoS attack</li>
         * <li><strong>8</strong>: buffer overflow attack</li>
         * <li><strong>9</strong>: web attack</li>
         * <li><strong>10</strong>: trojan backdoor</li>
         * <li><strong>11</strong>: computer worm</li>
         * <li><strong>12</strong>: mining</li>
         * <li><strong>13</strong>: reverse shell</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AttackType")
        public Integer attackType;

        /**
         * <p>The description of the intrusion event.</p>
         * 
         * <strong>example:</strong>
         * <p>Path traversal attacks are detected in the web access requests over HTTP.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The direction of the traffic for the intrusion event. Valid values:</p>
         * <ul>
         * <li><strong>in</strong>: inbound</li>
         * <li><strong>out</strong>: outbound</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>in</p>
         */
        @NameInMap("Direction")
        public String direction;

        /**
         * <p>The destination IP address that is included in the intrusion event.</p>
         * 
         * <strong>example:</strong>
         * <p>192.0.XX.XX</p>
         */
        @NameInMap("DstIP")
        public String dstIP;

        /**
         * <p>The number of intrusion events.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("EventCount")
        public Integer eventCount;

        /**
         * <p>The ID of the intrusion event.</p>
         * 
         * <strong>example:</strong>
         * <p>2b58efae-4c4b-4d96-9544-a586fb1f****</p>
         */
        @NameInMap("EventId")
        public String eventId;

        /**
         * <p>The name of the intrusion event.</p>
         * 
         * <strong>example:</strong>
         * <p>Path traversal attack</p>
         */
        @NameInMap("EventName")
        public String eventName;

        /**
         * <p>The time when the intrusion event was first detected. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1534408189</p>
         */
        @NameInMap("FirstEventTime")
        public Integer firstEventTime;

        /**
         * <p>The geographical information about the IP address. The value is a struct that contains the following parameters: <strong>CityId</strong>, <strong>CityName</strong>, <strong>CountryId</strong>, and <strong>CountryName</strong>.\</p>
         * <hr>
         */
        @NameInMap("IPLocationInfo")
        public DescribeRiskEventGroupResponseBodyDataListIPLocationInfo IPLocationInfo;

        /**
         * <p>The time when the intrusion event was last detected. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1534408267</p>
         */
        @NameInMap("LastEventTime")
        public Integer lastEventTime;

        /**
         * <p>The information about the private IP address in the intrusion event. The value is an array that contains the following parameters: <strong>RegionNo</strong>, <strong>ResourceInstanceId</strong>, <strong>ResourceInstanceName</strong>, and <strong>ResourcePrivateIP</strong>.\</p>
         * <hr>
         */
        @NameInMap("ResourcePrivateIPList")
        public java.util.List<DescribeRiskEventGroupResponseBodyDataListResourcePrivateIPList> resourcePrivateIPList;

        /**
         * <p>The type of the public IP address in the intrusion event. Valid values:</p>
         * <ul>
         * <li><strong>EIP</strong>: the elastic IP address (EIP)</li>
         * <li><strong>EcsPublicIP</strong>: the public IP address of an Elastic Compute Service (ECS) instance</li>
         * <li><strong>EcsEIP</strong>: the EIP of an ECS instance</li>
         * <li><strong>NatPublicIP</strong>: the public IP address of a NAT gateway</li>
         * <li><strong>NatEIP</strong>: the EIP of a NAT gateway</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EcsPublicIP</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The ID of the rule that is used to detect the intrusion event.</p>
         * 
         * <strong>example:</strong>
         * <p>1000****</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The status of the firewall. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: alerting</li>
         * <li><strong>2</strong>: blocking</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("RuleResult")
        public Integer ruleResult;

        /**
         * <p>The module of the rule that is used to detect the intrusion event. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: basic protection</li>
         * <li><strong>2</strong>: virtual patching</li>
         * <li><strong>4</strong>: threat intelligence</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RuleSource")
        public Integer ruleSource;

        /**
         * <p>The source IP address that is included in the intrusion event.</p>
         * 
         * <strong>example:</strong>
         * <p>192.0.XX.XX</p>
         */
        @NameInMap("SrcIP")
        public String srcIP;

        /**
         * <p>The tag added to the source IP address. The tag helps identify whether the source IP address is a back-to-origin IP address for a cloud service.</p>
         * 
         * <strong>example:</strong>
         * <p>WAF Back-to-origin Address</p>
         */
        @NameInMap("SrcIPTag")
        @Deprecated
        public String srcIPTag;

        /**
         * <p>An array that consists of the source private IP addresses in the intrusion event.</p>
         */
        @NameInMap("SrcPrivateIPList")
        public java.util.List<String> srcPrivateIPList;

        /**
         * <p>The tag added to the threat intelligence that is provided for major events.</p>
         * 
         * <strong>example:</strong>
         * <p>Threat intelligence provided for major events</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The information about the destination VPC of the intrusion event. The value is a struct that contains the following parameters: <strong>EcsInstanceId</strong>, <strong>EcsInstanceName</strong>, <strong>NetworkInstanceId</strong>, <strong>NetworkInstanceName</strong>, and <strong>RegionNo</strong>.\</p>
         * <hr>
         */
        @NameInMap("VpcDstInfo")
        public DescribeRiskEventGroupResponseBodyDataListVpcDstInfo vpcDstInfo;

        /**
         * <p>The information about the source VPC of the intrusion event. The value is a struct that contains the following parameters: <strong>EcsInstanceId</strong>, <strong>EcsInstanceName</strong>, <strong>NetworkInstanceId</strong>, <strong>NetworkInstanceName</strong>, and <strong>RegionNo</strong>.\</p>
         * <hr>
         */
        @NameInMap("VpcSrcInfo")
        public DescribeRiskEventGroupResponseBodyDataListVpcSrcInfo vpcSrcInfo;

        /**
         * <p>The risk level of the intrusion event. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: low</li>
         * <li><strong>2</strong>: medium</li>
         * <li><strong>3</strong>: high</li>
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
