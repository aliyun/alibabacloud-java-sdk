// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class RelationshipVO extends TeaModel {
    @NameInMap("Attributes")
    public java.util.Map<String, String> attributes;

    @NameInMap("RelationshipGuid")
    public String relationshipGuid;

    /**
     * <strong>example:</strong>
     * <p>sql</p>
     */
    @NameInMap("RelationshipType")
    public String relationshipType;

    public static RelationshipVO build(java.util.Map<String, ?> map) throws Exception {
        RelationshipVO self = new RelationshipVO();
        return TeaModel.build(map, self);
    }

    public RelationshipVO setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
        return this;
    }
    public java.util.Map<String, String> getAttributes() {
        return this.attributes;
    }

    public RelationshipVO setRelationshipGuid(String relationshipGuid) {
        this.relationshipGuid = relationshipGuid;
        return this;
    }
    public String getRelationshipGuid() {
        return this.relationshipGuid;
    }

    public RelationshipVO setRelationshipType(String relationshipType) {
        this.relationshipType = relationshipType;
        return this;
    }
    public String getRelationshipType() {
        return this.relationshipType;
    }

}
