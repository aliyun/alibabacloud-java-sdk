// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDISyncInstanceInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public GetDISyncInstanceInfoResponseData data;

    public static GetDISyncInstanceInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDISyncInstanceInfoResponse self = new GetDISyncInstanceInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetDISyncInstanceInfoResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDISyncInstanceInfoResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetDISyncInstanceInfoResponse setData(GetDISyncInstanceInfoResponseData data) {
        this.data = data;
        return this;
    }
    public GetDISyncInstanceInfoResponseData getData() {
        return this.data;
    }

    public static class GetDISyncInstanceInfoResponseData extends TeaModel {
        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        public static GetDISyncInstanceInfoResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetDISyncInstanceInfoResponseData self = new GetDISyncInstanceInfoResponseData();
            return TeaModel.build(map, self);
        }

        public GetDISyncInstanceInfoResponseData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDISyncInstanceInfoResponseData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDISyncInstanceInfoResponseData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
