// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeVerifyContentResponseBody extends TeaModel {
    /**
     * <p>The verification result.</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeVerifyContentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVerifyContentResponseBody self = new DescribeVerifyContentResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVerifyContentResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public DescribeVerifyContentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
