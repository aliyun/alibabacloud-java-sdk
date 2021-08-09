// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeployDISyncTaskResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public DeployDISyncTaskResponseData data;

    public static DeployDISyncTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeployDISyncTaskResponse self = new DeployDISyncTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeployDISyncTaskResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeployDISyncTaskResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DeployDISyncTaskResponse setData(DeployDISyncTaskResponseData data) {
        this.data = data;
        return this;
    }
    public DeployDISyncTaskResponseData getData() {
        return this.data;
    }

    public static class DeployDISyncTaskResponseData extends TeaModel {
        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        public static DeployDISyncTaskResponseData build(java.util.Map<String, ?> map) throws Exception {
            DeployDISyncTaskResponseData self = new DeployDISyncTaskResponseData();
            return TeaModel.build(map, self);
        }

        public DeployDISyncTaskResponseData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DeployDISyncTaskResponseData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
