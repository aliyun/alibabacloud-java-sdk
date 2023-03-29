// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnDeliverListResponseBody extends TeaModel {
    /**
     * <p>The information about the tracking task.</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The ID of the request.</p>
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
