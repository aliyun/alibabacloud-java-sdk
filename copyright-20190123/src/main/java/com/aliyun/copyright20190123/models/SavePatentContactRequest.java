// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class SavePatentContactRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("Email")
    public String email;

    @NameInMap("Mobile")
    public String mobile;

    @NameInMap("Id")
    public Long id;

    public static SavePatentContactRequest build(java.util.Map<String, ?> map) throws Exception {
        SavePatentContactRequest self = new SavePatentContactRequest();
        return TeaModel.build(map, self);
    }

    public SavePatentContactRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SavePatentContactRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public SavePatentContactRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public SavePatentContactRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
