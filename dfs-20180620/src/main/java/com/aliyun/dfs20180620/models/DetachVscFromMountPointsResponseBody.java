// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class DetachVscFromMountPointsResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DetachVscFromMountPointsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetachVscFromMountPointsResponseBody self = new DetachVscFromMountPointsResponseBody();
        return TeaModel.build(map, self);
    }

    public DetachVscFromMountPointsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
