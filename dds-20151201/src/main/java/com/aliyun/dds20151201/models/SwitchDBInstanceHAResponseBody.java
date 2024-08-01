// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class SwitchDBInstanceHAResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>26BD4E5F-BDB4-47BA-B232-413AA78CFA8F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SwitchDBInstanceHAResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SwitchDBInstanceHAResponseBody self = new SwitchDBInstanceHAResponseBody();
        return TeaModel.build(map, self);
    }

    public SwitchDBInstanceHAResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
