// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class QueryCommercialUsageResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryCommercialUsageResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryCommercialUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCommercialUsageResponseBody self = new QueryCommercialUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCommercialUsageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryCommercialUsageResponseBody setData(QueryCommercialUsageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryCommercialUsageResponseBodyData getData() {
        return this.data;
    }

    public QueryCommercialUsageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryCommercialUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCommercialUsageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryCommercialUsageResponseBodyData extends TeaModel {
        @NameInMap("Complete")
        public Boolean complete;

        @NameInMap("Items")
        public java.util.List<java.util.Map<String, ?>> items;

        public static QueryCommercialUsageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryCommercialUsageResponseBodyData self = new QueryCommercialUsageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryCommercialUsageResponseBodyData setComplete(Boolean complete) {
            this.complete = complete;
            return this;
        }
        public Boolean getComplete() {
            return this.complete;
        }

        public QueryCommercialUsageResponseBodyData setItems(java.util.List<java.util.Map<String, ?>> items) {
            this.items = items;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getItems() {
            return this.items;
        }

    }

}
