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
     * <p>The ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ins_1321_asedb_****</p>
     */
    @NameInMap("AssetsInstanceId")
    public String assetsInstanceId;

    /**
     * <p>The name of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS_test</p>
     */
    @NameInMap("AssetsInstanceName")
    public String assetsInstanceName;

    /**
     * <p>The number of the page to return.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    /**
     * <p>The end of the time range to query. The value is a UNIX timestamp. Unit: seconds. If you do not specify this parameter, the query ends at the current time.</p>
     * 
     * <strong>example:</strong>
     * <p>1656837360</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the breach awareness event.</p>
     * 
     * <strong>example:</strong>
     * <p>69d189e2-ec17-4676-a2fe-02969234****</p>
     */
    @NameInMap("EventKey")
    public String eventKey;

    /**
     * <p>The name of the breach awareness event.</p>
     * 
     * <strong>example:</strong>
     * <p>event_test</p>
     */
    @NameInMap("EventName")
    public String eventName;

    /**
     * <p>The UUID of the breach awareness event.</p>
     * 
     * <strong>example:</strong>
     * <p>fadd-dfdd-****</p>
     */
    @NameInMap("EventUuid")
    public String eventUuid;

    /**
     * <p>Specifies whether the breach awareness event is ignored. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The breach awareness event is ignored.</li>
     * <li><strong>false</strong>: The breach awareness event is not ignored.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsIgnore")
    public String isIgnore;

    /**
     * <p>The language of the content within the response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese (default)</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the member.</p>
     * 
     * <strong>example:</strong>
     * <p>135809047715****</p>
     */
    @NameInMap("MemberUid")
    public Long memberUid;

    /**
     * <p>The number of entries to return on each page.</p>
     * <p>Default value: 6. Maximum value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The handling status of breach awareness events.</p>
     */
    @NameInMap("ProcessStatusList")
    public java.util.List<Integer> processStatusList;

    /**
     * <p>The risk levels.</p>
     */
    @NameInMap("RiskLevel")
    public java.util.List<Integer> riskLevel;

    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>192.0.XX.XX</p>
     */
    @NameInMap("SourceIp")
    @Deprecated
    public String sourceIp;

    /**
     * <p>The beginning of the time range to query. The value is a UNIX timestamp. Unit: seconds. If you do not specify this parameter, the query starts from 30 days before the current time.</p>
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
