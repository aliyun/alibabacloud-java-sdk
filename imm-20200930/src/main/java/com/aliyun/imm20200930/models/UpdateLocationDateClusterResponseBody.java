// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class UpdateLocationDateClusterResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>52B017A8-FEF5-0A61-BAEE-234A8AD8****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateLocationDateClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLocationDateClusterResponseBody self = new UpdateLocationDateClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLocationDateClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
