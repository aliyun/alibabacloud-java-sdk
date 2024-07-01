// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CreateDBResourceGroupResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A94B6C02-7BD4-5D67-9776-3AC8317E8DD5</p>
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
