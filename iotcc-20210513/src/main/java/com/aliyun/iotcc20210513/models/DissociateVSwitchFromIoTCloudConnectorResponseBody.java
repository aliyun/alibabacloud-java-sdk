// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class DissociateVSwitchFromIoTCloudConnectorResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DissociateVSwitchFromIoTCloudConnectorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DissociateVSwitchFromIoTCloudConnectorResponseBody self = new DissociateVSwitchFromIoTCloudConnectorResponseBody();
        return TeaModel.build(map, self);
    }

    public DissociateVSwitchFromIoTCloudConnectorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
