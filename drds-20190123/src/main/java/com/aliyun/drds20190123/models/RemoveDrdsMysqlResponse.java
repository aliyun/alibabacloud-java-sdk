// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class RemoveDrdsMysqlResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public RemoveDrdsMysqlResponseData data;

    public static RemoveDrdsMysqlResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveDrdsMysqlResponse self = new RemoveDrdsMysqlResponse();
        return TeaModel.build(map, self);
    }

    public RemoveDrdsMysqlResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveDrdsMysqlResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public RemoveDrdsMysqlResponse setData(RemoveDrdsMysqlResponseData data) {
        this.data = data;
        return this;
    }
    public RemoveDrdsMysqlResponseData getData() {
        return this.data;
    }

    public static class RemoveDrdsMysqlResponseData extends TeaModel {
        @NameInMap("Result")
        @Validation(required = true)
        public Boolean result;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        public static RemoveDrdsMysqlResponseData build(java.util.Map<String, ?> map) throws Exception {
            RemoveDrdsMysqlResponseData self = new RemoveDrdsMysqlResponseData();
            return TeaModel.build(map, self);
        }

        public RemoveDrdsMysqlResponseData setResult(Boolean result) {
            this.result = result;
            return this;
        }
        public Boolean getResult() {
            return this.result;
        }

        public RemoveDrdsMysqlResponseData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
