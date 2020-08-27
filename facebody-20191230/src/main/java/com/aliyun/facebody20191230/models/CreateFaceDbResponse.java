// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class CreateFaceDbResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static CreateFaceDbResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFaceDbResponse self = new CreateFaceDbResponse();
        return TeaModel.build(map, self);
    }

    public CreateFaceDbResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
