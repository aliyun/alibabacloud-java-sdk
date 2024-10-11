// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListCallDetailRecordsV2Request extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[&quot;Web&quot;,&quot;AliMe&quot;]</p>
     */
    @NameInMap("AccessChannelTypeList")
    public String accessChannelTypeList;

    /**
     * <strong>example:</strong>
     * <p>agent@ccc-test</p>
     */
    @NameInMap("AgentId")
    public String agentId;

    @NameInMap("AnalyticsReportReady")
    public Boolean analyticsReportReady;

    /**
     * <strong>example:</strong>
     * <p>021****4972</p>
     */
    @NameInMap("Broker")
    public String broker;

    /**
     * <strong>example:</strong>
     * <p>191***9993</p>
     */
    @NameInMap("CalledNumber")
    public String calledNumber;

    /**
     * <strong>example:</strong>
     * <p>191***9993</p>
     */
    @NameInMap("CallingNumber")
    public String callingNumber;

    /**
     * <strong>example:</strong>
     * <p>[&quot;Success&quot;,&quot;NoAnswer&quot;]</p>
     */
    @NameInMap("ContactDispositionList")
    public String contactDispositionList;

    /**
     * <strong>example:</strong>
     * <p>[&quot;job-123456789&quot;,&quot;job-234567891&quot;]</p>
     */
    @NameInMap("ContactIdList")
    public String contactIdList;

    /**
     * <strong>example:</strong>
     * <p>[&quot;INBOUND&quot;,&quot;OUTBOUND&quot;]</p>
     */
    @NameInMap("ContactTypeList")
    public String contactTypeList;

    /**
     * <strong>example:</strong>
     * <p>[&quot;NotConnected&quot;,&quot;NoAnswer&quot;]</p>
     */
    @NameInMap("EarlyMediaStateList")
    public String earlyMediaStateList;

    /**
     * <strong>example:</strong>
     * <p>1657879880010</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <strong>example:</strong>
     * <p>agent@ccc-test</p>
     */
    @NameInMap("FirstAgentId")
    public String firstAgentId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>AUDIO</p>
     */
    @NameInMap("MediaType")
    public String mediaType;

    /**
     * <strong>example:</strong>
     * <p>191***9993</p>
     */
    @NameInMap("Number")
    public String number;

    /**
     * <strong>example:</strong>
     * <p>startTime</p>
     */
    @NameInMap("OrderByField")
    public String orderByField;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ReleaseInitiatorList")
    public String releaseInitiatorList;

    @NameInMap("ReleaseReasonList")
    public String releaseReasonList;

    @NameInMap("SatisfactionDescriptionList")
    public String satisfactionDescriptionList;

    /**
     * <strong>example:</strong>
     * <p>[&quot;1&quot;,&quot;3&quot;]</p>
     */
    @NameInMap("SatisfactionRateList")
    public String satisfactionRateList;

    /**
     * <strong>example:</strong>
     * <p>IVR</p>
     */
    @NameInMap("SatisfactionSurveyChannel")
    public String satisfactionSurveyChannel;

    @NameInMap("SearchPattern")
    public String searchPattern;

    /**
     * <strong>example:</strong>
     * <p>[
     *       &quot;skg1@ccc-test&quot;,
     *       &quot;skg2@ccc-test&quot;
     * ]</p>
     */
    @NameInMap("SkillGroupIdList")
    public String skillGroupIdList;

    /**
     * <strong>example:</strong>
     * <p>DESC</p>
     */
    @NameInMap("SortOrder")
    public String sortOrder;

    /**
     * <strong>example:</strong>
     * <p>1657853640015</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static ListCallDetailRecordsV2Request build(java.util.Map<String, ?> map) throws Exception {
        ListCallDetailRecordsV2Request self = new ListCallDetailRecordsV2Request();
        return TeaModel.build(map, self);
    }

    public ListCallDetailRecordsV2Request setAccessChannelTypeList(String accessChannelTypeList) {
        this.accessChannelTypeList = accessChannelTypeList;
        return this;
    }
    public String getAccessChannelTypeList() {
        return this.accessChannelTypeList;
    }

    public ListCallDetailRecordsV2Request setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public ListCallDetailRecordsV2Request setAnalyticsReportReady(Boolean analyticsReportReady) {
        this.analyticsReportReady = analyticsReportReady;
        return this;
    }
    public Boolean getAnalyticsReportReady() {
        return this.analyticsReportReady;
    }

    public ListCallDetailRecordsV2Request setBroker(String broker) {
        this.broker = broker;
        return this;
    }
    public String getBroker() {
        return this.broker;
    }

    public ListCallDetailRecordsV2Request setCalledNumber(String calledNumber) {
        this.calledNumber = calledNumber;
        return this;
    }
    public String getCalledNumber() {
        return this.calledNumber;
    }

    public ListCallDetailRecordsV2Request setCallingNumber(String callingNumber) {
        this.callingNumber = callingNumber;
        return this;
    }
    public String getCallingNumber() {
        return this.callingNumber;
    }

    public ListCallDetailRecordsV2Request setContactDispositionList(String contactDispositionList) {
        this.contactDispositionList = contactDispositionList;
        return this;
    }
    public String getContactDispositionList() {
        return this.contactDispositionList;
    }

    public ListCallDetailRecordsV2Request setContactIdList(String contactIdList) {
        this.contactIdList = contactIdList;
        return this;
    }
    public String getContactIdList() {
        return this.contactIdList;
    }

    public ListCallDetailRecordsV2Request setContactTypeList(String contactTypeList) {
        this.contactTypeList = contactTypeList;
        return this;
    }
    public String getContactTypeList() {
        return this.contactTypeList;
    }

    public ListCallDetailRecordsV2Request setEarlyMediaStateList(String earlyMediaStateList) {
        this.earlyMediaStateList = earlyMediaStateList;
        return this;
    }
    public String getEarlyMediaStateList() {
        return this.earlyMediaStateList;
    }

    public ListCallDetailRecordsV2Request setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListCallDetailRecordsV2Request setFirstAgentId(String firstAgentId) {
        this.firstAgentId = firstAgentId;
        return this;
    }
    public String getFirstAgentId() {
        return this.firstAgentId;
    }

    public ListCallDetailRecordsV2Request setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListCallDetailRecordsV2Request setMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }
    public String getMediaType() {
        return this.mediaType;
    }

    public ListCallDetailRecordsV2Request setNumber(String number) {
        this.number = number;
        return this;
    }
    public String getNumber() {
        return this.number;
    }

    public ListCallDetailRecordsV2Request setOrderByField(String orderByField) {
        this.orderByField = orderByField;
        return this;
    }
    public String getOrderByField() {
        return this.orderByField;
    }

    public ListCallDetailRecordsV2Request setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCallDetailRecordsV2Request setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCallDetailRecordsV2Request setReleaseInitiatorList(String releaseInitiatorList) {
        this.releaseInitiatorList = releaseInitiatorList;
        return this;
    }
    public String getReleaseInitiatorList() {
        return this.releaseInitiatorList;
    }

    public ListCallDetailRecordsV2Request setReleaseReasonList(String releaseReasonList) {
        this.releaseReasonList = releaseReasonList;
        return this;
    }
    public String getReleaseReasonList() {
        return this.releaseReasonList;
    }

    public ListCallDetailRecordsV2Request setSatisfactionDescriptionList(String satisfactionDescriptionList) {
        this.satisfactionDescriptionList = satisfactionDescriptionList;
        return this;
    }
    public String getSatisfactionDescriptionList() {
        return this.satisfactionDescriptionList;
    }

    public ListCallDetailRecordsV2Request setSatisfactionRateList(String satisfactionRateList) {
        this.satisfactionRateList = satisfactionRateList;
        return this;
    }
    public String getSatisfactionRateList() {
        return this.satisfactionRateList;
    }

    public ListCallDetailRecordsV2Request setSatisfactionSurveyChannel(String satisfactionSurveyChannel) {
        this.satisfactionSurveyChannel = satisfactionSurveyChannel;
        return this;
    }
    public String getSatisfactionSurveyChannel() {
        return this.satisfactionSurveyChannel;
    }

    public ListCallDetailRecordsV2Request setSearchPattern(String searchPattern) {
        this.searchPattern = searchPattern;
        return this;
    }
    public String getSearchPattern() {
        return this.searchPattern;
    }

    public ListCallDetailRecordsV2Request setSkillGroupIdList(String skillGroupIdList) {
        this.skillGroupIdList = skillGroupIdList;
        return this;
    }
    public String getSkillGroupIdList() {
        return this.skillGroupIdList;
    }

    public ListCallDetailRecordsV2Request setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public ListCallDetailRecordsV2Request setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
