// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class OpenAhasServiceRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    public static OpenAhasServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenAhasServiceRequest self = new OpenAhasServiceRequest();
        return TeaModel.build(map, self);
    }

    public OpenAhasServiceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
