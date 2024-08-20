// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainRealTimeDetailDataResponseBody extends TeaModel {
    /**
     * <p>The information returned.</p>
     * <blockquote>
     * <p>The value of this parameter is a JSON string. The following table describes the fields in Data.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[
     *     {
     *       &quot;time_stp&quot;: &quot;2018-06-05T20:00:00Z&quot;,
     *       &quot;domain_name&quot;: &quot;example.com&quot;,
     *       &quot;location&quot;: &quot;Guangdong&quot;,
     *       &quot;isp&quot;: &quot;telecom&quot;,
     *       &quot;qps&quot;: 10.0
     *     },
     *     {
     *       &quot;time_stp&quot;: &quot;2018-06-05T20:00:00Z&quot;,
     *       &quot;domain_name&quot;: &quot;example.com&quot;,
     *       &quot;location&quot;: &quot;Jiangsu&quot;,
     *       &quot;isp&quot;: &quot;unicom&quot;,
     *       &quot;qps&quot;: 11.1
     *     }
     *   ]</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A603F324-7A05-4FB3-ADF3-2563233D26CC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDcdnDomainRealTimeDetailDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainRealTimeDetailDataResponseBody self = new DescribeDcdnDomainRealTimeDetailDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainRealTimeDetailDataResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DescribeDcdnDomainRealTimeDetailDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
