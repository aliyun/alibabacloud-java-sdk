// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20101011.models;

import com.aliyun.tea.*;

public class AddCRParam extends TeaModel {
    @NameInMap("attributes")
    public String attributes;

    @NameInMap("configId")
    public String configId;

    @NameInMap("relations")
    public java.util.List<String> relations;

    public static AddCRParam build(java.util.Map<String, ?> map) throws Exception {
        AddCRParam self = new AddCRParam();
        return TeaModel.build(map, self);
    }

    public AddCRParam setAttributes(String attributes) {
        this.attributes = attributes;
        return this;
    }
    public String getAttributes() {
        return this.attributes;
    }

    public AddCRParam setConfigId(String configId) {
        this.configId = configId;
        return this;
    }
    public String getConfigId() {
        return this.configId;
    }

    public AddCRParam setRelations(java.util.List<String> relations) {
        this.relations = relations;
        return this;
    }
    public java.util.List<String> getRelations() {
        return this.relations;
    }

}
