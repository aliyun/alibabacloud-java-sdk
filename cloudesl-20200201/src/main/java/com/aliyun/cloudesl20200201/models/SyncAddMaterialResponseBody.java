// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class SyncAddMaterialResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public SyncAddMaterialResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static SyncAddMaterialResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SyncAddMaterialResponseBody self = new SyncAddMaterialResponseBody();
        return TeaModel.build(map, self);
    }

    public SyncAddMaterialResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SyncAddMaterialResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public SyncAddMaterialResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public SyncAddMaterialResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public SyncAddMaterialResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public SyncAddMaterialResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SyncAddMaterialResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SyncAddMaterialResponseBody setResult(SyncAddMaterialResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public SyncAddMaterialResponseBodyResult getResult() {
        return this.result;
    }

    public SyncAddMaterialResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SyncAddMaterialResponseBodyResult extends TeaModel {
        @NameInMap("DynamicCode")
        public String dynamicCode;

        @NameInMap("DynamicMessage")
        public String dynamicMessage;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        public static SyncAddMaterialResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            SyncAddMaterialResponseBodyResult self = new SyncAddMaterialResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public SyncAddMaterialResponseBodyResult setDynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }
        public String getDynamicCode() {
            return this.dynamicCode;
        }

        public SyncAddMaterialResponseBodyResult setDynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }
        public String getDynamicMessage() {
            return this.dynamicMessage;
        }

        public SyncAddMaterialResponseBodyResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public SyncAddMaterialResponseBodyResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public SyncAddMaterialResponseBodyResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
