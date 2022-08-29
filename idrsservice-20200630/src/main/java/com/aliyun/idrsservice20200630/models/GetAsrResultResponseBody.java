// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetAsrResultResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetAsrResultResponseBodyData data;

    @NameInMap("HttpCode")
    public Integer httpCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetAsrResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAsrResultResponseBody self = new GetAsrResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAsrResultResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetAsrResultResponseBody setData(GetAsrResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAsrResultResponseBodyData getData() {
        return this.data;
    }

    public GetAsrResultResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public GetAsrResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAsrResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAsrResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAsrResultResponseBodyData extends TeaModel {
        @NameInMap("Result")
        public String result;

        public static GetAsrResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAsrResultResponseBodyData self = new GetAsrResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAsrResultResponseBodyData setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

    }

}
