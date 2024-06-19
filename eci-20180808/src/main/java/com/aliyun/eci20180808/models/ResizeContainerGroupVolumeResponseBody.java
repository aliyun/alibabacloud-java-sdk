// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class ResizeContainerGroupVolumeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>89945DD3-9072-47D0-A318-353284CFC7B3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ResizeContainerGroupVolumeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResizeContainerGroupVolumeResponseBody self = new ResizeContainerGroupVolumeResponseBody();
        return TeaModel.build(map, self);
    }

    public ResizeContainerGroupVolumeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
