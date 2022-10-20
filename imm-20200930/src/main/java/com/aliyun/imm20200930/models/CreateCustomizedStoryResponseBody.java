// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateCustomizedStoryResponseBody extends TeaModel {
    @NameInMap("ObjectId")
    public String objectId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateCustomizedStoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomizedStoryResponseBody self = new CreateCustomizedStoryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCustomizedStoryResponseBody setObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }
    public String getObjectId() {
        return this.objectId;
    }

    public CreateCustomizedStoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
