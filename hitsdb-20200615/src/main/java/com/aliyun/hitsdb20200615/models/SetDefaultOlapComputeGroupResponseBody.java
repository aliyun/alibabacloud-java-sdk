// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class SetDefaultOlapComputeGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetDefaultOlapComputeGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetDefaultOlapComputeGroupResponseBody self = new SetDefaultOlapComputeGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public SetDefaultOlapComputeGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
