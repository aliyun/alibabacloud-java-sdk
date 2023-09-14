// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class GetApiDestinationResponseBody extends TeaModel {
    /**
     * <p>The returned response code. The value Success indicates that the request is successful.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetApiDestinationResponseBodyData data;

    /**
     * <p>The returned message. If the request is successful, success is returned. If the request failed, an error code is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
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
        /**
         * <p>The endpoint of the API destination.</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>The HTTP request method. Valid values:</p>
         * <br>
         * <p>*   POST</p>
         * <p>*   GET</p>
         * <p>*   DELETE</p>
         * <p>*   PUT</p>
         * <p>*   HEAD</p>
         * <p>*   TRACE</p>
         * <p>*   PATCH</p>
         */
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
        /**
         * <p>The name of the API destination.</p>
         */
        @NameInMap("ApiDestinationName")
        public String apiDestinationName;

        /**
         * <p>The connection name.</p>
         */
        @NameInMap("ConnectionName")
        public String connectionName;

        /**
         * <p>The description of the API destination.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The time when the API destination was created.</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The request parameters that are configured for the API destination.</p>
         */
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
