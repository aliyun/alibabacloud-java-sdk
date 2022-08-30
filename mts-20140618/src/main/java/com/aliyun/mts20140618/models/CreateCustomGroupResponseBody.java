// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class CreateCustomGroupResponseBody extends TeaModel {
    @NameInMap("CustomGroupId")
    public String customGroupId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateCustomGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomGroupResponseBody self = new CreateCustomGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCustomGroupResponseBody setCustomGroupId(String customGroupId) {
        this.customGroupId = customGroupId;
        return this;
    }
    public String getCustomGroupId() {
        return this.customGroupId;
    }

    public CreateCustomGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
