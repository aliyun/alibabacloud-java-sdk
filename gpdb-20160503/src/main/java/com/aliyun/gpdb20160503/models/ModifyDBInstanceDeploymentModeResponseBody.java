// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceDeploymentModeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBInstanceDeploymentModeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceDeploymentModeResponseBody self = new ModifyDBInstanceDeploymentModeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceDeploymentModeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
