// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class UnbindDBResourceGroupWithUserResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UnbindDBResourceGroupWithUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnbindDBResourceGroupWithUserResponseBody self = new UnbindDBResourceGroupWithUserResponseBody();
        return TeaModel.build(map, self);
    }

    public UnbindDBResourceGroupWithUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
