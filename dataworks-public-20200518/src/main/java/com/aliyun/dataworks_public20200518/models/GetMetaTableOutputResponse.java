// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTableOutputResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ErrorCode")
    @Validation(required = true)
    public String errorCode;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public GetMetaTableOutputResponseData data;

    public static GetMetaTableOutputResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableOutputResponse self = new GetMetaTableOutputResponse();
        return TeaModel.build(map, self);
    }

    public GetMetaTableOutputResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMetaTableOutputResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetMetaTableOutputResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetMetaTableOutputResponse setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetMetaTableOutputResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetMetaTableOutputResponse setData(GetMetaTableOutputResponseData data) {
        this.data = data;
        return this;
    }
    public GetMetaTableOutputResponseData getData() {
        return this.data;
    }

    public static class GetMetaTableOutputResponseDataDataEntityList extends TeaModel {
        @NameInMap("TableGuid")
        @Validation(required = true)
        public String tableGuid;

        @NameInMap("TaskId")
        @Validation(required = true)
        public String taskId;

        @NameInMap("StartTime")
        @Validation(required = true)
        public String startTime;

        @NameInMap("EndTime")
        @Validation(required = true)
        public String endTime;

        @NameInMap("WaitTime")
        @Validation(required = true)
        public String waitTime;

        @NameInMap("ProjectId")
        @Validation(required = true)
        public Long projectId;

        @NameInMap("TaskInstanceId")
        @Validation(required = true)
        public Long taskInstanceId;

        public static GetMetaTableOutputResponseDataDataEntityList build(java.util.Map<String, ?> map) throws Exception {
            GetMetaTableOutputResponseDataDataEntityList self = new GetMetaTableOutputResponseDataDataEntityList();
            return TeaModel.build(map, self);
        }

        public GetMetaTableOutputResponseDataDataEntityList setTableGuid(String tableGuid) {
            this.tableGuid = tableGuid;
            return this;
        }
        public String getTableGuid() {
            return this.tableGuid;
        }

        public GetMetaTableOutputResponseDataDataEntityList setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetMetaTableOutputResponseDataDataEntityList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetMetaTableOutputResponseDataDataEntityList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetMetaTableOutputResponseDataDataEntityList setWaitTime(String waitTime) {
            this.waitTime = waitTime;
            return this;
        }
        public String getWaitTime() {
            return this.waitTime;
        }

        public GetMetaTableOutputResponseDataDataEntityList setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetMetaTableOutputResponseDataDataEntityList setTaskInstanceId(Long taskInstanceId) {
            this.taskInstanceId = taskInstanceId;
            return this;
        }
        public Long getTaskInstanceId() {
            return this.taskInstanceId;
        }

    }

    public static class GetMetaTableOutputResponseData extends TeaModel {
        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Long totalCount;

        @NameInMap("DataEntityList")
        @Validation(required = true)
        public java.util.List<GetMetaTableOutputResponseDataDataEntityList> dataEntityList;

        public static GetMetaTableOutputResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetMetaTableOutputResponseData self = new GetMetaTableOutputResponseData();
            return TeaModel.build(map, self);
        }

        public GetMetaTableOutputResponseData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public GetMetaTableOutputResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetMetaTableOutputResponseData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public GetMetaTableOutputResponseData setDataEntityList(java.util.List<GetMetaTableOutputResponseDataDataEntityList> dataEntityList) {
            this.dataEntityList = dataEntityList;
            return this;
        }
        public java.util.List<GetMetaTableOutputResponseDataDataEntityList> getDataEntityList() {
            return this.dataEntityList;
        }

    }

}
