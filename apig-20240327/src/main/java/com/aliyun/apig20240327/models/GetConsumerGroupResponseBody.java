// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetConsumerGroupResponseBody extends TeaModel {
    /**
     * <p>The response status code. Ok is returned if the request is successful.</p>
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
    public GetConsumerGroupResponseBodyData data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetConsumerGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetConsumerGroupResponseBody self = new GetConsumerGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetConsumerGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetConsumerGroupResponseBody setData(GetConsumerGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetConsumerGroupResponseBodyData getData() {
        return this.data;
    }

    public GetConsumerGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetConsumerGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetConsumerGroupResponseBodyData extends TeaModel {
        /**
         * <p>The number of consumers in the consumer group.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("consumerCount")
        public Long consumerCount;

        /**
         * <p>The consumer group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>csg-8c13d2b4f8a1</p>
         */
        @NameInMap("consumerGroupId")
        public String consumerGroupId;

        /**
         * <p>The creation time of the consumer group, in Unix millisecond timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1715769600000</p>
         */
        @NameInMap("createTimestamp")
        public Long createTimestamp;

        /**
         * <p>The consumer group description.</p>
         * 
         * <strong>example:</strong>
         * <p>Used for online API caller grouping.</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The gateway type. Valid values: API or AI.</p>
         * 
         * <strong>example:</strong>
         * <p>API</p>
         */
        @NameInMap("gatewayType")
        public String gatewayType;

        /**
         * <p>The consumer group name.</p>
         * 
         * <strong>example:</strong>
         * <p>api-consumer-group</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The update time of the consumer group, in Unix millisecond timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1715769600000</p>
         */
        @NameInMap("updateTimestamp")
        public Long updateTimestamp;

        public static GetConsumerGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetConsumerGroupResponseBodyData self = new GetConsumerGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetConsumerGroupResponseBodyData setConsumerCount(Long consumerCount) {
            this.consumerCount = consumerCount;
            return this;
        }
        public Long getConsumerCount() {
            return this.consumerCount;
        }

        public GetConsumerGroupResponseBodyData setConsumerGroupId(String consumerGroupId) {
            this.consumerGroupId = consumerGroupId;
            return this;
        }
        public String getConsumerGroupId() {
            return this.consumerGroupId;
        }

        public GetConsumerGroupResponseBodyData setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public GetConsumerGroupResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetConsumerGroupResponseBodyData setGatewayType(String gatewayType) {
            this.gatewayType = gatewayType;
            return this;
        }
        public String getGatewayType() {
            return this.gatewayType;
        }

        public GetConsumerGroupResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetConsumerGroupResponseBodyData setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

    }

}
