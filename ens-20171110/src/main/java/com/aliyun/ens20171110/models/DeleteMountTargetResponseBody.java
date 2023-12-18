// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteMountTargetResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteMountTargetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMountTargetResponseBody self = new DeleteMountTargetResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMountTargetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
