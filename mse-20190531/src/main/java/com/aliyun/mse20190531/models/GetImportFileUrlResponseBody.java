// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetImportFileUrlResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request failed.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The details of the data.</p>
     */
    @NameInMap("Data")
    public GetImportFileUrlResponseBodyData data;

    /**
     * <p>The dynamic part in the error message. This parameter is used to replace the \\\\*\\\\*%s\\\\*\\\\* variable in the **ErrMessage** parameter.\\n\\n>  If the return value of the **ErrMessage** parameter is **The Value of Input Parameter %s is not valid** and the return value of the **DynamicMessage** parameter is **DtsJobId**, the specified **DtsJobId** parameter is invalid.</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The error code returned if the request failed.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <p>*   `true`: The request was successful. </p>
     * <p>*  `false`: The request failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetImportFileUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetImportFileUrlResponseBody self = new GetImportFileUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetImportFileUrlResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetImportFileUrlResponseBody setData(GetImportFileUrlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetImportFileUrlResponseBodyData getData() {
        return this.data;
    }

    public GetImportFileUrlResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public GetImportFileUrlResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetImportFileUrlResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetImportFileUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetImportFileUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetImportFileUrlResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetImportFileUrlResponseBodyData extends TeaModel {
        /**
         * <p>The URL that is used to upload the configuration file.</p>
         */
        @NameInMap("Url")
        public String url;

        public static GetImportFileUrlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetImportFileUrlResponseBodyData self = new GetImportFileUrlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetImportFileUrlResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
