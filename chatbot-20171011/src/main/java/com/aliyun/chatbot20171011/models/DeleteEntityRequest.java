// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class DeleteEntityRequest extends TeaModel {
    @NameInMap("EntityId")
    public Long entityId;

    public static DeleteEntityRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEntityRequest self = new DeleteEntityRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEntityRequest setEntityId(Long entityId) {
        this.entityId = entityId;
        return this;
    }
    public Long getEntityId() {
        return this.entityId;
    }

}
