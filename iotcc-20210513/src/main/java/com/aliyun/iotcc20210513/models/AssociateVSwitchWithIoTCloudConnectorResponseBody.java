// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class AssociateVSwitchWithIoTCloudConnectorResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AssociateVSwitchWithIoTCloudConnectorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssociateVSwitchWithIoTCloudConnectorResponseBody self = new AssociateVSwitchWithIoTCloudConnectorResponseBody();
        return TeaModel.build(map, self);
    }

    public AssociateVSwitchWithIoTCloudConnectorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
