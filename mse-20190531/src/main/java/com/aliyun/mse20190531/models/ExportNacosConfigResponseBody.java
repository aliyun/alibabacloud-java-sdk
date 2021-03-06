// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ExportNacosConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Data")
    public ExportNacosConfigResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Success")
    public Boolean success;

    public static ExportNacosConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportNacosConfigResponseBody self = new ExportNacosConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportNacosConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExportNacosConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ExportNacosConfigResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ExportNacosConfigResponseBody setData(ExportNacosConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ExportNacosConfigResponseBodyData getData() {
        return this.data;
    }

    public ExportNacosConfigResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ExportNacosConfigResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ExportNacosConfigResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ExportNacosConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ExportNacosConfigResponseBodyData extends TeaModel {
        @NameInMap("Url")
        public String url;

        public static ExportNacosConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ExportNacosConfigResponseBodyData self = new ExportNacosConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ExportNacosConfigResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
