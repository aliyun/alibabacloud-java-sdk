// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreatePrivateAccessTagResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TagId")
    public String tagId;

    public static CreatePrivateAccessTagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePrivateAccessTagResponseBody self = new CreatePrivateAccessTagResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePrivateAccessTagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePrivateAccessTagResponseBody setTagId(String tagId) {
        this.tagId = tagId;
        return this;
    }
    public String getTagId() {
        return this.tagId;
    }

}
