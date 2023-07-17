// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class OpenArmsServiceRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Type")
    public String type;

    public static OpenArmsServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenArmsServiceRequest self = new OpenArmsServiceRequest();
        return TeaModel.build(map, self);
    }

    public OpenArmsServiceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public OpenArmsServiceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
