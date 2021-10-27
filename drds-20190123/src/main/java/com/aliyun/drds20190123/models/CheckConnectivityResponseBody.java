// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CheckConnectivityResponseBody extends TeaModel {
    @NameInMap("CheckConnectivityResult")
    public CheckConnectivityResponseBodyCheckConnectivityResult checkConnectivityResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CheckConnectivityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckConnectivityResponseBody self = new CheckConnectivityResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckConnectivityResponseBody setCheckConnectivityResult(CheckConnectivityResponseBodyCheckConnectivityResult checkConnectivityResult) {
        this.checkConnectivityResult = checkConnectivityResult;
        return this;
    }
    public CheckConnectivityResponseBodyCheckConnectivityResult getCheckConnectivityResult() {
        return this.checkConnectivityResult;
    }

    public CheckConnectivityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckConnectivityResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CheckConnectivityResponseBodyCheckConnectivityResult extends TeaModel {
        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        public static CheckConnectivityResponseBodyCheckConnectivityResult build(java.util.Map<String, ?> map) throws Exception {
            CheckConnectivityResponseBodyCheckConnectivityResult self = new CheckConnectivityResponseBodyCheckConnectivityResult();
            return TeaModel.build(map, self);
        }

        public CheckConnectivityResponseBodyCheckConnectivityResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CheckConnectivityResponseBodyCheckConnectivityResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
