// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class ReleaseVirtualWareHousePublicConnectionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ReleaseVirtualWareHousePublicConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReleaseVirtualWareHousePublicConnectionResponseBody self = new ReleaseVirtualWareHousePublicConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public ReleaseVirtualWareHousePublicConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
