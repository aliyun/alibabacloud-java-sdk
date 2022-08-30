// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class CreateCustomEntityResponseBody extends TeaModel {
    @NameInMap("CustomEntityId")
    public String customEntityId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateCustomEntityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomEntityResponseBody self = new CreateCustomEntityResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCustomEntityResponseBody setCustomEntityId(String customEntityId) {
        this.customEntityId = customEntityId;
        return this;
    }
    public String getCustomEntityId() {
        return this.customEntityId;
    }

    public CreateCustomEntityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
