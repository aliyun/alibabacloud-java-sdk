// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DeleteProtocolMountTargetResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>98696EF0-1607-4E9D-B01D-F20930B6****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteProtocolMountTargetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteProtocolMountTargetResponseBody self = new DeleteProtocolMountTargetResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteProtocolMountTargetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
