// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyNASDefaultMountTargetResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyNASDefaultMountTargetResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyNASDefaultMountTargetResponse self = new ModifyNASDefaultMountTargetResponse();
        return TeaModel.build(map, self);
    }

    public ModifyNASDefaultMountTargetResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
