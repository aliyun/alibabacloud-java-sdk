// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class GetApiDestinationResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetApiDestinationResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetApiDestinationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetApiDestinationResponseBody self = new GetApiDestinationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetApiDestinationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetApiDestinationResponseBody setData(GetApiDestinationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetApiDestinationResponseBodyData getData() {
        return this.data;
    }

    public GetApiDestinationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetApiDestinationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetApiDestinationResponseBodyDataHttpApiParameters extends TeaModel {
        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("Method")
        public String method;

        public static GetApiDestinationResponseBodyDataHttpApiParameters build(java.util.Map<String, ?> map) throws Exception {
            GetApiDestinationResponseBodyDataHttpApiParameters self = new GetApiDestinationResponseBodyDataHttpApiParameters();
            return TeaModel.build(map, self);
        }

        public GetApiDestinationResponseBodyDataHttpApiParameters setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public GetApiDestinationResponseBodyDataHttpApiParameters setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

    }

    public static class GetApiDestinationResponseBodyData extends TeaModel {
        @NameInMap("ApiDestinationName")
        public String apiDestinationName;

        @NameInMap("ConnectionName")
        public String connectionName;

        @NameInMap("Description")
        public String description;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("HttpApiParameters")
        public GetApiDestinationResponseBodyDataHttpApiParameters httpApiParameters;

        public static GetApiDestinationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetApiDestinationResponseBodyData self = new GetApiDestinationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetApiDestinationResponseBodyData setApiDestinationName(String apiDestinationName) {
            this.apiDestinationName = apiDestinationName;
            return this;
        }
        public String getApiDestinationName() {
            return this.apiDestinationName;
        }

        public GetApiDestinationResponseBodyData setConnectionName(String connectionName) {
            this.connectionName = connectionName;
            return this;
        }
        public String getConnectionName() {
            return this.connectionName;
        }

        public GetApiDestinationResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetApiDestinationResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public GetApiDestinationResponseBodyData setHttpApiParameters(GetApiDestinationResponseBodyDataHttpApiParameters httpApiParameters) {
            this.httpApiParameters = httpApiParameters;
            return this;
        }
        public GetApiDestinationResponseBodyDataHttpApiParameters getHttpApiParameters() {
            return this.httpApiParameters;
        }

    }

}
