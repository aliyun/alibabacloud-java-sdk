// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetAiOutboundTaskProgressResponseBody extends TeaModel {
    /**
     * <p>Status code.</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Job progress.</p>
     */
    @NameInMap("Data")
    public GetAiOutboundTaskProgressResponseBodyData data;

    /**
     * <p>Description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D9CB3933-9FE3-4870-BA8E-2BEE91B69D23</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the API call succeeded.</p>
     * <ul>
     * <li><strong>true</strong>: Succeeded.</li>
     * <li><strong>false</strong>: Failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetAiOutboundTaskProgressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAiOutboundTaskProgressResponseBody self = new GetAiOutboundTaskProgressResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAiOutboundTaskProgressResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAiOutboundTaskProgressResponseBody setData(GetAiOutboundTaskProgressResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAiOutboundTaskProgressResponseBodyData getData() {
        return this.data;
    }

    public GetAiOutboundTaskProgressResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAiOutboundTaskProgressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAiOutboundTaskProgressResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAiOutboundTaskProgressResponseBodyDataCalloutProgress extends TeaModel {
        /**
         * <p>Call loss count.  </p>
         * <blockquote>
         * <p>A parameter specific to predictive outbound calls.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CallLossCount")
        public Integer callLossCount;

        /**
         * <p>Call Loss Rate.  </p>
         * <blockquote>
         * <p>A parameter exclusive to predictive outbound calls.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0.01</p>
         */
        @NameInMap("CallLossRate")
        public Float callLossRate;

        /**
         * <p>Number of successful outbound call connections.  </p>
         * <blockquote>
         * <p>This parameter is specific to automatic outbound calls.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("CallOutConnectCount")
        public Integer callOutConnectCount;

        /**
         * <p>Outbound Call Connection Rate.  </p>
         * <blockquote>
         * <p>A parameter exclusive to automated outbound calls.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("CallOutConnectRate")
        public Float callOutConnectRate;

        /**
         * <p>Number of outbound calls.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("CallOutCount")
        public Integer callOutCount;

        /**
         * <p>Agent Pickup Count.  </p>
         * <blockquote>
         * <p>A parameter exclusive to predictive outbound calls.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("CallOutServicerPickupCount")
        public Integer callOutServicerPickupCount;

        /**
         * <p>Agent pickup rate.  </p>
         * <blockquote>
         * <p>A parameter specific to predictive outbound calls.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0.4</p>
         */
        @NameInMap("CallOutServicerPickupRate")
        public Float callOutServicerPickupRate;

        /**
         * <p>Customer Pickup Count.  </p>
         * <blockquote>
         * <p>A parameter exclusive to predictive outbound calls.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("CallOutUserPickupCount")
        public Integer callOutUserPickupCount;

        /**
         * <p>Customer Pickup Rate.  </p>
         * <blockquote>
         * <p>A parameter exclusive to predictive outbound calls.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("CallOutUserPickupRate")
        public Float callOutUserPickupRate;

        public static GetAiOutboundTaskProgressResponseBodyDataCalloutProgress build(java.util.Map<String, ?> map) throws Exception {
            GetAiOutboundTaskProgressResponseBodyDataCalloutProgress self = new GetAiOutboundTaskProgressResponseBodyDataCalloutProgress();
            return TeaModel.build(map, self);
        }

        public GetAiOutboundTaskProgressResponseBodyDataCalloutProgress setCallLossCount(Integer callLossCount) {
            this.callLossCount = callLossCount;
            return this;
        }
        public Integer getCallLossCount() {
            return this.callLossCount;
        }

        public GetAiOutboundTaskProgressResponseBodyDataCalloutProgress setCallLossRate(Float callLossRate) {
            this.callLossRate = callLossRate;
            return this;
        }
        public Float getCallLossRate() {
            return this.callLossRate;
        }

        public GetAiOutboundTaskProgressResponseBodyDataCalloutProgress setCallOutConnectCount(Integer callOutConnectCount) {
            this.callOutConnectCount = callOutConnectCount;
            return this;
        }
        public Integer getCallOutConnectCount() {
            return this.callOutConnectCount;
        }

        public GetAiOutboundTaskProgressResponseBodyDataCalloutProgress setCallOutConnectRate(Float callOutConnectRate) {
            this.callOutConnectRate = callOutConnectRate;
            return this;
        }
        public Float getCallOutConnectRate() {
            return this.callOutConnectRate;
        }

        public GetAiOutboundTaskProgressResponseBodyDataCalloutProgress setCallOutCount(Integer callOutCount) {
            this.callOutCount = callOutCount;
            return this;
        }
        public Integer getCallOutCount() {
            return this.callOutCount;
        }

        public GetAiOutboundTaskProgressResponseBodyDataCalloutProgress setCallOutServicerPickupCount(Integer callOutServicerPickupCount) {
            this.callOutServicerPickupCount = callOutServicerPickupCount;
            return this;
        }
        public Integer getCallOutServicerPickupCount() {
            return this.callOutServicerPickupCount;
        }

        public GetAiOutboundTaskProgressResponseBodyDataCalloutProgress setCallOutServicerPickupRate(Float callOutServicerPickupRate) {
            this.callOutServicerPickupRate = callOutServicerPickupRate;
            return this;
        }
        public Float getCallOutServicerPickupRate() {
            return this.callOutServicerPickupRate;
        }

        public GetAiOutboundTaskProgressResponseBodyDataCalloutProgress setCallOutUserPickupCount(Integer callOutUserPickupCount) {
            this.callOutUserPickupCount = callOutUserPickupCount;
            return this;
        }
        public Integer getCallOutUserPickupCount() {
            return this.callOutUserPickupCount;
        }

        public GetAiOutboundTaskProgressResponseBodyDataCalloutProgress setCallOutUserPickupRate(Float callOutUserPickupRate) {
            this.callOutUserPickupRate = callOutUserPickupRate;
            return this;
        }
        public Float getCallOutUserPickupRate() {
            return this.callOutUserPickupRate;
        }

    }

    public static class GetAiOutboundTaskProgressResponseBodyDataTaskProgress extends TeaModel {
        /**
         * <p>Number of jobs in calling status.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("CallingCount")
        public Integer callingCount;

        /**
         * <p>Number of connected jobs.</p>
         * <blockquote>
         * <p>Parameter specific to auto dialing.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ConnectCount")
        public Integer connectCount;

        /**
         * <p>Job connection rate.  </p>
         * <blockquote>
         * <p>A parameter specific to automatic outbound calls.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("ConnectRate")
        public Float connectRate;

        /**
         * <p>Number of completed jobs.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("FinishCount")
        public Integer finishCount;

        /**
         * <p>Job completion rate.</p>
         * 
         * <strong>example:</strong>
         * <p>0.20</p>
         */
        @NameInMap("FinishRate")
        public Float finishRate;

        /**
         * <p>Number of agent pickups.</p>
         * <blockquote>
         * <p>Parameter specific to predictive dialing.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ServicerPickupCount")
        public Integer servicerPickupCount;

        /**
         * <p>Agent pickup rate.</p>
         * <blockquote>
         * <p>Exclusive parameter for predictive outbound calls.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("ServicerPickupRate")
        public Float servicerPickupRate;

        /**
         * <p>Number of stopped jobs.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TerminateCount")
        public Integer terminateCount;

        /**
         * <p>Total number of jobs.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        /**
         * <p>Number of customer pickups.</p>
         * <blockquote>
         * <p>Parameter specific to predictive dialing.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("UserPickupCount")
        public Integer userPickupCount;

        /**
         * <p>Customer pickup rate.</p>
         * <blockquote>
         * <p>Exclusive parameter for predictive outbound calls.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("UserPickupRate")
        public Float userPickupRate;

        /**
         * <p>Number of pending call jobs.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("WaitingCallCount")
        public Integer waitingCallCount;

        /**
         * <p>Number of jobs pending redial.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("WaitingRecallCount")
        public Integer waitingRecallCount;

        public static GetAiOutboundTaskProgressResponseBodyDataTaskProgress build(java.util.Map<String, ?> map) throws Exception {
            GetAiOutboundTaskProgressResponseBodyDataTaskProgress self = new GetAiOutboundTaskProgressResponseBodyDataTaskProgress();
            return TeaModel.build(map, self);
        }

        public GetAiOutboundTaskProgressResponseBodyDataTaskProgress setCallingCount(Integer callingCount) {
            this.callingCount = callingCount;
            return this;
        }
        public Integer getCallingCount() {
            return this.callingCount;
        }

        public GetAiOutboundTaskProgressResponseBodyDataTaskProgress setConnectCount(Integer connectCount) {
            this.connectCount = connectCount;
            return this;
        }
        public Integer getConnectCount() {
            return this.connectCount;
        }

        public GetAiOutboundTaskProgressResponseBodyDataTaskProgress setConnectRate(Float connectRate) {
            this.connectRate = connectRate;
            return this;
        }
        public Float getConnectRate() {
            return this.connectRate;
        }

        public GetAiOutboundTaskProgressResponseBodyDataTaskProgress setFinishCount(Integer finishCount) {
            this.finishCount = finishCount;
            return this;
        }
        public Integer getFinishCount() {
            return this.finishCount;
        }

        public GetAiOutboundTaskProgressResponseBodyDataTaskProgress setFinishRate(Float finishRate) {
            this.finishRate = finishRate;
            return this;
        }
        public Float getFinishRate() {
            return this.finishRate;
        }

        public GetAiOutboundTaskProgressResponseBodyDataTaskProgress setServicerPickupCount(Integer servicerPickupCount) {
            this.servicerPickupCount = servicerPickupCount;
            return this;
        }
        public Integer getServicerPickupCount() {
            return this.servicerPickupCount;
        }

        public GetAiOutboundTaskProgressResponseBodyDataTaskProgress setServicerPickupRate(Float servicerPickupRate) {
            this.servicerPickupRate = servicerPickupRate;
            return this;
        }
        public Float getServicerPickupRate() {
            return this.servicerPickupRate;
        }

        public GetAiOutboundTaskProgressResponseBodyDataTaskProgress setTerminateCount(Integer terminateCount) {
            this.terminateCount = terminateCount;
            return this;
        }
        public Integer getTerminateCount() {
            return this.terminateCount;
        }

        public GetAiOutboundTaskProgressResponseBodyDataTaskProgress setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public GetAiOutboundTaskProgressResponseBodyDataTaskProgress setUserPickupCount(Integer userPickupCount) {
            this.userPickupCount = userPickupCount;
            return this;
        }
        public Integer getUserPickupCount() {
            return this.userPickupCount;
        }

        public GetAiOutboundTaskProgressResponseBodyDataTaskProgress setUserPickupRate(Float userPickupRate) {
            this.userPickupRate = userPickupRate;
            return this;
        }
        public Float getUserPickupRate() {
            return this.userPickupRate;
        }

        public GetAiOutboundTaskProgressResponseBodyDataTaskProgress setWaitingCallCount(Integer waitingCallCount) {
            this.waitingCallCount = waitingCallCount;
            return this;
        }
        public Integer getWaitingCallCount() {
            return this.waitingCallCount;
        }

        public GetAiOutboundTaskProgressResponseBodyDataTaskProgress setWaitingRecallCount(Integer waitingRecallCount) {
            this.waitingRecallCount = waitingRecallCount;
            return this;
        }
        public Integer getWaitingRecallCount() {
            return this.waitingRecallCount;
        }

    }

    public static class GetAiOutboundTaskProgressResponseBodyData extends TeaModel {
        /**
         * <p>Progress by outbound call dimension.</p>
         */
        @NameInMap("CalloutProgress")
        public GetAiOutboundTaskProgressResponseBodyDataCalloutProgress calloutProgress;

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("TaskId")
        public Long taskId;

        /**
         * <p>Job dimension progress.</p>
         */
        @NameInMap("TaskProgress")
        public GetAiOutboundTaskProgressResponseBodyDataTaskProgress taskProgress;

        /**
         * <p>Task Type. Valid values:  </p>
         * <ul>
         * <li><strong>2</strong>: Predictive.  </li>
         * <li><strong>3</strong>: Automatic.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Type")
        public Integer type;

        public static GetAiOutboundTaskProgressResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAiOutboundTaskProgressResponseBodyData self = new GetAiOutboundTaskProgressResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAiOutboundTaskProgressResponseBodyData setCalloutProgress(GetAiOutboundTaskProgressResponseBodyDataCalloutProgress calloutProgress) {
            this.calloutProgress = calloutProgress;
            return this;
        }
        public GetAiOutboundTaskProgressResponseBodyDataCalloutProgress getCalloutProgress() {
            return this.calloutProgress;
        }

        public GetAiOutboundTaskProgressResponseBodyData setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public GetAiOutboundTaskProgressResponseBodyData setTaskProgress(GetAiOutboundTaskProgressResponseBodyDataTaskProgress taskProgress) {
            this.taskProgress = taskProgress;
            return this;
        }
        public GetAiOutboundTaskProgressResponseBodyDataTaskProgress getTaskProgress() {
            return this.taskProgress;
        }

        public GetAiOutboundTaskProgressResponseBodyData setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

}
