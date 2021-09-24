// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class StopDISyncInstanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public StopDISyncInstanceResponseData data;

    public static StopDISyncInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        StopDISyncInstanceResponse self = new StopDISyncInstanceResponse();
        return TeaModel.build(map, self);
    }

    public StopDISyncInstanceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StopDISyncInstanceResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public StopDISyncInstanceResponse setData(StopDISyncInstanceResponseData data) {
        this.data = data;
        return this;
    }
    public StopDISyncInstanceResponseData getData() {
        return this.data;
    }

    public static class StopDISyncInstanceResponseData extends TeaModel {
        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        public static StopDISyncInstanceResponseData build(java.util.Map<String, ?> map) throws Exception {
            StopDISyncInstanceResponseData self = new StopDISyncInstanceResponseData();
            return TeaModel.build(map, self);
        }

        public StopDISyncInstanceResponseData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public StopDISyncInstanceResponseData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
