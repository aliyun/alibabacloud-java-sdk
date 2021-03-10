// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryThingModelExtendConfigPublishedResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Data")
    public QueryThingModelExtendConfigPublishedResponseBodyData data;

    public static QueryThingModelExtendConfigPublishedResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryThingModelExtendConfigPublishedResponseBody self = new QueryThingModelExtendConfigPublishedResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryThingModelExtendConfigPublishedResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryThingModelExtendConfigPublishedResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryThingModelExtendConfigPublishedResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryThingModelExtendConfigPublishedResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryThingModelExtendConfigPublishedResponseBody setData(QueryThingModelExtendConfigPublishedResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryThingModelExtendConfigPublishedResponseBodyData getData() {
        return this.data;
    }

    public static class QueryThingModelExtendConfigPublishedResponseBodyData extends TeaModel {
        @NameInMap("Configuration")
        public String configuration;

        public static QueryThingModelExtendConfigPublishedResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryThingModelExtendConfigPublishedResponseBodyData self = new QueryThingModelExtendConfigPublishedResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryThingModelExtendConfigPublishedResponseBodyData setConfiguration(String configuration) {
            this.configuration = configuration;
            return this;
        }
        public String getConfiguration() {
            return this.configuration;
        }

    }

}
