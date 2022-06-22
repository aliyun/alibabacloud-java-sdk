// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryEventDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryEventDetailResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryEventDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryEventDetailResponseBody self = new QueryEventDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryEventDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryEventDetailResponseBody setData(QueryEventDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryEventDetailResponseBodyData getData() {
        return this.data;
    }

    public QueryEventDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryEventDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryEventDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryEventDetailResponseBodyData extends TeaModel {
        @NameInMap("items")
        public java.util.List<String> items;

        public static QueryEventDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryEventDetailResponseBodyData self = new QueryEventDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryEventDetailResponseBodyData setItems(java.util.List<String> items) {
            this.items = items;
            return this;
        }
        public java.util.List<String> getItems() {
            return this.items;
        }

    }

}
