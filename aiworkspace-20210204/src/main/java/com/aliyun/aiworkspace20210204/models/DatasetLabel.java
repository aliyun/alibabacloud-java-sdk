// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DatasetLabel extends TeaModel {
    /**
     * <p>The label key, which must be 1 to 128 characters long.</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The label value, which can be 0 to 128 characters long.</p>
     */
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
