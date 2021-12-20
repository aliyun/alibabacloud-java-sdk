// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class OpenIoTCloudConnectorServiceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static OpenIoTCloudConnectorServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenIoTCloudConnectorServiceResponseBody self = new OpenIoTCloudConnectorServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenIoTCloudConnectorServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
