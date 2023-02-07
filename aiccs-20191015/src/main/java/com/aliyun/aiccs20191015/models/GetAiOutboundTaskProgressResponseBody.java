// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetAiOutboundTaskProgressResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetAiOutboundTaskProgressResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("CallLossCount")
        public Integer callLossCount;

        @NameInMap("CallLossRate")
        public Float callLossRate;

        @NameInMap("CallOutConnectCount")
        public Integer callOutConnectCount;

        @NameInMap("CallOutConnectRate")
        public Float callOutConnectRate;

        @NameInMap("CallOutCount")
        public Integer callOutCount;

        @NameInMap("CallOutServicerPickupCount")
        public Integer callOutServicerPickupCount;

        @NameInMap("CallOutServicerPickupRate")
        public Float callOutServicerPickupRate;

        @NameInMap("CallOutUserPickupCount")
        public Integer callOutUserPickupCount;

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
        @NameInMap("CallingCount")
        public Integer callingCount;

        @NameInMap("ConnectCount")
        public Integer connectCount;

        @NameInMap("ConnectRate")
        public Float connectRate;

        @NameInMap("FinishCount")
        public Integer finishCount;

        @NameInMap("FinishRate")
        public Float finishRate;

        @NameInMap("ServicerPickupCount")
        public Integer servicerPickupCount;

        @NameInMap("ServicerPickupRate")
        public Float servicerPickupRate;

        @NameInMap("TerminateCount")
        public Integer terminateCount;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("UserPickupCount")
        public Integer userPickupCount;

        @NameInMap("UserPickupRate")
        public Float userPickupRate;

        @NameInMap("WaitingCallCount")
        public Integer waitingCallCount;

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
        @NameInMap("CalloutProgress")
        public GetAiOutboundTaskProgressResponseBodyDataCalloutProgress calloutProgress;

        @NameInMap("TaskId")
        public Long taskId;

        @NameInMap("TaskProgress")
        public GetAiOutboundTaskProgressResponseBodyDataTaskProgress taskProgress;

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
