// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnDeliverListResponseBody extends TeaModel {
    /**
     * <p>The information about the tracking task.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;data&quot;: [{&quot;deliverId&quot;: 1,&quot;status&quot;: &quot;enable&quot;,&quot;createTime&quot;: &quot;2020-10-14T11:19:26Z&quot;,&quot;crontab&quot;: &quot;0 0 0 \* \* ?&quot;,&quot;frequency&quot;: &quot;d&quot;,&quot;name&quot;: &quot;The name of the tracking task&quot;,&quot;dmList&quot;: [&quot;<a href="http://www.example.com%22%5D,%22reports">www.example.com&quot;],&quot;reports</a>&quot;: [{&quot;reportId&quot;: 1,&quot;conditions&quot;: [{&quot;op&quot;: &quot;in&quot;,&quot;field&quot;: &quot;prov&quot;,&quot;value&quot;: [&quot;Heilongjiang&quot;,&quot;Beijing&quot;]}} },{&quot;reportId&quot;: 2}],&quot;deliver&quot;: {&quot;email&quot;: {&quot;subject&quot;: &quot;subject&quot;,&quot;to&quot;: [&quot;<a href="mailto:example@alibaba-inc.com">example@alibaba-inc.com</a>&quot;,&quot;<a href="mailto:example@alibaba-inc.com">example@alibaba-inc.com</a>&quot;]}}}]}</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCdnDeliverListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnDeliverListResponseBody self = new DescribeCdnDeliverListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCdnDeliverListResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public DescribeCdnDeliverListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
