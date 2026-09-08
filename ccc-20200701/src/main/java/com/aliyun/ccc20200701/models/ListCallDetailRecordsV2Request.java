// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListCallDetailRecordsV2Request extends TeaModel {
    /**
     * <p>The list of visitor channel types.</p>
     * <p>Valid values:</p>
     * <p>Web: web page.</p>
     * <p>DingTalkServiceWindow: DingTalk service window.</p>
     * <p>AliMe: chatbot.</p>
     * <p>DingTalkRobot: DingTalk chatbot.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;Web&quot;,&quot;AliMe&quot;]</p>
     */
    @NameInMap("AccessChannelTypeList")
    public String accessChannelTypeList;

    /**
     * <p>The ID of the agent.</p>
     * 
     * <strong>example:</strong>
     * <p>agent@ccc-test</p>
     */
    @NameInMap("AgentId")
    public String agentId;

    /**
     * <p>Indicates whether the AI post-call analytics report is ready.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AnalyticsReportReady")
    public Boolean analyticsReportReady;

    /**
     * <p>The intermediate number. The number must be an available outbound number under the instance. In a back-to-back call, this number is used to call the caller and the callee sequentially.</p>
     * 
     * <strong>example:</strong>
     * <p>021****4972</p>
     */
    @NameInMap("Broker")
    public String broker;

    /**
     * <p>The called number.</p>
     * 
     * <strong>example:</strong>
     * <p>191***9993</p>
     */
    @NameInMap("CalledNumber")
    public String calledNumber;

    /**
     * <p>The calling number.</p>
     * 
     * <strong>example:</strong>
     * <p>191***9993</p>
     */
    @NameInMap("CallingNumber")
    public String callingNumber;

    /**
     * <p>Filters results by hangup cause.</p>
     * <p>Valid values:</p>
     * <p>AbandonedInQueue: Abandoned while queuing.</p>
     * <p>NoAnswer: Customer did not answer.</p>
     * <p>QueuingTimeout: Queuing timed out.</p>
     * <p>Voicemail: Transferred to voice mail.</p>
     * <p>QueuingFailed: Transfer to agent failed.</p>
     * <p>QueuingOverflow: Queue overflow.</p>
     * <p>AbandonedInVoiceNavigator: Abandoned during intelligent navigation.</p>
     * <p>Success: Ended normally.</p>
     * <p>IVRException: IVR exception.</p>
     * <p>AbandonedInRing: Abandoned while ringing.</p>
     * <p>AbandonedInIVR: Abandoned in IVR.</p>
     * <p>Reject: Customer rejected the call.</p>
     * <p>ForwardToOutsideNumber: Forwarded to an external number.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;Success&quot;,&quot;NoAnswer&quot;]</p>
     */
    @NameInMap("ContactDispositionList")
    public String contactDispositionList;

    /**
     * <p>The list of call IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;job-123456789&quot;,&quot;job-234567891&quot;]</p>
     */
    @NameInMap("ContactIdList")
    public String contactIdList;

    /**
     * <p>Filters results by call type.</p>
     * <p>Valid values:</p>
     * <p>OUTBOUND: outbound call.</p>
     * <p>BACK2BACK: back-to-back call.</p>
     * <p>PRIVACY_DIAL: encrypted call.</p>
     * <p>INTERNAL: internal call.</p>
     * <p>PREDICTIVE: predictive outbound call.</p>
     * <p>INBOUND: inbound call.</p>
     * <p>CONFERENCE: conference call.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;INBOUND&quot;,&quot;OUTBOUND&quot;]</p>
     */
    @NameInMap("ContactTypeList")
    public String contactTypeList;

    /**
     * <p>Filters results by the reason for unanswered calls.</p>
     * <p>Valid values:</p>
     * <p>NoAnswer: No answer.</p>
     * <p>OutOfService: Out of service.</p>
     * <p>NotExist: Number does not exist.</p>
     * <p>Restricted: Call restricted.</p>
     * <p>Busy: Line busy.</p>
     * <p>NotConnected: Cannot be connected.</p>
     * <p>PowerOff: Phone powered off.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;NotConnected&quot;,&quot;NoAnswer&quot;]</p>
     */
    @NameInMap("EarlyMediaStateList")
    public String earlyMediaStateList;

    /**
     * <p>The end time of the historical data to retrieve. The default value is the current time. The value is a UNIX timestamp. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1657879880010</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The ID of the first agent who participated in the call.</p>
     * 
     * <strong>example:</strong>
     * <p>agent@ccc-test</p>
     */
    @NameInMap("FirstAgentId")
    public String firstAgentId;

    /**
     * <p>The instance ID of the call center.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The media type.</p>
     * <p>Valid values:</p>
     * <p>AUDIO: voice call.</p>
     * <p>VIDEO: video call.</p>
     * <p>CHAT: message.</p>
     * <p>ALL: all types.</p>
     * 
     * <strong>example:</strong>
     * <p>AUDIO</p>
     */
    @NameInMap("MediaType")
    public String mediaType;

    /**
     * <p>The phone number.</p>
     * 
     * <strong>example:</strong>
     * <p>191***9993</p>
     */
    @NameInMap("Number")
    public String number;

    /**
     * <p>The field by which to sort the results. This parameter is optional. Default value: startTime (call start time).</p>
     * <p>Valid values:</p>
     * <p>startTime: call start time.</p>
     * 
     * <strong>example:</strong>
     * <p>startTime</p>
     */
    @NameInMap("OrderByField")
    public String orderByField;

    /**
     * <p>The page number. Valid values: 1 to 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The party that hung up.</p>
     * 
     * <strong>example:</strong>
     * <p>[\&quot;AGENT\&quot;]</p>
     */
    @NameInMap("ReleaseInitiatorList")
    public String releaseInitiatorList;

    /**
     * <p>The hangup reason.</p>
     * 
     * <strong>example:</strong>
     * <p>[\&quot;VisitorInitiatedClosure\&quot;,\&quot;AgentInitiatedClosure\&quot;]</p>
     */
    @NameInMap("ReleaseReasonList")
    public String releaseReasonList;

    /**
     * <p>Filters results by satisfaction description. The description content is defined by the customer.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;Satisfied&quot;,&quot;Average&quot;]</p>
     */
    @NameInMap("SatisfactionDescriptionList")
    public String satisfactionDescriptionList;

    /**
     * <p>Filters results by satisfaction rating. Separate multiple satisfaction ratings with commas (,).</p>
     * <p>Valid values:</p>
     * <p>-2: Not sent.</p>
     * <p>-1: Not rated.</p>
     * <p>Other positive numbers: custom satisfaction rating values.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;-1&quot;,&quot;3&quot;]
     * [&quot;&gt;2&quot;]
     * [&quot;&lt;3&quot;]</p>
     */
    @NameInMap("SatisfactionRateList")
    public String satisfactionRateList;

    /**
     * <p>The satisfaction survey channel.</p>
     * <p>Valid values:</p>
     * <p>IVR: voice-based satisfaction survey.</p>
     * <p>SMS: SMS-based satisfaction survey.</p>
     * <p>CHAT: message-based satisfaction survey.</p>
     * 
     * <strong>example:</strong>
     * <p>IVR</p>
     */
    @NameInMap("SatisfactionSurveyChannel")
    public String satisfactionSurveyChannel;

    /**
     * <p>The custom query text that follows the Lucene query syntax.</p>
     * <p>The following table describes the supported query fields and query types:</p>
     * <p>accessChannelUserId: the visitor ID. Supports exact match and fuzzy match.</p>
     * <p>accessChannelName: the channel name. Supports exact match and fuzzy match.</p>
     * <p>text: the session text. Supports fuzzy match.</p>
     * 
     * <strong>example:</strong>
     * <p>text:please wait AND accessChannelUserId:af1a0-afaa-5086e2946e0b* AND accessChannelName:dedicated development channel*</p>
     */
    @NameInMap("SearchPattern")
    public String searchPattern;

    /**
     * <p>The list of skill group IDs to which the agent belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>[
     *       &quot;skg1@ccc-test&quot;,
     *       &quot;skg2@ccc-test&quot;
     * ]</p>
     */
    @NameInMap("SkillGroupIdList")
    public String skillGroupIdList;

    /**
     * <p>The sort order. Default value: DESC.</p>
     * <p>Valid values:</p>
     * <p>ASC: ascending order.</p>
     * <p>DESC: descending order.</p>
     * 
     * <strong>example:</strong>
     * <p>DESC</p>
     */
    @NameInMap("SortOrder")
    public String sortOrder;

    /**
     * <p>The start time of the historical data to retrieve. The default value is 00:00 of the current day. The value is a UNIX timestamp. Unit: milliseconds.</p>
     * 
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
