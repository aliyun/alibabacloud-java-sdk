// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ResetNASDefaultMountTargetResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ResetNASDefaultMountTargetResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetNASDefaultMountTargetResponse self = new ResetNASDefaultMountTargetResponse();
        return TeaModel.build(map, self);
    }

    public ResetNASDefaultMountTargetResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
