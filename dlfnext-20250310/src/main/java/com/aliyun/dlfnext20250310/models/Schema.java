// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class Schema extends TeaModel {
    /**
     * <p>The comment for the table.</p>
     * 
     * <strong>example:</strong>
     * <p>description</p>
     */
    @NameInMap("comment")
    public String comment;

    /**
     * <p>A list of table column definitions.</p>
     */
    @NameInMap("fields")
    public java.util.List<DataField> fields;

    /**
     * <p>A list of table configuration options.</p>
     */
    @NameInMap("options")
    public java.util.Map<String, String> options;

    /**
     * <p>A list of partition column names.</p>
     */
    @NameInMap("partitionKeys")
    public java.util.List<String> partitionKeys;

    /**
     * <p>A list of primary key column names.</p>
     */
    @NameInMap("primaryKeys")
    public java.util.List<String> primaryKeys;

    public static Schema build(java.util.Map<String, ?> map) throws Exception {
        Schema self = new Schema();
        return TeaModel.build(map, self);
    }

    public Schema setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public Schema setFields(java.util.List<DataField> fields) {
        this.fields = fields;
        return this;
    }
    public java.util.List<DataField> getFields() {
        return this.fields;
    }

    public Schema setOptions(java.util.Map<String, String> options) {
        this.options = options;
        return this;
    }
    public java.util.Map<String, String> getOptions() {
        return this.options;
    }

    public Schema setPartitionKeys(java.util.List<String> partitionKeys) {
        this.partitionKeys = partitionKeys;
        return this;
    }
    public java.util.List<String> getPartitionKeys() {
        return this.partitionKeys;
    }

    public Schema setPrimaryKeys(java.util.List<String> primaryKeys) {
        this.primaryKeys = primaryKeys;
        return this;
    }
    public java.util.List<String> getPrimaryKeys() {
        return this.primaryKeys;
    }

}
