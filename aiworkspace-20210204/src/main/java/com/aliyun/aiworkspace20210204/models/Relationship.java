// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class Relationship extends TeaModel {
    @NameInMap("Attributes")
    public java.util.Map<String, ?> attributes;

    @NameInMap("DataChannel")
    public String dataChannel;

    @NameInMap("RelationshipGuid")
    public String relationshipGuid;

    @NameInMap("RelationshipType")
    public String relationshipType;

    public static Relationship build(java.util.Map<String, ?> map) throws Exception {
        Relationship self = new Relationship();
        return TeaModel.build(map, self);
    }

    public Relationship setAttributes(java.util.Map<String, ?> attributes) {
        this.attributes = attributes;
        return this;
    }
    public java.util.Map<String, ?> getAttributes() {
        return this.attributes;
    }

    public Relationship setDataChannel(String dataChannel) {
        this.dataChannel = dataChannel;
        return this;
    }
    public String getDataChannel() {
        return this.dataChannel;
    }

    public Relationship setRelationshipGuid(String relationshipGuid) {
        this.relationshipGuid = relationshipGuid;
        return this;
    }
    public String getRelationshipGuid() {
        return this.relationshipGuid;
    }

    public Relationship setRelationshipType(String relationshipType) {
        this.relationshipType = relationshipType;
        return this;
    }
    public String getRelationshipType() {
        return this.relationshipType;
    }

}
