// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class BatchExportRequest extends TeaModel {
    @NameInMap("Cursor")
    public String cursor;

    @NameInMap("Length")
    public Integer length;

    @NameInMap("Measurements")
    public java.util.List<String> measurements;

    @NameInMap("Metric")
    public String metric;

    @NameInMap("Namespace")
    public String namespace;

    public static BatchExportRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchExportRequest self = new BatchExportRequest();
        return TeaModel.build(map, self);
    }

    public BatchExportRequest setCursor(String cursor) {
        this.cursor = cursor;
        return this;
    }
    public String getCursor() {
        return this.cursor;
    }

    public BatchExportRequest setLength(Integer length) {
        this.length = length;
        return this;
    }
    public Integer getLength() {
        return this.length;
    }

    public BatchExportRequest setMeasurements(java.util.List<String> measurements) {
        this.measurements = measurements;
        return this;
    }
    public java.util.List<String> getMeasurements() {
        return this.measurements;
    }

    public BatchExportRequest setMetric(String metric) {
        this.metric = metric;
        return this;
    }
    public String getMetric() {
        return this.metric;
    }

    public BatchExportRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
