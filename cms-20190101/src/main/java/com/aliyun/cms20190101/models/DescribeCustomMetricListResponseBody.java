// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeCustomMetricListResponseBody extends TeaModel {
    /**
     * <p>The responses code.</p>
     * <blockquote>
     * <p> The status code 200 indicates that the request was successful.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1AF425E4-1DEA-54F2-910A-8117C9686140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The reported custom metrics that are found in the query.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;all\&quot;:0,\&quot;size\&quot;:10,\&quot;param\&quot;:{\&quot;metric\&quot;:\&quot;{\\\&quot;metricName\\\&quot;:\\\&quot;cpu_total\\\&quot;,\\\&quot;groupId\\\&quot;:7378****,\\\&quot;project\\\&quot;:\\\&quot;acs_customMetric_120886317861****\\\&quot;,\\\&quot;dimension\\\&quot;:\\\&quot;sampleName1=value1&amp;sampleName2=value2\\\&quot;,\\\&quot;status\\\&quot;:1}\&quot;,\&quot;service\&quot;:\&quot;metric-center.aliyun-inc.com\&quot;},\&quot;page\&quot;:1,\&quot;list\&quot;:[]}</p>
     */
    @NameInMap("Result")
    public String result;

    public static DescribeCustomMetricListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomMetricListResponseBody self = new DescribeCustomMetricListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCustomMetricListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeCustomMetricListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeCustomMetricListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCustomMetricListResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
