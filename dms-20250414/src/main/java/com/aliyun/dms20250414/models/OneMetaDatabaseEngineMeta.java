// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class OneMetaDatabaseEngineMeta extends TeaModel {
    @NameInMap("CatalogName")
    public String catalogName;

    @NameInMap("Encoding")
    public String encoding;

    @NameInMap("SchemaName")
    public String schemaName;

    @NameInMap("StorageCapacity")
    public Long storageCapacity;

    public static OneMetaDatabaseEngineMeta build(java.util.Map<String, ?> map) throws Exception {
        OneMetaDatabaseEngineMeta self = new OneMetaDatabaseEngineMeta();
        return TeaModel.build(map, self);
    }

    public OneMetaDatabaseEngineMeta setCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }
    public String getCatalogName() {
        return this.catalogName;
    }

    public OneMetaDatabaseEngineMeta setEncoding(String encoding) {
        this.encoding = encoding;
        return this;
    }
    public String getEncoding() {
        return this.encoding;
    }

    public OneMetaDatabaseEngineMeta setSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }
    public String getSchemaName() {
        return this.schemaName;
    }

    public OneMetaDatabaseEngineMeta setStorageCapacity(Long storageCapacity) {
        this.storageCapacity = storageCapacity;
        return this;
    }
    public Long getStorageCapacity() {
        return this.storageCapacity;
    }

}
