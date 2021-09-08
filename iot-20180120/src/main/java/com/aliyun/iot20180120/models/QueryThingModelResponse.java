// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryThingModelResponse extends TeaModel {
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
    public QueryThingModelResponseData data;

    public static QueryThingModelResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryThingModelResponse self = new QueryThingModelResponse();
        return TeaModel.build(map, self);
    }

    public QueryThingModelResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryThingModelResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryThingModelResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryThingModelResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryThingModelResponse setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public QueryThingModelResponse setData(QueryThingModelResponseData data) {
        this.data = data;
        return this;
    }
    public QueryThingModelResponseData getData() {
        return this.data;
    }

    public static class QueryThingModelResponseData extends TeaModel {
        @NameInMap("ThingModelJson")
        @Validation(required = true)
        public String thingModelJson;

        public static QueryThingModelResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryThingModelResponseData self = new QueryThingModelResponseData();
            return TeaModel.build(map, self);
        }

        public QueryThingModelResponseData setThingModelJson(String thingModelJson) {
            this.thingModelJson = thingModelJson;
            return this;
        }
        public String getThingModelJson() {
            return this.thingModelJson;
        }

    }

}
