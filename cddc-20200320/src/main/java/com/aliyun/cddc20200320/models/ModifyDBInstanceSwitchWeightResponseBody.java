// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceSwitchWeightResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBInstanceSwitchWeightResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceSwitchWeightResponseBody self = new ModifyDBInstanceSwitchWeightResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceSwitchWeightResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
