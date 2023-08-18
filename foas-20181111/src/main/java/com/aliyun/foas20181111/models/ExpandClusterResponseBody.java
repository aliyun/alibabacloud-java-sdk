// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class ExpandClusterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ExpandClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExpandClusterResponseBody self = new ExpandClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public ExpandClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
