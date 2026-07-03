// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ConsumerGroupInfo extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>csg-8c13d2b4f8a1</p>
     */
    @NameInMap("consumerGroupId")
    public String consumerGroupId;

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

    public static ConsumerGroupInfo build(java.util.Map<String, ?> map) throws Exception {
        ConsumerGroupInfo self = new ConsumerGroupInfo();
        return TeaModel.build(map, self);
    }

    public ConsumerGroupInfo setConsumerGroupId(String consumerGroupId) {
        this.consumerGroupId = consumerGroupId;
        return this;
    }
    public String getConsumerGroupId() {
        return this.consumerGroupId;
    }

    public ConsumerGroupInfo setGatewayType(String gatewayType) {
        this.gatewayType = gatewayType;
        return this;
    }
    public String getGatewayType() {
        return this.gatewayType;
    }

    public ConsumerGroupInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
