// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class CreateTableRequest extends TeaModel {
    /**
     * <p>The table identifier.</p>
     */
    @NameInMap("identifier")
    public Identifier identifier;

    /**
     * <p>The table schema.</p>
     */
    @NameInMap("schema")
    public Schema schema;

    public static CreateTableRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTableRequest self = new CreateTableRequest();
        return TeaModel.build(map, self);
    }

    public CreateTableRequest setIdentifier(Identifier identifier) {
        this.identifier = identifier;
        return this;
    }
    public Identifier getIdentifier() {
        return this.identifier;
    }

    public CreateTableRequest setSchema(Schema schema) {
        this.schema = schema;
        return this;
    }
    public Schema getSchema() {
        return this.schema;
    }

}
