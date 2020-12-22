// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DeleteFaceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteFaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteFaceResponseBody self = new DeleteFaceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteFaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
