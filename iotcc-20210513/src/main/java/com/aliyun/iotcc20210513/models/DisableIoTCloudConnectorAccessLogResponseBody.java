// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class DisableIoTCloudConnectorAccessLogResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DisableIoTCloudConnectorAccessLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableIoTCloudConnectorAccessLogResponseBody self = new DisableIoTCloudConnectorAccessLogResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableIoTCloudConnectorAccessLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
