// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListCallDetailRecordsRequest extends TeaModel {
    /**
     * <p>Filter by agent ID.</p>
     * 
     * <strong>example:</strong>
     * <p>agent@ccc-test</p>
     */
    @NameInMap("AgentId")
    public String agentId;

    /**
     * <p>Filter by called number.</p>
     * 
     * <strong>example:</strong>
     * <p>1320523****</p>
     */
    @NameInMap("CalledNumber")
    public String calledNumber;

    /**
     * <p>Filter by calling number.</p>
     * 
     * <strong>example:</strong>
     * <p>07353988****</p>
     */
    @NameInMap("CallingNumber")
    public String callingNumber;

    /**
     * <p>Filter by disposition type. Note: Disposition reasons such as voicemail, transfer to agent failed, queuing timeout, queuing overflow, and IVR abnormal are only displayed if the customer has configured a disposition reason node. If no such node is configured and there is no transfer-to-agent module in the IVR, the disposition reason defaults to &quot;Abandoned in IVR&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("ContactDisposition")
    public String contactDisposition;

    /**
     * <p>Filter by hang-up reason list.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;Success&quot;,&quot;NoAnswer&quot;]</p>
     */
    @NameInMap("ContactDispositionList")
    public String contactDispositionList;

    /**
     * <p>Query the record of a specific call by specifying a contactId. The contactId can be obtained from the softphone software development kit (SDK) during a call. If this parameter is provided, all other query parameters are automatically ignored.</p>
     * 
     * <strong>example:</strong>
     * <p>job-12515239414412****</p>
     */
    @NameInMap("ContactId")
    public String contactId;

    /**
     * <p>Filter by call type.</p>
     * 
     * <strong>example:</strong>
     * <p>Outbound</p>
     */
    @NameInMap("ContactType")
    public String contactType;

    /**
     * <p>Filter by contact type list.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;Internal&quot;,&quot;Inbound&quot;]</p>
     */
    @NameInMap("ContactTypeList")
    public String contactTypeList;

    /**
     * <p>Perform a fuzzy query based on the calling or called number. The value must be a JSON string containing only one field, phoneNumber, which can be the full number or a partial segment of either the calling or called number.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;phoneNumber&quot;:&quot;0735&quot;}</p>
     */
    @NameInMap("Criteria")
    public String criteria;

    /**
     * <p>Filter by a list of reasons for failed connection.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;NotConnected&quot;,&quot;NoAnswer&quot;]</p>
     */
    @NameInMap("EarlyMediaStateList")
    public String earlyMediaStateList;

    /**
     * <p>End time of the historical data to retrieve. The default value is the current time, in UNIX timestamp format with millisecond precision.</p>
     * 
     * <strong>example:</strong>
     * <p>1532707199000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>Instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Sorting field. Optional. Default value is startTime (call start time).</p>
     * 
     * <strong>example:</strong>
     * <p>startTime</p>
     */
    @NameInMap("OrderByField")
    public String orderByField;

    /**
     * <p>Page number for paging, ranging from 1 to 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Page size, ranging from 1 to 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Filter by satisfaction description list. The description content is Custom by the Customer.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;满意&quot;,&quot;一般&quot;]</p>
     */
    @NameInMap("SatisfactionDescriptionList")
    public String satisfactionDescriptionList;

    /**
     * <p>Filter by satisfaction List. Separate multiple satisfaction Results with commas.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;1&quot;,&quot;3&quot;]</p>
     */
    @NameInMap("SatisfactionList")
    public String satisfactionList;

    /**
     * <p>Filter by satisfaction survey channel.</p>
     * 
     * <strong>example:</strong>
     * <p>IVR</p>
     */
    @NameInMap("SatisfactionSurveyChannel")
    public String satisfactionSurveyChannel;

    /**
     * <p>Filter by skill group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>skillgroup@ccc-test</p>
     */
    @NameInMap("SkillGroupId")
    public String skillGroupId;

    /**
     * <p>Sorting order. This parameter is optional and defaults to descending.</p>
     * 
     * <strong>example:</strong>
     * <p>DESC</p>
     */
    @NameInMap("SortOrder")
    public String sortOrder;

    /**
     * <p>Start time of the historical data to retrieve. The default value is 00:00:00 of the current day, in UNIX timestamp format with millisecond precision.</p>
     * 
     * <strong>example:</strong>
     * <p>1532448000000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static ListCallDetailRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCallDetailRecordsRequest self = new ListCallDetailRecordsRequest();
        return TeaModel.build(map, self);
    }

    public ListCallDetailRecordsRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public ListCallDetailRecordsRequest setCalledNumber(String calledNumber) {
        this.calledNumber = calledNumber;
        return this;
    }
    public String getCalledNumber() {
        return this.calledNumber;
    }

    public ListCallDetailRecordsRequest setCallingNumber(String callingNumber) {
        this.callingNumber = callingNumber;
        return this;
    }
    public String getCallingNumber() {
        return this.callingNumber;
    }

    public ListCallDetailRecordsRequest setContactDisposition(String contactDisposition) {
        this.contactDisposition = contactDisposition;
        return this;
    }
    public String getContactDisposition() {
        return this.contactDisposition;
    }

    public ListCallDetailRecordsRequest setContactDispositionList(String contactDispositionList) {
        this.contactDispositionList = contactDispositionList;
        return this;
    }
    public String getContactDispositionList() {
        return this.contactDispositionList;
    }

    public ListCallDetailRecordsRequest setContactId(String contactId) {
        this.contactId = contactId;
        return this;
    }
    public String getContactId() {
        return this.contactId;
    }

    public ListCallDetailRecordsRequest setContactType(String contactType) {
        this.contactType = contactType;
        return this;
    }
    public String getContactType() {
        return this.contactType;
    }

    public ListCallDetailRecordsRequest setContactTypeList(String contactTypeList) {
        this.contactTypeList = contactTypeList;
        return this;
    }
    public String getContactTypeList() {
        return this.contactTypeList;
    }

    public ListCallDetailRecordsRequest setCriteria(String criteria) {
        this.criteria = criteria;
        return this;
    }
    public String getCriteria() {
        return this.criteria;
    }

    public ListCallDetailRecordsRequest setEarlyMediaStateList(String earlyMediaStateList) {
        this.earlyMediaStateList = earlyMediaStateList;
        return this;
    }
    public String getEarlyMediaStateList() {
        return this.earlyMediaStateList;
    }

    public ListCallDetailRecordsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListCallDetailRecordsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListCallDetailRecordsRequest setOrderByField(String orderByField) {
        this.orderByField = orderByField;
        return this;
    }
    public String getOrderByField() {
        return this.orderByField;
    }

    public ListCallDetailRecordsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCallDetailRecordsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCallDetailRecordsRequest setSatisfactionDescriptionList(String satisfactionDescriptionList) {
        this.satisfactionDescriptionList = satisfactionDescriptionList;
        return this;
    }
    public String getSatisfactionDescriptionList() {
        return this.satisfactionDescriptionList;
    }

    public ListCallDetailRecordsRequest setSatisfactionList(String satisfactionList) {
        this.satisfactionList = satisfactionList;
        return this;
    }
    public String getSatisfactionList() {
        return this.satisfactionList;
    }

    public ListCallDetailRecordsRequest setSatisfactionSurveyChannel(String satisfactionSurveyChannel) {
        this.satisfactionSurveyChannel = satisfactionSurveyChannel;
        return this;
    }
    public String getSatisfactionSurveyChannel() {
        return this.satisfactionSurveyChannel;
    }

    public ListCallDetailRecordsRequest setSkillGroupId(String skillGroupId) {
        this.skillGroupId = skillGroupId;
        return this;
    }
    public String getSkillGroupId() {
        return this.skillGroupId;
    }

    public ListCallDetailRecordsRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public ListCallDetailRecordsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
