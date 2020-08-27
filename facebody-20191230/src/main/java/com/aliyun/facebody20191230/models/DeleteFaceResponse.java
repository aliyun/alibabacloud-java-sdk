// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DeleteFaceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteFaceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFaceResponse self = new DeleteFaceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFaceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
