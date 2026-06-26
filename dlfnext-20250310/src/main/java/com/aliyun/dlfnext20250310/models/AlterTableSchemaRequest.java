// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class AlterTableSchemaRequest extends TeaModel {
    /**
     * <p>The table schema.</p>
     */
    @NameInMap("schema")
    public Schema schema;

    public static AlterTableSchemaRequest build(java.util.Map<String, ?> map) throws Exception {
        AlterTableSchemaRequest self = new AlterTableSchemaRequest();
        return TeaModel.build(map, self);
    }

    public AlterTableSchemaRequest setSchema(Schema schema) {
        this.schema = schema;
        return this;
    }
    public Schema getSchema() {
        return this.schema;
    }

}
