// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class BatchExportShrinkRequest extends TeaModel {
    /**
     * <p>The value of Cursor. This parameter is required when you repeatedly call this operation to export data. You can obtain the value of Cursor by using one of the following methods:</p>
     * <ul>
     * <li><p>When you call this operation for the first time, you must call the Cursor operation to obtain the value of Cursor. For more information, see <a href="https://help.aliyun.com/document_detail/2330730.html">Cursor</a>.</p>
     * </li>
     * <li><p>When you call this operation again, you can obtain the value of Cursor from the response of the previous call.</p>
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
     * <p>The maximum number of data records to return each time.</p>
     * <p>Valid values: 1 to 10000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("Length")
    public Integer length;

    /**
     * <p>The measurements used to customize the returned data. By default, all measurements are returned.</p>
     * <p>For example, the cpu_idle monitoring metric of the acs_ecs_dashboard cloud service has three measurement columns: Average, Maximum, and Minimum. If you want to return only the Average and Maximum columns, you can apply the following Settings to this parameter: [&quot;Average&quot;, &quot;Maximum&quot;].</p>
     * <p>For more information about how to obtain the measurements of a cloud service monitoring metric, see the statistics column in <a href="https://help.aliyun.com/document_detail/163515.html">Cloud service monitoring metrics</a>.</p>
     */
    @NameInMap("Measurements")
    public String measurementsShrink;

    /**
     * <p>The name of the cloud service monitoring metric.</p>
     * <p>For more information about how to obtain the name of a cloud service monitoring metric, see <a href="https://help.aliyun.com/document_detail/163515.html">Cloud service monitoring metrics</a>.</p>
     * <blockquote>
     * <p>This parameter must be the same as the Metric request parameter in the Cursor operation.</p>
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
     * <p>For more information about how to obtain the data namespace of a cloud service, see <a href="https://help.aliyun.com/document_detail/163515.html">Cloud service monitoring metrics</a>.</p>
     * <blockquote>
     * <p>This parameter must be the same as the Namespace request parameter in the Cursor operation.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acs_ecs_dashboard</p>
     */
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
