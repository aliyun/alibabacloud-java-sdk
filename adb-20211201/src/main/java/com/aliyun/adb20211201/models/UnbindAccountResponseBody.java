// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class UnbindAccountResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>93E85E5C-C805-5837-8713-05B69A504EE5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UnbindAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnbindAccountResponseBody self = new UnbindAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public UnbindAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
