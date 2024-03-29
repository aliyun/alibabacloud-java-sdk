// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class DetachVscMountPointResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DetachVscMountPointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetachVscMountPointResponseBody self = new DetachVscMountPointResponseBody();
        return TeaModel.build(map, self);
    }

    public DetachVscMountPointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
