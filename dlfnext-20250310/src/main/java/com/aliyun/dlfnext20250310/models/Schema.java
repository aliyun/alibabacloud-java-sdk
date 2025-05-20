// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class Schema extends TeaModel {
    @NameInMap("comment")
    public String comment;

    @NameInMap("fields")
    public java.util.List<DataField> fields;

    @NameInMap("options")
    public java.util.Map<String, String> options;

    @NameInMap("partitionKeys")
    public java.util.List<String> partitionKeys;

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
