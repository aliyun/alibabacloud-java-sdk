// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DatasetLabel extends TeaModel {
    /**
     * <p>Dataset label keys</p>
     * 
     * <strong>example:</strong>
     * <p>key1</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>Dataset label values</p>
     * 
     * <strong>example:</strong>
     * <p>value1</p>
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
