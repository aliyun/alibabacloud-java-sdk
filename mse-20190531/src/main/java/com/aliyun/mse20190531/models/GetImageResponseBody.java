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
     * 
     * <strong>example:</strong>
     * <p>mse-100-000</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpCode")
    public String httpCode;

    /**
     * <p>The message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>The request is successfully processed.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>25EA0A83-9007-4E87-808C-637BE1A****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><code>true</code>: The request was successful.</li>
     * <li><code>false</code>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * 
         * <strong>example:</strong>
         * <p>3.5.5.0</p>
         */
        @NameInMap("CurrentVersionFullShowName")
        public String currentVersionFullShowName;

        /**
         * <p>The URL of the changelog for the maximum version to which the current version can be upgraded.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxxxx">https://xxxxx</a></p>
         */
        @NameInMap("MaxVersionChangelogUrl")
        public String maxVersionChangelogUrl;

        /**
         * <p>The code of the maximum version to which the current version can be upgraded.</p>
         * 
         * <strong>example:</strong>
         * <p>ZooKeeper_3_6_3</p>
         */
        @NameInMap("MaxVersionCode")
        public String maxVersionCode;

        /**
         * <p>The full number of the maximum version to which the current version can be upgraded.</p>
         * 
         * <strong>example:</strong>
         * <p>3.6.3.0</p>
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
