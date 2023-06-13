// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetImageResponseBody extends TeaModel {
    /**
     * <p>The details of the data.</p>
     */
    @NameInMap("Data")
    public GetImageResponseBodyData data;

    /**
     * <p>The error code returned if the request failed.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("HttpCode")
    public String httpCode;

    /**
     * <p>The message returned.</p>
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
     * <br>
     * <p>*   `true`: The request was successful.</p>
     * <p>*   `false`: The request failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetImageResponseBody self = new GetImageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetImageResponseBody setData(GetImageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetImageResponseBodyData getData() {
        return this.data;
    }

    public GetImageResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetImageResponseBody setHttpCode(String httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public String getHttpCode() {
        return this.httpCode;
    }

    public GetImageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetImageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetImageResponseBodyData extends TeaModel {
        /**
         * <p>The full version number of the current instance image. The parameter is in the X.X.X.X format.</p>
         */
        @NameInMap("CurrentVersionFullShowName")
        public String currentVersionFullShowName;

        /**
         * <p>The URL of the changelog for the maximum version to which the current version can be upgraded.</p>
         */
        @NameInMap("MaxVersionChangelogUrl")
        public String maxVersionChangelogUrl;

        /**
         * <p>The code of the maximum version to which the current version can be upgraded.</p>
         */
        @NameInMap("MaxVersionCode")
        public String maxVersionCode;

        /**
         * <p>The full number of the maximum version to which the current version can be upgraded.</p>
         */
        @NameInMap("MaxVersionFullShowName")
        public String maxVersionFullShowName;

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

        public GetImageResponseBodyData setMaxVersionChangelogUrl(String maxVersionChangelogUrl) {
            this.maxVersionChangelogUrl = maxVersionChangelogUrl;
            return this;
        }
        public String getMaxVersionChangelogUrl() {
            return this.maxVersionChangelogUrl;
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

    }

}
