// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainRealTimeDetailDataResponseBody extends TeaModel {
    /**
     * <p>The monitoring data of each ISP in each region.</p>
     * 
     * <strong>example:</strong>
     * <p>[
     *       {
     *             &quot;time_stp&quot;: &quot;2018-06-05T20:00:00Z&quot;,
     *             &quot;domain_name&quot;: &quot;example.com&quot;,
     *             &quot;location&quot;: &quot;Guangdong&quot;,
     *             &quot;isp&quot;: &quot;telecom&quot;,
     *             &quot;qps&quot;: 10
     *       },
     *       {
     *             &quot;time_stp&quot;: &quot;2018-06-05T20:00:00Z&quot;,
     *             &quot;domain_name&quot;: &quot;example.com&quot;,
     *             &quot;location&quot;: &quot;Jiangsu&quot;,
     *             &quot;isp&quot;: &quot;unicom&quot;,
     *             &quot;qps&quot;: 11.1
     *       }
     * ]</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B49E6DDA-F413-422B-B58E-2FA23F286726</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDomainRealTimeDetailDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainRealTimeDetailDataResponseBody self = new DescribeDomainRealTimeDetailDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainRealTimeDetailDataResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DescribeDomainRealTimeDetailDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
