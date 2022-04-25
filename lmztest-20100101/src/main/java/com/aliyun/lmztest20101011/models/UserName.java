// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20101011.models;

import com.aliyun.tea.*;

public class UserName extends TeaModel {
    // code
    @NameInMap("Code")
    public String code;

    // name
    @NameInMap("Name")
    public String name;

    public static UserName build(java.util.Map<String, ?> map) throws Exception {
        UserName self = new UserName();
        return TeaModel.build(map, self);
    }

    public UserName setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UserName setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
