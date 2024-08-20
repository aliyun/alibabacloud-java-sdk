// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnSubListResponseBody extends TeaModel {
    /**
     * <p>The information about the custom report.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;data&quot;: [{&quot;subId&quot;: 336,&quot;reportId&quot;: [6,8],&quot;createTime&quot;: &quot;2021-07-05T06:18:46Z&quot;,&quot;domains&quot;: [&quot;example.com&quot;],&quot;effectiveFrom&quot;: &quot;2021-07-05T06:18:46Z&quot;,&quot;effectiveEnd&quot;: &quot;2021-10-05T06:18:46Z&quot;,&quot;status&quot;: &quot;enable&quot;}]</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3250A51D-C11D-46BA-B6B3-95348EEDE652</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDcdnSubListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnSubListResponseBody self = new DescribeDcdnSubListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnSubListResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public DescribeDcdnSubListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
