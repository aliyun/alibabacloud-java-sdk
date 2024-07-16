// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class DeleteWirelessCloudConnectorGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2E759287-F208-589B-82D8-6D7A30F417E3</p>
     */
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
