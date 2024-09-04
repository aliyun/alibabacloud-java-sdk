// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class Element extends TeaModel {
    @NameInMap("ElementContents")
    public java.util.List<ElementContent> elementContents;

    @NameInMap("ElementRelations")
    public java.util.List<ElementRelation> elementRelations;

    @NameInMap("ElementType")
    public String elementType;

    @NameInMap("ObjectId")
    public String objectId;

    @NameInMap("SemanticSimilarity")
    public Float semanticSimilarity;

    public static Element build(java.util.Map<String, ?> map) throws Exception {
        Element self = new Element();
        return TeaModel.build(map, self);
    }

    public Element setElementContents(java.util.List<ElementContent> elementContents) {
        this.elementContents = elementContents;
        return this;
    }
    public java.util.List<ElementContent> getElementContents() {
        return this.elementContents;
    }

    public Element setElementRelations(java.util.List<ElementRelation> elementRelations) {
        this.elementRelations = elementRelations;
        return this;
    }
    public java.util.List<ElementRelation> getElementRelations() {
        return this.elementRelations;
    }

    public Element setElementType(String elementType) {
        this.elementType = elementType;
        return this;
    }
    public String getElementType() {
        return this.elementType;
    }

    public Element setObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }
    public String getObjectId() {
        return this.objectId;
    }

    public Element setSemanticSimilarity(Float semanticSimilarity) {
        this.semanticSimilarity = semanticSimilarity;
        return this;
    }
    public Float getSemanticSimilarity() {
        return this.semanticSimilarity;
    }

}
