// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class ConfirmIoTCloudConnectorResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceId")
    public String resourceId;

    public static ConfirmIoTCloudConnectorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfirmIoTCloudConnectorResponseBody self = new ConfirmIoTCloudConnectorResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfirmIoTCloudConnectorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ConfirmIoTCloudConnectorResponseBody setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

}
