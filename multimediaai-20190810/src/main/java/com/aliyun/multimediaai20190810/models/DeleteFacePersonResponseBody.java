// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.multimediaai20190810.models;

import com.aliyun.tea.*;

public class DeleteFacePersonResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteFacePersonResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteFacePersonResponseBody self = new DeleteFacePersonResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteFacePersonResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
