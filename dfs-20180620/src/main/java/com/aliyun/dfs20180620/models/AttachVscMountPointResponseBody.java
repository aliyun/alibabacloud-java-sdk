// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class AttachVscMountPointResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AttachVscMountPointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachVscMountPointResponseBody self = new AttachVscMountPointResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachVscMountPointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
