// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class PrepareUpgradeResponseBody extends TeaModel {
    @NameInMap("Data")
    public PrepareUpgradeResponseBodyData data;

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
     * <p>77B97AFB-7C9D-50FF-A72D-F13FD73E49D8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static PrepareUpgradeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PrepareUpgradeResponseBody self = new PrepareUpgradeResponseBody();
        return TeaModel.build(map, self);
    }

    public PrepareUpgradeResponseBody setData(PrepareUpgradeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PrepareUpgradeResponseBodyData getData() {
        return this.data;
    }

    public PrepareUpgradeResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public PrepareUpgradeResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public PrepareUpgradeResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public PrepareUpgradeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PrepareUpgradeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PrepareUpgradeResponseBodyData extends TeaModel {
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

        public static PrepareUpgradeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PrepareUpgradeResponseBodyData self = new PrepareUpgradeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PrepareUpgradeResponseBodyData setFailReason(String failReason) {
            this.failReason = failReason;
            return this;
        }
        public String getFailReason() {
            return this.failReason;
        }

        public PrepareUpgradeResponseBodyData setReasonKey(String reasonKey) {
            this.reasonKey = reasonKey;
            return this;
        }
        public String getReasonKey() {
            return this.reasonKey;
        }

        public PrepareUpgradeResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
