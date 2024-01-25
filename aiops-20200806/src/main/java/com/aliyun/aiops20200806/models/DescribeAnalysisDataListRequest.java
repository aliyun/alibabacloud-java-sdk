// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeAnalysisDataListRequest extends TeaModel {
    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MetricExtend")
    public String metricExtend;

    @NameInMap("MetricName")
    public String metricName;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeAnalysisDataListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAnalysisDataListRequest self = new DescribeAnalysisDataListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAnalysisDataListRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeAnalysisDataListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeAnalysisDataListRequest setMetricExtend(String metricExtend) {
        this.metricExtend = metricExtend;
        return this;
    }
    public String getMetricExtend() {
        return this.metricExtend;
    }

    public DescribeAnalysisDataListRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public DescribeAnalysisDataListRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public DescribeAnalysisDataListRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
