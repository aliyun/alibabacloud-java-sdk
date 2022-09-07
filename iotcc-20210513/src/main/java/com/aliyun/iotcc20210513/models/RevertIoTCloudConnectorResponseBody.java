// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class RevertIoTCloudConnectorResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceId")
    public String resourceId;

    public static RevertIoTCloudConnectorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RevertIoTCloudConnectorResponseBody self = new RevertIoTCloudConnectorResponseBody();
        return TeaModel.build(map, self);
    }

    public RevertIoTCloudConnectorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RevertIoTCloudConnectorResponseBody setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

}
