// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class EntityAddShrinkRequest extends TeaModel {
    @NameInMap("entity_d_o_list")
    public String entityDOListShrink;

    @NameInMap("thirdpart_id")
    public String thirdpartId;

    @NameInMap("user_id")
    public String userId;

    public static EntityAddShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        EntityAddShrinkRequest self = new EntityAddShrinkRequest();
        return TeaModel.build(map, self);
    }

    public EntityAddShrinkRequest setEntityDOListShrink(String entityDOListShrink) {
        this.entityDOListShrink = entityDOListShrink;
        return this;
    }
    public String getEntityDOListShrink() {
        return this.entityDOListShrink;
    }

    public EntityAddShrinkRequest setThirdpartId(String thirdpartId) {
        this.thirdpartId = thirdpartId;
        return this;
    }
    public String getThirdpartId() {
        return this.thirdpartId;
    }

    public EntityAddShrinkRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
