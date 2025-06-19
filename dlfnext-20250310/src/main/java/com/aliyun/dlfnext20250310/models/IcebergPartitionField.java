// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class IcebergPartitionField extends TeaModel {
    @NameInMap("fieldId")
    public Long fieldId;

    @NameInMap("name")
    public String name;

    @NameInMap("sourceId")
    public Long sourceId;

    @NameInMap("transform")
    public String transform;

    public static IcebergPartitionField build(java.util.Map<String, ?> map) throws Exception {
        IcebergPartitionField self = new IcebergPartitionField();
        return TeaModel.build(map, self);
    }

    public IcebergPartitionField setFieldId(Long fieldId) {
        this.fieldId = fieldId;
        return this;
    }
    public Long getFieldId() {
        return this.fieldId;
    }

    public IcebergPartitionField setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public IcebergPartitionField setSourceId(Long sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public Long getSourceId() {
        return this.sourceId;
    }

    public IcebergPartitionField setTransform(String transform) {
        this.transform = transform;
        return this;
    }
    public String getTransform() {
        return this.transform;
    }

}
