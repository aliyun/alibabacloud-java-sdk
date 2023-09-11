// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class SwitchDBInstanceNetTypeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SwitchDBInstanceNetTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SwitchDBInstanceNetTypeResponseBody self = new SwitchDBInstanceNetTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public SwitchDBInstanceNetTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
