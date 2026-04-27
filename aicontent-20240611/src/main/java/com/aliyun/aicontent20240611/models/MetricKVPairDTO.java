// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class MetricKVPairDTO extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>total_calls</p>
     */
    @NameInMap("key")
    public String key;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("value")
    public Float value;

    public static MetricKVPairDTO build(java.util.Map<String, ?> map) throws Exception {
        MetricKVPairDTO self = new MetricKVPairDTO();
        return TeaModel.build(map, self);
    }

    public MetricKVPairDTO setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public MetricKVPairDTO setValue(Float value) {
        this.value = value;
        return this;
    }
    public Float getValue() {
        return this.value;
    }

}
