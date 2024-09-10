// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class BatchExportRequest extends TeaModel {
    /**
     * <p>When you call this operation to export data, you must specify the <code>Cursor</code> parameter. You can obtain the value of the <code>Cursor</code> parameter by using one of the following methods:</p>
     * <ul>
     * <li>When you call this operation for the first time, you must call the Cursor operation to obtain the <code>Cursor</code> value. For more information, see <a href="https://help.aliyun.com/document_detail/2330730.html">Cursor</a>.</li>
     * <li>When you call this operation again, you can obtain the <code>Cursor</code> value from the returned data of the last call.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJidWNrZXRzIjo0LCJjdXJzb3IiOiIxNjQxNDU0MzIwMDAwMWUxY2YxNWY0NTU0MTliZjllYTY4OWQ2ODI1OTU1Yzc1NmZjMDQ2OTMxMzczMzM2MzUzMTMxMzEzMzM0MzMzODM5MzEzMTMwMjQyYzY5MmQ3NTY2MzYzMjY3NmI2ZjM5MzU2YjY4MzAzMTYyNzg3MTcwNjkzMTM3MjQyYyIsImN1cnNvclZlcnNpb24iOiJxdWVyeSIsImVuZFRpbWUiOjE2NDE0NTQ3OTU4MjMsImV4cG9ydEVuZFRpbWUiOjE2NDE0NTQ3OTU4MjMsImV4cG9ydFN0YXJ0VGltZSI6MTY0MTQ1NDE5NTgyMywiZXhwcmVzc1JhbmdlIjpmYWxzZSwiaGFzTmV4dCI6dHJ1ZSwiaW5wdXRNZXRyaWMiOiJDUFVVdGlsaXphdGlvbiIsImlucHV0TmFtZXNwYWNlIjoiYWNzX2Vjc19kYXNoYm9hcmQiLCJsaW1pdCI6MTAwMCwibG9nVGltZU1vZGUiOnRydWUsIm1hdGNoZXJzIjp7ImNoYWluIjpbeyJsYWJlbCI6InVzZXJJZCIsIm9wZXJhdG9yIjoiRVFVQUxTIiwidmFsdWUiOiIxNzM2NTExMTM0Mzg5MTEwIn1dfSwibWV0cmljIjoiQ1BVVXRpbGl6YXRpb24iLCJtZXRyaWNUeXBlIjoiTUVUUklDIiwibmFtZXNwYWNlIjoiYWNzX2Vjc19kYXNoYm9hcmQiLCJuZXh0UGtBZGFwdGVyIjp7fSwib2Zmc2V0IjowLCJwYXJlbnRVaWQiOjEyNzA2NzY2Nzk1NDY3MDQsInN0YXJ0VGltZSI6MTY0MTQ1NDE5NTgyMywic3RlcCI6LTEsInRpbWVvdXQiOjEyMCwid2luZG93Ijo2****</p>
     */
    @NameInMap("Cursor")
    public String cursor;

    /**
     * <p>The maximum number of data entries that can be returned in each response.</p>
     * <p>Valid values: 1 to 10000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("Length")
    public Integer length;

    /**
     * <p>The statistical methods used to customize the returned data. By default, the measurements based on all statistical methods are returned.</p>
     * <p>For example, the <code>cpu_idle</code> metric of ECS (<code>acs_ecs_dashboard</code>) has three statistical methods: <code>Average</code>, <code>Maximum</code>, and <code>Minimum</code>. If you want to return only the measurements based on the <code>Average</code> and <code>Maximum</code> statistical methods, set this parameter to <code>[&quot;Average&quot;, &quot;Maximum&quot;]</code>.</p>
     * <p>The statistical methods of metrics are displayed in the <code>Statistics</code> column on the Metrics page of each cloud service. For more information, see <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
     */
    @NameInMap("Measurements")
    public java.util.List<String> measurements;

    /**
     * <p>The metric that is used to monitor the cloud service.</p>
     * <p>For more information about the metrics of cloud services, see <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
     * <blockquote>
     * <p> The value of this parameter must be the same as the value of the request parameter <code>Metric</code> in the Cursor operation.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cpu_idle</p>
     */
    @NameInMap("Metric")
    public String metric;

    /**
     * <p>The namespace of the cloud service.</p>
     * <p>For more information about the namespaces of cloud services, see <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
     * <blockquote>
     * <p> The value of this parameter must be the same as the value of the request parameter <code>Namespace</code> in the Cursor operation.</p>
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
