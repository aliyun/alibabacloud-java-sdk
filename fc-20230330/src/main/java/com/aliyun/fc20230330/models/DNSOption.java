// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class DNSOption extends TeaModel {
    @NameInMap("name")
    public String name;

    @NameInMap("value")
    public String value;

    public static DNSOption build(java.util.Map<String, ?> map) throws Exception {
        DNSOption self = new DNSOption();
        return TeaModel.build(map, self);
    }

    public DNSOption setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DNSOption setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
