// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class TimeSeriesPointDTO extends TeaModel {
    /**
     * <p>The label.</p>
     * 
     * <strong>example:</strong>
     * <p>series1</p>
     */
    @NameInMap("label")
    public String label;

    /**
     * <p>The timestamp (RFC3339).</p>
     * 
     * <strong>example:</strong>
     * <p>2024-01-01T00:00:00Z</p>
     */
    @NameInMap("timestamp")
    public String timestamp;

    /**
     * <p>The value.</p>
     * 
     * <strong>example:</strong>
     * <p>42.76</p>
     */
    @NameInMap("value")
    public Object value;

    public static TimeSeriesPointDTO build(java.util.Map<String, ?> map) throws Exception {
        TimeSeriesPointDTO self = new TimeSeriesPointDTO();
        return TeaModel.build(map, self);
    }

    public TimeSeriesPointDTO setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public TimeSeriesPointDTO setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public String getTimestamp() {
        return this.timestamp;
    }

    public TimeSeriesPointDTO setValue(Object value) {
        this.value = value;
        return this;
    }
    public Object getValue() {
        return this.value;
    }

}
