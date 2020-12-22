// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DeleteFaceDbResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteFaceDbResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteFaceDbResponseBody self = new DeleteFaceDbResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteFaceDbResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
