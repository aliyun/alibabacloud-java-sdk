// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class TrendPointDTO extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1700000000</p>
     */
    @NameInMap("timestamp")
    public Long timestamp;

    @NameInMap("values")
    public String values;

    public static TrendPointDTO build(java.util.Map<String, ?> map) throws Exception {
        TrendPointDTO self = new TrendPointDTO();
        return TeaModel.build(map, self);
    }

    public TrendPointDTO setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public TrendPointDTO setValues(String values) {
        this.values = values;
        return this;
    }
    public String getValues() {
        return this.values;
    }

}
