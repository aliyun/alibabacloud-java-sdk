// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class CreateTagResourcesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateTagResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTagResourcesResponseBody self = new CreateTagResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTagResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
