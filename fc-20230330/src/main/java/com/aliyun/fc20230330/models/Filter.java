// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class Filter extends TeaModel {
    @NameInMap("key")
    public Key key;

    public static Filter build(java.util.Map<String, ?> map) throws Exception {
        Filter self = new Filter();
        return TeaModel.build(map, self);
    }

    public Filter setKey(Key key) {
        this.key = key;
        return this;
    }
    public Key getKey() {
        return this.key;
    }

}
