// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class LineageEntityVO extends TeaModel {
    /**
     * <p>A map of additional key-value attributes for the entity.</p>
     * 
     * <strong>example:</strong>
     * <p>attribute map</p>
     */
    @NameInMap("Attributes")
    public java.util.Map<String, String> attributes;

    /**
     * <p>A URL for more details about the entity.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://domain.test.url/entity">http://domain.test.url/entity</a></p>
     */
    @NameInMap("DetailUrl")
    public String detailUrl;

    /**
     * <p>The type of the entity.</p>
     * 
     * <strong>example:</strong>
     * <p>maxcompute-table</p>
     */
    @NameInMap("EntityType")
    public String entityType;

    /**
     * <p>The human-readable name of the entity.</p>
     * 
     * <strong>example:</strong>
     * <p>tableName</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The owner of the entity.</p>
     * 
     * <strong>example:</strong>
     * <p>owner</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The name of the entity\&quot;s parent container, such as a database.</p>
     * 
     * <strong>example:</strong>
     * <p>dbName</p>
     */
    @NameInMap("ParentName")
    public String parentName;

    /**
     * <p>The unique, fully qualified name of the entity.</p>
     * 
     * <strong>example:</strong>
     * <p>maxcompute-table.projectName.tablename</p>
     */
    @NameInMap("QualifiedName")
    public String qualifiedName;

    public static LineageEntityVO build(java.util.Map<String, ?> map) throws Exception {
        LineageEntityVO self = new LineageEntityVO();
        return TeaModel.build(map, self);
    }

    public LineageEntityVO setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
        return this;
    }
    public java.util.Map<String, String> getAttributes() {
        return this.attributes;
    }

    public LineageEntityVO setDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
        return this;
    }
    public String getDetailUrl() {
        return this.detailUrl;
    }

    public LineageEntityVO setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public LineageEntityVO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public LineageEntityVO setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public LineageEntityVO setParentName(String parentName) {
        this.parentName = parentName;
        return this;
    }
    public String getParentName() {
        return this.parentName;
    }

    public LineageEntityVO setQualifiedName(String qualifiedName) {
        this.qualifiedName = qualifiedName;
        return this;
    }
    public String getQualifiedName() {
        return this.qualifiedName;
    }

}
