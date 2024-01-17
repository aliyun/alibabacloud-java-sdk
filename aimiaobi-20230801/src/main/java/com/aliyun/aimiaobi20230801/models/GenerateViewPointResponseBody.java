// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GenerateViewPointResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GenerateViewPointResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GenerateViewPointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateViewPointResponseBody self = new GenerateViewPointResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateViewPointResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GenerateViewPointResponseBody setData(java.util.List<GenerateViewPointResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GenerateViewPointResponseBodyData> getData() {
        return this.data;
    }

    public GenerateViewPointResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GenerateViewPointResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GenerateViewPointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateViewPointResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GenerateViewPointResponseBodyData extends TeaModel {
        @NameInMap("Point")
        public String point;

        public static GenerateViewPointResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GenerateViewPointResponseBodyData self = new GenerateViewPointResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GenerateViewPointResponseBodyData setPoint(String point) {
            this.point = point;
            return this;
        }
        public String getPoint() {
            return this.point;
        }

    }

}
