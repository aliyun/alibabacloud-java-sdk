// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteLivePackageOriginEndpointResponseBody extends TeaModel {
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
