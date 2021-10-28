// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class QueryOutboundTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryOutboundTaskResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("BuId")
        public Long buId;

        @NameInMap("CallerNum")
        public String callerNum;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("DepartmentId")
        public Long departmentId;

        @NameInMap("Description")
        public String description;

        @NameInMap("EndDate")
        public String endDate;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("ExtAttrs")
        public String extAttrs;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Model")
        public Integer model;

        @NameInMap("Modifier")
        public String modifier;

        @NameInMap("Name")
        public String name;

        @NameInMap("RetryInterval")
        public Integer retryInterval;

        @NameInMap("RetryTime")
        public Integer retryTime;

        @NameInMap("SkillGroup")
        public Long skillGroup;

        @NameInMap("StartDate")
        public String startDate;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public Integer status;

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
        @NameInMap("CurrentPage")
        public String currentPage;

        @NameInMap("List")
        public java.util.List<QueryOutboundTaskResponseBodyDataList> list;

        @NameInMap("PageSize")
        public String pageSize;

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
