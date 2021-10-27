// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class RemoveDrdsMysqlResponseBody extends TeaModel {
    @NameInMap("Data")
    public RemoveDrdsMysqlResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static RemoveDrdsMysqlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveDrdsMysqlResponseBody self = new RemoveDrdsMysqlResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveDrdsMysqlResponseBody setData(RemoveDrdsMysqlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RemoveDrdsMysqlResponseBodyData getData() {
        return this.data;
    }

    public RemoveDrdsMysqlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveDrdsMysqlResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RemoveDrdsMysqlResponseBodyData extends TeaModel {
        @NameInMap("Message")
        public String message;

        @NameInMap("Result")
        public Boolean result;

        public static RemoveDrdsMysqlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RemoveDrdsMysqlResponseBodyData self = new RemoveDrdsMysqlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RemoveDrdsMysqlResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public RemoveDrdsMysqlResponseBodyData setResult(Boolean result) {
            this.result = result;
            return this;
        }
        public Boolean getResult() {
            return this.result;
        }

    }

}
