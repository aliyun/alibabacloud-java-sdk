// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeIceProductStatusResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ICEServiceAvaliable")
    public Boolean ICEServiceAvaliable;

    public static DescribeIceProductStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIceProductStatusResponseBody self = new DescribeIceProductStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIceProductStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeIceProductStatusResponseBody setICEServiceAvaliable(Boolean ICEServiceAvaliable) {
        this.ICEServiceAvaliable = ICEServiceAvaliable;
        return this;
    }
    public Boolean getICEServiceAvaliable() {
        return this.ICEServiceAvaliable;
    }

}
