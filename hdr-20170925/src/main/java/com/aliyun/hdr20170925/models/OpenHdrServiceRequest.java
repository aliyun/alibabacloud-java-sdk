// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class OpenHdrServiceRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    public static OpenHdrServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenHdrServiceRequest self = new OpenHdrServiceRequest();
        return TeaModel.build(map, self);
    }

    public OpenHdrServiceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
