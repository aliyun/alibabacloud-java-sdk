// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DeleteWasmRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static DeleteWasmRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteWasmRequest self = new DeleteWasmRequest();
        return TeaModel.build(map, self);
    }

    public DeleteWasmRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeleteWasmRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
