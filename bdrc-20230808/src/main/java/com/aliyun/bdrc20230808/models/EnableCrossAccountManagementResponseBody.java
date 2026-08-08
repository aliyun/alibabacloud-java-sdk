// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class EnableCrossAccountManagementResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>14DFF801-A4E3-5136-AAB8-7D246012CD7A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EnableCrossAccountManagementResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableCrossAccountManagementResponseBody self = new EnableCrossAccountManagementResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableCrossAccountManagementResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
