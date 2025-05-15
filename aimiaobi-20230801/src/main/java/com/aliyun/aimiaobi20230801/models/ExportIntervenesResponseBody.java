// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ExportIntervenesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ExportIntervenesResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        @NameInMap("Code")
        public Integer code;

        /**
         * <strong>example:</strong>
         * <p><a href="http://xxx/xxx.xls">http://xxx/xxx.xls</a></p>
         */
        @NameInMap("FileUrl")
        public String fileUrl;

        public static ExportIntervenesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ExportIntervenesResponseBodyData self = new ExportIntervenesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ExportIntervenesResponseBodyData setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
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
