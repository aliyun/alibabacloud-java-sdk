// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class BindDBResourcePoolWithUserResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static BindDBResourcePoolWithUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindDBResourcePoolWithUserResponseBody self = new BindDBResourcePoolWithUserResponseBody();
        return TeaModel.build(map, self);
    }

    public BindDBResourcePoolWithUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
