// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class ResizeClusterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ResizeClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResizeClusterResponseBody self = new ResizeClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public ResizeClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
