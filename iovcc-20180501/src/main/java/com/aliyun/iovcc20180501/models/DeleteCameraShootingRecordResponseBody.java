// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DeleteCameraShootingRecordResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteCameraShootingRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCameraShootingRecordResponseBody self = new DeleteCameraShootingRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCameraShootingRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
