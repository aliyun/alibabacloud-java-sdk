// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20101011.models;

import com.aliyun.tea.*;

public class DemoGrayReleaseTestTwoResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DemoGrayReleaseTestTwoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DemoGrayReleaseTestTwoResponseBody self = new DemoGrayReleaseTestTwoResponseBody();
        return TeaModel.build(map, self);
    }

    public DemoGrayReleaseTestTwoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
