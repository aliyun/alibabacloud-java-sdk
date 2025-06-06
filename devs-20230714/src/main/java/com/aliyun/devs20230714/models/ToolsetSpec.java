// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ToolsetSpec extends TeaModel {
    @NameInMap("schema")
    public ToolsetSchema schema;

    public static ToolsetSpec build(java.util.Map<String, ?> map) throws Exception {
        ToolsetSpec self = new ToolsetSpec();
        return TeaModel.build(map, self);
    }

    public ToolsetSpec setSchema(ToolsetSchema schema) {
        this.schema = schema;
        return this;
    }
    public ToolsetSchema getSchema() {
        return this.schema;
    }

}
