// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class DescribeEntitiesRequest extends TeaModel {
    @NameInMap("EntityId")
    public Long entityId;

    public static DescribeEntitiesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEntitiesRequest self = new DescribeEntitiesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEntitiesRequest setEntityId(Long entityId) {
        this.entityId = entityId;
        return this;
    }
    public Long getEntityId() {
        return this.entityId;
    }

}
