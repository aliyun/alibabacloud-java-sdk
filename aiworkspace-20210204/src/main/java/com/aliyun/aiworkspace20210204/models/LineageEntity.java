// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class LineageEntity extends TeaModel {
    @NameInMap("Attributes")
    public java.util.Map<String, ?> attributes;

    @NameInMap("EntityType")
    public String entityType;

    @NameInMap("Name")
    public String name;

    @NameInMap("QualifiedName")
    public String qualifiedName;

    public static LineageEntity build(java.util.Map<String, ?> map) throws Exception {
        LineageEntity self = new LineageEntity();
        return TeaModel.build(map, self);
    }

    public LineageEntity setAttributes(java.util.Map<String, ?> attributes) {
        this.attributes = attributes;
        return this;
    }
    public java.util.Map<String, ?> getAttributes() {
        return this.attributes;
    }

    public LineageEntity setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public LineageEntity setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public LineageEntity setQualifiedName(String qualifiedName) {
        this.qualifiedName = qualifiedName;
        return this;
    }
    public String getQualifiedName() {
        return this.qualifiedName;
    }

}
