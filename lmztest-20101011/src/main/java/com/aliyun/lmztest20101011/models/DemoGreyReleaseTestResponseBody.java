// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20101011.models;

import com.aliyun.tea.*;

public class DemoGreyReleaseTestResponseBody extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("RequestId")
    public String requestId;

    public static DemoGreyReleaseTestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DemoGreyReleaseTestResponseBody self = new DemoGreyReleaseTestResponseBody();
        return TeaModel.build(map, self);
    }

    public DemoGreyReleaseTestResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DemoGreyReleaseTestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
