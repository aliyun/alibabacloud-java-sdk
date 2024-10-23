// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class CreateDBResourcePoolResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
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
