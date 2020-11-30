// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeBackSourceCidrResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("CidrList")
    @Validation(required = true)
    public java.util.List<String> cidrList;

    public static DescribeBackSourceCidrResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackSourceCidrResponse self = new DescribeBackSourceCidrResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBackSourceCidrResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBackSourceCidrResponse setCidrList(java.util.List<String> cidrList) {
        this.cidrList = cidrList;
        return this;
    }
    public java.util.List<String> getCidrList() {
        return this.cidrList;
    }

}
