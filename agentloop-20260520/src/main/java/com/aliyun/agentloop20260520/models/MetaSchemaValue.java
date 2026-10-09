// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class MetaSchemaValue extends TeaModel {
    /**
     * <p>The dataset field types. Valid values: text, long, double, and json.</p>
     * 
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("type")
    public String type;

    public static MetaSchemaValue build(java.util.Map<String, ?> map) throws Exception {
        MetaSchemaValue self = new MetaSchemaValue();
        return TeaModel.build(map, self);
    }

    public MetaSchemaValue setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
