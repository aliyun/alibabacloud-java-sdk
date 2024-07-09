// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnSubListResponseBody extends TeaModel {
    /**
     * <p>The information about the custom report task.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;RequestId&quot;:&quot;3250A51D-C11D-46BA-B6B3-95348EEDE652&quot;,&quot;Description&quot;:&quot;Successful&quot;,&quot;Content&quot;:{&quot;data&quot;:[{&quot;subId&quot;:5,&quot;reportId&quot;:[1,2,3],&quot;createTime&quot;:&quot;2020-09-25T09:39:33Z&quot;,&quot;domains&quot;[&quot;<a href="http://www.example.com%22,%22www.example.com%22%5D,%22effectiveFrom%22:%222020-09-17T00:00:00Z%22,%22effectiveEnd%22:%222020-11-17T00:00:00Z%22,%22status%22:%22enable%22%7D%5D%7D%7D">www.example.com&quot;,&quot;www.example.com&quot;],&quot;effectiveFrom&quot;:&quot;2020-09-17T00:00:00Z&quot;,&quot;effectiveEnd&quot;:&quot;2020-11-17T00:00:00Z&quot;,&quot;status&quot;:&quot;enable&quot;}]}}</a></p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>3250A51D-C11D-46BA-B6B3-95348EEDE652</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCdnSubListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnSubListResponseBody self = new DescribeCdnSubListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCdnSubListResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public DescribeCdnSubListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
