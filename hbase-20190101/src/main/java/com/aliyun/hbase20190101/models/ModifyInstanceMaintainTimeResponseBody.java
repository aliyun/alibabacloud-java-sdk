// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ModifyInstanceMaintainTimeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>C9085433-A56A-4089-B49A-DF5A4E2B7B06</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInstanceMaintainTimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceMaintainTimeResponseBody self = new ModifyInstanceMaintainTimeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceMaintainTimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
