// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class SwitchWirelessCloudConnectorToBusinessResponseBody extends TeaModel {
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
