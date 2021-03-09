// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class OpenIotServiceRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    public static OpenIotServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenIotServiceRequest self = new OpenIotServiceRequest();
        return TeaModel.build(map, self);
    }

    public OpenIotServiceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
