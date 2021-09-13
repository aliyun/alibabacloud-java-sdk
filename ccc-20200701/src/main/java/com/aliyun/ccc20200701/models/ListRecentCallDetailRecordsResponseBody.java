// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListRecentCallDetailRecordsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ListRecentCallDetailRecordsResponseBodyData data;

    public static ListRecentCallDetailRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRecentCallDetailRecordsResponseBody self = new ListRecentCallDetailRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRecentCallDetailRecordsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListRecentCallDetailRecordsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListRecentCallDetailRecordsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListRecentCallDetailRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRecentCallDetailRecordsResponseBody setData(ListRecentCallDetailRecordsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListRecentCallDetailRecordsResponseBodyData getData() {
        return this.data;
    }

    public static class ListRecentCallDetailRecordsResponseBodyDataList extends TeaModel {
        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("ContactDisposition")
        public String contactDisposition;

        @NameInMap("ContactType")
        public String contactType;

        @NameInMap("AgentIds")
        public String agentIds;

        @NameInMap("ContactId")
        public String contactId;

        @NameInMap("CallDuration")
        public String callDuration;

        @NameInMap("CallingNumber")
        public String callingNumber;

        @NameInMap("Duration")
        public Long duration;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("CalledNumber")
        public String calledNumber;

        @NameInMap("SkillGroupIds")
        public String skillGroupIds;

        public static ListRecentCallDetailRecordsResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListRecentCallDetailRecordsResponseBodyDataList self = new ListRecentCallDetailRecordsResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListRecentCallDetailRecordsResponseBodyDataList setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListRecentCallDetailRecordsResponseBodyDataList setContactDisposition(String contactDisposition) {
            this.contactDisposition = contactDisposition;
            return this;
        }
        public String getContactDisposition() {
            return this.contactDisposition;
        }

        public ListRecentCallDetailRecordsResponseBodyDataList setContactType(String contactType) {
            this.contactType = contactType;
            return this;
        }
        public String getContactType() {
            return this.contactType;
        }

        public ListRecentCallDetailRecordsResponseBodyDataList setAgentIds(String agentIds) {
            this.agentIds = agentIds;
            return this;
        }
        public String getAgentIds() {
            return this.agentIds;
        }

        public ListRecentCallDetailRecordsResponseBodyDataList setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }
        public String getContactId() {
            return this.contactId;
        }

        public ListRecentCallDetailRecordsResponseBodyDataList setCallDuration(String callDuration) {
            this.callDuration = callDuration;
            return this;
        }
        public String getCallDuration() {
            return this.callDuration;
        }

        public ListRecentCallDetailRecordsResponseBodyDataList setCallingNumber(String callingNumber) {
            this.callingNumber = callingNumber;
            return this;
        }
        public String getCallingNumber() {
            return this.callingNumber;
        }

        public ListRecentCallDetailRecordsResponseBodyDataList setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public ListRecentCallDetailRecordsResponseBodyDataList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListRecentCallDetailRecordsResponseBodyDataList setCalledNumber(String calledNumber) {
            this.calledNumber = calledNumber;
            return this;
        }
        public String getCalledNumber() {
            return this.calledNumber;
        }

        public ListRecentCallDetailRecordsResponseBodyDataList setSkillGroupIds(String skillGroupIds) {
            this.skillGroupIds = skillGroupIds;
            return this;
        }
        public String getSkillGroupIds() {
            return this.skillGroupIds;
        }

    }

    public static class ListRecentCallDetailRecordsResponseBodyData extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("List")
        public java.util.List<ListRecentCallDetailRecordsResponseBodyDataList> list;

        public static ListRecentCallDetailRecordsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListRecentCallDetailRecordsResponseBodyData self = new ListRecentCallDetailRecordsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListRecentCallDetailRecordsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListRecentCallDetailRecordsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListRecentCallDetailRecordsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListRecentCallDetailRecordsResponseBodyData setList(java.util.List<ListRecentCallDetailRecordsResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListRecentCallDetailRecordsResponseBodyDataList> getList() {
            return this.list;
        }

    }

}
