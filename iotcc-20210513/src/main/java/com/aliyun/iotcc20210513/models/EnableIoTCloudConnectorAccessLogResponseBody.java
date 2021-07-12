// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class EnableIoTCloudConnectorAccessLogResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static EnableIoTCloudConnectorAccessLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableIoTCloudConnectorAccessLogResponseBody self = new EnableIoTCloudConnectorAccessLogResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableIoTCloudConnectorAccessLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
