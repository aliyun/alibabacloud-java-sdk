// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.milvus20231012.models;

import com.aliyun.tea.*;

public class DlfFieldSchema extends TeaModel {
    /**
     * <p>A comment for the field.</p>
     * 
     * <strong>example:</strong>
     * <p>Primary key field</p>
     */
    @NameInMap("comment")
    public String comment;

    /**
     * <p>The dimension of the vector field. This parameter applies only when <code>isVectorField</code> is <code>true</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>128</p>
     */
    @NameInMap("dimension")
    public Integer dimension;

    /**
     * <p>The DLF field type.</p>
     * 
     * <strong>example:</strong>
     * <p>BIGINT</p>
     */
    @NameInMap("dlfFieldType")
    public String dlfFieldType;

    /**
     * <p>The field name.</p>
     * 
     * <strong>example:</strong>
     * <p>id</p>
     */
    @NameInMap("fieldName")
    public String fieldName;

    /**
     * <p>Indicates whether the field is a primary key.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("isPrimaryKey")
    public Boolean isPrimaryKey;

    /**
     * <p>Indicates whether the DLF field type can be mapped to a Milvus field type.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("isSupported")
    public Boolean isSupported;

    /**
     * <p>Indicates whether the field is a vector field.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("isVectorField")
    public Boolean isVectorField;

    /**
     * <p>The corresponding Milvus field type.</p>
     * 
     * <strong>example:</strong>
     * <p>Int64</p>
     */
    @NameInMap("milvusFieldType")
    public String milvusFieldType;

    /**
     * <p>Indicates whether the field can be null.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("nullable")
    public Boolean nullable;

    /**
     * <p>The reason the DLF field type is unsupported. This field is present only when <code>isSupported</code> is <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>Unsupported type</p>
     */
    @NameInMap("unsupportedReason")
    public String unsupportedReason;

    public static DlfFieldSchema build(java.util.Map<String, ?> map) throws Exception {
        DlfFieldSchema self = new DlfFieldSchema();
        return TeaModel.build(map, self);
    }

    public DlfFieldSchema setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public DlfFieldSchema setDimension(Integer dimension) {
        this.dimension = dimension;
        return this;
    }
    public Integer getDimension() {
        return this.dimension;
    }

    public DlfFieldSchema setDlfFieldType(String dlfFieldType) {
        this.dlfFieldType = dlfFieldType;
        return this;
    }
    public String getDlfFieldType() {
        return this.dlfFieldType;
    }

    public DlfFieldSchema setFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }
    public String getFieldName() {
        return this.fieldName;
    }

    public DlfFieldSchema setIsPrimaryKey(Boolean isPrimaryKey) {
        this.isPrimaryKey = isPrimaryKey;
        return this;
    }
    public Boolean getIsPrimaryKey() {
        return this.isPrimaryKey;
    }

    public DlfFieldSchema setIsSupported(Boolean isSupported) {
        this.isSupported = isSupported;
        return this;
    }
    public Boolean getIsSupported() {
        return this.isSupported;
    }

    public DlfFieldSchema setIsVectorField(Boolean isVectorField) {
        this.isVectorField = isVectorField;
        return this;
    }
    public Boolean getIsVectorField() {
        return this.isVectorField;
    }

    public DlfFieldSchema setMilvusFieldType(String milvusFieldType) {
        this.milvusFieldType = milvusFieldType;
        return this;
    }
    public String getMilvusFieldType() {
        return this.milvusFieldType;
    }

    public DlfFieldSchema setNullable(Boolean nullable) {
        this.nullable = nullable;
        return this;
    }
    public Boolean getNullable() {
        return this.nullable;
    }

    public DlfFieldSchema setUnsupportedReason(String unsupportedReason) {
        this.unsupportedReason = unsupportedReason;
        return this;
    }
    public String getUnsupportedReason() {
        return this.unsupportedReason;
    }

}
