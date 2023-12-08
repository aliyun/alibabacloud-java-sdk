// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alicloudproc20240104.models;

import com.aliyun.tea.*;

public class Company extends TeaModel {
    @NameInMap("name")
    public String name;

    @NameInMap("uscc")
    public String uscc;

    public static Company build(java.util.Map<String, ?> map) throws Exception {
        Company self = new Company();
        return TeaModel.build(map, self);
    }

    public Company setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Company setUscc(String uscc) {
        this.uscc = uscc;
        return this;
    }
    public String getUscc() {
        return this.uscc;
    }

}
