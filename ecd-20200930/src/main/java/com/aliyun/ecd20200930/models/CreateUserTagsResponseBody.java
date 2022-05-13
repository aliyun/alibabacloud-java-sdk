// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateUserTagsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateUserTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateUserTagsResponseBody self = new CreateUserTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateUserTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
