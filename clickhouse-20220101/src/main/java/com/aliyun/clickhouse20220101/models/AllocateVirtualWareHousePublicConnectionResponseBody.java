// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class AllocateVirtualWareHousePublicConnectionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AllocateVirtualWareHousePublicConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AllocateVirtualWareHousePublicConnectionResponseBody self = new AllocateVirtualWareHousePublicConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public AllocateVirtualWareHousePublicConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
