// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class DeleteLdpsComputeGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteLdpsComputeGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLdpsComputeGroupResponseBody self = new DeleteLdpsComputeGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLdpsComputeGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
