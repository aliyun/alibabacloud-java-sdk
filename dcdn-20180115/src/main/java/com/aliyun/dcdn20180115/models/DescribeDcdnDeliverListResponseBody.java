// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDeliverListResponseBody extends TeaModel {
    /**
     * <p>The information about the tracking task.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;data&quot;: [{&quot;deliverId&quot;: 1,&quot;status&quot;: &quot;enable&quot;,&quot;createTime&quot;: &quot;2021-06-14T11:19:26Z&quot;,&quot;crontab&quot;: &quot;0 0 0 \* \* ?&quot;,&quot;frequency&quot;: &quot;d&quot;,&quot;name&quot;: &quot;Domain name report&quot;,&quot;dmList&quot;: [&quot;<a href="http://www.example.com%22%5D,%22reports">www.example.com&quot;],&quot;reports</a>&quot;: [{&quot;reportId&quot;: 1,&quot;conditions&quot;: [{&quot;op&quot;: &quot;in&quot;,&quot;field&quot;: &quot;prov&quot;,&quot;value&quot;: [&quot;Heilongjiang&quot;,&quot;Beijing&quot;]}]},{&quot;reportId&quot;: 2}],&quot;deliver&quot;: {&quot;email&quot;: {&quot;subject&quot;: &quot;subject&quot;,&quot;to&quot;: [&quot;<a href="mailto:username@example.com">username@example.com</a>&quot;,&quot;<a href="mailto:username@example.org">username@example.org</a>&quot;],&quot;copy&quot;:[&quot;<a href="mailto:username@example.com">username@example.com</a>&quot;,&quot;<a href="mailto:username@example.org">username@example.org</a>&quot;]}}}]}</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDcdnDeliverListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDeliverListResponseBody self = new DescribeDcdnDeliverListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDeliverListResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public DescribeDcdnDeliverListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
