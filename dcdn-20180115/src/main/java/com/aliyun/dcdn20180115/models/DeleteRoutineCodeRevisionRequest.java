// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DeleteRoutineCodeRevisionRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SelectCodeRevision")
    public String selectCodeRevision;

    public static DeleteRoutineCodeRevisionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRoutineCodeRevisionRequest self = new DeleteRoutineCodeRevisionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRoutineCodeRevisionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeleteRoutineCodeRevisionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteRoutineCodeRevisionRequest setSelectCodeRevision(String selectCodeRevision) {
        this.selectCodeRevision = selectCodeRevision;
        return this;
    }
    public String getSelectCodeRevision() {
        return this.selectCodeRevision;
    }

}
