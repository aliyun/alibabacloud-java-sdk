// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListCallDetailRecordsRequest extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("ContactType")
    public String contactType;

    @NameInMap("ContactDisposition")
    public String contactDisposition;

    @NameInMap("ContactId")
    public String contactId;

    @NameInMap("AgentId")
    public String agentId;

    @NameInMap("SkillGroupId")
    public String skillGroupId;

    @NameInMap("SortOrder")
    public String sortOrder;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OrderByField")
    public String orderByField;

    @NameInMap("Criteria")
    public String criteria;

    @NameInMap("CallingNumber")
    public String callingNumber;

    @NameInMap("CalledNumber")
    public String calledNumber;

    @NameInMap("SatisfactionList")
    public String satisfactionList;

    @NameInMap("SatisfactionSurveyChannel")
    public String satisfactionSurveyChannel;

    @NameInMap("SatisfactionDescriptionList")
    public String satisfactionDescriptionList;

    public static ListCallDetailRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCallDetailRecordsRequest self = new ListCallDetailRecordsRequest();
        return TeaModel.build(map, self);
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

    public ListCallDetailRecordsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListCallDetailRecordsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListCallDetailRecordsRequest setContactType(String contactType) {
        this.contactType = contactType;
        return this;
    }
    public String getContactType() {
        return this.contactType;
    }

    public ListCallDetailRecordsRequest setContactDisposition(String contactDisposition) {
        this.contactDisposition = contactDisposition;
        return this;
    }
    public String getContactDisposition() {
        return this.contactDisposition;
    }

    public ListCallDetailRecordsRequest setContactId(String contactId) {
        this.contactId = contactId;
        return this;
    }
    public String getContactId() {
        return this.contactId;
    }

    public ListCallDetailRecordsRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
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

    public ListCallDetailRecordsRequest setCriteria(String criteria) {
        this.criteria = criteria;
        return this;
    }
    public String getCriteria() {
        return this.criteria;
    }

    public ListCallDetailRecordsRequest setCallingNumber(String callingNumber) {
        this.callingNumber = callingNumber;
        return this;
    }
    public String getCallingNumber() {
        return this.callingNumber;
    }

    public ListCallDetailRecordsRequest setCalledNumber(String calledNumber) {
        this.calledNumber = calledNumber;
        return this;
    }
    public String getCalledNumber() {
        return this.calledNumber;
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

    public ListCallDetailRecordsRequest setSatisfactionDescriptionList(String satisfactionDescriptionList) {
        this.satisfactionDescriptionList = satisfactionDescriptionList;
        return this;
    }
    public String getSatisfactionDescriptionList() {
        return this.satisfactionDescriptionList;
    }

}
