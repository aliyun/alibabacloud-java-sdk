// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DisableDcdnOfflineLogDeliveryRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    public static DisableDcdnOfflineLogDeliveryRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableDcdnOfflineLogDeliveryRequest self = new DisableDcdnOfflineLogDeliveryRequest();
        return TeaModel.build(map, self);
    }

    public DisableDcdnOfflineLogDeliveryRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
