// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class RemoveIoTCloudConnectorFromGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveIoTCloudConnectorFromGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveIoTCloudConnectorFromGroupResponseBody self = new RemoveIoTCloudConnectorFromGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveIoTCloudConnectorFromGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
