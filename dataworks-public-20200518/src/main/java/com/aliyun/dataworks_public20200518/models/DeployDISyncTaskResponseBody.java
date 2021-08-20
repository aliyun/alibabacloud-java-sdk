// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeployDISyncTaskResponseBody extends TeaModel {
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public DeployDISyncTaskResponseBodyData data;

    public static DeployDISyncTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeployDISyncTaskResponseBody self = new DeployDISyncTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DeployDISyncTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DeployDISyncTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeployDISyncTaskResponseBody setData(DeployDISyncTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeployDISyncTaskResponseBodyData getData() {
        return this.data;
    }

    public static class DeployDISyncTaskResponseBodyData extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Message")
        public String message;

        public static DeployDISyncTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeployDISyncTaskResponseBodyData self = new DeployDISyncTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeployDISyncTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DeployDISyncTaskResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
