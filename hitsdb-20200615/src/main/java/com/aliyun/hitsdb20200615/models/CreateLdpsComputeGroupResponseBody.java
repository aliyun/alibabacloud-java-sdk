// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class CreateLdpsComputeGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateLdpsComputeGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLdpsComputeGroupResponseBody self = new CreateLdpsComputeGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLdpsComputeGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
