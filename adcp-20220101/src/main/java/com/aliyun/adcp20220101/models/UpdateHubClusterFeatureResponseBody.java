// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class UpdateHubClusterFeatureResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateHubClusterFeatureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateHubClusterFeatureResponseBody self = new UpdateHubClusterFeatureResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateHubClusterFeatureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
