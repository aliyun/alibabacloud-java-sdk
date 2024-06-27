// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceDescriptionResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>107BE202-D1A2-479E-98E0-A8**********</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBInstanceDescriptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceDescriptionResponseBody self = new ModifyDBInstanceDescriptionResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceDescriptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
