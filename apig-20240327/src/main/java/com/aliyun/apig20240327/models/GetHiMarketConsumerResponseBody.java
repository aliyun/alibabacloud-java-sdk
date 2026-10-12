// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetHiMarketConsumerResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public GetHiMarketConsumerResponseBodyData data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>393E2630-DBE7-5221-AB35-9E740675491A</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetHiMarketConsumerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHiMarketConsumerResponseBody self = new GetHiMarketConsumerResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHiMarketConsumerResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetHiMarketConsumerResponseBody setData(GetHiMarketConsumerResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetHiMarketConsumerResponseBodyData getData() {
        return this.data;
    }

    public GetHiMarketConsumerResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHiMarketConsumerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetHiMarketConsumerResponseBodyData extends TeaModel {
        /**
         * <p>The consumer ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cs-xxxxxxxxxxxx</p>
         */
        @NameInMap("consumerId")
        public String consumerId;

        /**
         * <p>The description of the consumer.</p>
         * 
         * <strong>example:</strong>
         * <p>Dedicated test consumer</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>Indicates whether the consumer is the primary consumer.</p>
         */
        @NameInMap("isPrimary")
        public Boolean isPrimary;

        /**
         * <p>The name of the consumer.</p>
         * 
         * <strong>example:</strong>
         * <p>consumer-1</p>
         */
        @NameInMap("name")
        public String name;

        public static GetHiMarketConsumerResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetHiMarketConsumerResponseBodyData self = new GetHiMarketConsumerResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetHiMarketConsumerResponseBodyData setConsumerId(String consumerId) {
            this.consumerId = consumerId;
            return this;
        }
        public String getConsumerId() {
            return this.consumerId;
        }

        public GetHiMarketConsumerResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetHiMarketConsumerResponseBodyData setIsPrimary(Boolean isPrimary) {
            this.isPrimary = isPrimary;
            return this;
        }
        public Boolean getIsPrimary() {
            return this.isPrimary;
        }

        public GetHiMarketConsumerResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
