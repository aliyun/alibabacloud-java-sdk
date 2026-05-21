// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class GetUpgradeableResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<GetUpgradeableResponseBodyData> data;

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
     * <p>B8E7613D-E09F-59D3-B35A-FBB7680DCE8F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetUpgradeableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUpgradeableResponseBody self = new GetUpgradeableResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUpgradeableResponseBody setData(java.util.List<GetUpgradeableResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetUpgradeableResponseBodyData> getData() {
        return this.data;
    }

    public GetUpgradeableResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetUpgradeableResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetUpgradeableResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetUpgradeableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUpgradeableResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetUpgradeableResponseBodyData extends TeaModel {
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

        public static GetUpgradeableResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetUpgradeableResponseBodyData self = new GetUpgradeableResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetUpgradeableResponseBodyData setFailReason(String failReason) {
            this.failReason = failReason;
            return this;
        }
        public String getFailReason() {
            return this.failReason;
        }

        public GetUpgradeableResponseBodyData setReasonKey(String reasonKey) {
            this.reasonKey = reasonKey;
            return this;
        }
        public String getReasonKey() {
            return this.reasonKey;
        }

        public GetUpgradeableResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
