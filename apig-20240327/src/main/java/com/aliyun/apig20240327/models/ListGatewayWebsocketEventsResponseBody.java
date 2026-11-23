// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListGatewayWebsocketEventsResponseBody extends TeaModel {
    /**
     * <p>The business response code.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The query results.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("data")
    public ListGatewayWebsocketEventsResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The specified gateway does not exist.</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D0A6A1A0-8793-4C10-AB1A-2C03E770A912</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListGatewayWebsocketEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayWebsocketEventsResponseBody self = new ListGatewayWebsocketEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGatewayWebsocketEventsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListGatewayWebsocketEventsResponseBody setData(ListGatewayWebsocketEventsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListGatewayWebsocketEventsResponseBodyData getData() {
        return this.data;
    }

    public ListGatewayWebsocketEventsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListGatewayWebsocketEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListGatewayWebsocketEventsResponseBodyData extends TeaModel {
        /**
         * <p>The data basis.</p>
         * 
         * <strong>example:</strong>
         * <p>observed</p>
         */
        @NameInMap("basis")
        public String basis;

        /**
         * <p>Indicates whether there is a next page.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("hasMore")
        public Boolean hasMore;

        /**
         * <p>The observability events.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("items")
        public java.util.List<java.util.Map<String, ?>> items;

        /**
         * <p>The actual number of results per page.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("maxResults")
        public Integer maxResults;

        /**
         * <p>The pagination token for the next page.</p>
         * 
         * <strong>example:</strong>
         * <p>opaque-token-from-previous-page</p>
         */
        @NameInMap("nextToken")
        public String nextToken;

        public static ListGatewayWebsocketEventsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayWebsocketEventsResponseBodyData self = new ListGatewayWebsocketEventsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListGatewayWebsocketEventsResponseBodyData setBasis(String basis) {
            this.basis = basis;
            return this;
        }
        public String getBasis() {
            return this.basis;
        }

        public ListGatewayWebsocketEventsResponseBodyData setHasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }
        public Boolean getHasMore() {
            return this.hasMore;
        }

        public ListGatewayWebsocketEventsResponseBodyData setItems(java.util.List<java.util.Map<String, ?>> items) {
            this.items = items;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getItems() {
            return this.items;
        }

        public ListGatewayWebsocketEventsResponseBodyData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ListGatewayWebsocketEventsResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

    }

}
