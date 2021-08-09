// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteDISyncTaskResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public DeleteDISyncTaskResponseData data;

    public static DeleteDISyncTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDISyncTaskResponse self = new DeleteDISyncTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDISyncTaskResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteDISyncTaskResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DeleteDISyncTaskResponse setData(DeleteDISyncTaskResponseData data) {
        this.data = data;
        return this;
    }
    public DeleteDISyncTaskResponseData getData() {
        return this.data;
    }

    public static class DeleteDISyncTaskResponseData extends TeaModel {
        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        public static DeleteDISyncTaskResponseData build(java.util.Map<String, ?> map) throws Exception {
            DeleteDISyncTaskResponseData self = new DeleteDISyncTaskResponseData();
            return TeaModel.build(map, self);
        }

        public DeleteDISyncTaskResponseData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DeleteDISyncTaskResponseData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
