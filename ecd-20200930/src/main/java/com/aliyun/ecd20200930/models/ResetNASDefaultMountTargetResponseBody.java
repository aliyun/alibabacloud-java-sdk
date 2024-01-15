// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ResetNASDefaultMountTargetResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ResetNASDefaultMountTargetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetNASDefaultMountTargetResponseBody self = new ResetNASDefaultMountTargetResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetNASDefaultMountTargetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
