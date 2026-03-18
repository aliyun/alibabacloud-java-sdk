// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetTableInfoRequest extends TeaModel {
    @NameInMap("schemaName")
    public String schemaName;

    @NameInMap("type")
    public String type;

    public static GetTableInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTableInfoRequest self = new GetTableInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetTableInfoRequest setSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }
    public String getSchemaName() {
        return this.schemaName;
    }

    public GetTableInfoRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
