// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class UpdateLdpsComputeGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateLdpsComputeGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLdpsComputeGroupResponseBody self = new UpdateLdpsComputeGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLdpsComputeGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
