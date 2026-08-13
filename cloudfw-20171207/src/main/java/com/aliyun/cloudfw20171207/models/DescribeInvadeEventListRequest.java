// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeInvadeEventListRequest extends TeaModel {
    /**
     * <p>The IP address of the affected asset.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.XX.XX</p>
     */
    @NameInMap("AssetsIP")
    public String assetsIP;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ins_1321_asedb_****</p>
     */
    @NameInMap("AssetsInstanceId")
    public String assetsInstanceId;

    /**
     * <p>The instance name.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS_test</p>
     */
    @NameInMap("AssetsInstanceName")
    public String assetsInstanceName;

    /**
     * <p>Specifies the page number to return in a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    /**
     * <p>Specifies the end time of the query. The value is a UNIX timestamp in seconds. If this parameter is not specified, the current time is used.</p>
     * 
     * <strong>example:</strong>
     * <p>1656837360</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the compromise awareness event.</p>
     * 
     * <strong>example:</strong>
     * <p>69d189e2-ec17-4676-a2fe-02969234****</p>
     */
    @NameInMap("EventKey")
    public String eventKey;

    /**
     * <p>The name of the compromise awareness event.</p>
     * 
     * <strong>example:</strong>
     * <p>event_test</p>
     */
    @NameInMap("EventName")
    public String eventName;

    /**
     * <p>The UUID of the compromise awareness event.</p>
     * 
     * <strong>example:</strong>
     * <p>fadd-dfdd-****</p>
     */
    @NameInMap("EventUuid")
    public String eventUuid;

    /**
     * <p>Specifies whether the compromise awareness event is ignored. Valid values:</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsIgnore")
    public String isIgnore;

    /**
     * <p>The language type of the received message. Valid values:</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The UID of the member accounts.</p>
     * 
     * <strong>example:</strong>
     * <p>135809047715****</p>
     */
    @NameInMap("MemberUid")
    public Long memberUid;

    /**
     * <p>Specifies the number of entries per page in a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The list of processing statuses.</p>
     * 
     * <strong>example:</strong>
     * <p>1358090477156271</p>
     */
    @NameInMap("ProcessStatusList")
    public java.util.List<Integer> processStatusList;

    /**
     * <p>The risk assessment level.</p>
     */
    @NameInMap("RiskLevel")
    public java.util.List<Integer> riskLevel;

    /**
     * <p>The source IP address of the requester.</p>
     * 
     * <strong>example:</strong>
     * <p>192.0.XX.XX</p>
     */
    @NameInMap("SourceIp")
    @Deprecated
    public String sourceIp;

    /**
     * <p>Specifies the start time of the query. The value is a UNIX timestamp in seconds. If this parameter is not specified, the query starts from the last 30 days.</p>
     * 
     * <strong>example:</strong>
     * <p>1656750960</p>
     */
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

    @Deprecated
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
