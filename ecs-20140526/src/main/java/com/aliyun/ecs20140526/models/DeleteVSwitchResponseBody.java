// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteVSwitchResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteVSwitchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteVSwitchResponseBody self = new DeleteVSwitchResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteVSwitchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
