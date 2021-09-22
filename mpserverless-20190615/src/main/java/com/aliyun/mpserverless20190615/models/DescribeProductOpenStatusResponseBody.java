// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DescribeProductOpenStatusResponseBody extends TeaModel {
    @NameInMap("SpaceId")
    public String spaceId;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeProductOpenStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeProductOpenStatusResponseBody self = new DescribeProductOpenStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeProductOpenStatusResponseBody setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public DescribeProductOpenStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
