// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class StartDISyncInstanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public StartDISyncInstanceResponseData data;

    public static StartDISyncInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        StartDISyncInstanceResponse self = new StartDISyncInstanceResponse();
        return TeaModel.build(map, self);
    }

    public StartDISyncInstanceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartDISyncInstanceResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public StartDISyncInstanceResponse setData(StartDISyncInstanceResponseData data) {
        this.data = data;
        return this;
    }
    public StartDISyncInstanceResponseData getData() {
        return this.data;
    }

    public static class StartDISyncInstanceResponseData extends TeaModel {
        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        public static StartDISyncInstanceResponseData build(java.util.Map<String, ?> map) throws Exception {
            StartDISyncInstanceResponseData self = new StartDISyncInstanceResponseData();
            return TeaModel.build(map, self);
        }

        public StartDISyncInstanceResponseData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public StartDISyncInstanceResponseData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
