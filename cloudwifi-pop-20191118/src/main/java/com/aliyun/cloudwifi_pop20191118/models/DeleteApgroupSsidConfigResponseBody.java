// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class DeleteApgroupSsidConfigResponseBody extends TeaModel {
    // data
    @NameInMap("Data")
    public DeleteApgroupSsidConfigResponseBodyData data;

    // errorCode
    @NameInMap("ErrorCode")
    public Integer errorCode;

    // errorMsg
    @NameInMap("ErrorMessage")
    public String errorMessage;

    // success
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    // requestId
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteApgroupSsidConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteApgroupSsidConfigResponseBody self = new DeleteApgroupSsidConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteApgroupSsidConfigResponseBody setData(DeleteApgroupSsidConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteApgroupSsidConfigResponseBodyData getData() {
        return this.data;
    }

    public DeleteApgroupSsidConfigResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DeleteApgroupSsidConfigResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DeleteApgroupSsidConfigResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public DeleteApgroupSsidConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteApgroupSsidConfigResponseBodyData extends TeaModel {
        // id
        @NameInMap("Id")
        public Long id;

        // taskId
        @NameInMap("TaskId")
        public String taskId;

        public static DeleteApgroupSsidConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteApgroupSsidConfigResponseBodyData self = new DeleteApgroupSsidConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteApgroupSsidConfigResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DeleteApgroupSsidConfigResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
