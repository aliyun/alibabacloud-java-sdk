// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteVpcResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteVpcResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteVpcResponseBody self = new DeleteVpcResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteVpcResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
