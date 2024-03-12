// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ExportIntervenesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ExportIntervenesResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ExportIntervenesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportIntervenesResponseBody self = new ExportIntervenesResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportIntervenesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ExportIntervenesResponseBody setData(ExportIntervenesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ExportIntervenesResponseBodyData getData() {
        return this.data;
    }

    public ExportIntervenesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ExportIntervenesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ExportIntervenesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExportIntervenesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ExportIntervenesResponseBodyData extends TeaModel {
        @NameInMap("FileUrl")
        public String fileUrl;

        public static ExportIntervenesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ExportIntervenesResponseBodyData self = new ExportIntervenesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ExportIntervenesResponseBodyData setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

    }

}
