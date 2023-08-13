// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DataValue extends TeaModel {
    /**
     * <p>The timestamp. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     */
    @NameInMap("Timestamp")
    public String timestamp;

    /**
     * <p>The value of the metric.</p>
     */
    @NameInMap("Value")
    public Object value;

    public static DataValue build(java.util.Map<String, ?> map) throws Exception {
        DataValue self = new DataValue();
        return TeaModel.build(map, self);
    }

    public DataValue setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public String getTimestamp() {
        return this.timestamp;
    }

    public DataValue setValue(Object value) {
        this.value = value;
        return this;
    }
    public Object getValue() {
        return this.value;
    }

}
