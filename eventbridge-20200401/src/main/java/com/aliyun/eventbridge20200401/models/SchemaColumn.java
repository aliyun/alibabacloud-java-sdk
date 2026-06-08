// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class SchemaColumn extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>VARCHAR</p>
     */
    @NameInMap("Type")
    public String type;

    public static SchemaColumn build(java.util.Map<String, ?> map) throws Exception {
        SchemaColumn self = new SchemaColumn();
        return TeaModel.build(map, self);
    }

    public SchemaColumn setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SchemaColumn setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
