// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpgradeEngineVersionResponseBody extends TeaModel {
    /**
     * <p>The verification information.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The type of the error. Valid values:</p>
     * <br>
     * <p>*   clusterStatus: the health status of the cluster.</p>
     * <p>*   clusterConfigYml: Cluster YML File</p>
     * <p>*   clusterConfigPlugins: Cluster Configuration File</p>
     * <p>*   clusterResource: cluster resources</p>
     * <p>*   clusterSnapshot: cluster snapshot</p>
     */
    @NameInMap("Result")
    public java.util.List<UpgradeEngineVersionResponseBodyResult> result;

    public static UpgradeEngineVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeEngineVersionResponseBody self = new UpgradeEngineVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeEngineVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpgradeEngineVersionResponseBody setResult(java.util.List<UpgradeEngineVersionResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<UpgradeEngineVersionResponseBodyResult> getResult() {
        return this.result;
    }

    public static class UpgradeEngineVersionResponseBodyResultValidateResult extends TeaModel {
        @NameInMap("errorCode")
        public String errorCode;

        @NameInMap("errorMsg")
        public String errorMsg;

        /**
         * <p>The verification is passed. Valid values:</p>
         * <br>
         * <p>*   success: through</p>
         * <p>*   failed: failed</p>
         */
        @NameInMap("errorType")
        public String errorType;

        public static UpgradeEngineVersionResponseBodyResultValidateResult build(java.util.Map<String, ?> map) throws Exception {
            UpgradeEngineVersionResponseBodyResultValidateResult self = new UpgradeEngineVersionResponseBodyResultValidateResult();
            return TeaModel.build(map, self);
        }

        public UpgradeEngineVersionResponseBodyResultValidateResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public UpgradeEngineVersionResponseBodyResultValidateResult setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public UpgradeEngineVersionResponseBodyResultValidateResult setErrorType(String errorType) {
            this.errorType = errorType;
            return this;
        }
        public String getErrorType() {
            return this.errorType;
        }

    }

    public static class UpgradeEngineVersionResponseBodyResult extends TeaModel {
        @NameInMap("status")
        public String status;

        /**
         * <p>The error message returned.</p>
         */
        @NameInMap("validateResult")
        public java.util.List<UpgradeEngineVersionResponseBodyResultValidateResult> validateResult;

        /**
         * <p>The error code returned if the request failed.</p>
         */
        @NameInMap("validateType")
        public String validateType;

        public static UpgradeEngineVersionResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpgradeEngineVersionResponseBodyResult self = new UpgradeEngineVersionResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpgradeEngineVersionResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpgradeEngineVersionResponseBodyResult setValidateResult(java.util.List<UpgradeEngineVersionResponseBodyResultValidateResult> validateResult) {
            this.validateResult = validateResult;
            return this;
        }
        public java.util.List<UpgradeEngineVersionResponseBodyResultValidateResult> getValidateResult() {
            return this.validateResult;
        }

        public UpgradeEngineVersionResponseBodyResult setValidateType(String validateType) {
            this.validateType = validateType;
            return this;
        }
        public String getValidateType() {
            return this.validateType;
        }

    }

}
