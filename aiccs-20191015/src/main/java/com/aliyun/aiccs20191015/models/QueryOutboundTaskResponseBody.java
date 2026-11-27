// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class QueryOutboundTaskResponseBody extends TeaModel {
    /**
     * <p>The status code. A value of 200 indicates that the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The outbound call task information.</p>
     */
    @NameInMap("Data")
    public QueryOutboundTaskResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    /**
     * <p>The status code description.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EE338D98-9BD3-4413-B165</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the API call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static QueryOutboundTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryOutboundTaskResponseBody self = new QueryOutboundTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryOutboundTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryOutboundTaskResponseBody setData(QueryOutboundTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryOutboundTaskResponseBodyData getData() {
        return this.data;
    }

    public QueryOutboundTaskResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryOutboundTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryOutboundTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryOutboundTaskResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class QueryOutboundTaskResponseBodyDataList extends TeaModel {
        /**
         * <p>The tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BuId")
        public Long buId;

        /**
         * <p>The caller number.</p>
         * 
         * <strong>example:</strong>
         * <p>130****0000</p>
         */
        @NameInMap("CallerNum")
        public String callerNum;

        /**
         * <p>The creator.</p>
         * 
         * <strong>example:</strong>
         * <p>Zhang San</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The department ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("DepartmentId")
        public Long departmentId;

        /**
         * <p>The task description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The end date of task execution. The maximum time span between the start time and the end time is 7 days.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-08-09</p>
         */
        @NameInMap("EndDate")
        public String endDate;

        /**
         * <p>The end time of task execution.</p>
         * 
         * <strong>example:</strong>
         * <p>23:00:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The extended attributes.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Note&quot;:&quot;Outbound call test&quot;}</p>
         */
        @NameInMap("ExtAttrs")
        public String extAttrs;

        /**
         * <p>The task creation time. The value is a timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1615445263000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The task update time. The value is a timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1615478401000</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <p>The skill group name.</p>
         * 
         * <strong>example:</strong>
         * <p>Test skill group</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>120001</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The model.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Model")
        public Integer model;

        /**
         * <p>The modifier.</p>
         * 
         * <strong>example:</strong>
         * <p>Zhang San</p>
         */
        @NameInMap("Modifier")
        public String modifier;

        /**
         * <p>The task name.</p>
         * 
         * <strong>example:</strong>
         * <p>Test task</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The retry interval. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("RetryInterval")
        public Integer retryInterval;

        /**
         * <p>The next retry time.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RetryTime")
        public Integer retryTime;

        /**
         * <p>The skill group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>19467</p>
         */
        @NameInMap("SkillGroup")
        public Long skillGroup;

        /**
         * <p>The start date of task execution. The maximum time span between the start time and the end time is 7 days.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-08-08</p>
         */
        @NameInMap("StartDate")
        public String startDate;

        /**
         * <p>The start time of task execution.</p>
         * 
         * <strong>example:</strong>
         * <p>09:09:09</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The task status.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The task type.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Type")
        public Integer type;

        public static QueryOutboundTaskResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryOutboundTaskResponseBodyDataList self = new QueryOutboundTaskResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QueryOutboundTaskResponseBodyDataList setBuId(Long buId) {
            this.buId = buId;
            return this;
        }
        public Long getBuId() {
            return this.buId;
        }

        public QueryOutboundTaskResponseBodyDataList setCallerNum(String callerNum) {
            this.callerNum = callerNum;
            return this;
        }
        public String getCallerNum() {
            return this.callerNum;
        }

        public QueryOutboundTaskResponseBodyDataList setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public QueryOutboundTaskResponseBodyDataList setDepartmentId(Long departmentId) {
            this.departmentId = departmentId;
            return this;
        }
        public Long getDepartmentId() {
            return this.departmentId;
        }

        public QueryOutboundTaskResponseBodyDataList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryOutboundTaskResponseBodyDataList setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public QueryOutboundTaskResponseBodyDataList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public QueryOutboundTaskResponseBodyDataList setExtAttrs(String extAttrs) {
            this.extAttrs = extAttrs;
            return this;
        }
        public String getExtAttrs() {
            return this.extAttrs;
        }

        public QueryOutboundTaskResponseBodyDataList setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryOutboundTaskResponseBodyDataList setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public QueryOutboundTaskResponseBodyDataList setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public QueryOutboundTaskResponseBodyDataList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryOutboundTaskResponseBodyDataList setModel(Integer model) {
            this.model = model;
            return this;
        }
        public Integer getModel() {
            return this.model;
        }

        public QueryOutboundTaskResponseBodyDataList setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public QueryOutboundTaskResponseBodyDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryOutboundTaskResponseBodyDataList setRetryInterval(Integer retryInterval) {
            this.retryInterval = retryInterval;
            return this;
        }
        public Integer getRetryInterval() {
            return this.retryInterval;
        }

        public QueryOutboundTaskResponseBodyDataList setRetryTime(Integer retryTime) {
            this.retryTime = retryTime;
            return this;
        }
        public Integer getRetryTime() {
            return this.retryTime;
        }

        public QueryOutboundTaskResponseBodyDataList setSkillGroup(Long skillGroup) {
            this.skillGroup = skillGroup;
            return this;
        }
        public Long getSkillGroup() {
            return this.skillGroup;
        }

        public QueryOutboundTaskResponseBodyDataList setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public QueryOutboundTaskResponseBodyDataList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryOutboundTaskResponseBodyDataList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryOutboundTaskResponseBodyDataList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class QueryOutboundTaskResponseBodyData extends TeaModel {
        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public String currentPage;

        /**
         * <p>The list of outbound call records.</p>
         */
        @NameInMap("List")
        public java.util.List<QueryOutboundTaskResponseBodyDataList> list;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public String pageSize;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>194</p>
         */
        @NameInMap("TotalResults")
        public String totalResults;

        public static QueryOutboundTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryOutboundTaskResponseBodyData self = new QueryOutboundTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryOutboundTaskResponseBodyData setCurrentPage(String currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public String getCurrentPage() {
            return this.currentPage;
        }

        public QueryOutboundTaskResponseBodyData setList(java.util.List<QueryOutboundTaskResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<QueryOutboundTaskResponseBodyDataList> getList() {
            return this.list;
        }

        public QueryOutboundTaskResponseBodyData setPageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public String getPageSize() {
            return this.pageSize;
        }

        public QueryOutboundTaskResponseBodyData setTotalResults(String totalResults) {
            this.totalResults = totalResults;
            return this;
        }
        public String getTotalResults() {
            return this.totalResults;
        }

    }

}
