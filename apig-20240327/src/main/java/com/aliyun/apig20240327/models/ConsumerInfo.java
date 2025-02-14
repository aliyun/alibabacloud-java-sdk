// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ConsumerInfo extends TeaModel {
    @NameInMap("consumerId")
    public String consumerId;

    @NameInMap("enable")
    public Boolean enable;

    @NameInMap("name")
    public String name;

    public static ConsumerInfo build(java.util.Map<String, ?> map) throws Exception {
        ConsumerInfo self = new ConsumerInfo();
        return TeaModel.build(map, self);
    }

    public ConsumerInfo setConsumerId(String consumerId) {
        this.consumerId = consumerId;
        return this;
    }
    public String getConsumerId() {
        return this.consumerId;
    }

    public ConsumerInfo setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public ConsumerInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
