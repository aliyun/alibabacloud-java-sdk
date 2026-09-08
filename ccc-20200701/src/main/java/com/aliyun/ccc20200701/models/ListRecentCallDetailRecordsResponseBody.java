// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListRecentCallDetailRecordsResponseBody extends TeaModel {
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
    public ListRecentCallDetailRecordsResponseBodyData data;

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
     * <p>EEEE671A-3E24-4A04-81E6-6C4F5B39DF75</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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

    public ListRecentCallDetailRecordsResponseBody setData(ListRecentCallDetailRecordsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListRecentCallDetailRecordsResponseBodyData getData() {
        return this.data;
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

    public static class ListRecentCallDetailRecordsResponseBodyDataList extends TeaModel {
        /**
         * <p>List of agent IDs. Multiple values are separated by commas.</p>
         * 
         * <strong>example:</strong>
         * <p>agent@ccc-test</p>
         */
        @NameInMap("AgentIds")
        public String agentIds;

        /**
         * <p>Call duration in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("CallDuration")
        public String callDuration;

        /**
         * <p>Called number.</p>
         * 
         * <strong>example:</strong>
         * <p>1332315****</p>
         */
        @NameInMap("CalledNumber")
        public String calledNumber;

        /**
         * <p>Calling number.</p>
         * 
         * <strong>example:</strong>
         * <p>0533128****</p>
         */
        @NameInMap("CallingNumber")
        public String callingNumber;

        /**
         * <p>The reason the call ended.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("ContactDisposition")
        public String contactDisposition;

        /**
         * <p>Call ID.</p>
         * 
         * <strong>example:</strong>
         * <p>job-7660472242845****</p>
         */
        @NameInMap("ContactId")
        public String contactId;

        /**
         * <p>Call type.</p>
         * 
         * <strong>example:</strong>
         * <p>Outbound</p>
         */
        @NameInMap("ContactType")
        public String contactType;

        /**
         * <p>Call duration in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("Duration")
        public Long duration;

        /**
         * <p>Instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Skill groups to which the agent participating in the call belongs. Multiple skill groups are separated by commas.</p>
         * 
         * <strong>example:</strong>
         * <p>skillgroup@ccc-test</p>
         */
        @NameInMap("SkillGroupIds")
        public String skillGroupIds;

        /**
         * <p>Call start time. For inbound calls, it starts when the call enters IVR. For outbound calls, it starts when the call is answered. The format is a Unix timestamp string in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1532448000000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        public static ListRecentCallDetailRecordsResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListRecentCallDetailRecordsResponseBodyDataList self = new ListRecentCallDetailRecordsResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListRecentCallDetailRecordsResponseBodyDataList setAgentIds(String agentIds) {
            this.agentIds = agentIds;
            return this;
        }
        public String getAgentIds() {
            return this.agentIds;
        }

        public ListRecentCallDetailRecordsResponseBodyDataList setCallDuration(String callDuration) {
            this.callDuration = callDuration;
            return this;
        }
        public String getCallDuration() {
            return this.callDuration;
        }

        public ListRecentCallDetailRecordsResponseBodyDataList setCalledNumber(String calledNumber) {
            this.calledNumber = calledNumber;
            return this;
        }
        public String getCalledNumber() {
            return this.calledNumber;
        }

        public ListRecentCallDetailRecordsResponseBodyDataList setCallingNumber(String callingNumber) {
            this.callingNumber = callingNumber;
            return this;
        }
        public String getCallingNumber() {
            return this.callingNumber;
        }

        public ListRecentCallDetailRecordsResponseBodyDataList setContactDisposition(String contactDisposition) {
            this.contactDisposition = contactDisposition;
            return this;
        }
        public String getContactDisposition() {
            return this.contactDisposition;
        }

        public ListRecentCallDetailRecordsResponseBodyDataList setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }
        public String getContactId() {
            return this.contactId;
        }

        public ListRecentCallDetailRecordsResponseBodyDataList setContactType(String contactType) {
            this.contactType = contactType;
            return this;
        }
        public String getContactType() {
            return this.contactType;
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

        public ListRecentCallDetailRecordsResponseBodyDataList setSkillGroupIds(String skillGroupIds) {
            this.skillGroupIds = skillGroupIds;
            return this;
        }
        public String getSkillGroupIds() {
            return this.skillGroupIds;
        }

        public ListRecentCallDetailRecordsResponseBodyDataList setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

    public static class ListRecentCallDetailRecordsResponseBodyData extends TeaModel {
        /**
         * <p>List of call records.</p>
         */
        @NameInMap("List")
        public java.util.List<ListRecentCallDetailRecordsResponseBodyDataList> list;

        /**
         * <p>Page number, ranging from 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>Page size, ranging from 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>Total count. The actual total is returned only when PageNumber is 1; otherwise, it is 0.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListRecentCallDetailRecordsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListRecentCallDetailRecordsResponseBodyData self = new ListRecentCallDetailRecordsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListRecentCallDetailRecordsResponseBodyData setList(java.util.List<ListRecentCallDetailRecordsResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListRecentCallDetailRecordsResponseBodyDataList> getList() {
            return this.list;
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

    }

}
