// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class BatchExportShrinkRequest extends TeaModel {
    @NameInMap("Cursor")
    public String cursor;

    @NameInMap("Length")
    public Integer length;

    @NameInMap("Measurements")
    public String measurementsShrink;

    @NameInMap("Metric")
    public String metric;

    @NameInMap("Namespace")
    public String namespace;

    public static BatchExportShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchExportShrinkRequest self = new BatchExportShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchExportShrinkRequest setCursor(String cursor) {
        this.cursor = cursor;
        return this;
    }
    public String getCursor() {
        return this.cursor;
    }

    public BatchExportShrinkRequest setLength(Integer length) {
        this.length = length;
        return this;
    }
    public Integer getLength() {
        return this.length;
    }

    public BatchExportShrinkRequest setMeasurementsShrink(String measurementsShrink) {
        this.measurementsShrink = measurementsShrink;
        return this;
    }
    public String getMeasurementsShrink() {
        return this.measurementsShrink;
    }

    public BatchExportShrinkRequest setMetric(String metric) {
        this.metric = metric;
        return this;
    }
    public String getMetric() {
        return this.metric;
    }

    public BatchExportShrinkRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
