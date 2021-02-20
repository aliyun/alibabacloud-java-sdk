// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeBackSourceCidrResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Cidrs")
    public java.util.List<String> cidrs;

    public static DescribeBackSourceCidrResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackSourceCidrResponseBody self = new DescribeBackSourceCidrResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackSourceCidrResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBackSourceCidrResponseBody setCidrs(java.util.List<String> cidrs) {
        this.cidrs = cidrs;
        return this;
    }
    public java.util.List<String> getCidrs() {
        return this.cidrs;
    }

}
