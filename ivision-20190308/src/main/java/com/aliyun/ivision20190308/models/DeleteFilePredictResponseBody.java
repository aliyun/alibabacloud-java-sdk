// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivision20190308.models;

import com.aliyun.tea.*;

public class DeleteFilePredictResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public DeleteFilePredictResponseBodyData data;

    @NameInMap("Code")
    public String code;

    public static DeleteFilePredictResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteFilePredictResponseBody self = new DeleteFilePredictResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteFilePredictResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteFilePredictResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteFilePredictResponseBody setData(DeleteFilePredictResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteFilePredictResponseBodyData getData() {
        return this.data;
    }

    public DeleteFilePredictResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class DeleteFilePredictResponseBodyData extends TeaModel {
        @NameInMap("TaskId")
        public String taskId;

        public static DeleteFilePredictResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteFilePredictResponseBodyData self = new DeleteFilePredictResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteFilePredictResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
