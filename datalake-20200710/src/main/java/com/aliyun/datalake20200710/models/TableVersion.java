// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class TableVersion extends TeaModel {
    @NameInMap("Table")
    public Table table;

    // table version
    @NameInMap("VersionId")
    public Integer versionId;

    public static TableVersion build(java.util.Map<String, ?> map) throws Exception {
        TableVersion self = new TableVersion();
        return TeaModel.build(map, self);
    }

    public TableVersion setTable(Table table) {
        this.table = table;
        return this;
    }
    public Table getTable() {
        return this.table;
    }

    public TableVersion setVersionId(Integer versionId) {
        this.versionId = versionId;
        return this;
    }
    public Integer getVersionId() {
        return this.versionId;
    }

}
