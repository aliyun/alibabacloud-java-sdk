// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class ModifyWirelessCloudConnectorFeatureResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>999E0F64-9A10-567B-BB84-B7C46023BA3B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyWirelessCloudConnectorFeatureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyWirelessCloudConnectorFeatureResponseBody self = new ModifyWirelessCloudConnectorFeatureResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyWirelessCloudConnectorFeatureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
