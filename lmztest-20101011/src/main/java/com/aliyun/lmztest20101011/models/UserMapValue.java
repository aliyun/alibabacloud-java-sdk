// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20101011.models;

import com.aliyun.tea.*;

public class UserMapValue extends TeaModel {
    @NameInMap("id")
    public String id;

    @NameInMap("name")
    public String name;

    public static UserMapValue build(java.util.Map<String, ?> map) throws Exception {
        UserMapValue self = new UserMapValue();
        return TeaModel.build(map, self);
    }

    public UserMapValue setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UserMapValue setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
