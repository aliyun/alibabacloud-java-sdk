// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryThingModelPublishedResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("ProductKey")
    @Validation(required = true)
    public String productKey;

    @NameInMap("Data")
    @Validation(required = true)
    public QueryThingModelPublishedResponseData data;

    public static QueryThingModelPublishedResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryThingModelPublishedResponse self = new QueryThingModelPublishedResponse();
        return TeaModel.build(map, self);
    }

    public QueryThingModelPublishedResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryThingModelPublishedResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryThingModelPublishedResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryThingModelPublishedResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryThingModelPublishedResponse setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public QueryThingModelPublishedResponse setData(QueryThingModelPublishedResponseData data) {
        this.data = data;
        return this;
    }
    public QueryThingModelPublishedResponseData getData() {
        return this.data;
    }

    public static class QueryThingModelPublishedResponseData extends TeaModel {
        @NameInMap("ThingModelJson")
        @Validation(required = true)
        public String thingModelJson;

        public static QueryThingModelPublishedResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryThingModelPublishedResponseData self = new QueryThingModelPublishedResponseData();
            return TeaModel.build(map, self);
        }

        public QueryThingModelPublishedResponseData setThingModelJson(String thingModelJson) {
            this.thingModelJson = thingModelJson;
            return this;
        }
        public String getThingModelJson() {
            return this.thingModelJson;
        }

    }

}
