// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeInvadeEventListRequest extends TeaModel {
    // The IP address of the affected asset.
    @NameInMap("AssetsIP")
    public String assetsIP;

    // The ID of the instance.
    @NameInMap("AssetsInstanceId")
    public String assetsInstanceId;

    // The name of the instance.
    @NameInMap("AssetsInstanceName")
    public String assetsInstanceName;

    // The number of the page to return.
    // 
    // Pages start from page 1. Default value: 1.
    @NameInMap("CurrentPage")
    public String currentPage;

    // The end of the time range to query. The value is a UNIX timestamp. Unit: seconds.
    @NameInMap("EndTime")
    public String endTime;

    // The ID of the breach awareness event.
    @NameInMap("EventKey")
    public String eventKey;

    // The name of the breach awareness event.
    @NameInMap("EventName")
    public String eventName;

    // The UUID of the breach awareness event.
    @NameInMap("EventUuid")
    public String eventUuid;

    // Specifies whether to ignore the breach awareness event. Valid values:
    // 
    // *   **true**: ignores the breach awareness event.
    // *   **false**: does not ignore the breach awareness event.
    @NameInMap("IsIgnore")
    public String isIgnore;

    // The language of the content within the response. Valid values:
    // 
    // *   **zh**: Chinese (default)
    // *   **en**: English
    @NameInMap("Lang")
    public String lang;

    // The ID of the member.
    @NameInMap("MemberUid")
    public Long memberUid;

    // The number of entries to return on each page.
    // 
    // Default value: 6. Maximum value: 10.
    @NameInMap("PageSize")
    public String pageSize;

    // The list of process statuses.
    @NameInMap("ProcessStatusList")
    public java.util.List<Integer> processStatusList;

    // The list of risk levels.
    @NameInMap("RiskLevel")
    public java.util.List<Integer> riskLevel;

    // The source IP address of the request.
    @NameInMap("SourceIp")
    public String sourceIp;

    // The beginning of the time range to query. The value is a UNIX timestamp. Unit: seconds.
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeInvadeEventListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInvadeEventListRequest self = new DescribeInvadeEventListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInvadeEventListRequest setAssetsIP(String assetsIP) {
        this.assetsIP = assetsIP;
        return this;
    }
    public String getAssetsIP() {
        return this.assetsIP;
    }

    public DescribeInvadeEventListRequest setAssetsInstanceId(String assetsInstanceId) {
        this.assetsInstanceId = assetsInstanceId;
        return this;
    }
    public String getAssetsInstanceId() {
        return this.assetsInstanceId;
    }

    public DescribeInvadeEventListRequest setAssetsInstanceName(String assetsInstanceName) {
        this.assetsInstanceName = assetsInstanceName;
        return this;
    }
    public String getAssetsInstanceName() {
        return this.assetsInstanceName;
    }

    public DescribeInvadeEventListRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeInvadeEventListRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeInvadeEventListRequest setEventKey(String eventKey) {
        this.eventKey = eventKey;
        return this;
    }
    public String getEventKey() {
        return this.eventKey;
    }

    public DescribeInvadeEventListRequest setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }
    public String getEventName() {
        return this.eventName;
    }

    public DescribeInvadeEventListRequest setEventUuid(String eventUuid) {
        this.eventUuid = eventUuid;
        return this;
    }
    public String getEventUuid() {
        return this.eventUuid;
    }

    public DescribeInvadeEventListRequest setIsIgnore(String isIgnore) {
        this.isIgnore = isIgnore;
        return this;
    }
    public String getIsIgnore() {
        return this.isIgnore;
    }

    public DescribeInvadeEventListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeInvadeEventListRequest setMemberUid(Long memberUid) {
        this.memberUid = memberUid;
        return this;
    }
    public Long getMemberUid() {
        return this.memberUid;
    }

    public DescribeInvadeEventListRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeInvadeEventListRequest setProcessStatusList(java.util.List<Integer> processStatusList) {
        this.processStatusList = processStatusList;
        return this;
    }
    public java.util.List<Integer> getProcessStatusList() {
        return this.processStatusList;
    }

    public DescribeInvadeEventListRequest setRiskLevel(java.util.List<Integer> riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public java.util.List<Integer> getRiskLevel() {
        return this.riskLevel;
    }

    public DescribeInvadeEventListRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeInvadeEventListRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
