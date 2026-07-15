// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetConsumerGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetConsumerGroupResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
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
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("consumerCount")
        public Long consumerCount;

        /**
         * <strong>example:</strong>
         * <p>csg-8c13d2b4f8a1</p>
         */
        @NameInMap("consumerGroupId")
        public String consumerGroupId;

        /**
         * <strong>example:</strong>
         * <p>1715769600000</p>
         */
        @NameInMap("createTimestamp")
        public Long createTimestamp;

        /**
         * <strong>example:</strong>
         * <p>用于线上 API 调用方分组</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>API</p>
         */
        @NameInMap("gatewayType")
        public String gatewayType;

        /**
         * <strong>example:</strong>
         * <p>api-consumer-group</p>
         */
        @NameInMap("name")
        public String name;

        /**
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
