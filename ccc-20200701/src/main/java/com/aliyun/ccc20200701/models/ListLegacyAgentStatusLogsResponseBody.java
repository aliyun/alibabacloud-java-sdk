// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListLegacyAgentStatusLogsResponseBody extends TeaModel {
    /**
     * <p>Response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Data.</p>
     */
    @NameInMap("Data")
    public ListLegacyAgentStatusLogsResponseBodyData data;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Response message.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4C9A5D93-33A6-57F3-A423-4C83BD0A8455</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>Indicates whether the agent hung up the call.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AgentDropCall")
        public String agentDropCall;

        /**
         * <p>Agent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>agent@ccc-test</p>
         */
        @NameInMap("AgentNo")
        public String agentNo;

        /**
         * <p>Hang-up reason.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        @NameInMap("AliHangupCause")
        public String aliHangupCause;

        /**
         * <p>Call direction.</p>
         * 
         * <strong>example:</strong>
         * <p>内部</p>
         */
        @NameInMap("CallDir")
        public String callDir;

        /**
         * <p>Call ID.</p>
         * 
         * <strong>example:</strong>
         * <p>454326****</p>
         */
        @NameInMap("CallId")
        public String callId;

        /**
         * <p>Call type.</p>
         * 
         * <strong>example:</strong>
         * <p>呼入</p>
         */
        @NameInMap("CallType")
        public String callType;

        /**
         * <p>The callee number.</p>
         * 
         * <strong>example:</strong>
         * <p>1312121****</p>
         */
        @NameInMap("CalleeId")
        public String calleeId;

        /**
         * <p>Calling number.</p>
         * 
         * <strong>example:</strong>
         * <p>08337676****</p>
         */
        @NameInMap("CallerId")
        public String callerId;

        /**
         * <p>Call channel ID.</p>
         * 
         * <strong>example:</strong>
         * <p>487326****</p>
         */
        @NameInMap("ConnId")
        public String connId;

        /**
         * <p>Custom extension field.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        @NameInMap("Extend1")
        public String extend1;

        /**
         * <p>Custom extension field.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        @NameInMap("Extend2")
        public String extend2;

        /**
         * <p>Custom extension field.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        @NameInMap("Extend3")
        public String extend3;

        /**
         * <p>Custom extension field.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        @NameInMap("Extend4")
        public String extend4;

        /**
         * <p>Skill group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>skillgroup@ccc-test</p>
         */
        @NameInMap("GroupNo")
        public String groupNo;

        /**
         * <p>The listener phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>8032****</p>
         */
        @NameInMap("MonitedAgentNo")
        public String monitedAgentNo;

        /**
         * <p>The monitored agent phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>8012****</p>
         */
        @NameInMap("MonitedAgentPhoneNo")
        public String monitedAgentPhoneNo;

        /**
         * <p>Indicates whether the agent is in outbound-only mode.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("OutboundScenario")
        public Boolean outboundScenario;

        /**
         * <p>Agent extension number.</p>
         * 
         * <strong>example:</strong>
         * <p>8012****</p>
         */
        @NameInMap("PhoneNo")
        public String phoneNo;

        /**
         * <p>The time when the statistics were collected.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-03T10:15:30</p>
         */
        @NameInMap("StatisticDate")
        public String statisticDate;

        /**
         * <p>Duration of the status, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("StatisticTime")
        public Integer statisticTime;

        /**
         * <p>Agent status.</p>
         * 
         * <strong>example:</strong>
         * <p>振铃</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Skill group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>skillgroup@ccc-test</p>
         */
        @NameInMap("TargetRequest")
        public String targetRequest;

        /**
         * <p>Skill group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>skillgroup@ccc-test</p>
         */
        @NameInMap("TargetSelect")
        public String targetSelect;

        /**
         * <p>Tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>acc6736</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <p>Transfer number.</p>
         * 
         * <strong>example:</strong>
         * <p>07551231****</p>
         */
        @NameInMap("TransferNo")
        public String transferNo;

        /**
         * <p>Transfer number.</p>
         * 
         * <strong>example:</strong>
         * <p>05711231****</p>
         */
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
        /**
         * <p>List of agent status data.</p>
         */
        @NameInMap("List")
        public java.util.List<ListLegacyAgentStatusLogsResponseBodyDataList> list;

        /**
         * <p>Page number, ranging from 1 to 1000.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>Page size, ranging from 1 to 1000.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>Total count.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
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
