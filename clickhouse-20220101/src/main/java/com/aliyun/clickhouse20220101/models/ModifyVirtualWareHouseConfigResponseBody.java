// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class ModifyVirtualWareHouseConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyVirtualWareHouseConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyVirtualWareHouseConfigResponseBody self = new ModifyVirtualWareHouseConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyVirtualWareHouseConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
