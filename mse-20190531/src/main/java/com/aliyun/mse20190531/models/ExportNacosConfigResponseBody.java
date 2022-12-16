// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ExportNacosConfigResponseBody extends TeaModel {
    // The status code returned.
    @NameInMap("Code")
    public Integer code;

    // The details of the data.
    @NameInMap("Data")
    public ExportNacosConfigResponseBodyData data;

    // The dynamic part in the error message. This parameter is used to replace the **%s** variable in the **Message** parameter. 
    // > If the specified **InstanceId** parameter is invalid, **The Value of Input Parameter %s is not valid** is returned for **Message** and **InstanceId** is returned for **DynamicMessage**.
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    // The error code returned if the request fails.
    @NameInMap("ErrorCode")
    public String errorCode;

    // The HTTP status code returned.
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // The message returned.
    @NameInMap("Message")
    public String message;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request is successful. Valid values:
    // - `true`: The request is successful. 
    // - `false`: The request fails.
    @NameInMap("Success")
    public Boolean success;

    public static ExportNacosConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportNacosConfigResponseBody self = new ExportNacosConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportNacosConfigResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ExportNacosConfigResponseBody setData(ExportNacosConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ExportNacosConfigResponseBodyData getData() {
        return this.data;
    }

    public ExportNacosConfigResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ExportNacosConfigResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ExportNacosConfigResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ExportNacosConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ExportNacosConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExportNacosConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ExportNacosConfigResponseBodyData extends TeaModel {
        // The URL used to download the exported configurations.
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
