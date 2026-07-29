// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class DiscardUpgradeResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public java.util.List<DiscardUpgradeResponseBodyData> data;

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
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A47D57BE-59D1-51A6-9CC3-080C07852C4E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the API request itself was successful. This does not reflect the outcome of the operation. For the operation\&quot;s result, see the Success field in the Data array.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DiscardUpgradeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DiscardUpgradeResponseBody self = new DiscardUpgradeResponseBody();
        return TeaModel.build(map, self);
    }

    public DiscardUpgradeResponseBody setData(java.util.List<DiscardUpgradeResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DiscardUpgradeResponseBodyData> getData() {
        return this.data;
    }

    public DiscardUpgradeResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DiscardUpgradeResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DiscardUpgradeResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DiscardUpgradeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DiscardUpgradeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DiscardUpgradeResponseBodyData extends TeaModel {
        /**
         * <p>The reason the upgrade failed.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("FailReason")
        public String failReason;

        /**
         * <p>The reason key.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("ReasonKey")
        public String reasonKey;

        /**
         * <p>Indicates whether the operation was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static DiscardUpgradeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DiscardUpgradeResponseBodyData self = new DiscardUpgradeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DiscardUpgradeResponseBodyData setFailReason(String failReason) {
            this.failReason = failReason;
            return this;
        }
        public String getFailReason() {
            return this.failReason;
        }

        public DiscardUpgradeResponseBodyData setReasonKey(String reasonKey) {
            this.reasonKey = reasonKey;
            return this;
        }
        public String getReasonKey() {
            return this.reasonKey;
        }

        public DiscardUpgradeResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
