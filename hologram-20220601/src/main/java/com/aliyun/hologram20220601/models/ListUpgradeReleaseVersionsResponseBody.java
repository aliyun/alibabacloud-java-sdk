// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class ListUpgradeReleaseVersionsResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListUpgradeReleaseVersionsResponseBodyData> data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>F6DFB9EA-0E2A-52AC-BFD5-1ADBBFFB6A2B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The request result, which indicates whether an exception occurred. This is not related to business logic.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListUpgradeReleaseVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUpgradeReleaseVersionsResponseBody self = new ListUpgradeReleaseVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUpgradeReleaseVersionsResponseBody setData(java.util.List<ListUpgradeReleaseVersionsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListUpgradeReleaseVersionsResponseBodyData> getData() {
        return this.data;
    }

    public ListUpgradeReleaseVersionsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListUpgradeReleaseVersionsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListUpgradeReleaseVersionsResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListUpgradeReleaseVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUpgradeReleaseVersionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListUpgradeReleaseVersionsResponseBodyData extends TeaModel {
        /**
         * <p>The URL of the version release notes.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.alibabacloud.com/help/en/hologres/product-overview/release-notes">https://www.alibabacloud.com/help/en/hologres/product-overview/release-notes</a></p>
         */
        @NameInMap("ReleaseNotesUrl")
        public String releaseNotesUrl;

        /**
         * <p>The version status.</p>
         * 
         * <strong>example:</strong>
         * <p>Stable</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The upgrade strategy.</p>
         */
        @NameInMap("UpgradeStrategy")
        public java.util.List<String> upgradeStrategy;

        /**
         * <p>The version number.</p>
         * 
         * <strong>example:</strong>
         * <p>r2.2.47</p>
         */
        @NameInMap("Version")
        public String version;

        public static ListUpgradeReleaseVersionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListUpgradeReleaseVersionsResponseBodyData self = new ListUpgradeReleaseVersionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListUpgradeReleaseVersionsResponseBodyData setReleaseNotesUrl(String releaseNotesUrl) {
            this.releaseNotesUrl = releaseNotesUrl;
            return this;
        }
        public String getReleaseNotesUrl() {
            return this.releaseNotesUrl;
        }

        public ListUpgradeReleaseVersionsResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListUpgradeReleaseVersionsResponseBodyData setUpgradeStrategy(java.util.List<String> upgradeStrategy) {
            this.upgradeStrategy = upgradeStrategy;
            return this;
        }
        public java.util.List<String> getUpgradeStrategy() {
            return this.upgradeStrategy;
        }

        public ListUpgradeReleaseVersionsResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
