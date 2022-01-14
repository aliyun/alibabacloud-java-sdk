// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class SaveApgroupBasicConfigResponseBody extends TeaModel {
    @NameInMap("Data")
    public SaveApgroupBasicConfigResponseBodyData data;

    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    @NameInMap("RequestId")
    public String requestId;

    public static SaveApgroupBasicConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveApgroupBasicConfigResponseBody self = new SaveApgroupBasicConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveApgroupBasicConfigResponseBody setData(SaveApgroupBasicConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SaveApgroupBasicConfigResponseBodyData getData() {
        return this.data;
    }

    public SaveApgroupBasicConfigResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public SaveApgroupBasicConfigResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public SaveApgroupBasicConfigResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public SaveApgroupBasicConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SaveApgroupBasicConfigResponseBodyData extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("TaskId")
        public String taskId;

        public static SaveApgroupBasicConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SaveApgroupBasicConfigResponseBodyData self = new SaveApgroupBasicConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SaveApgroupBasicConfigResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SaveApgroupBasicConfigResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
