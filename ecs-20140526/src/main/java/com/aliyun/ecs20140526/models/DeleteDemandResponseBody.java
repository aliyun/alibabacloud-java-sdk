// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteDemandResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDemandResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDemandResponseBody self = new DeleteDemandResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDemandResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
