// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpgradeEngineVersionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F99407AB-2FA9-489E-A259-40CF6DC*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
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
        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>ClusterStatusNotHealth</p>
         */
        @NameInMap("errorCode")
        public String errorCode;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The cluster status is not health</p>
         */
        @NameInMap("errorMsg")
        public String errorMsg;

        /**
         * <p>The error type. Valid values:</p>
         * <ul>
         * <li>clusterStatus: Cluster health status.</li>
         * <li>clusterConfigYml: Cluster YML file.</li>
         * <li>clusterConfigPlugins: Cluster configuration file.</li>
         * <li>clusterResource: Cluster resources.</li>
         * <li>clusterSnapshot: Cluster snapshot.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>clusterStatus</p>
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
        /**
         * <p>Specifies whether the check is passed. Valid values:</p>
         * <ul>
         * <li>success: Passed.</li>
         * <li>failed: Failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The check information.</p>
         */
        @NameInMap("validateResult")
        public java.util.List<UpgradeEngineVersionResponseBodyResultValidateResult> validateResult;

        /**
         * <p>The check type. Valid values:</p>
         * <ul>
         * <li>checkClusterHealth: Cluster health status.</li>
         * <li>checkConfigCompatible: Configuration compatibility status.</li>
         * <li>checkClusterResource: Resource space status.</li>
         * <li>checkClusterSnapshot: Snapshot existence.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>checkClusterHealth</p>
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
