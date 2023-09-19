// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class BatchExportRequest extends TeaModel {
    /**
     * <p>When you call this operation to export data, you must specify the `Cursor` parameter. You can obtain the value of the `Cursor` parameter by using one of the following methods:</p>
     * <br>
     * <p>*   When you call this operation for the first time, you must call the Cursor operation to obtain the `Cursor` value. For more information, see [Cursor](~~2330730~~).</p>
     * <p>*   When you call this operation again, you can obtain the `Cursor` value from the returned data of the last call.</p>
     */
    @NameInMap("Cursor")
    public String cursor;

    /**
     * <p>The maximum number of data entries that can be returned in each response.</p>
     * <br>
     * <p>Valid values: 1 to 10000.</p>
     */
    @NameInMap("Length")
    public Integer length;

    /**
     * <p>The statistical methods used to customize the returned data. By default, the measurements based on all statistical methods are returned.</p>
     * <br>
     * <p>For example, the `cpu_idle` metric of ECS (`acs_ecs_dashboard`) has three statistical methods: `Average`, `Maximum`, and `Minimum`. If you want to return only the measurements based on the `Average` and `Maximum` statistical methods, set this parameter to `["Average", "Maximum"]`.</p>
     * <br>
     * <p>The statistical methods of metrics are displayed in the `Statistics` column on the Metrics page of each cloud service. For more information, see [Appendix 1: Metrics](~~163515~~).</p>
     */
    @NameInMap("Measurements")
    public java.util.List<String> measurements;

    /**
     * <p>The metric that is used to monitor the cloud service.</p>
     * <br>
     * <p>For more information about the metrics of cloud services, see [Appendix 1: Metrics](~~163515~~).</p>
     * <br>
     * <p>>  The value of this parameter must be the same as the value of the request parameter `Metric` in the Cursor operation.</p>
     */
    @NameInMap("Metric")
    public String metric;

    /**
     * <p>The namespace of the cloud service.</p>
     * <br>
     * <p>For more information about the namespaces of cloud services, see [Appendix 1: Metrics](~~163515~~).</p>
     * <br>
     * <p>>  The value of this parameter must be the same as the value of the request parameter `Namespace` in the Cursor operation.</p>
     */
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
