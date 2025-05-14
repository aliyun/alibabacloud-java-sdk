// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class UpdateClusterInspectConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>49511F2D-D56A-5C24-B9AE-C8491E09B***</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateClusterInspectConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateClusterInspectConfigResponseBody self = new UpdateClusterInspectConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateClusterInspectConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
