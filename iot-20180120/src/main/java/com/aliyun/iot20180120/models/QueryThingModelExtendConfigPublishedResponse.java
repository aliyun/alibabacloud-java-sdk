// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryThingModelExtendConfigPublishedResponse extends TeaModel {
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

    @NameInMap("Data")
    @Validation(required = true)
    public QueryThingModelExtendConfigPublishedResponseData data;

    public static QueryThingModelExtendConfigPublishedResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryThingModelExtendConfigPublishedResponse self = new QueryThingModelExtendConfigPublishedResponse();
        return TeaModel.build(map, self);
    }

    public QueryThingModelExtendConfigPublishedResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryThingModelExtendConfigPublishedResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryThingModelExtendConfigPublishedResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryThingModelExtendConfigPublishedResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryThingModelExtendConfigPublishedResponse setData(QueryThingModelExtendConfigPublishedResponseData data) {
        this.data = data;
        return this;
    }
    public QueryThingModelExtendConfigPublishedResponseData getData() {
        return this.data;
    }

    public static class QueryThingModelExtendConfigPublishedResponseData extends TeaModel {
        @NameInMap("Configuration")
        @Validation(required = true)
        public String configuration;

        public static QueryThingModelExtendConfigPublishedResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryThingModelExtendConfigPublishedResponseData self = new QueryThingModelExtendConfigPublishedResponseData();
            return TeaModel.build(map, self);
        }

        public QueryThingModelExtendConfigPublishedResponseData setConfiguration(String configuration) {
            this.configuration = configuration;
            return this;
        }
        public String getConfiguration() {
            return this.configuration;
        }

    }

}
