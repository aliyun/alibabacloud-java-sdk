// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeBackSourceCidrResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the back-to-origin CIDR blocks of the instance.</p>
     */
    @NameInMap("Cidrs")
    public java.util.List<String> cidrs;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>0bcf28g5-d57c-11e7-9bs0-d89d6717dxbc</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeBackSourceCidrResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackSourceCidrResponseBody self = new DescribeBackSourceCidrResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackSourceCidrResponseBody setCidrs(java.util.List<String> cidrs) {
        this.cidrs = cidrs;
        return this;
    }
    public java.util.List<String> getCidrs() {
        return this.cidrs;
    }

    public DescribeBackSourceCidrResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
