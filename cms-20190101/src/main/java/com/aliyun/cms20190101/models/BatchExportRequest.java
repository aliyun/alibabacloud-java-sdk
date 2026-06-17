// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class BatchExportRequest extends TeaModel {
    /**
     * <p>When you call this operation in a loop to export data, you must specify the value of <code>Cursor</code>. You can obtain the value of <code>Cursor</code> by using the following methods:</p>
     * <ul>
     * <li><p>When you call this operation for the first time, you must first call the Cursor operation to obtain the value of <code>Cursor</code>. For more information, see <a href="https://help.aliyun.com/document_detail/2330730.html">Cursor</a>.</p>
     * </li>
     * <li><p>When you call this operation again, you can obtain the value of <code>Cursor</code> from the response of the last call.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJidWNrZXRzIjo0LCJjdXJzb3IiOiIxNjQxNDU0MzIwMDAwMWUxY2YxNWY0NTU0MTliZjllYTY4OWQ2ODI1OTU1Yzc1NmZjMDQ2OTMxMzczMzM2MzUzMTMxMzEzMzM0MzMzODM5MzEzMTMwMjQyYzY5MmQ3NTY2MzYzMjY3NmI2ZjM5MzU2YjY4MzAzMTYyNzg3MTcwNjkzMTM3MjQyYyIsImN1cnNvclZlcnNpb24iOiJxdWVyeSIsImVuZFRpbWUiOjE2NDE0NTQ3OTU4MjMsImV4cG9ydEVuZFRpbWUiOjE2NDE0NTQ3OTU4MjMsImV4cG9ydFN0YXJ0VGltZSI6MTY0MTQ1NDE5NTgyMywiZXhwcmVzc1JhbmdlIjpmYWxzZSwiaGFzTmV4dCI6dHJ1ZSwiaW5wdXRNZXRyaWMiOiJDUFVVdGlsaXphdGlvbiIsImlucHV0TmFtZXNwYWNlIjoiYWNzX2Vjc19kYXNoYm9hcmQiLCJsaW1pdCI6MTAwMCwibG9nVGltZU1vZGUiOnRydWUsIm1hdGNoZXJzIjp7ImNoYWluIjpbeyJsYWJlbCI6InVzZXJJZCIsIm9wZXJhdG9yIjoiRVFVQUxTIiwidmFsdWUiOiIxNzM2NTExMTM0Mzg5MTEwIn1dfSwibWV0cmljIjoiQ1BVVXRpbGl6YXRpb24iLCJtZXRyaWNUeXBlIjoiTUVUUklDIiwibmFtZXNwYWNlIjoiYWNzX2Vjc19kYXNoYm9hcmQiLCJuZXh0UGtBZGFwdGVyIjp7fSwib2Zmc2V0IjowLCJwYXJlbnRVaWQiOjEyNzA2NzY2Nzk1NDY3MDQsInN0YXJ0VGltZSI6MTY0MTQ1NDE5NTgyMywic3RlcCI6LTEsInRpbWVvdXQiOjEyMCwid2luZG93Ijo2****</p>
     */
    @NameInMap("Cursor")
    public String cursor;

    /**
     * <p>The maximum number of data entries to return each time.</p>
     * <p>Valid values: 1 to 10000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("Length")
    public Integer length;

    /**
     * <p>The measurements that are used to customize the returned data. By default, all measurements are returned.</p>
     * <p>For example, the metric <code>cpu_idle</code> of the cloud service <code>acs_ecs_dashboard</code> has three measurement columns: <code>Average</code>, <code>Maximum</code>, and <code>Minimum</code>. If you only need to return the <code>Average</code> and <code>Maximum</code> columns, set this parameter to the array <code>[&quot;Average&quot;, &quot;Maximum&quot;]</code>.</p>
     * <p>For information about how to obtain the measurements of a metric of a cloud service, see the <code>statistics</code> column of <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
     */
    @NameInMap("Measurements")
    public java.util.List<String> measurements;

    /**
     * <p>The name of the metric of the cloud service.</p>
     * <p>For information about how to obtain the name of a metric of a cloud service, see <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
     * <blockquote>
     * <p>This parameter must be the same as the request parameter <code>Metric</code> in the Cursor operation.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cpu_idle</p>
     */
    @NameInMap("Metric")
    public String metric;

    /**
     * <p>The data namespace of the cloud service.</p>
     * <p>For information about how to obtain the data namespace of a cloud service, see <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
     * <blockquote>
     * <p>This parameter must be the same as the request parameter <code>Namespace</code> in the Cursor operation.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acs_ecs_dashboard</p>
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
