// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeBenchmarkTaskReportResponseBody extends TeaModel {
    /**
     * <p>If the value of ReportType is set to RAW, the details about the stress testing report are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;TimestampList&quot;: [&quot;int64&quot;],
     *     &quot;QPSList&quot;: [&quot;float32&quot;],
     *     &quot;RTList&quot;: [
     *       {
     *         &quot;AVG&quot;: &quot;float32&quot;,
     *         &quot;TP100&quot;: &quot;float32&quot;,
     *         &quot;TP99&quot;: &quot;float32&quot;,
     *         &quot;TP90&quot;: &quot;float32&quot;,
     *         &quot;TP50&quot;: &quot;float32&quot;,
     *         &quot;TP10&quot;: &quot;float32&quot;
     *       }
     *     ],
     *     &quot;TrafficList&quot;: [
     *       {
     *         &quot;Send&quot;: &quot;float64&quot;,
     *         &quot;Receive&quot;: &quot;float64&quot;
     *       }
     *     ],
     *     &quot;StatusCode&quot;: {
     *       &quot;200&quot;: &quot;uint64&quot;,
     *       &quot;450&quot;: &quot;uint64&quot;,
     *       &quot;500&quot;: &quot;uint64&quot;
     *     },
     *     &quot;Count&quot;: &quot;uint64&quot;,
     *     &quot;Total&quot;: &quot;float64&quot;,
     *     &quot;MinRT&quot;: &quot;float32&quot;,
     *     &quot;AvgRT&quot;: &quot;float32&quot;,
     *     &quot;MaxRT&quot;: &quot;float32&quot;,
     *     &quot;QPS&quot;: &quot;float32&quot;,
     *     &quot;TotalSend&quot;: &quot;float64&quot;,
     *     &quot;TotalReceive&quot;: &quot;float64&quot;,
     *     &quot;RTDistribution&quot;: [
     *       {
     *         &quot;Latency&quot;: &quot;float32&quot;,
     *         &quot;Percentage&quot;: &quot;int&quot;
     *       }
     *     ],
     *     &quot;RTHistogram&quot;: [
     *       {
     *         &quot;Count&quot;: &quot;int&quot;,
     *         &quot;Mark&quot;: &quot;float32&quot;,
     *         &quot;Frequency&quot;: &quot;float32&quot;
     *       }
     *     ]
     *   }</p>
     */
    @NameInMap("Data")
    public Object data;

    /**
     * <p>If the value of ReportType is set to Report, the URL of the stress testing report is returned.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://eas-benchmark.oss-cn-chengdu.aliyuncs.com/summary/benchmark-larec-test-015d-10007.html">http://eas-benchmark.oss-cn-chengdu.aliyuncs.com/summary/benchmark-larec-test-015d-10007.html</a></p>
     */
    @NameInMap("ReportUrl")
    public String reportUrl;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>40325405-579C-4D82********</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeBenchmarkTaskReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBenchmarkTaskReportResponseBody self = new DescribeBenchmarkTaskReportResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBenchmarkTaskReportResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public DescribeBenchmarkTaskReportResponseBody setReportUrl(String reportUrl) {
        this.reportUrl = reportUrl;
        return this;
    }
    public String getReportUrl() {
        return this.reportUrl;
    }

    public DescribeBenchmarkTaskReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
