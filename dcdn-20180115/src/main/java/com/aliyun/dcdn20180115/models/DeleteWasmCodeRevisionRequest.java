// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DeleteWasmCodeRevisionRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SelectCodeRevision")
    public String selectCodeRevision;

    public static DeleteWasmCodeRevisionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteWasmCodeRevisionRequest self = new DeleteWasmCodeRevisionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteWasmCodeRevisionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeleteWasmCodeRevisionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteWasmCodeRevisionRequest setSelectCodeRevision(String selectCodeRevision) {
        this.selectCodeRevision = selectCodeRevision;
        return this;
    }
    public String getSelectCodeRevision() {
        return this.selectCodeRevision;
    }

}
