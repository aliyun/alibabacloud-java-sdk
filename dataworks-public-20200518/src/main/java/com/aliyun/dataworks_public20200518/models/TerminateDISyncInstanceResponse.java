// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class TerminateDISyncInstanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public TerminateDISyncInstanceResponseData data;

    public static TerminateDISyncInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        TerminateDISyncInstanceResponse self = new TerminateDISyncInstanceResponse();
        return TeaModel.build(map, self);
    }

    public TerminateDISyncInstanceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TerminateDISyncInstanceResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public TerminateDISyncInstanceResponse setData(TerminateDISyncInstanceResponseData data) {
        this.data = data;
        return this;
    }
    public TerminateDISyncInstanceResponseData getData() {
        return this.data;
    }

    public static class TerminateDISyncInstanceResponseData extends TeaModel {
        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        public static TerminateDISyncInstanceResponseData build(java.util.Map<String, ?> map) throws Exception {
            TerminateDISyncInstanceResponseData self = new TerminateDISyncInstanceResponseData();
            return TeaModel.build(map, self);
        }

        public TerminateDISyncInstanceResponseData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public TerminateDISyncInstanceResponseData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
