// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListApiDestinationsResponseBody extends TeaModel {
    /**
     * <p>The returned response code. The value Success indicates that the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public ListApiDestinationsResponseBodyData data;

    /**
     * <p>The returned message. If the request is successful, success is returned. If the request failed, an error code is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>96D7C0AB-DCE5-5E82-96B8-4725E1706BB1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListApiDestinationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApiDestinationsResponseBody self = new ListApiDestinationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApiDestinationsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListApiDestinationsResponseBody setData(ListApiDestinationsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListApiDestinationsResponseBodyData getData() {
        return this.data;
    }

    public ListApiDestinationsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListApiDestinationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListApiDestinationsResponseBodyDataApiDestinationsHttpApiParameters extends TeaModel {
        /**
         * <p>The endpoint of the API destination.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://127.0.0.1:8001/api">http://127.0.0.1:8001/api</a></p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>The HTTP request method. Valid values:</p>
         * <ul>
         * <li><p>POST</p>
         * </li>
         * <li><p>GET</p>
         * </li>
         * <li><p>DELETE</p>
         * </li>
         * <li><p>PUT</p>
         * </li>
         * <li><p>HEAD</p>
         * </li>
         * <li><p>TRACE</p>
         * </li>
         * <li><p>PATCH</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>POST</p>
         */
        @NameInMap("Method")
        public String method;

        public static ListApiDestinationsResponseBodyDataApiDestinationsHttpApiParameters build(java.util.Map<String, ?> map) throws Exception {
            ListApiDestinationsResponseBodyDataApiDestinationsHttpApiParameters self = new ListApiDestinationsResponseBodyDataApiDestinationsHttpApiParameters();
            return TeaModel.build(map, self);
        }

        public ListApiDestinationsResponseBodyDataApiDestinationsHttpApiParameters setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public ListApiDestinationsResponseBodyDataApiDestinationsHttpApiParameters setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

    }

    public static class ListApiDestinationsResponseBodyDataApiDestinations extends TeaModel {
        /**
         * <p>The name of the API destination.</p>
         * 
         * <strong>example:</strong>
         * <p>api-destination-2</p>
         */
        @NameInMap("ApiDestinationName")
        public String apiDestinationName;

        /**
         * <p>The connection name.</p>
         * 
         * <strong>example:</strong>
         * <p>connection-name</p>
         */
        @NameInMap("ConnectionName")
        public String connectionName;

        /**
         * <p>The description of the connection.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The time when the API destination was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1665223213000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The request parameters that are configured for the API destination.</p>
         */
        @NameInMap("HttpApiParameters")
        public ListApiDestinationsResponseBodyDataApiDestinationsHttpApiParameters httpApiParameters;

        public static ListApiDestinationsResponseBodyDataApiDestinations build(java.util.Map<String, ?> map) throws Exception {
            ListApiDestinationsResponseBodyDataApiDestinations self = new ListApiDestinationsResponseBodyDataApiDestinations();
            return TeaModel.build(map, self);
        }

        public ListApiDestinationsResponseBodyDataApiDestinations setApiDestinationName(String apiDestinationName) {
            this.apiDestinationName = apiDestinationName;
            return this;
        }
        public String getApiDestinationName() {
            return this.apiDestinationName;
        }

        public ListApiDestinationsResponseBodyDataApiDestinations setConnectionName(String connectionName) {
            this.connectionName = connectionName;
            return this;
        }
        public String getConnectionName() {
            return this.connectionName;
        }

        public ListApiDestinationsResponseBodyDataApiDestinations setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListApiDestinationsResponseBodyDataApiDestinations setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListApiDestinationsResponseBodyDataApiDestinations setHttpApiParameters(ListApiDestinationsResponseBodyDataApiDestinationsHttpApiParameters httpApiParameters) {
            this.httpApiParameters = httpApiParameters;
            return this;
        }
        public ListApiDestinationsResponseBodyDataApiDestinationsHttpApiParameters getHttpApiParameters() {
            return this.httpApiParameters;
        }

    }

    public static class ListApiDestinationsResponseBodyData extends TeaModel {
        /**
         * <p>The API destinations.</p>
         */
        @NameInMap("ApiDestinations")
        public java.util.List<ListApiDestinationsResponseBodyDataApiDestinations> apiDestinations;

        /**
         * <p>The maximum number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxResults")
        public Float maxResults;

        /**
         * <p>If excess return values exist, this parameter is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Total")
        public Float total;

        public static ListApiDestinationsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListApiDestinationsResponseBodyData self = new ListApiDestinationsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListApiDestinationsResponseBodyData setApiDestinations(java.util.List<ListApiDestinationsResponseBodyDataApiDestinations> apiDestinations) {
            this.apiDestinations = apiDestinations;
            return this;
        }
        public java.util.List<ListApiDestinationsResponseBodyDataApiDestinations> getApiDestinations() {
            return this.apiDestinations;
        }

        public ListApiDestinationsResponseBodyData setMaxResults(Float maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Float getMaxResults() {
            return this.maxResults;
        }

        public ListApiDestinationsResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListApiDestinationsResponseBodyData setTotal(Float total) {
            this.total = total;
            return this;
        }
        public Float getTotal() {
            return this.total;
        }

    }

}
