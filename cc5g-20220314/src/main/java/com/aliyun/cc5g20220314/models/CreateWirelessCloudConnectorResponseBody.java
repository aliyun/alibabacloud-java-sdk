// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class CreateWirelessCloudConnectorResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>E1E237B1-EED7-55D5-AE5F-671E642DB3B5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>cc5g-xxxx</p>
     */
    @NameInMap("WirelessCloudConnectorId")
    public String wirelessCloudConnectorId;

    public static CreateWirelessCloudConnectorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateWirelessCloudConnectorResponseBody self = new CreateWirelessCloudConnectorResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateWirelessCloudConnectorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateWirelessCloudConnectorResponseBody setWirelessCloudConnectorId(String wirelessCloudConnectorId) {
        this.wirelessCloudConnectorId = wirelessCloudConnectorId;
        return this;
    }
    public String getWirelessCloudConnectorId() {
        return this.wirelessCloudConnectorId;
    }

}
