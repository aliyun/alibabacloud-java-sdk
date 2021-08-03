// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class RecreateDesktopGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RecreateDesktopGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecreateDesktopGroupResponseBody self = new RecreateDesktopGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public RecreateDesktopGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
