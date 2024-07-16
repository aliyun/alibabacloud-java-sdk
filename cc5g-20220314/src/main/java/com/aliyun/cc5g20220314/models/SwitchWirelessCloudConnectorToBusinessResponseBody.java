// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class SwitchWirelessCloudConnectorToBusinessResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>74ADDCF3-E3FE-5200-9290-1320125D71DC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SwitchWirelessCloudConnectorToBusinessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SwitchWirelessCloudConnectorToBusinessResponseBody self = new SwitchWirelessCloudConnectorToBusinessResponseBody();
        return TeaModel.build(map, self);
    }

    public SwitchWirelessCloudConnectorToBusinessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
