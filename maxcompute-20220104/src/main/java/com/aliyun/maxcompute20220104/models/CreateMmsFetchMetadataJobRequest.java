// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class CreateMmsFetchMetadataJobRequest extends TeaModel {
    /**
     * <p>Updates metadata for the specified source database, schema, or dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("dbName")
    public String dbName;

    /**
     * <p>Updates metadata for the specified source tables.</p>
     */
    @NameInMap("tableNames")
    public java.util.List<String> tableNames;

    public static CreateMmsFetchMetadataJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMmsFetchMetadataJobRequest self = new CreateMmsFetchMetadataJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateMmsFetchMetadataJobRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public CreateMmsFetchMetadataJobRequest setTableNames(java.util.List<String> tableNames) {
        this.tableNames = tableNames;
        return this;
    }
    public java.util.List<String> getTableNames() {
        return this.tableNames;
    }

}
