// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class DeleteWirelessCloudConnectorResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteWirelessCloudConnectorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteWirelessCloudConnectorResponseBody self = new DeleteWirelessCloudConnectorResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteWirelessCloudConnectorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
