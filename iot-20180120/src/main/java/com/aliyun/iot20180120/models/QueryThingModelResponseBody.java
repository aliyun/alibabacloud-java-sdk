// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryThingModelResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryThingModelResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryThingModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryThingModelResponseBody self = new QueryThingModelResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryThingModelResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryThingModelResponseBody setData(QueryThingModelResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryThingModelResponseBodyData getData() {
        return this.data;
    }

    public QueryThingModelResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryThingModelResponseBody setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public QueryThingModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryThingModelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryThingModelResponseBodyData extends TeaModel {
        @NameInMap("ThingModelJson")
        public String thingModelJson;

        public static QueryThingModelResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryThingModelResponseBodyData self = new QueryThingModelResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryThingModelResponseBodyData setThingModelJson(String thingModelJson) {
            this.thingModelJson = thingModelJson;
            return this;
        }
        public String getThingModelJson() {
            return this.thingModelJson;
        }

    }

}
