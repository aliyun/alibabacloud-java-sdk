// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class SwitchDBInstanceNetTypeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FA67B751-2A2D-470C-850B-D6B93699D35C</p>
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
