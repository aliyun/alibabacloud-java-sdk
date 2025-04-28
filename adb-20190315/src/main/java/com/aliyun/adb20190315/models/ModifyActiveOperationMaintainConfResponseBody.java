// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class ModifyActiveOperationMaintainConfResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0A156332-D2AC-5C98-8872-9779EA1CC022</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyActiveOperationMaintainConfResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyActiveOperationMaintainConfResponseBody self = new ModifyActiveOperationMaintainConfResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyActiveOperationMaintainConfResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
