// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListAgentStatesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListAgentStatesResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListAgentStatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAgentStatesResponseBody self = new ListAgentStatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAgentStatesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAgentStatesResponseBody setData(ListAgentStatesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListAgentStatesResponseBodyData getData() {
        return this.data;
    }

    public ListAgentStatesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListAgentStatesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAgentStatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAgentStatesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAgentStatesResponseBodyDataList extends TeaModel {
        @NameInMap("AgentId")
        public String agentId;

        @NameInMap("AgentName")
        public String agentName;

        @NameInMap("Dn")
        public String dn;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("LoginName")
        public String loginName;

        @NameInMap("State")
        public String state;

        @NameInMap("StateDuration")
        public String stateDuration;

        public static ListAgentStatesResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListAgentStatesResponseBodyDataList self = new ListAgentStatesResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListAgentStatesResponseBodyDataList setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public ListAgentStatesResponseBodyDataList setAgentName(String agentName) {
            this.agentName = agentName;
            return this;
        }
        public String getAgentName() {
            return this.agentName;
        }

        public ListAgentStatesResponseBodyDataList setDn(String dn) {
            this.dn = dn;
            return this;
        }
        public String getDn() {
            return this.dn;
        }

        public ListAgentStatesResponseBodyDataList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListAgentStatesResponseBodyDataList setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
        }
        public String getLoginName() {
            return this.loginName;
        }

        public ListAgentStatesResponseBodyDataList setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListAgentStatesResponseBodyDataList setStateDuration(String stateDuration) {
            this.stateDuration = stateDuration;
            return this;
        }
        public String getStateDuration() {
            return this.stateDuration;
        }

    }

    public static class ListAgentStatesResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListAgentStatesResponseBodyDataList> list;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListAgentStatesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAgentStatesResponseBodyData self = new ListAgentStatesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAgentStatesResponseBodyData setList(java.util.List<ListAgentStatesResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListAgentStatesResponseBodyDataList> getList() {
            return this.list;
        }

        public ListAgentStatesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListAgentStatesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListAgentStatesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
