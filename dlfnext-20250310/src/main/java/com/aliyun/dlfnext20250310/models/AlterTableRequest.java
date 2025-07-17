// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class AlterTableRequest extends TeaModel {
    @NameInMap("changes")
    public java.util.List<FullSchemaChange> changes;

    public static AlterTableRequest build(java.util.Map<String, ?> map) throws Exception {
        AlterTableRequest self = new AlterTableRequest();
        return TeaModel.build(map, self);
    }

    public AlterTableRequest setChanges(java.util.List<FullSchemaChange> changes) {
        this.changes = changes;
        return this;
    }
    public java.util.List<FullSchemaChange> getChanges() {
        return this.changes;
    }

}
