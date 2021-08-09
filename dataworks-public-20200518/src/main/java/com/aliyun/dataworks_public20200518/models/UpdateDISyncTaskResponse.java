// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateDISyncTaskResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public UpdateDISyncTaskResponseData data;

    public static UpdateDISyncTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDISyncTaskResponse self = new UpdateDISyncTaskResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDISyncTaskResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateDISyncTaskResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpdateDISyncTaskResponse setData(UpdateDISyncTaskResponseData data) {
        this.data = data;
        return this;
    }
    public UpdateDISyncTaskResponseData getData() {
        return this.data;
    }

    public static class UpdateDISyncTaskResponseData extends TeaModel {
        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        public static UpdateDISyncTaskResponseData build(java.util.Map<String, ?> map) throws Exception {
            UpdateDISyncTaskResponseData self = new UpdateDISyncTaskResponseData();
            return TeaModel.build(map, self);
        }

        public UpdateDISyncTaskResponseData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateDISyncTaskResponseData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
