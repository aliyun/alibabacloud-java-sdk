// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListLegacyAgentEventLogsResponseBody extends TeaModel {
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
    public ListLegacyAgentEventLogsResponseBodyData data;

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
     * <p>2802EE59-3B53-513A-A130-85E480AF689D</p>
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
         * <p>378654****</p>
         */
        @NameInMap("CallId")
        public String callId;

        /**
         * <p>Call pattern.</p>
         * 
         * <strong>example:</strong>
         * <p>呼入</p>
         */
        @NameInMap("CallMode")
        public String callMode;

        /**
         * <p>Call type.</p>
         * 
         * <strong>example:</strong>
         * <p>呼入</p>
         */
        @NameInMap("CallType")
        public String callType;

        /**
         * <p>Callee number.</p>
         * 
         * <strong>example:</strong>
         * <p>1312343****</p>
         */
        @NameInMap("CalleeId")
        public String calleeId;

        /**
         * <p>Calling number.</p>
         * 
         * <strong>example:</strong>
         * <p>08331111****</p>
         */
        @NameInMap("CallerId")
        public String callerId;

        /**
         * <p>Call channel ID.</p>
         * 
         * <strong>example:</strong>
         * <p>345467****</p>
         */
        @NameInMap("ConnId")
        public String connId;

        /**
         * <p>Type of management event.</p>
         * 
         * <strong>example:</strong>
         * <p>拨号</p>
         */
        @NameInMap("Event")
        public String event;

        /**
         * <p>List of skill group IDs that the agent signed in to. Separate multiple skill group IDs with commas.</p>
         * 
         * <strong>example:</strong>
         * <p>skillgroup1@ccc-test,skillgroup2@ccc-test</p>
         */
        @NameInMap("GroupNo")
        public String groupNo;

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
         * <p>Statistics timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-03T10:15:30</p>
         */
        @NameInMap("StatisticDate")
        public String statisticDate;

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
         * <p>acc101</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <p>Transfer number.</p>
         * 
         * <strong>example:</strong>
         * <p>07518888****</p>
         */
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
        /**
         * <p>List of agent event logs.</p>
         */
        @NameInMap("List")
        public java.util.List<ListLegacyAgentEventLogsResponseBodyDataList> list;

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
