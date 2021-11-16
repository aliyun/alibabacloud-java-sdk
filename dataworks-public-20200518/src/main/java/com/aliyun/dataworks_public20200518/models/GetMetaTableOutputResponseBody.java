// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTableOutputResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetMetaTableOutputResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetMetaTableOutputResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableOutputResponseBody self = new GetMetaTableOutputResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMetaTableOutputResponseBody setData(GetMetaTableOutputResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMetaTableOutputResponseBodyData getData() {
        return this.data;
    }

    public GetMetaTableOutputResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetMetaTableOutputResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetMetaTableOutputResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetMetaTableOutputResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMetaTableOutputResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetMetaTableOutputResponseBodyDataDataEntityList extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("TableGuid")
        public String tableGuid;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TaskInstanceId")
        public Long taskInstanceId;

        @NameInMap("WaitTime")
        public String waitTime;

        public static GetMetaTableOutputResponseBodyDataDataEntityList build(java.util.Map<String, ?> map) throws Exception {
            GetMetaTableOutputResponseBodyDataDataEntityList self = new GetMetaTableOutputResponseBodyDataDataEntityList();
            return TeaModel.build(map, self);
        }

        public GetMetaTableOutputResponseBodyDataDataEntityList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetMetaTableOutputResponseBodyDataDataEntityList setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetMetaTableOutputResponseBodyDataDataEntityList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetMetaTableOutputResponseBodyDataDataEntityList setTableGuid(String tableGuid) {
            this.tableGuid = tableGuid;
            return this;
        }
        public String getTableGuid() {
            return this.tableGuid;
        }

        public GetMetaTableOutputResponseBodyDataDataEntityList setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetMetaTableOutputResponseBodyDataDataEntityList setTaskInstanceId(Long taskInstanceId) {
            this.taskInstanceId = taskInstanceId;
            return this;
        }
        public Long getTaskInstanceId() {
            return this.taskInstanceId;
        }

        public GetMetaTableOutputResponseBodyDataDataEntityList setWaitTime(String waitTime) {
            this.waitTime = waitTime;
            return this;
        }
        public String getWaitTime() {
            return this.waitTime;
        }

    }

    public static class GetMetaTableOutputResponseBodyData extends TeaModel {
        @NameInMap("DataEntityList")
        public java.util.List<GetMetaTableOutputResponseBodyDataDataEntityList> dataEntityList;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static GetMetaTableOutputResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMetaTableOutputResponseBodyData self = new GetMetaTableOutputResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMetaTableOutputResponseBodyData setDataEntityList(java.util.List<GetMetaTableOutputResponseBodyDataDataEntityList> dataEntityList) {
            this.dataEntityList = dataEntityList;
            return this;
        }
        public java.util.List<GetMetaTableOutputResponseBodyDataDataEntityList> getDataEntityList() {
            return this.dataEntityList;
        }

        public GetMetaTableOutputResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public GetMetaTableOutputResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetMetaTableOutputResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
