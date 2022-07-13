// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class UpdateAutoSqlOptimizeStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UpdateAutoSqlOptimizeStatusResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static UpdateAutoSqlOptimizeStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAutoSqlOptimizeStatusResponseBody self = new UpdateAutoSqlOptimizeStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAutoSqlOptimizeStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateAutoSqlOptimizeStatusResponseBody setData(UpdateAutoSqlOptimizeStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateAutoSqlOptimizeStatusResponseBodyData getData() {
        return this.data;
    }

    public UpdateAutoSqlOptimizeStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateAutoSqlOptimizeStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateAutoSqlOptimizeStatusResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class UpdateAutoSqlOptimizeStatusResponseBodyData extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMsg")
        public String errorMsg;

        @NameInMap("Success")
        public String success;

        public static UpdateAutoSqlOptimizeStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateAutoSqlOptimizeStatusResponseBodyData self = new UpdateAutoSqlOptimizeStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateAutoSqlOptimizeStatusResponseBodyData setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public UpdateAutoSqlOptimizeStatusResponseBodyData setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public UpdateAutoSqlOptimizeStatusResponseBodyData setSuccess(String success) {
            this.success = success;
            return this;
        }
        public String getSuccess() {
            return this.success;
        }

    }

}
