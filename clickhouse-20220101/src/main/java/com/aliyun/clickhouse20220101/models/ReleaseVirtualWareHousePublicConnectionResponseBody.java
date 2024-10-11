// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class ReleaseVirtualWareHousePublicConnectionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>05321590-BB65-4720-8CB6-8218E041CDD0</p>
     */
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
