// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListCampaignsResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data.</p>
     */
    @NameInMap("Data")
    public ListCampaignsResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6CCEF32F-8614-535F-A1D9-D85B8C0DC4F0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListCampaignsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCampaignsResponseBody self = new ListCampaignsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCampaignsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCampaignsResponseBody setData(ListCampaignsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListCampaignsResponseBodyData getData() {
        return this.data;
    }

    public ListCampaignsResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListCampaignsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCampaignsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCampaignsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListCampaignsResponseBodyDataList extends TeaModel {
        /**
         * <p>The actual end time of the predictive dialing campaign. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1634008800000</p>
         */
        @NameInMap("ActualEndTime")
        public Long actualEndTime;

        /**
         * <p>The actual start time of the predictive dialing campaign. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1634000460000</p>
         */
        @NameInMap("ActualStartTime")
        public Long actualStartTime;

        /**
         * <p>The ID of the predictive dialing campaign.</p>
         * 
         * <strong>example:</strong>
         * <p>6badb397-a8b5-40b6-21019d382a09</p>
         */
        @NameInMap("CampaignId")
        public String campaignId;

        /**
         * <p>The number of aborted cases in the predictive dialing campaign. An aborted case indicates that the call to the contact was canceled.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CasesAborted")
        public Long casesAborted;

        /**
         * <p>The number of connected cases in the predictive dialing campaign.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("CasesConnected")
        public Long casesConnected;

        /**
         * <p>The number of uncompleted cases in the predictive dialing campaign. An uncompleted case indicates that the call was not connected and the maximum number of retry attempts was not reached.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CasesUncompleted")
        public Long casesUncompleted;

        /**
         * <p>The completion rate. This parameter is deprecated. You can calculate the completion rate by using the formula (TotalCases - CasesUnCompleted) / TotalCases.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        @NameInMap("CompletionRate")
        public Float completionRate;

        /**
         * <p>The ID of the IVR contact flow associated with the phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>a3fb6c62-9b49-4942-ae5b-cf2abd4123ek</p>
         */
        @NameInMap("ContactFlowId")
        public String contactFlowId;

        /**
         * <p>The maximum number of attempts for the predictive dialing campaign. This value specifies the maximum number of redial attempts when a call to a number fails.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MaxAttemptCount")
        public Long maxAttemptCount;

        /**
         * <p>The minimum redial interval for the predictive dialing campaign. This value specifies the minimum interval between redial attempts after a failure. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinAttemptInterval")
        public Long minAttemptInterval;

        /**
         * <p>The name of the predictive dialing campaign.</p>
         * 
         * <strong>example:</strong>
         * <p>test-campaign</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The planned end time of the predictive dialing campaign. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1634054400000</p>
         */
        @NameInMap("PlanedEndTime")
        public Long planedEndTime;

        /**
         * <p>The planned start time of the predictive dialing campaign. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1633968000000</p>
         */
        @NameInMap("PlanedStartTime")
        public Long planedStartTime;

        /**
         * <p>The ID of the associated skill group.</p>
         * 
         * <strong>example:</strong>
         * <p>skillgroup@ccc-test</p>
         */
        @NameInMap("QueueId")
        public String queueId;

        /**
         * <p>The name of the skill group.</p>
         * 
         * <strong>example:</strong>
         * <p>测试技能组</p>
         */
        @NameInMap("QueueName")
        public String queueName;

        /**
         * <p>Indicates whether the campaign is a simulated campaign.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Simulation")
        public Boolean simulation;

        /**
         * <p>The state of the predictive dialing campaign.</p>
         * 
         * <strong>example:</strong>
         * <p>Completed</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The strategy parameters of the predictive dialing campaign. Example for the PID strategy: {&quot;abandonRate&quot;:&quot;5&quot;,&quot;historicalConnectedRate&quot;:&quot;35&quot;}. Example for the PACING strategy: {&quot;ratio&quot;:1}. abandonRate specifies the expected call abandon rate. historicalConnectedRate specifies the historical reference connection rate. ratio specifies the fixed dialing ratio.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ratio&quot;:1}</p>
         */
        @NameInMap("StrategyParameters")
        public String strategyParameters;

        /**
         * <p>The strategy mode of the predictive dialing campaign.</p>
         * 
         * <strong>example:</strong>
         * <p>PACING</p>
         */
        @NameInMap("StrategyType")
        public String strategyType;

        /**
         * <p>The total number of phone numbers.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCases")
        public Long totalCases;

        public static ListCampaignsResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListCampaignsResponseBodyDataList self = new ListCampaignsResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListCampaignsResponseBodyDataList setActualEndTime(Long actualEndTime) {
            this.actualEndTime = actualEndTime;
            return this;
        }
        public Long getActualEndTime() {
            return this.actualEndTime;
        }

        public ListCampaignsResponseBodyDataList setActualStartTime(Long actualStartTime) {
            this.actualStartTime = actualStartTime;
            return this;
        }
        public Long getActualStartTime() {
            return this.actualStartTime;
        }

        public ListCampaignsResponseBodyDataList setCampaignId(String campaignId) {
            this.campaignId = campaignId;
            return this;
        }
        public String getCampaignId() {
            return this.campaignId;
        }

        public ListCampaignsResponseBodyDataList setCasesAborted(Long casesAborted) {
            this.casesAborted = casesAborted;
            return this;
        }
        public Long getCasesAborted() {
            return this.casesAborted;
        }

        public ListCampaignsResponseBodyDataList setCasesConnected(Long casesConnected) {
            this.casesConnected = casesConnected;
            return this;
        }
        public Long getCasesConnected() {
            return this.casesConnected;
        }

        public ListCampaignsResponseBodyDataList setCasesUncompleted(Long casesUncompleted) {
            this.casesUncompleted = casesUncompleted;
            return this;
        }
        public Long getCasesUncompleted() {
            return this.casesUncompleted;
        }

        public ListCampaignsResponseBodyDataList setCompletionRate(Float completionRate) {
            this.completionRate = completionRate;
            return this;
        }
        public Float getCompletionRate() {
            return this.completionRate;
        }

        public ListCampaignsResponseBodyDataList setContactFlowId(String contactFlowId) {
            this.contactFlowId = contactFlowId;
            return this;
        }
        public String getContactFlowId() {
            return this.contactFlowId;
        }

        public ListCampaignsResponseBodyDataList setMaxAttemptCount(Long maxAttemptCount) {
            this.maxAttemptCount = maxAttemptCount;
            return this;
        }
        public Long getMaxAttemptCount() {
            return this.maxAttemptCount;
        }

        public ListCampaignsResponseBodyDataList setMinAttemptInterval(Long minAttemptInterval) {
            this.minAttemptInterval = minAttemptInterval;
            return this;
        }
        public Long getMinAttemptInterval() {
            return this.minAttemptInterval;
        }

        public ListCampaignsResponseBodyDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListCampaignsResponseBodyDataList setPlanedEndTime(Long planedEndTime) {
            this.planedEndTime = planedEndTime;
            return this;
        }
        public Long getPlanedEndTime() {
            return this.planedEndTime;
        }

        public ListCampaignsResponseBodyDataList setPlanedStartTime(Long planedStartTime) {
            this.planedStartTime = planedStartTime;
            return this;
        }
        public Long getPlanedStartTime() {
            return this.planedStartTime;
        }

        public ListCampaignsResponseBodyDataList setQueueId(String queueId) {
            this.queueId = queueId;
            return this;
        }
        public String getQueueId() {
            return this.queueId;
        }

        public ListCampaignsResponseBodyDataList setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public ListCampaignsResponseBodyDataList setSimulation(Boolean simulation) {
            this.simulation = simulation;
            return this;
        }
        public Boolean getSimulation() {
            return this.simulation;
        }

        public ListCampaignsResponseBodyDataList setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListCampaignsResponseBodyDataList setStrategyParameters(String strategyParameters) {
            this.strategyParameters = strategyParameters;
            return this;
        }
        public String getStrategyParameters() {
            return this.strategyParameters;
        }

        public ListCampaignsResponseBodyDataList setStrategyType(String strategyType) {
            this.strategyType = strategyType;
            return this;
        }
        public String getStrategyType() {
            return this.strategyType;
        }

        public ListCampaignsResponseBodyDataList setTotalCases(Long totalCases) {
            this.totalCases = totalCases;
            return this;
        }
        public Long getTotalCases() {
            return this.totalCases;
        }

    }

    public static class ListCampaignsResponseBodyData extends TeaModel {
        /**
         * <p>The list of predictive dialing campaigns.</p>
         */
        @NameInMap("List")
        public java.util.List<ListCampaignsResponseBodyDataList> list;

        /**
         * <p>The page number. Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Long pageNumber;

        /**
         * <p>The page size. Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <p>The total count.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListCampaignsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCampaignsResponseBodyData self = new ListCampaignsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCampaignsResponseBodyData setList(java.util.List<ListCampaignsResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListCampaignsResponseBodyDataList> getList() {
            return this.list;
        }

        public ListCampaignsResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public ListCampaignsResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListCampaignsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
