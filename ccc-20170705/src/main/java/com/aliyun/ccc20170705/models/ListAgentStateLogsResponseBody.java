// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListAgentStateLogsResponseBody extends TeaModel {
    @NameInMap("AgentStateLogPage")
    public ListAgentStateLogsResponseBodyAgentStateLogPage agentStateLogPage;

    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListAgentStateLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAgentStateLogsResponseBody self = new ListAgentStateLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAgentStateLogsResponseBody setAgentStateLogPage(ListAgentStateLogsResponseBodyAgentStateLogPage agentStateLogPage) {
        this.agentStateLogPage = agentStateLogPage;
        return this;
    }
    public ListAgentStateLogsResponseBodyAgentStateLogPage getAgentStateLogPage() {
        return this.agentStateLogPage;
    }

    public ListAgentStateLogsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAgentStateLogsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListAgentStateLogsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAgentStateLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAgentStateLogsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAgentStateLogsResponseBodyAgentStateLogPageList extends TeaModel {
        @NameInMap("ConnectId")
        public String connectId;

        @NameInMap("ContactId")
        public String contactId;

        @NameInMap("CounterParty")
        public String counterParty;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("RamId")
        public Long ramId;

        @NameInMap("SkillGroupIds")
        public String skillGroupIds;

        @NameInMap("State")
        public String state;

        @NameInMap("StateCode")
        public String stateCode;

        @NameInMap("StateTime")
        public Long stateTime;

        public static ListAgentStateLogsResponseBodyAgentStateLogPageList build(java.util.Map<String, ?> map) throws Exception {
            ListAgentStateLogsResponseBodyAgentStateLogPageList self = new ListAgentStateLogsResponseBodyAgentStateLogPageList();
            return TeaModel.build(map, self);
        }

        public ListAgentStateLogsResponseBodyAgentStateLogPageList setConnectId(String connectId) {
            this.connectId = connectId;
            return this;
        }
        public String getConnectId() {
            return this.connectId;
        }

        public ListAgentStateLogsResponseBodyAgentStateLogPageList setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }
        public String getContactId() {
            return this.contactId;
        }

        public ListAgentStateLogsResponseBodyAgentStateLogPageList setCounterParty(String counterParty) {
            this.counterParty = counterParty;
            return this;
        }
        public String getCounterParty() {
            return this.counterParty;
        }

        public ListAgentStateLogsResponseBodyAgentStateLogPageList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListAgentStateLogsResponseBodyAgentStateLogPageList setRamId(Long ramId) {
            this.ramId = ramId;
            return this;
        }
        public Long getRamId() {
            return this.ramId;
        }

        public ListAgentStateLogsResponseBodyAgentStateLogPageList setSkillGroupIds(String skillGroupIds) {
            this.skillGroupIds = skillGroupIds;
            return this;
        }
        public String getSkillGroupIds() {
            return this.skillGroupIds;
        }

        public ListAgentStateLogsResponseBodyAgentStateLogPageList setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListAgentStateLogsResponseBodyAgentStateLogPageList setStateCode(String stateCode) {
            this.stateCode = stateCode;
            return this;
        }
        public String getStateCode() {
            return this.stateCode;
        }

        public ListAgentStateLogsResponseBodyAgentStateLogPageList setStateTime(Long stateTime) {
            this.stateTime = stateTime;
            return this;
        }
        public Long getStateTime() {
            return this.stateTime;
        }

    }

    public static class ListAgentStateLogsResponseBodyAgentStateLogPage extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListAgentStateLogsResponseBodyAgentStateLogPageList> list;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListAgentStateLogsResponseBodyAgentStateLogPage build(java.util.Map<String, ?> map) throws Exception {
            ListAgentStateLogsResponseBodyAgentStateLogPage self = new ListAgentStateLogsResponseBodyAgentStateLogPage();
            return TeaModel.build(map, self);
        }

        public ListAgentStateLogsResponseBodyAgentStateLogPage setList(java.util.List<ListAgentStateLogsResponseBodyAgentStateLogPageList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListAgentStateLogsResponseBodyAgentStateLogPageList> getList() {
            return this.list;
        }

        public ListAgentStateLogsResponseBodyAgentStateLogPage setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListAgentStateLogsResponseBodyAgentStateLogPage setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListAgentStateLogsResponseBodyAgentStateLogPage setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
