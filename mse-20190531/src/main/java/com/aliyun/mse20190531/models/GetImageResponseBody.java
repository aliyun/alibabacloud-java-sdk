// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetImageResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("HttpCode")
    public String httpCode;

    @NameInMap("Data")
    public GetImageResponseBodyData data;

    public static GetImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetImageResponseBody self = new GetImageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetImageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetImageResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetImageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetImageResponseBody setHttpCode(String httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public String getHttpCode() {
        return this.httpCode;
    }

    public GetImageResponseBody setData(GetImageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetImageResponseBodyData getData() {
        return this.data;
    }

    public static class GetImageResponseBodyData extends TeaModel {
        // 当前集群镜像版本的4位全名
        @NameInMap("CurrentVersionFullShowName")
        public String currentVersionFullShowName;

        // 可升级的增量版本Code
        @NameInMap("MaxVersionCode")
        public String maxVersionCode;

        // 可升级的增量版本全名
        @NameInMap("MaxVersionFullShowName")
        public String maxVersionFullShowName;

        // 可升级的最大版本变更日志url
        @NameInMap("MaxVersionChangelogUrl")
        public String maxVersionChangelogUrl;

        public static GetImageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetImageResponseBodyData self = new GetImageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetImageResponseBodyData setCurrentVersionFullShowName(String currentVersionFullShowName) {
            this.currentVersionFullShowName = currentVersionFullShowName;
            return this;
        }
        public String getCurrentVersionFullShowName() {
            return this.currentVersionFullShowName;
        }

        public GetImageResponseBodyData setMaxVersionCode(String maxVersionCode) {
            this.maxVersionCode = maxVersionCode;
            return this;
        }
        public String getMaxVersionCode() {
            return this.maxVersionCode;
        }

        public GetImageResponseBodyData setMaxVersionFullShowName(String maxVersionFullShowName) {
            this.maxVersionFullShowName = maxVersionFullShowName;
            return this;
        }
        public String getMaxVersionFullShowName() {
            return this.maxVersionFullShowName;
        }

        public GetImageResponseBodyData setMaxVersionChangelogUrl(String maxVersionChangelogUrl) {
            this.maxVersionChangelogUrl = maxVersionChangelogUrl;
            return this;
        }
        public String getMaxVersionChangelogUrl() {
            return this.maxVersionChangelogUrl;
        }

    }

}
