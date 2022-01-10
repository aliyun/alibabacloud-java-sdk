// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DatasetLabel extends TeaModel {
    // Key
    @NameInMap("Key")
    public String key;

    // Value
    @NameInMap("Value")
    public String value;

    public static DatasetLabel build(java.util.Map<String, ?> map) throws Exception {
        DatasetLabel self = new DatasetLabel();
        return TeaModel.build(map, self);
    }

    public DatasetLabel setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public DatasetLabel setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
