// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class CancelVideoTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CancelVideoTaskResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CancelVideoTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelVideoTaskResponseBody self = new CancelVideoTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelVideoTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CancelVideoTaskResponseBody setData(CancelVideoTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CancelVideoTaskResponseBodyData getData() {
        return this.data;
    }

    public CancelVideoTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CancelVideoTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CancelVideoTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CancelVideoTaskResponseBodyData extends TeaModel {
        @NameInMap("FailReason")
        public String failReason;

        @NameInMap("IsCancel")
        public Boolean isCancel;

        @NameInMap("TaskUuid")
        public String taskUuid;

        public static CancelVideoTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CancelVideoTaskResponseBodyData self = new CancelVideoTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CancelVideoTaskResponseBodyData setFailReason(String failReason) {
            this.failReason = failReason;
            return this;
        }
        public String getFailReason() {
            return this.failReason;
        }

        public CancelVideoTaskResponseBodyData setIsCancel(Boolean isCancel) {
            this.isCancel = isCancel;
            return this;
        }
        public Boolean getIsCancel() {
            return this.isCancel;
        }

        public CancelVideoTaskResponseBodyData setTaskUuid(String taskUuid) {
            this.taskUuid = taskUuid;
            return this;
        }
        public String getTaskUuid() {
            return this.taskUuid;
        }

    }

}
