// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class RequestTag extends TeaModel {
    @NameInMap("Key")
    public String key;

    @NameInMap("Value")
    public String value;

    public static RequestTag build(java.util.Map<String, ?> map) throws Exception {
        RequestTag self = new RequestTag();
        return TeaModel.build(map, self);
    }

    public RequestTag setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public RequestTag setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
