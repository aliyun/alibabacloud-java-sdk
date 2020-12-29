// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class OpenAlimtServiceRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Type")
    public String type;

    public static OpenAlimtServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenAlimtServiceRequest self = new OpenAlimtServiceRequest();
        return TeaModel.build(map, self);
    }

    public OpenAlimtServiceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public OpenAlimtServiceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
