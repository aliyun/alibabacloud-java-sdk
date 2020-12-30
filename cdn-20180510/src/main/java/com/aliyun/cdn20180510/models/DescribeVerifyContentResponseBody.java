// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeVerifyContentResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Content")
    public String content;

    public static DescribeVerifyContentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVerifyContentResponseBody self = new DescribeVerifyContentResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVerifyContentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVerifyContentResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
