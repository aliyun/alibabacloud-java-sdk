// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class SetDedicatedBlockStorageClusterDiskThroughputResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>17EE62D8-064E-5404-8B0D-72122478****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetDedicatedBlockStorageClusterDiskThroughputResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetDedicatedBlockStorageClusterDiskThroughputResponseBody self = new SetDedicatedBlockStorageClusterDiskThroughputResponseBody();
        return TeaModel.build(map, self);
    }

    public SetDedicatedBlockStorageClusterDiskThroughputResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
