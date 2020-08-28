// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DeleteMountTargetResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteMountTargetResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMountTargetResponse self = new DeleteMountTargetResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMountTargetResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
