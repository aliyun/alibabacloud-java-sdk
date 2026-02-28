// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryThingModelPublishedResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryThingModelPublishedResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryThingModelPublishedResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryThingModelPublishedResponseBody self = new QueryThingModelPublishedResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryThingModelPublishedResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryThingModelPublishedResponseBody setData(QueryThingModelPublishedResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryThingModelPublishedResponseBodyData getData() {
        return this.data;
    }

    public QueryThingModelPublishedResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryThingModelPublishedResponseBody setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public QueryThingModelPublishedResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryThingModelPublishedResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryThingModelPublishedResponseBodyData extends TeaModel {
        @NameInMap("ThingModelJson")
        public String thingModelJson;

        public static QueryThingModelPublishedResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryThingModelPublishedResponseBodyData self = new QueryThingModelPublishedResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryThingModelPublishedResponseBodyData setThingModelJson(String thingModelJson) {
            this.thingModelJson = thingModelJson;
            return this;
        }
        public String getThingModelJson() {
            return this.thingModelJson;
        }

    }

}
