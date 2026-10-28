// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class SparkOperatorInfo extends TeaModel {
    /**
     * <p>The metric value.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MetricValue")
    public Long metricValue;

    /**
     * <p>The operator name.</p>
     * 
     * <strong>example:</strong>
     * <p>TableScan</p>
     */
    @NameInMap("OperatorName")
    public byte[] operatorName;

    public static SparkOperatorInfo build(java.util.Map<String, ?> map) throws Exception {
        SparkOperatorInfo self = new SparkOperatorInfo();
        return TeaModel.build(map, self);
    }

    public SparkOperatorInfo setMetricValue(Long metricValue) {
        this.metricValue = metricValue;
        return this;
    }
    public Long getMetricValue() {
        return this.metricValue;
    }

    public SparkOperatorInfo setOperatorName(byte[] operatorName) {
        this.operatorName = operatorName;
        return this;
    }
    public byte[] getOperatorName() {
        return this.operatorName;
    }

}
