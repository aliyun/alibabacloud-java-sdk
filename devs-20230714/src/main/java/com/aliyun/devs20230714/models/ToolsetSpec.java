// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ToolsetSpec extends TeaModel {
    @NameInMap("authorization")
    public ToolsetAuthorization authorization;

    @NameInMap("schema")
    public ToolsetSchema schema;

    public static ToolsetSpec build(java.util.Map<String, ?> map) throws Exception {
        ToolsetSpec self = new ToolsetSpec();
        return TeaModel.build(map, self);
    }

    public ToolsetSpec setAuthorization(ToolsetAuthorization authorization) {
        this.authorization = authorization;
        return this;
    }
    public ToolsetAuthorization getAuthorization() {
        return this.authorization;
    }

    public ToolsetSpec setSchema(ToolsetSchema schema) {
        this.schema = schema;
        return this;
    }
    public ToolsetSchema getSchema() {
        return this.schema;
    }

}
