// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetGatewayWebsocketUsageResponseBody extends TeaModel {
    /**
     * <p>The business response code.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The query result.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("data")
    public GetGatewayWebsocketUsageResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The specified gateway does not exist.</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D0A6A1A0-8793-4C10-AB1A-2C03E770A912</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetGatewayWebsocketUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGatewayWebsocketUsageResponseBody self = new GetGatewayWebsocketUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGatewayWebsocketUsageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetGatewayWebsocketUsageResponseBody setData(GetGatewayWebsocketUsageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetGatewayWebsocketUsageResponseBodyData getData() {
        return this.data;
    }

    public GetGatewayWebsocketUsageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetGatewayWebsocketUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetGatewayWebsocketUsageResponseBodyData extends TeaModel {
        /**
         * <p>The data basis.</p>
         * 
         * <strong>example:</strong>
         * <p>redis_period</p>
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
         * <p>The cycle usage.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("items")
        public java.util.List<java.util.Map<String, ?>> items;

        public static GetGatewayWebsocketUsageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayWebsocketUsageResponseBodyData self = new GetGatewayWebsocketUsageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetGatewayWebsocketUsageResponseBodyData setBasis(String basis) {
            this.basis = basis;
            return this;
        }
        public String getBasis() {
            return this.basis;
        }

        public GetGatewayWebsocketUsageResponseBodyData setHasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }
        public Boolean getHasMore() {
            return this.hasMore;
        }

        public GetGatewayWebsocketUsageResponseBodyData setItems(java.util.List<java.util.Map<String, ?>> items) {
            this.items = items;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getItems() {
            return this.items;
        }

    }

}
