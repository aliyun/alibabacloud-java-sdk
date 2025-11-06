// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class ListLogstoreResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public ListLogstoreResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListLogstoreResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLogstoreResponseBody self = new ListLogstoreResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLogstoreResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListLogstoreResponseBody setData(ListLogstoreResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListLogstoreResponseBodyData getData() {
        return this.data;
    }

    public ListLogstoreResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListLogstoreResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLogstoreResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListLogstoreResponseBodyData extends TeaModel {
        @NameInMap("Logstores")
        public java.util.List<String> logstores;

        public static ListLogstoreResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListLogstoreResponseBodyData self = new ListLogstoreResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListLogstoreResponseBodyData setLogstores(java.util.List<String> logstores) {
            this.logstores = logstores;
            return this;
        }
        public java.util.List<String> getLogstores() {
            return this.logstores;
        }

    }

}
