// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyNASDefaultMountTargetResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyNASDefaultMountTargetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyNASDefaultMountTargetResponseBody self = new ModifyNASDefaultMountTargetResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyNASDefaultMountTargetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
