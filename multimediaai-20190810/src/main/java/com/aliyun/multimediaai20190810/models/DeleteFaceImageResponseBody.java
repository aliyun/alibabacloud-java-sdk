// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.multimediaai20190810.models;

import com.aliyun.tea.*;

public class DeleteFaceImageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteFaceImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteFaceImageResponseBody self = new DeleteFaceImageResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteFaceImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
