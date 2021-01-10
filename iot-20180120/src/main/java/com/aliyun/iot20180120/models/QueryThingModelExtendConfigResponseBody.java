// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryThingModelExtendConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Data")
    public QueryThingModelExtendConfigResponseBodyData data;

    public static QueryThingModelExtendConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryThingModelExtendConfigResponseBody self = new QueryThingModelExtendConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryThingModelExtendConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryThingModelExtendConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryThingModelExtendConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryThingModelExtendConfigResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryThingModelExtendConfigResponseBody setData(QueryThingModelExtendConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryThingModelExtendConfigResponseBodyData getData() {
        return this.data;
    }

    public static class QueryThingModelExtendConfigResponseBodyData extends TeaModel {
        @NameInMap("Configuration")
        public String configuration;

        public static QueryThingModelExtendConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryThingModelExtendConfigResponseBodyData self = new QueryThingModelExtendConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryThingModelExtendConfigResponseBodyData setConfiguration(String configuration) {
            this.configuration = configuration;
            return this;
        }
        public String getConfiguration() {
            return this.configuration;
        }

    }

}
