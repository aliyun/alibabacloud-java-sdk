// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ConsumerConfig extends TeaModel {
    @NameInMap("consumerId")
    public String consumerId;

    @NameInMap("name")
    public String name;

    public static ConsumerConfig build(java.util.Map<String, ?> map) throws Exception {
        ConsumerConfig self = new ConsumerConfig();
        return TeaModel.build(map, self);
    }

    public ConsumerConfig setConsumerId(String consumerId) {
        this.consumerId = consumerId;
        return this;
    }
    public String getConsumerId() {
        return this.consumerId;
    }

    public ConsumerConfig setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
