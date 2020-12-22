// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DeleteFaceEntityResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteFaceEntityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteFaceEntityResponseBody self = new DeleteFaceEntityResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteFaceEntityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
