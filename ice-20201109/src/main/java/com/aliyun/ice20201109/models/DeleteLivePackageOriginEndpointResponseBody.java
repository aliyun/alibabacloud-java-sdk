// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteLivePackageOriginEndpointResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5D87B753-0250-5D9D-B248-D40C3271F864</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteLivePackageOriginEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLivePackageOriginEndpointResponseBody self = new DeleteLivePackageOriginEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLivePackageOriginEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
