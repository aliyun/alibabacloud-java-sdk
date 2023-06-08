// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnSubListResponseBody extends TeaModel {
    /**
     * <p>The information about the custom report task.</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The ID of the request.</p>
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
