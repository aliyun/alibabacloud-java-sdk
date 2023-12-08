// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alicloudproc20240104.models;

import com.aliyun.tea.*;

public class Contact extends TeaModel {
    @NameInMap("email")
    public String email;

    @NameInMap("name")
    public String name;

    @NameInMap("phone")
    public String phone;

    public static Contact build(java.util.Map<String, ?> map) throws Exception {
        Contact self = new Contact();
        return TeaModel.build(map, self);
    }

    public Contact setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public Contact setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Contact setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

}
