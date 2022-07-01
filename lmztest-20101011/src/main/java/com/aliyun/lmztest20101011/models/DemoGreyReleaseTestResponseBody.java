// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20101011.models;

import com.aliyun.tea.*;

public class DemoGreyReleaseTestResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DemoGreyReleaseTestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DemoGreyReleaseTestResponseBody self = new DemoGreyReleaseTestResponseBody();
        return TeaModel.build(map, self);
    }

    public DemoGreyReleaseTestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
