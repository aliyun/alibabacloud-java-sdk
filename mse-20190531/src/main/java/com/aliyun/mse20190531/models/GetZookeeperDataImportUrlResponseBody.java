// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetZookeeperDataImportUrlResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetZookeeperDataImportUrlResponseBodyData data;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("MaxSize")
        public String maxSize;

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
