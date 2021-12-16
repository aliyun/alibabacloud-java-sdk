// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListAttemptsRequest extends TeaModel {
    // 坐席ID
    @NameInMap("AgentId")
    public String agentId;

    // 记录ID
    @NameInMap("AttemptId")
    public String attemptId;

    // 被叫
    @NameInMap("Callee")
    public String callee;

    // 主叫
    @NameInMap("Caller")
    public String caller;

    // 活动ID
    @NameInMap("CampaignId")
    public String campaignId;

    // CaseID
    @NameInMap("CaseId")
    public String caseId;

    // 话务ID
    @NameInMap("ContactId")
    public String contactId;

    // 结束时间
    @NameInMap("EndTime")
    public Long endTime;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 页码
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 页大小
    @NameInMap("PageSize")
    public Integer pageSize;

    // 队列ID
    @NameInMap("QueueId")
    public String queueId;

    // 开始时间
    @NameInMap("StartTime")
    public Long startTime;

    public static ListAttemptsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAttemptsRequest self = new ListAttemptsRequest();
        return TeaModel.build(map, self);
    }

    public ListAttemptsRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public ListAttemptsRequest setAttemptId(String attemptId) {
        this.attemptId = attemptId;
        return this;
    }
    public String getAttemptId() {
        return this.attemptId;
    }

    public ListAttemptsRequest setCallee(String callee) {
        this.callee = callee;
        return this;
    }
    public String getCallee() {
        return this.callee;
    }

    public ListAttemptsRequest setCaller(String caller) {
        this.caller = caller;
        return this;
    }
    public String getCaller() {
        return this.caller;
    }

    public ListAttemptsRequest setCampaignId(String campaignId) {
        this.campaignId = campaignId;
        return this;
    }
    public String getCampaignId() {
        return this.campaignId;
    }

    public ListAttemptsRequest setCaseId(String caseId) {
        this.caseId = caseId;
        return this;
    }
    public String getCaseId() {
        return this.caseId;
    }

    public ListAttemptsRequest setContactId(String contactId) {
        this.contactId = contactId;
        return this;
    }
    public String getContactId() {
        return this.contactId;
    }

    public ListAttemptsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListAttemptsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListAttemptsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAttemptsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAttemptsRequest setQueueId(String queueId) {
        this.queueId = queueId;
        return this;
    }
    public String getQueueId() {
        return this.queueId;
    }

    public ListAttemptsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
