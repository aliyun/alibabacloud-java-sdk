// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceDescriptionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>06F8F642-4009-4FFC-80C4-9D67DBF7B74E</p>
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
