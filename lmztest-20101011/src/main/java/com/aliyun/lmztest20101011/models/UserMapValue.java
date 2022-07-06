// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20101011.models;

import com.aliyun.tea.*;

public class UserMapValue extends TeaModel {
    @NameInMap("id")
    public String id;

    @NameInMap("name")
    public String name;

    @NameInMap("Uas")
    public String uas;

    @NameInMap("Uaa")
    public String uaa;

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

    public UserMapValue setUas(String uas) {
        this.uas = uas;
        return this;
    }
    public String getUas() {
        return this.uas;
    }

    public UserMapValue setUaa(String uaa) {
        this.uaa = uaa;
        return this;
    }
    public String getUaa() {
        return this.uaa;
    }

}
