// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.efc_service20190318.models;

import com.aliyun.tea.*;

public class VerifyRdOperationResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RdOprationCheckResult")
    @Validation(required = true)
    public VerifyRdOperationResponseRdOprationCheckResult rdOprationCheckResult;

    public static VerifyRdOperationResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyRdOperationResponse self = new VerifyRdOperationResponse();
        return TeaModel.build(map, self);
    }

    public VerifyRdOperationResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public VerifyRdOperationResponse setRdOprationCheckResult(VerifyRdOperationResponseRdOprationCheckResult rdOprationCheckResult) {
        this.rdOprationCheckResult = rdOprationCheckResult;
        return this;
    }
    public VerifyRdOperationResponseRdOprationCheckResult getRdOprationCheckResult() {
        return this.rdOprationCheckResult;
    }

    public static class VerifyRdOperationResponseRdOprationCheckResult extends TeaModel {
        @NameInMap("Success")
        @Validation(required = true)
        public Boolean success;

        @NameInMap("BizType")
        @Validation(required = true)
        public String bizType;

        @NameInMap("FailCode")
        @Validation(required = true)
        public String failCode;

        @NameInMap("FailMessage")
        @Validation(required = true)
        public String failMessage;

        @NameInMap("ExtraData")
        @Validation(required = true)
        public String extraData;

        public static VerifyRdOperationResponseRdOprationCheckResult build(java.util.Map<String, ?> map) throws Exception {
            VerifyRdOperationResponseRdOprationCheckResult self = new VerifyRdOperationResponseRdOprationCheckResult();
            return TeaModel.build(map, self);
        }

        public VerifyRdOperationResponseRdOprationCheckResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public VerifyRdOperationResponseRdOprationCheckResult setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public VerifyRdOperationResponseRdOprationCheckResult setFailCode(String failCode) {
            this.failCode = failCode;
            return this;
        }
        public String getFailCode() {
            return this.failCode;
        }

        public VerifyRdOperationResponseRdOprationCheckResult setFailMessage(String failMessage) {
            this.failMessage = failMessage;
            return this;
        }
        public String getFailMessage() {
            return this.failMessage;
        }

        public VerifyRdOperationResponseRdOprationCheckResult setExtraData(String extraData) {
            this.extraData = extraData;
            return this;
        }
        public String getExtraData() {
            return this.extraData;
        }

    }

}
