// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListCallDetailRecordsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>agent@ccc-test</p>
     */
    @NameInMap("AgentId")
    public String agentId;

    /**
     * <strong>example:</strong>
     * <p>1320523****</p>
     */
    @NameInMap("CalledNumber")
    public String calledNumber;

    /**
     * <strong>example:</strong>
     * <p>07353988****</p>
     */
    @NameInMap("CallingNumber")
    public String callingNumber;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("ContactDisposition")
    public String contactDisposition;

    /**
     * <strong>example:</strong>
     * <p>[&quot;Success&quot;,&quot;NoAnswer&quot;]</p>
     */
    @NameInMap("ContactDispositionList")
    public String contactDispositionList;

    /**
     * <strong>example:</strong>
     * <p>job-12515239414412****</p>
     */
    @NameInMap("ContactId")
    public String contactId;

    /**
     * <strong>example:</strong>
     * <p>Outbound</p>
     */
    @NameInMap("ContactType")
    public String contactType;

    /**
     * <strong>example:</strong>
     * <p>[&quot;Internal&quot;,&quot;Inbound&quot;]</p>
     */
    @NameInMap("ContactTypeList")
    public String contactTypeList;

    /**
     * <strong>example:</strong>
     * <p>{&quot;phoneNumber&quot;:&quot;0735&quot;}</p>
     */
    @NameInMap("Criteria")
    public String criteria;

    /**
     * <strong>example:</strong>
     * <p>[&quot;NotConnected&quot;,&quot;NoAnswer&quot;]</p>
     */
    @NameInMap("EarlyMediaStateList")
    public String earlyMediaStateList;

    /**
     * <strong>example:</strong>
     * <p>1532707199000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

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

    @NameInMap("SatisfactionDescriptionList")
    public String satisfactionDescriptionList;

    /**
     * <strong>example:</strong>
     * <p>[&quot;1&quot;,&quot;3&quot;]</p>
     */
    @NameInMap("SatisfactionList")
    public String satisfactionList;

    /**
     * <strong>example:</strong>
     * <p>IVR</p>
     */
    @NameInMap("SatisfactionSurveyChannel")
    public String satisfactionSurveyChannel;

    /**
     * <strong>example:</strong>
     * <p>skillgroup@ccc-test</p>
     */
    @NameInMap("SkillGroupId")
    public String skillGroupId;

    /**
     * <strong>example:</strong>
     * <p>DESC</p>
     */
    @NameInMap("SortOrder")
    public String sortOrder;

    /**
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
