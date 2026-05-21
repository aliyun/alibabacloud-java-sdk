// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class UpgradeInstanceResponseBody extends TeaModel {
    @NameInMap("Data")
    public UpgradeInstanceResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>EEB0A71E-7AC7-572F-990F-EE51D3FD35B9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpgradeInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeInstanceResponseBody self = new UpgradeInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeInstanceResponseBody setData(UpgradeInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpgradeInstanceResponseBodyData getData() {
        return this.data;
    }

    public UpgradeInstanceResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpgradeInstanceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UpgradeInstanceResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpgradeInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpgradeInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpgradeInstanceResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("FailReason")
        public String failReason;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("ReasonKey")
        public String reasonKey;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static UpgradeInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpgradeInstanceResponseBodyData self = new UpgradeInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpgradeInstanceResponseBodyData setFailReason(String failReason) {
            this.failReason = failReason;
            return this;
        }
        public String getFailReason() {
            return this.failReason;
        }

        public UpgradeInstanceResponseBodyData setReasonKey(String reasonKey) {
            this.reasonKey = reasonKey;
            return this;
        }
        public String getReasonKey() {
            return this.reasonKey;
        }

        public UpgradeInstanceResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
