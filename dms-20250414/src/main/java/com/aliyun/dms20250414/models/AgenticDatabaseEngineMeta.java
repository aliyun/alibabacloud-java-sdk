// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class AgenticDatabaseEngineMeta extends TeaModel {
    /**
     * <p>The catalog name in the database engine.</p>
     * 
     * <strong>example:</strong>
     * <p>def</p>
     */
    @NameInMap("CatalogName")
    public String catalogName;

    /**
     * <p>The character set encoding of the database.</p>
     * 
     * <strong>example:</strong>
     * <p>utf8mb4</p>
     */
    @NameInMap("Encoding")
    public String encoding;

    /**
     * <p>The schema name.</p>
     * 
     * <strong>example:</strong>
     * <p>public</p>
     */
    @NameInMap("SchemaName")
    public String schemaName;

    /**
     * <p>The storage capacity of the database, in MB.</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("StorageCapacity")
    public Long storageCapacity;

    public static AgenticDatabaseEngineMeta build(java.util.Map<String, ?> map) throws Exception {
        AgenticDatabaseEngineMeta self = new AgenticDatabaseEngineMeta();
        return TeaModel.build(map, self);
    }

    public AgenticDatabaseEngineMeta setCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }
    public String getCatalogName() {
        return this.catalogName;
    }

    public AgenticDatabaseEngineMeta setEncoding(String encoding) {
        this.encoding = encoding;
        return this;
    }
    public String getEncoding() {
        return this.encoding;
    }

    public AgenticDatabaseEngineMeta setSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }
    public String getSchemaName() {
        return this.schemaName;
    }

    public AgenticDatabaseEngineMeta setStorageCapacity(Long storageCapacity) {
        this.storageCapacity = storageCapacity;
        return this;
    }
    public Long getStorageCapacity() {
        return this.storageCapacity;
    }

}
