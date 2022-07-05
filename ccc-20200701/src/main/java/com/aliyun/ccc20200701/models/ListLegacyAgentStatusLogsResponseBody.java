// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListLegacyAgentStatusLogsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListLegacyAgentStatusLogsResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListLegacyAgentStatusLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLegacyAgentStatusLogsResponseBody self = new ListLegacyAgentStatusLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLegacyAgentStatusLogsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListLegacyAgentStatusLogsResponseBody setData(ListLegacyAgentStatusLogsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListLegacyAgentStatusLogsResponseBodyData getData() {
        return this.data;
    }

    public ListLegacyAgentStatusLogsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListLegacyAgentStatusLogsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListLegacyAgentStatusLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLegacyAgentStatusLogsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListLegacyAgentStatusLogsResponseBodyDataList extends TeaModel {
        @NameInMap("AgentDropCall")
        public String agentDropCall;

        @NameInMap("AgentNo")
        public String agentNo;

        @NameInMap("AliHangupCause")
        public String aliHangupCause;

        @NameInMap("CallDir")
        public String callDir;

        @NameInMap("CallId")
        public String callId;

        @NameInMap("CallType")
        public String callType;

        @NameInMap("CalleeId")
        public String calleeId;

        @NameInMap("CallerId")
        public String callerId;

        @NameInMap("ConnId")
        public String connId;

        @NameInMap("Extend1")
        public String extend1;

        @NameInMap("Extend2")
        public String extend2;

        @NameInMap("Extend3")
        public String extend3;

        @NameInMap("Extend4")
        public String extend4;

        @NameInMap("GroupNo")
        public String groupNo;

        @NameInMap("MonitedAgentNo")
        public String monitedAgentNo;

        @NameInMap("MonitedAgentPhoneNo")
        public String monitedAgentPhoneNo;

        @NameInMap("OutboundScenario")
        public Boolean outboundScenario;

        @NameInMap("PhoneNo")
        public String phoneNo;

        @NameInMap("StatisticDate")
        public String statisticDate;

        @NameInMap("StatisticTime")
        public Integer statisticTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("TargetRequest")
        public String targetRequest;

        @NameInMap("TargetSelect")
        public String targetSelect;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("TransferNo")
        public String transferNo;

        @NameInMap("TransferNumber")
        public String transferNumber;

        public static ListLegacyAgentStatusLogsResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListLegacyAgentStatusLogsResponseBodyDataList self = new ListLegacyAgentStatusLogsResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListLegacyAgentStatusLogsResponseBodyDataList setAgentDropCall(String agentDropCall) {
            this.agentDropCall = agentDropCall;
            return this;
        }
        public String getAgentDropCall() {
            return this.agentDropCall;
        }

        public ListLegacyAgentStatusLogsResponseBodyDataList setAgentNo(String agentNo) {
            this.agentNo = agentNo;
            return this;
        }
        public String getAgentNo() {
            return this.agentNo;
        }

        public ListLegacyAgentStatusLogsResponseBodyDataList setAliHangupCause(String aliHangupCause) {
            this.aliHangupCause = aliHangupCause;
            return this;
        }
        public String getAliHangupCause() {
            return this.aliHangupCause;
        }

        public ListLegacyAgentStatusLogsResponseBodyDataList setCallDir(String callDir) {
            this.callDir = callDir;
            return this;
        }
        public String getCallDir() {
            return this.callDir;
        }

        public ListLegacyAgentStatusLogsResponseBodyDataList setCallId(String callId) {
            this.callId = callId;
            return this;
        }
        public String getCallId() {
            return this.callId;
        }

        public ListLegacyAgentStatusLogsResponseBodyDataList setCallType(String callType) {
            this.callType = callType;
            return this;
        }
        public String getCallType() {
            return this.callType;
        }

        public ListLegacyAgentStatusLogsResponseBodyDataList setCalleeId(String calleeId) {
            this.calleeId = calleeId;
            return this;
        }
        public String getCalleeId() {
            return this.calleeId;
        }

        public ListLegacyAgentStatusLogsResponseBodyDataList setCallerId(String callerId) {
            this.callerId = callerId;
            return this;
        }
        public String getCallerId() {
            return this.callerId;
        }

        public ListLegacyAgentStatusLogsResponseBodyDataList setConnId(String connId) {
            this.connId = connId;
            return this;
        }
        public String getConnId() {
            return this.connId;
        }

        public ListLegacyAgentStatusLogsResponseBodyDataList setExtend1(String extend1) {
            this.extend1 = extend1;
            return this;
        }
        public String getExtend1() {
            return this.extend1;
        }

        public ListLegacyAgentStatusLogsResponseBodyDataList setExtend2(String extend2) {
            this.extend2 = extend2;
            return this;
        }
        public String getExtend2() {
            return this.extend2;
        }

        public ListLegacyAgentStatusLogsResponseBodyDataList setExtend3(String extend3) {
            this.extend3 = extend3;
            return this;
        }
        public String getExtend3() {
            return this.extend3;
        }

        public ListLegacyAgentStatusLogsResponseBodyDataList setExtend4(String extend4) {
            this.extend4 = extend4;
            return this;
        }
        public String getExtend4() {
            return this.extend4;
        }

        public ListLegacyAgentStatusLogsResponseBodyDataList setGroupNo(String groupNo) {
            this.groupNo = groupNo;
            return this;
        }
        public String getGroupNo() {
            return this.groupNo;
        }

        public ListLegacyAgentStatusLogsResponseBodyDataList setMonitedAgentNo(String monitedAgentNo) {
            this.monitedAgentNo = monitedAgentNo;
            return this;
        }
        public String getMonitedAgentNo() {
            return this.monitedAgentNo;
        }

        public ListLegacyAgentStatusLogsResponseBodyDataList setMonitedAgentPhoneNo(String monitedAgentPhoneNo) {
            this.monitedAgentPhoneNo = monitedAgentPhoneNo;
            return this;
        }
        public String getMonitedAgentPhoneNo() {
            return this.monitedAgentPhoneNo;
        }

        public ListLegacyAgentStatusLogsResponseBodyDataList setOutboundScenario(Boolean outboundScenario) {
            this.outboundScenario = outboundScenario;
            return this;
        }
        public Boolean getOutboundScenario() {
            return this.outboundScenario;
        }

        public ListLegacyAgentStatusLogsResponseBodyDataList setPhoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
            return this;
        }
        public String getPhoneNo() {
            return this.phoneNo;
        }

        public ListLegacyAgentStatusLogsResponseBodyDataList setStatisticDate(String statisticDate) {
            this.statisticDate = statisticDate;
            return this;
        }
        public String getStatisticDate() {
            return this.statisticDate;
        }

        public ListLegacyAgentStatusLogsResponseBodyDataList setStatisticTime(Integer statisticTime) {
            this.statisticTime = statisticTime;
            return this;
        }
        public Integer getStatisticTime() {
            return this.statisticTime;
        }

        public ListLegacyAgentStatusLogsResponseBodyDataList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListLegacyAgentStatusLogsResponseBodyDataList setTargetRequest(String targetRequest) {
            this.targetRequest = targetRequest;
            return this;
        }
        public String getTargetRequest() {
            return this.targetRequest;
        }

        public ListLegacyAgentStatusLogsResponseBodyDataList setTargetSelect(String targetSelect) {
            this.targetSelect = targetSelect;
            return this;
        }
        public String getTargetSelect() {
            return this.targetSelect;
        }

        public ListLegacyAgentStatusLogsResponseBodyDataList setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListLegacyAgentStatusLogsResponseBodyDataList setTransferNo(String transferNo) {
            this.transferNo = transferNo;
            return this;
        }
        public String getTransferNo() {
            return this.transferNo;
        }

        public ListLegacyAgentStatusLogsResponseBodyDataList setTransferNumber(String transferNumber) {
            this.transferNumber = transferNumber;
            return this;
        }
        public String getTransferNumber() {
            return this.transferNumber;
        }

    }

    public static class ListLegacyAgentStatusLogsResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListLegacyAgentStatusLogsResponseBodyDataList> list;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListLegacyAgentStatusLogsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListLegacyAgentStatusLogsResponseBodyData self = new ListLegacyAgentStatusLogsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListLegacyAgentStatusLogsResponseBodyData setList(java.util.List<ListLegacyAgentStatusLogsResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListLegacyAgentStatusLogsResponseBodyDataList> getList() {
            return this.list;
        }

        public ListLegacyAgentStatusLogsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListLegacyAgentStatusLogsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListLegacyAgentStatusLogsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
