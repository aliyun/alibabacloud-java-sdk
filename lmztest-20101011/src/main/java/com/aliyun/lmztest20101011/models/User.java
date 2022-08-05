// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20101011.models;

import com.aliyun.tea.*;

public class User extends TeaModel {
    @NameInMap("Address")
    public String address;

    @NameInMap("Id")
    public String id;

    public static User build(java.util.Map<String, ?> map) throws Exception {
        User self = new User();
        return TeaModel.build(map, self);
    }

    public User setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public User setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
