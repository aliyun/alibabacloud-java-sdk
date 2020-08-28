// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ModifyMountTargetResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyMountTargetResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyMountTargetResponse self = new ModifyMountTargetResponse();
        return TeaModel.build(map, self);
    }

    public ModifyMountTargetResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
