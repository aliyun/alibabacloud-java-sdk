// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeInvadeEventListRequest extends TeaModel {
    // 资产IP
    @NameInMap("AssetsIP")
    public String assetsIP;

    // 实例ID
    @NameInMap("AssetsInstanceId")
    public String assetsInstanceId;

    // 实例名称
    @NameInMap("AssetsInstanceName")
    public String assetsInstanceName;

    // 当前页
    @NameInMap("CurrentPage")
    public String currentPage;

    // 结束时间
    @NameInMap("EndTime")
    public String endTime;

    // 事件key
    @NameInMap("EventKey")
    public String eventKey;

    // 事件名称
    @NameInMap("EventName")
    public String eventName;

    // 事件UUID
    @NameInMap("EventUuid")
    public String eventUuid;

    // 是否忽略
    @NameInMap("IsIgnore")
    public String isIgnore;

    // 语言
    @NameInMap("Lang")
    public String lang;

    // 成员账号UID
    @NameInMap("MemberUid")
    public Long memberUid;

    // 每页多少条
    @NameInMap("PageSize")
    public String pageSize;

    // 处理状态列表
    @NameInMap("ProcessStatusList")
    public java.util.List<Integer> processStatusList;

    // 风险等级
    @NameInMap("RiskLevel")
    public java.util.List<Integer> riskLevel;

    // 源IP
    @NameInMap("SourceIp")
    public String sourceIp;

    // 开始时间
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
