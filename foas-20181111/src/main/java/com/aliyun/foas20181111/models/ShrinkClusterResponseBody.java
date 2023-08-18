// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class ShrinkClusterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ShrinkClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ShrinkClusterResponseBody self = new ShrinkClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public ShrinkClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
