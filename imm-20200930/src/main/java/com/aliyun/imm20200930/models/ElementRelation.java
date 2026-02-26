// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ElementRelation extends TeaModel {
    /**
     * <p>The ID of the element.</p>
     * 
     * <strong>example:</strong>
     * <p>id1</p>
     */
    @NameInMap("ObjectId")
    public String objectId;

    /**
     * <p>The type.</p>
     * 
     * <strong>example:</strong>
     * <p>child，parent</p>
     */
    @NameInMap("Type")
    public String type;

    public static ElementRelation build(java.util.Map<String, ?> map) throws Exception {
        ElementRelation self = new ElementRelation();
        return TeaModel.build(map, self);
    }

    public ElementRelation setObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }
    public String getObjectId() {
        return this.objectId;
    }

    public ElementRelation setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
