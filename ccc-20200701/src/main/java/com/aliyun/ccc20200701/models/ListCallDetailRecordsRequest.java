// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListCallDetailRecordsRequest extends TeaModel {
    @NameInMap("AgentId")
    public String agentId;

    @NameInMap("CalledNumber")
    public String calledNumber;

    @NameInMap("CallingNumber")
    public String callingNumber;

    @NameInMap("ContactDisposition")
    public String contactDisposition;

    @NameInMap("ContactDispositionList")
    public String contactDispositionList;

    @NameInMap("ContactId")
    public String contactId;

    @NameInMap("ContactType")
    public String contactType;

    @NameInMap("ContactTypeList")
    public String contactTypeList;

    @NameInMap("Criteria")
    public String criteria;

    @NameInMap("EarlyMediaStateList")
    public String earlyMediaStateList;

    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OrderByField")
    public String orderByField;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SatisfactionDescriptionList")
    public String satisfactionDescriptionList;

    @NameInMap("SatisfactionList")
    public String satisfactionList;

    @NameInMap("SatisfactionSurveyChannel")
    public String satisfactionSurveyChannel;

    @NameInMap("SkillGroupId")
    public String skillGroupId;

    @NameInMap("SortOrder")
    public String sortOrder;

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
