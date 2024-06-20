// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListAttemptsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListAttemptsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>7CC6523B-0E51-1B62-8DA5-6A9831CAE315</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListAttemptsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAttemptsResponseBody self = new ListAttemptsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAttemptsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAttemptsResponseBody setData(ListAttemptsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListAttemptsResponseBodyData getData() {
        return this.data;
    }

    public ListAttemptsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListAttemptsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAttemptsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAttemptsResponseBodyDataList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1632883592732</p>
         */
        @NameInMap("AgentEstablishedTime")
        public Long agentEstablishedTime;

        /**
         * <strong>example:</strong>
         * <p>agent@ccc-test</p>
         */
        @NameInMap("AgentId")
        public String agentId;

        /**
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("AgentRingDuration")
        public Long agentRingDuration;

        /**
         * <strong>example:</strong>
         * <p>1634196287869</p>
         */
        @NameInMap("AssignAgentTime")
        public Long assignAgentTime;

        /**
         * <strong>example:</strong>
         * <p>job-1704342174816****</p>
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
         * <strong>example:</strong>
         * <p>083046e3-5822-4cda-9b84-04f2a02eb605</p>
         */
        @NameInMap("CampaignId")
        public String campaignId;

        /**
         * <strong>example:</strong>
         * <p>21d194a7-60b7-4824-932b-48ed03a83704</p>
         */
        @NameInMap("CaseId")
        public String caseId;

        /**
         * <strong>example:</strong>
         * <p>job-1704342174816****</p>
         */
        @NameInMap("ContactId")
        public String contactId;

        /**
         * <strong>example:</strong>
         * <p>1634196286708</p>
         */
        @NameInMap("CustomerEstablishedTime")
        public Long customerEstablishedTime;

        /**
         * <strong>example:</strong>
         * <p>1634196317888</p>
         */
        @NameInMap("CustomerReleasedTime")
        public Long customerReleasedTime;

        /**
         * <strong>example:</strong>
         * <p>2734</p>
         */
        @NameInMap("DialDuration")
        public Long dialDuration;

        /**
         * <strong>example:</strong>
         * <p>1634196283974</p>
         */
        @NameInMap("DialTime")
        public Long dialTime;

        /**
         * <strong>example:</strong>
         * <p>1634196287789</p>
         */
        @NameInMap("EnqueueTime")
        public Long enqueueTime;

        /**
         * <strong>example:</strong>
         * <p>1634196286740</p>
         */
        @NameInMap("EnterIvrTime")
        public Long enterIvrTime;

        /**
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>1049</p>
         */
        @NameInMap("IvrDuration")
        public Long ivrDuration;

        /**
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("QueueDuration")
        public Long queueDuration;

        /**
         * <strong>example:</strong>
         * <p>skillgroup@ccc-test</p>
         */
        @NameInMap("QueueId")
        public String queueId;

        public static ListAttemptsResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListAttemptsResponseBodyDataList self = new ListAttemptsResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListAttemptsResponseBodyDataList setAgentEstablishedTime(Long agentEstablishedTime) {
            this.agentEstablishedTime = agentEstablishedTime;
            return this;
        }
        public Long getAgentEstablishedTime() {
            return this.agentEstablishedTime;
        }

        public ListAttemptsResponseBodyDataList setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public ListAttemptsResponseBodyDataList setAgentRingDuration(Long agentRingDuration) {
            this.agentRingDuration = agentRingDuration;
            return this;
        }
        public Long getAgentRingDuration() {
            return this.agentRingDuration;
        }

        public ListAttemptsResponseBodyDataList setAssignAgentTime(Long assignAgentTime) {
            this.assignAgentTime = assignAgentTime;
            return this;
        }
        public Long getAssignAgentTime() {
            return this.assignAgentTime;
        }

        public ListAttemptsResponseBodyDataList setAttemptId(String attemptId) {
            this.attemptId = attemptId;
            return this;
        }
        public String getAttemptId() {
            return this.attemptId;
        }

        public ListAttemptsResponseBodyDataList setCallee(String callee) {
            this.callee = callee;
            return this;
        }
        public String getCallee() {
            return this.callee;
        }

        public ListAttemptsResponseBodyDataList setCaller(String caller) {
            this.caller = caller;
            return this;
        }
        public String getCaller() {
            return this.caller;
        }

        public ListAttemptsResponseBodyDataList setCampaignId(String campaignId) {
            this.campaignId = campaignId;
            return this;
        }
        public String getCampaignId() {
            return this.campaignId;
        }

        public ListAttemptsResponseBodyDataList setCaseId(String caseId) {
            this.caseId = caseId;
            return this;
        }
        public String getCaseId() {
            return this.caseId;
        }

        public ListAttemptsResponseBodyDataList setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }
        public String getContactId() {
            return this.contactId;
        }

        public ListAttemptsResponseBodyDataList setCustomerEstablishedTime(Long customerEstablishedTime) {
            this.customerEstablishedTime = customerEstablishedTime;
            return this;
        }
        public Long getCustomerEstablishedTime() {
            return this.customerEstablishedTime;
        }

        public ListAttemptsResponseBodyDataList setCustomerReleasedTime(Long customerReleasedTime) {
            this.customerReleasedTime = customerReleasedTime;
            return this;
        }
        public Long getCustomerReleasedTime() {
            return this.customerReleasedTime;
        }

        public ListAttemptsResponseBodyDataList setDialDuration(Long dialDuration) {
            this.dialDuration = dialDuration;
            return this;
        }
        public Long getDialDuration() {
            return this.dialDuration;
        }

        public ListAttemptsResponseBodyDataList setDialTime(Long dialTime) {
            this.dialTime = dialTime;
            return this;
        }
        public Long getDialTime() {
            return this.dialTime;
        }

        public ListAttemptsResponseBodyDataList setEnqueueTime(Long enqueueTime) {
            this.enqueueTime = enqueueTime;
            return this;
        }
        public Long getEnqueueTime() {
            return this.enqueueTime;
        }

        public ListAttemptsResponseBodyDataList setEnterIvrTime(Long enterIvrTime) {
            this.enterIvrTime = enterIvrTime;
            return this;
        }
        public Long getEnterIvrTime() {
            return this.enterIvrTime;
        }

        public ListAttemptsResponseBodyDataList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListAttemptsResponseBodyDataList setIvrDuration(Long ivrDuration) {
            this.ivrDuration = ivrDuration;
            return this;
        }
        public Long getIvrDuration() {
            return this.ivrDuration;
        }

        public ListAttemptsResponseBodyDataList setQueueDuration(Long queueDuration) {
            this.queueDuration = queueDuration;
            return this;
        }
        public Long getQueueDuration() {
            return this.queueDuration;
        }

        public ListAttemptsResponseBodyDataList setQueueId(String queueId) {
            this.queueId = queueId;
            return this;
        }
        public String getQueueId() {
            return this.queueId;
        }

    }

    public static class ListAttemptsResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListAttemptsResponseBodyDataList> list;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListAttemptsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAttemptsResponseBodyData self = new ListAttemptsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAttemptsResponseBodyData setList(java.util.List<ListAttemptsResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListAttemptsResponseBodyDataList> getList() {
            return this.list;
        }

        public ListAttemptsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListAttemptsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListAttemptsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
