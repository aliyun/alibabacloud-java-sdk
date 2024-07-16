// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class DeleteIoTCloudConnectorBackhaulRouteResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>AA93A076-3D94-51AB-AC70-4C94AF003B03</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteIoTCloudConnectorBackhaulRouteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteIoTCloudConnectorBackhaulRouteResponseBody self = new DeleteIoTCloudConnectorBackhaulRouteResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteIoTCloudConnectorBackhaulRouteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
