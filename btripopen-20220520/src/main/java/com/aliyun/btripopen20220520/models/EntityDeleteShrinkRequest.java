// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class EntityDeleteShrinkRequest extends TeaModel {
    @NameInMap("del_all")
    public Boolean delAll;

    @NameInMap("entity_d_o_list")
    public String entityDOListShrink;

    @NameInMap("thirdpart_id")
    public String thirdpartId;

    @NameInMap("user_id")
    public String userId;

    public static EntityDeleteShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        EntityDeleteShrinkRequest self = new EntityDeleteShrinkRequest();
        return TeaModel.build(map, self);
    }

    public EntityDeleteShrinkRequest setDelAll(Boolean delAll) {
        this.delAll = delAll;
        return this;
    }
    public Boolean getDelAll() {
        return this.delAll;
    }

    public EntityDeleteShrinkRequest setEntityDOListShrink(String entityDOListShrink) {
        this.entityDOListShrink = entityDOListShrink;
        return this;
    }
    public String getEntityDOListShrink() {
        return this.entityDOListShrink;
    }

    public EntityDeleteShrinkRequest setThirdpartId(String thirdpartId) {
        this.thirdpartId = thirdpartId;
        return this;
    }
    public String getThirdpartId() {
        return this.thirdpartId;
    }

    public EntityDeleteShrinkRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
