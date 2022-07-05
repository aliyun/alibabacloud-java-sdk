// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListLegacyAgentEventLogsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListLegacyAgentEventLogsResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListLegacyAgentEventLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLegacyAgentEventLogsResponseBody self = new ListLegacyAgentEventLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLegacyAgentEventLogsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListLegacyAgentEventLogsResponseBody setData(ListLegacyAgentEventLogsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListLegacyAgentEventLogsResponseBodyData getData() {
        return this.data;
    }

    public ListLegacyAgentEventLogsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListLegacyAgentEventLogsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListLegacyAgentEventLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLegacyAgentEventLogsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListLegacyAgentEventLogsResponseBodyDataList extends TeaModel {
        @NameInMap("AgentDropCall")
        public String agentDropCall;

        @NameInMap("AgentNo")
        public String agentNo;

        @NameInMap("CallDir")
        public String callDir;

        @NameInMap("CallId")
        public String callId;

        @NameInMap("CallMode")
        public String callMode;

        @NameInMap("CallType")
        public String callType;

        @NameInMap("CalleeId")
        public String calleeId;

        @NameInMap("CallerId")
        public String callerId;

        @NameInMap("ConnId")
        public String connId;

        @NameInMap("Event")
        public String event;

        @NameInMap("GroupNo")
        public String groupNo;

        @NameInMap("OutboundScenario")
        public Boolean outboundScenario;

        @NameInMap("PhoneNo")
        public String phoneNo;

        @NameInMap("StatisticDate")
        public String statisticDate;

        @NameInMap("TargetRequest")
        public String targetRequest;

        @NameInMap("TargetSelect")
        public String targetSelect;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("TransferNumber")
        public String transferNumber;

        public static ListLegacyAgentEventLogsResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListLegacyAgentEventLogsResponseBodyDataList self = new ListLegacyAgentEventLogsResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListLegacyAgentEventLogsResponseBodyDataList setAgentDropCall(String agentDropCall) {
            this.agentDropCall = agentDropCall;
            return this;
        }
        public String getAgentDropCall() {
            return this.agentDropCall;
        }

        public ListLegacyAgentEventLogsResponseBodyDataList setAgentNo(String agentNo) {
            this.agentNo = agentNo;
            return this;
        }
        public String getAgentNo() {
            return this.agentNo;
        }

        public ListLegacyAgentEventLogsResponseBodyDataList setCallDir(String callDir) {
            this.callDir = callDir;
            return this;
        }
        public String getCallDir() {
            return this.callDir;
        }

        public ListLegacyAgentEventLogsResponseBodyDataList setCallId(String callId) {
            this.callId = callId;
            return this;
        }
        public String getCallId() {
            return this.callId;
        }

        public ListLegacyAgentEventLogsResponseBodyDataList setCallMode(String callMode) {
            this.callMode = callMode;
            return this;
        }
        public String getCallMode() {
            return this.callMode;
        }

        public ListLegacyAgentEventLogsResponseBodyDataList setCallType(String callType) {
            this.callType = callType;
            return this;
        }
        public String getCallType() {
            return this.callType;
        }

        public ListLegacyAgentEventLogsResponseBodyDataList setCalleeId(String calleeId) {
            this.calleeId = calleeId;
            return this;
        }
        public String getCalleeId() {
            return this.calleeId;
        }

        public ListLegacyAgentEventLogsResponseBodyDataList setCallerId(String callerId) {
            this.callerId = callerId;
            return this;
        }
        public String getCallerId() {
            return this.callerId;
        }

        public ListLegacyAgentEventLogsResponseBodyDataList setConnId(String connId) {
            this.connId = connId;
            return this;
        }
        public String getConnId() {
            return this.connId;
        }

        public ListLegacyAgentEventLogsResponseBodyDataList setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public ListLegacyAgentEventLogsResponseBodyDataList setGroupNo(String groupNo) {
            this.groupNo = groupNo;
            return this;
        }
        public String getGroupNo() {
            return this.groupNo;
        }

        public ListLegacyAgentEventLogsResponseBodyDataList setOutboundScenario(Boolean outboundScenario) {
            this.outboundScenario = outboundScenario;
            return this;
        }
        public Boolean getOutboundScenario() {
            return this.outboundScenario;
        }

        public ListLegacyAgentEventLogsResponseBodyDataList setPhoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
            return this;
        }
        public String getPhoneNo() {
            return this.phoneNo;
        }

        public ListLegacyAgentEventLogsResponseBodyDataList setStatisticDate(String statisticDate) {
            this.statisticDate = statisticDate;
            return this;
        }
        public String getStatisticDate() {
            return this.statisticDate;
        }

        public ListLegacyAgentEventLogsResponseBodyDataList setTargetRequest(String targetRequest) {
            this.targetRequest = targetRequest;
            return this;
        }
        public String getTargetRequest() {
            return this.targetRequest;
        }

        public ListLegacyAgentEventLogsResponseBodyDataList setTargetSelect(String targetSelect) {
            this.targetSelect = targetSelect;
            return this;
        }
        public String getTargetSelect() {
            return this.targetSelect;
        }

        public ListLegacyAgentEventLogsResponseBodyDataList setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListLegacyAgentEventLogsResponseBodyDataList setTransferNumber(String transferNumber) {
            this.transferNumber = transferNumber;
            return this;
        }
        public String getTransferNumber() {
            return this.transferNumber;
        }

    }

    public static class ListLegacyAgentEventLogsResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListLegacyAgentEventLogsResponseBodyDataList> list;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListLegacyAgentEventLogsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListLegacyAgentEventLogsResponseBodyData self = new ListLegacyAgentEventLogsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListLegacyAgentEventLogsResponseBodyData setList(java.util.List<ListLegacyAgentEventLogsResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListLegacyAgentEventLogsResponseBodyDataList> getList() {
            return this.list;
        }

        public ListLegacyAgentEventLogsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListLegacyAgentEventLogsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListLegacyAgentEventLogsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
