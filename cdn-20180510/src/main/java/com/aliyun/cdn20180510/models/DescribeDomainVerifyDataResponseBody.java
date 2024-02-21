// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainVerifyDataResponseBody extends TeaModel {
    /**
     * <p>The verification content.</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDomainVerifyDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainVerifyDataResponseBody self = new DescribeDomainVerifyDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainVerifyDataResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public DescribeDomainVerifyDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
