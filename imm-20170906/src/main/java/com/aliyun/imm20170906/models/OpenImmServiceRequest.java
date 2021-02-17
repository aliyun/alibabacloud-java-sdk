// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class OpenImmServiceRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    public static OpenImmServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenImmServiceRequest self = new OpenImmServiceRequest();
        return TeaModel.build(map, self);
    }

    public OpenImmServiceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
