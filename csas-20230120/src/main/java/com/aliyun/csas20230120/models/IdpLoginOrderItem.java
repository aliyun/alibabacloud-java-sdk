// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class IdpLoginOrderItem extends TeaModel {
    @NameInMap("Class")
    public String _class;

    @NameInMap("ConfigId")
    public String configId;

    @NameInMap("Desc")
    public String desc;

    @NameInMap("Enabled")
    public Boolean enabled;

    @NameInMap("Name")
    public String name;

    @NameInMap("Type")
    public String type;

    public static IdpLoginOrderItem build(java.util.Map<String, ?> map) throws Exception {
        IdpLoginOrderItem self = new IdpLoginOrderItem();
        return TeaModel.build(map, self);
    }

    public IdpLoginOrderItem set_class(String _class) {
        this._class = _class;
        return this;
    }
    public String get_class() {
        return this._class;
    }

    public IdpLoginOrderItem setConfigId(String configId) {
        this.configId = configId;
        return this;
    }
    public String getConfigId() {
        return this.configId;
    }

    public IdpLoginOrderItem setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public IdpLoginOrderItem setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public IdpLoginOrderItem setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public IdpLoginOrderItem setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
