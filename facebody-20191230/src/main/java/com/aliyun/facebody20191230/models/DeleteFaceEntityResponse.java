// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DeleteFaceEntityResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteFaceEntityResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFaceEntityResponse self = new DeleteFaceEntityResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFaceEntityResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
