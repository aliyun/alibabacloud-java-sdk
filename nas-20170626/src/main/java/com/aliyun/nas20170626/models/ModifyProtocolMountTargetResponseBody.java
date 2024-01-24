// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ModifyProtocolMountTargetResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyProtocolMountTargetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyProtocolMountTargetResponseBody self = new ModifyProtocolMountTargetResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyProtocolMountTargetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
