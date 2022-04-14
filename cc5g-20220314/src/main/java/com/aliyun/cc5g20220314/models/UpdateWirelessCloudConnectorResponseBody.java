// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class UpdateWirelessCloudConnectorResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateWirelessCloudConnectorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateWirelessCloudConnectorResponseBody self = new UpdateWirelessCloudConnectorResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateWirelessCloudConnectorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
