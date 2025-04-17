// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DatasetFileMetasStat extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <strong>example:</strong>
     * <p>cat</p>
     */
    @NameInMap("Key")
    public String key;

    public static DatasetFileMetasStat build(java.util.Map<String, ?> map) throws Exception {
        DatasetFileMetasStat self = new DatasetFileMetasStat();
        return TeaModel.build(map, self);
    }

    public DatasetFileMetasStat setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DatasetFileMetasStat setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

}
