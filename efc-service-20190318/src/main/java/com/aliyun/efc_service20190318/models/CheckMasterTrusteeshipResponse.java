// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.efc_service20190318.models;

import com.aliyun.tea.*;

public class CheckMasterTrusteeshipResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Data")
    @Validation(required = true)
    public CheckMasterTrusteeshipResponseData data;

    public static CheckMasterTrusteeshipResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckMasterTrusteeshipResponse self = new CheckMasterTrusteeshipResponse();
        return TeaModel.build(map, self);
    }

    public CheckMasterTrusteeshipResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckMasterTrusteeshipResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CheckMasterTrusteeshipResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CheckMasterTrusteeshipResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CheckMasterTrusteeshipResponse setData(CheckMasterTrusteeshipResponseData data) {
        this.data = data;
        return this;
    }
    public CheckMasterTrusteeshipResponseData getData() {
        return this.data;
    }

    public static class CheckMasterTrusteeshipResponseData extends TeaModel {
        @NameInMap("CheckResult")
        @Validation(required = true)
        public Boolean checkResult;

        @NameInMap("Code")
        @Validation(required = true)
        public String code;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        public static CheckMasterTrusteeshipResponseData build(java.util.Map<String, ?> map) throws Exception {
            CheckMasterTrusteeshipResponseData self = new CheckMasterTrusteeshipResponseData();
            return TeaModel.build(map, self);
        }

        public CheckMasterTrusteeshipResponseData setCheckResult(Boolean checkResult) {
            this.checkResult = checkResult;
            return this;
        }
        public Boolean getCheckResult() {
            return this.checkResult;
        }

        public CheckMasterTrusteeshipResponseData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CheckMasterTrusteeshipResponseData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
