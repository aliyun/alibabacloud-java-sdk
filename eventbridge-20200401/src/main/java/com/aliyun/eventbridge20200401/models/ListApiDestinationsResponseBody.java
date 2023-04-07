// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListApiDestinationsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListApiDestinationsResponseBodyData data;

    @NameInMap("Message")
    public String message;

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
        @NameInMap("Endpoint")
        public String endpoint;

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
        @NameInMap("ApiDestinationName")
        public String apiDestinationName;

        @NameInMap("ConnectionName")
        public String connectionName;

        @NameInMap("Description")
        public String description;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

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
        @NameInMap("ApiDestinations")
        public java.util.List<ListApiDestinationsResponseBodyDataApiDestinations> apiDestinations;

        @NameInMap("MaxResults")
        public Float maxResults;

        @NameInMap("NextToken")
        public String nextToken;

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
