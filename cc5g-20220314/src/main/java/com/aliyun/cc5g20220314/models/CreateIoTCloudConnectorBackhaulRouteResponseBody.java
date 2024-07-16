// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class CreateIoTCloudConnectorBackhaulRouteResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1651FBB6-4FBF-49FF-A9F5-DF5D696C7EC6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateIoTCloudConnectorBackhaulRouteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateIoTCloudConnectorBackhaulRouteResponseBody self = new CreateIoTCloudConnectorBackhaulRouteResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateIoTCloudConnectorBackhaulRouteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
