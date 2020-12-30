// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeBackSourceCidrResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CidrList")
    public java.util.List<String> cidrList;

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

    public DescribeBackSourceCidrResponseBody setCidrList(java.util.List<String> cidrList) {
        this.cidrList = cidrList;
        return this;
    }
    public java.util.List<String> getCidrList() {
        return this.cidrList;
    }

}
