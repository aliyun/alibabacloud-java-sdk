// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class CreateWirelessCloudConnectorGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>88C2F32F-B641-5980-B7A5-6907050ABCD1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>cc5gg-****</p>
     */
    @NameInMap("WirelessCloudConnectorGroupId")
    public String wirelessCloudConnectorGroupId;

    public static CreateWirelessCloudConnectorGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateWirelessCloudConnectorGroupResponseBody self = new CreateWirelessCloudConnectorGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateWirelessCloudConnectorGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateWirelessCloudConnectorGroupResponseBody setWirelessCloudConnectorGroupId(String wirelessCloudConnectorGroupId) {
        this.wirelessCloudConnectorGroupId = wirelessCloudConnectorGroupId;
        return this;
    }
    public String getWirelessCloudConnectorGroupId() {
        return this.wirelessCloudConnectorGroupId;
    }

}
