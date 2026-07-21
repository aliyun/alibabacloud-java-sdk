// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class CostModelDetailRowDTO extends TeaModel {
    /**
     * <p>UNIX timestamp (Unix seconds)</p>
     * 
     * <strong>example:</strong>
     * <p>1700000000</p>
     */
    @NameInMap("timestamp")
    public Long timestamp;

    /**
     * <p>Metric value mapping, where the key is the metric name and the value is numeric</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;{\&quot;total_calls\&quot;:3,\&quot;video_duration\&quot;:0,\&quot;total_amount\&quot;:0.6,\&quot;image_count\&quot;:3,\&quot;timestamp\&quot;:1776787200}&quot;</p>
     */
    @NameInMap("values")
    public String values;

    public static CostModelDetailRowDTO build(java.util.Map<String, ?> map) throws Exception {
        CostModelDetailRowDTO self = new CostModelDetailRowDTO();
        return TeaModel.build(map, self);
    }

    public CostModelDetailRowDTO setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public CostModelDetailRowDTO setValues(String values) {
        this.values = values;
        return this;
    }
    public String getValues() {
        return this.values;
    }

}
