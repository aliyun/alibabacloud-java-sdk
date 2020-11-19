// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CheckConnectivityResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("CheckConnectivityResult")
    @Validation(required = true)
    public CheckConnectivityResponseCheckConnectivityResult checkConnectivityResult;

    public static CheckConnectivityResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckConnectivityResponse self = new CheckConnectivityResponse();
        return TeaModel.build(map, self);
    }

    public CheckConnectivityResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckConnectivityResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CheckConnectivityResponse setCheckConnectivityResult(CheckConnectivityResponseCheckConnectivityResult checkConnectivityResult) {
        this.checkConnectivityResult = checkConnectivityResult;
        return this;
    }
    public CheckConnectivityResponseCheckConnectivityResult getCheckConnectivityResult() {
        return this.checkConnectivityResult;
    }

    public static class CheckConnectivityResponseCheckConnectivityResult extends TeaModel {
        @NameInMap("Success")
        @Validation(required = true)
        public Boolean success;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        public static CheckConnectivityResponseCheckConnectivityResult build(java.util.Map<String, ?> map) throws Exception {
            CheckConnectivityResponseCheckConnectivityResult self = new CheckConnectivityResponseCheckConnectivityResult();
            return TeaModel.build(map, self);
        }

        public CheckConnectivityResponseCheckConnectivityResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public CheckConnectivityResponseCheckConnectivityResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
