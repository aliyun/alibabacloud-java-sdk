// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetZookeeperDataImportUrlResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request failed.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The URL that is used to upload the configuration file.</p>
     */
    @NameInMap("Data")
    public GetZookeeperDataImportUrlResponseBodyData data;

    /**
     * <p>The dynamic part in the error message. This parameter is used to replace the \*\*%s\*\* variable in the **ErrMessage** parameter.</p>
     * <br>
     * <p>>  If the return value of the **ErrMessage** parameter is **The Value of Input Parameter %s is not valid** and the return value of the **DynamicMessage** parameter is **DtsJobId**, the specified **DtsJobId** parameter is invalid.</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The message returned.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request was successfully processed.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   `true`: The request was successful.</p>
     * <p>*   `false`: The request failed.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status code. A value of 200 is returned if the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetZookeeperDataImportUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetZookeeperDataImportUrlResponseBody self = new GetZookeeperDataImportUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetZookeeperDataImportUrlResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetZookeeperDataImportUrlResponseBody setData(GetZookeeperDataImportUrlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetZookeeperDataImportUrlResponseBodyData getData() {
        return this.data;
    }

    public GetZookeeperDataImportUrlResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public GetZookeeperDataImportUrlResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public GetZookeeperDataImportUrlResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetZookeeperDataImportUrlResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetZookeeperDataImportUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetZookeeperDataImportUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetZookeeperDataImportUrlResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetZookeeperDataImportUrlResponseBodyData extends TeaModel {
        /**
         * <p>code</p>
         */
        @NameInMap("MaxSize")
        public String maxSize;

        /**
         * <p>The maximum size of a file that can be uploaded each time. Unit: MB.</p>
         */
        @NameInMap("Url")
        public String url;

        public static GetZookeeperDataImportUrlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetZookeeperDataImportUrlResponseBodyData self = new GetZookeeperDataImportUrlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetZookeeperDataImportUrlResponseBodyData setMaxSize(String maxSize) {
            this.maxSize = maxSize;
            return this;
        }
        public String getMaxSize() {
            return this.maxSize;
        }

        public GetZookeeperDataImportUrlResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
