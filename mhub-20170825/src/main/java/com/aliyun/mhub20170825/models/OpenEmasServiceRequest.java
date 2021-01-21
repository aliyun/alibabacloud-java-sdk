// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825.models;

import com.aliyun.tea.*;

public class OpenEmasServiceRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    public static OpenEmasServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenEmasServiceRequest self = new OpenEmasServiceRequest();
        return TeaModel.build(map, self);
    }

    public OpenEmasServiceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
