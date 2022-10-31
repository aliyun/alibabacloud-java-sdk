// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class DeleteWirelessCloudConnectorGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteWirelessCloudConnectorGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteWirelessCloudConnectorGroupResponseBody self = new DeleteWirelessCloudConnectorGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteWirelessCloudConnectorGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
