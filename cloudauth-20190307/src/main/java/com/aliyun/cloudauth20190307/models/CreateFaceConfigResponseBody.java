// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CreateFaceConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateFaceConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFaceConfigResponseBody self = new CreateFaceConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFaceConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
