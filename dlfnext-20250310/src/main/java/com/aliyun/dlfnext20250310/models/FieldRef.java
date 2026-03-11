// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class FieldRef extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("index")
    public Integer index;

    /**
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("name")
    public String name;

    @NameInMap("type")
    public FullDataType type;

    public static FieldRef build(java.util.Map<String, ?> map) throws Exception {
        FieldRef self = new FieldRef();
        return TeaModel.build(map, self);
    }

    public FieldRef setIndex(Integer index) {
        this.index = index;
        return this;
    }
    public Integer getIndex() {
        return this.index;
    }

    public FieldRef setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public FieldRef setType(FullDataType type) {
        this.type = type;
        return this;
    }
    public FullDataType getType() {
        return this.type;
    }

}
