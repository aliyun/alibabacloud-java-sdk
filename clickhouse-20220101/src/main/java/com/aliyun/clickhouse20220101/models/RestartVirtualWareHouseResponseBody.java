// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class RestartVirtualWareHouseResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RestartVirtualWareHouseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RestartVirtualWareHouseResponseBody self = new RestartVirtualWareHouseResponseBody();
        return TeaModel.build(map, self);
    }

    public RestartVirtualWareHouseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
