// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class ModifyVirtualWareHouseDescriptionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>F5178C10-1407-4987-9133-DE4DC9119F75</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyVirtualWareHouseDescriptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyVirtualWareHouseDescriptionResponseBody self = new ModifyVirtualWareHouseDescriptionResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyVirtualWareHouseDescriptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
