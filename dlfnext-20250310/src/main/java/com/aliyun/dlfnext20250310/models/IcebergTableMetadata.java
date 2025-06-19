// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class IcebergTableMetadata extends TeaModel {
    @NameInMap("currentSnapshot")
    public IcebergSnapshot currentSnapshot;

    @NameInMap("fields")
    public java.util.List<IcebergNestedField> fields;

    @NameInMap("partitionFields")
    public java.util.List<IcebergPartitionField> partitionFields;

    @NameInMap("properties")
    public java.util.Map<String, String> properties;

    public static IcebergTableMetadata build(java.util.Map<String, ?> map) throws Exception {
        IcebergTableMetadata self = new IcebergTableMetadata();
        return TeaModel.build(map, self);
    }

    public IcebergTableMetadata setCurrentSnapshot(IcebergSnapshot currentSnapshot) {
        this.currentSnapshot = currentSnapshot;
        return this;
    }
    public IcebergSnapshot getCurrentSnapshot() {
        return this.currentSnapshot;
    }

    public IcebergTableMetadata setFields(java.util.List<IcebergNestedField> fields) {
        this.fields = fields;
        return this;
    }
    public java.util.List<IcebergNestedField> getFields() {
        return this.fields;
    }

    public IcebergTableMetadata setPartitionFields(java.util.List<IcebergPartitionField> partitionFields) {
        this.partitionFields = partitionFields;
        return this;
    }
    public java.util.List<IcebergPartitionField> getPartitionFields() {
        return this.partitionFields;
    }

    public IcebergTableMetadata setProperties(java.util.Map<String, String> properties) {
        this.properties = properties;
        return this;
    }
    public java.util.Map<String, String> getProperties() {
        return this.properties;
    }

}
