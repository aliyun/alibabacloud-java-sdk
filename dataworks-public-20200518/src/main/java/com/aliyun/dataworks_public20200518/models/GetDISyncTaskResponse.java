// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDISyncTaskResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public GetDISyncTaskResponseData data;

    public static GetDISyncTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDISyncTaskResponse self = new GetDISyncTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetDISyncTaskResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDISyncTaskResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetDISyncTaskResponse setData(GetDISyncTaskResponseData data) {
        this.data = data;
        return this;
    }
    public GetDISyncTaskResponseData getData() {
        return this.data;
    }

    public static class GetDISyncTaskResponseData extends TeaModel {
        @NameInMap("Code")
        @Validation(required = true)
        public String code;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        public static GetDISyncTaskResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetDISyncTaskResponseData self = new GetDISyncTaskResponseData();
            return TeaModel.build(map, self);
        }

        public GetDISyncTaskResponseData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetDISyncTaskResponseData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDISyncTaskResponseData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
