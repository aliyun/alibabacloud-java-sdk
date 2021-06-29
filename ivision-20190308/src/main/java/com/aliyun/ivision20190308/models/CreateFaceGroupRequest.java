// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivision20190308.models;

import com.aliyun.tea.*;

public class CreateFaceGroupRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Name")
    public String name;

    public static CreateFaceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFaceGroupRequest self = new CreateFaceGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateFaceGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateFaceGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
