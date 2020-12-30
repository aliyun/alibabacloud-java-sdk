// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class EnableRealtimeLogDeliveryRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Domain")
    public String domain;

    public static EnableRealtimeLogDeliveryRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableRealtimeLogDeliveryRequest self = new EnableRealtimeLogDeliveryRequest();
        return TeaModel.build(map, self);
    }

    public EnableRealtimeLogDeliveryRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public EnableRealtimeLogDeliveryRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

}
