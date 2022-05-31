// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class PresetReference extends TeaModel {
    // 名称
    @NameInMap("Name")
    public String name;

    // 类型
    @NameInMap("Type")
    public String type;

    public static PresetReference build(java.util.Map<String, ?> map) throws Exception {
        PresetReference self = new PresetReference();
        return TeaModel.build(map, self);
    }

    public PresetReference setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PresetReference setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
