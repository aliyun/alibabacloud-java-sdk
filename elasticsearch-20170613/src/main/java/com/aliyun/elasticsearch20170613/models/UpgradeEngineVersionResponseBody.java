// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpgradeEngineVersionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public UpgradeEngineVersionResponseBodyResult result;

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

    public UpgradeEngineVersionResponseBody setResult(UpgradeEngineVersionResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpgradeEngineVersionResponseBodyResult getResult() {
        return this.result;
    }

    public static class UpgradeEngineVersionResponseBodyResultValidateResult extends TeaModel {
        @NameInMap("errorType")
        public String errorType;

        @NameInMap("errorCode")
        public String errorCode;

        @NameInMap("errorMsg")
        public String errorMsg;

        public static UpgradeEngineVersionResponseBodyResultValidateResult build(java.util.Map<String, ?> map) throws Exception {
            UpgradeEngineVersionResponseBodyResultValidateResult self = new UpgradeEngineVersionResponseBodyResultValidateResult();
            return TeaModel.build(map, self);
        }

        public UpgradeEngineVersionResponseBodyResultValidateResult setErrorType(String errorType) {
            this.errorType = errorType;
            return this;
        }
        public String getErrorType() {
            return this.errorType;
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

    }

    public static class UpgradeEngineVersionResponseBodyResult extends TeaModel {
        @NameInMap("validateType")
        public String validateType;

        @NameInMap("status")
        public String status;

        @NameInMap("validateResult")
        public UpgradeEngineVersionResponseBodyResultValidateResult validateResult;

        public static UpgradeEngineVersionResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpgradeEngineVersionResponseBodyResult self = new UpgradeEngineVersionResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpgradeEngineVersionResponseBodyResult setValidateType(String validateType) {
            this.validateType = validateType;
            return this;
        }
        public String getValidateType() {
            return this.validateType;
        }

        public UpgradeEngineVersionResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpgradeEngineVersionResponseBodyResult setValidateResult(UpgradeEngineVersionResponseBodyResultValidateResult validateResult) {
            this.validateResult = validateResult;
            return this;
        }
        public UpgradeEngineVersionResponseBodyResultValidateResult getValidateResult() {
            return this.validateResult;
        }

    }

}
