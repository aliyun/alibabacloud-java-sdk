// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDISyncTaskResponseBody extends TeaModel {
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetDISyncTaskResponseBodyData data;

    public static GetDISyncTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDISyncTaskResponseBody self = new GetDISyncTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDISyncTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetDISyncTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDISyncTaskResponseBody setData(GetDISyncTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDISyncTaskResponseBodyData getData() {
        return this.data;
    }

    public static class GetDISyncTaskResponseBodyData extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Status")
        public String status;

        @NameInMap("Message")
        public String message;

        public static GetDISyncTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDISyncTaskResponseBodyData self = new GetDISyncTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDISyncTaskResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetDISyncTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDISyncTaskResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
