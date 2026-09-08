// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListAttemptsRequest extends TeaModel {
    /**
     * <p>Filter by agent ID. This parameter is optional and defaults to empty.</p>
     * 
     * <strong>example:</strong>
     * <p>agent@ccc-test</p>
     */
    @NameInMap("AgentId")
    public String agentId;

    /**
     * <p>Call record ID, which has the same value as the call ID.</p>
     * 
     * <strong>example:</strong>
     * <p>job-16976964500325****</p>
     */
    @NameInMap("AttemptId")
    public String attemptId;

    /**
     * <p>Filter by called number. Optional. Default is empty.</p>
     * 
     * <strong>example:</strong>
     * <p>1888888****</p>
     */
    @NameInMap("Callee")
    public String callee;

    /**
     * <p>Filter by caller number. This parameter is optional and defaults to empty.</p>
     * 
     * <strong>example:</strong>
     * <p>05711234****</p>
     */
    @NameInMap("Caller")
    public String caller;

    /**
     * <p>Predictive outbound dialing Activity ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6badb397-a8b5-40b6-21019d382a09</p>
     */
    @NameInMap("CampaignId")
    public String campaignId;

    /**
     * <p>System-generated contact ID. Customers do not need to concern themselves with this value.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>60ecb1a2-4480-4d01-bede-c5b7655bfadf</p>
     */
    @NameInMap("CaseId")
    public String caseId;

    /**
     * <p>Filter by call ID. This parameter is optional and defaults to empty.</p>
     * 
     * <strong>example:</strong>
     * <p>job-16976964500325****</p>
     */
    @NameInMap("ContactId")
    public String contactId;

    /**
     * <p>Extended query conditions in JSON format. Currently supports caseIds for batch queries.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;caseIds&quot;:[&quot;964f05a7-fc15-4a05-93a6-cd7421c4459e&quot;,&quot;5e2d508b-0df6-4077-8099-d3fff51ea6d0&quot;,&quot;da037029-8c83-4270-a90e-e7734be76af6&quot;]}</p>
     */
    @NameInMap("Criteria")
    public String criteria;

    /**
     * <p>End Time. This parameter is optional. If not specified, it defaults to the End Time of the predictive outbound dialing Activity. The format is a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1634115698291</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>Instance ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Page number. The product of PageNumber and PageSize must not exceed 10 000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Page size. The product of PageNumber and PageSize must not exceed 10 000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Filter by skill group ID. This parameter is optional and defaults to empty, which means no filtering is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>skillgroup@ccc-test</p>
     */
    @NameInMap("QueueId")
    public String queueId;

    /**
     * <p>Start Time. This parameter is optional. If not specified, it defaults to the Start Time of the predictive outbound dialing Activity. The format is a UNIX timestamp in milliseconds.</p>
     * 
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
