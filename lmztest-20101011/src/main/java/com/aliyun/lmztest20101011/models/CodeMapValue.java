// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20101011.models;

import com.aliyun.tea.*;

public class CodeMapValue extends TeaModel {
    @NameInMap("id")
    public String id;

    @NameInMap("name")
    public String name;

    public static CodeMapValue build(java.util.Map<String, ?> map) throws Exception {
        CodeMapValue self = new CodeMapValue();
        return TeaModel.build(map, self);
    }

    public CodeMapValue setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CodeMapValue setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
