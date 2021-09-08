// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryThingModelExtendConfigResponse extends TeaModel {
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
    public QueryThingModelExtendConfigResponseData data;

    public static QueryThingModelExtendConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryThingModelExtendConfigResponse self = new QueryThingModelExtendConfigResponse();
        return TeaModel.build(map, self);
    }

    public QueryThingModelExtendConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryThingModelExtendConfigResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryThingModelExtendConfigResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryThingModelExtendConfigResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryThingModelExtendConfigResponse setData(QueryThingModelExtendConfigResponseData data) {
        this.data = data;
        return this;
    }
    public QueryThingModelExtendConfigResponseData getData() {
        return this.data;
    }

    public static class QueryThingModelExtendConfigResponseData extends TeaModel {
        @NameInMap("Configuration")
        @Validation(required = true)
        public String configuration;

        public static QueryThingModelExtendConfigResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryThingModelExtendConfigResponseData self = new QueryThingModelExtendConfigResponseData();
            return TeaModel.build(map, self);
        }

        public QueryThingModelExtendConfigResponseData setConfiguration(String configuration) {
            this.configuration = configuration;
            return this;
        }
        public String getConfiguration() {
            return this.configuration;
        }

    }

}
