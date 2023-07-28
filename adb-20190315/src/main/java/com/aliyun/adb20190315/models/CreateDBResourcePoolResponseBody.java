// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class CreateDBResourcePoolResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDBResourcePoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDBResourcePoolResponseBody self = new CreateDBResourcePoolResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDBResourcePoolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
