// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class AddFaceEntityResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static AddFaceEntityResponse build(java.util.Map<String, ?> map) throws Exception {
        AddFaceEntityResponse self = new AddFaceEntityResponse();
        return TeaModel.build(map, self);
    }

    public AddFaceEntityResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
