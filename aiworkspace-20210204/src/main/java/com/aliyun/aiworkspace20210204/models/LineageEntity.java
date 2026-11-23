// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class LineageEntity extends TeaModel {
    /**
     * <p>Attributes</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Bucket&quot;:&quot;example-bucket&quot;,&quot;Path&quot;:&quot;training/data/&quot;,&quot;ResourceType&quot;:&quot;dataset&quot;,&quot;ResourceUse&quot;:&quot;train&quot;,&quot;RegionId&quot;:&quot;cn-hangzhou&quot;}</p>
     */
    @NameInMap("Attributes")
    public java.util.Map<String, ?> attributes;

    /**
     * <p>The type of the data lineage entity.</p>
     * 
     * <strong>example:</strong>
     * <p>oss-file</p>
     */
    @NameInMap("EntityType")
    public String entityType;

    /**
     * <p>The name of the data lineage entity.</p>
     * 
     * <strong>example:</strong>
     * <p>training-dataset</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The unique qualified name of the data lineage entity.</p>
     * 
     * <strong>example:</strong>
     * <p>maxcompute-table.demo_project.training_data</p>
     */
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
