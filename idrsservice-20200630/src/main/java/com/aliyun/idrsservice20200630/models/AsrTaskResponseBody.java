// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class AsrTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public AsrTaskResponseBodyData data;

    @NameInMap("HttpCode")
    public Integer httpCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static AsrTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AsrTaskResponseBody self = new AsrTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public AsrTaskResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public AsrTaskResponseBody setData(AsrTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AsrTaskResponseBodyData getData() {
        return this.data;
    }

    public AsrTaskResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public AsrTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AsrTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AsrTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AsrTaskResponseBodyData extends TeaModel {
        @NameInMap("Result")
        public String result;

        public static AsrTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AsrTaskResponseBodyData self = new AsrTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AsrTaskResponseBodyData setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

    }

}
