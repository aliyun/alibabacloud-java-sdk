// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class UpdateWirelessCloudConnectorGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>8734B5B2-FC84-54C4-8038-D40228CF01FE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateWirelessCloudConnectorGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateWirelessCloudConnectorGroupResponseBody self = new UpdateWirelessCloudConnectorGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateWirelessCloudConnectorGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
