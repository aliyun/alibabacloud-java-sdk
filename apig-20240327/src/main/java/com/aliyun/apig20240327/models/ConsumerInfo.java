// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ConsumerInfo extends TeaModel {
    /**
     * <p>consumerId</p>
     * 
     * <strong>example:</strong>
     * <p>cs-ctd4l1um1hkph7ki1k80</p>
     */
    @NameInMap("consumerId")
    public String consumerId;

    /**
     * <p>enable</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("enable")
    public Boolean enable;

    /**
     * <p>name</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
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
