// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class CreateDBResourceGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDBResourceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDBResourceGroupResponseBody self = new CreateDBResourceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDBResourceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
