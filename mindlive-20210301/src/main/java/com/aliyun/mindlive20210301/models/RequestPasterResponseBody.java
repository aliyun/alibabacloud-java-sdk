// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301.models;

import com.aliyun.tea.*;

public class RequestPasterResponseBody extends TeaModel {
    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Data")
    public java.util.List<RequestPasterResponseBodyData> data;

    public static RequestPasterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RequestPasterResponseBody self = new RequestPasterResponseBody();
        return TeaModel.build(map, self);
    }

    public RequestPasterResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public RequestPasterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RequestPasterResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public RequestPasterResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public RequestPasterResponseBody setData(java.util.List<RequestPasterResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<RequestPasterResponseBodyData> getData() {
        return this.data;
    }

    public static class RequestPasterResponseBodyData extends TeaModel {
        @NameInMap("ResourceUuid")
        public String resourceUuid;

        @NameInMap("DownloadUrl")
        public String downloadUrl;

        @NameInMap("Configs")
        public java.util.Map<String, ?> configs;

        public static RequestPasterResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RequestPasterResponseBodyData self = new RequestPasterResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RequestPasterResponseBodyData setResourceUuid(String resourceUuid) {
            this.resourceUuid = resourceUuid;
            return this;
        }
        public String getResourceUuid() {
            return this.resourceUuid;
        }

        public RequestPasterResponseBodyData setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public RequestPasterResponseBodyData setConfigs(java.util.Map<String, ?> configs) {
            this.configs = configs;
            return this;
        }
        public java.util.Map<String, ?> getConfigs() {
            return this.configs;
        }

    }

}
