// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeRiskEventGroupResponseBody extends TeaModel {
    @NameInMap("DataList")
    public java.util.List<DescribeRiskEventGroupResponseBodyDataList> dataList;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("CityId")
        public String cityId;

        @NameInMap("CityName")
        public String cityName;

        @NameInMap("CountryId")
        public String countryId;

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
        @NameInMap("RegionNo")
        public String regionNo;

        @NameInMap("ResourceInstanceId")
        public String resourceInstanceId;

        @NameInMap("ResourceInstanceName")
        public String resourceInstanceName;

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
        @NameInMap("EcsInstanceId")
        public String ecsInstanceId;

        @NameInMap("EcsInstanceName")
        public String ecsInstanceName;

        @NameInMap("NetworkInstanceId")
        public String networkInstanceId;

        @NameInMap("NetworkInstanceName")
        public String networkInstanceName;

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
        @NameInMap("EcsInstanceId")
        public String ecsInstanceId;

        @NameInMap("EcsInstanceName")
        public String ecsInstanceName;

        @NameInMap("NetworkInstanceId")
        public String networkInstanceId;

        @NameInMap("NetworkInstanceName")
        public String networkInstanceName;

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
        @NameInMap("AttackApp")
        public String attackApp;

        @NameInMap("AttackType")
        public Integer attackType;

        @NameInMap("Description")
        public String description;

        @NameInMap("Direction")
        public String direction;

        @NameInMap("DstIP")
        public String dstIP;

        @NameInMap("EventCount")
        public Integer eventCount;

        @NameInMap("EventId")
        public String eventId;

        @NameInMap("EventName")
        public String eventName;

        @NameInMap("FirstEventTime")
        public Integer firstEventTime;

        @NameInMap("IPLocationInfo")
        public DescribeRiskEventGroupResponseBodyDataListIPLocationInfo IPLocationInfo;

        @NameInMap("LastEventTime")
        public Integer lastEventTime;

        @NameInMap("ResourcePrivateIPList")
        public java.util.List<DescribeRiskEventGroupResponseBodyDataListResourcePrivateIPList> resourcePrivateIPList;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("RuleId")
        public String ruleId;

        @NameInMap("RuleResult")
        public Integer ruleResult;

        @NameInMap("RuleSource")
        public Integer ruleSource;

        @NameInMap("SrcIP")
        public String srcIP;

        @NameInMap("SrcPrivateIPList")
        public java.util.List<String> srcPrivateIPList;

        @NameInMap("Tag")
        public String tag;

        @NameInMap("VpcDstInfo")
        public DescribeRiskEventGroupResponseBodyDataListVpcDstInfo vpcDstInfo;

        @NameInMap("VpcSrcInfo")
        public DescribeRiskEventGroupResponseBodyDataListVpcSrcInfo vpcSrcInfo;

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
