// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListAttemptsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>agent@ccc-test</p>
     */
    @NameInMap("AgentId")
    public String agentId;

    /**
     * <strong>example:</strong>
     * <p>job-16976964500325****</p>
     */
    @NameInMap("AttemptId")
    public String attemptId;

    /**
     * <strong>example:</strong>
     * <p>1888888****</p>
     */
    @NameInMap("Callee")
    public String callee;

    /**
     * <strong>example:</strong>
     * <p>05711234****</p>
     */
    @NameInMap("Caller")
    public String caller;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6badb397-a8b5-40b6-21019d382a09</p>
     */
    @NameInMap("CampaignId")
    public String campaignId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>60ecb1a2-4480-4d01-bede-c5b7655bfadf</p>
     */
    @NameInMap("CaseId")
    public String caseId;

    /**
     * <strong>example:</strong>
     * <p>job-16976964500325****</p>
     */
    @NameInMap("ContactId")
    public String contactId;

    @NameInMap("Criteria")
    public String criteria;

    /**
     * <strong>example:</strong>
     * <p>1634115698291</p>
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

    /**
     * <strong>example:</strong>
     * <p>skillgroup@ccc-test</p>
     */
    @NameInMap("QueueId")
    public String queueId;

    /**
     * <strong>example:</strong>
     * <p>1634115688291</p>
     */
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

    public ListAttemptsRequest setCriteria(String criteria) {
        this.criteria = criteria;
        return this;
    }
    public String getCriteria() {
        return this.criteria;
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
