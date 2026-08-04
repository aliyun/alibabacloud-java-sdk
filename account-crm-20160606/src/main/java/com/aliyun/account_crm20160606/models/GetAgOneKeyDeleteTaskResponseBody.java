// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class GetAgOneKeyDeleteTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TaskDto")
    public GetAgOneKeyDeleteTaskResponseBodyTaskDto taskDto;

    public static GetAgOneKeyDeleteTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAgOneKeyDeleteTaskResponseBody self = new GetAgOneKeyDeleteTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAgOneKeyDeleteTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAgOneKeyDeleteTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAgOneKeyDeleteTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAgOneKeyDeleteTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetAgOneKeyDeleteTaskResponseBody setTaskDto(GetAgOneKeyDeleteTaskResponseBodyTaskDto taskDto) {
        this.taskDto = taskDto;
        return this;
    }
    public GetAgOneKeyDeleteTaskResponseBodyTaskDto getTaskDto() {
        return this.taskDto;
    }

    public static class GetAgOneKeyDeleteTaskResponseBodyTaskDto extends TeaModel {
        @NameInMap("DeleteStatus")
        public String deleteStatus;

        @NameInMap("ExistQuietPeriod")
        public Boolean existQuietPeriod;

        @NameInMap("QuietPeriodEndTime")
        public String quietPeriodEndTime;

        public static GetAgOneKeyDeleteTaskResponseBodyTaskDto build(java.util.Map<String, ?> map) throws Exception {
            GetAgOneKeyDeleteTaskResponseBodyTaskDto self = new GetAgOneKeyDeleteTaskResponseBodyTaskDto();
            return TeaModel.build(map, self);
        }

        public GetAgOneKeyDeleteTaskResponseBodyTaskDto setDeleteStatus(String deleteStatus) {
            this.deleteStatus = deleteStatus;
            return this;
        }
        public String getDeleteStatus() {
            return this.deleteStatus;
        }

        public GetAgOneKeyDeleteTaskResponseBodyTaskDto setExistQuietPeriod(Boolean existQuietPeriod) {
            this.existQuietPeriod = existQuietPeriod;
            return this;
        }
        public Boolean getExistQuietPeriod() {
            return this.existQuietPeriod;
        }

        public GetAgOneKeyDeleteTaskResponseBodyTaskDto setQuietPeriodEndTime(String quietPeriodEndTime) {
            this.quietPeriodEndTime = quietPeriodEndTime;
            return this;
        }
        public String getQuietPeriodEndTime() {
            return this.quietPeriodEndTime;
        }

    }

}
