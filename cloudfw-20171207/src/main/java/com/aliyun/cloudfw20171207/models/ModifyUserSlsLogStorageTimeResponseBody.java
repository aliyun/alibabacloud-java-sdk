// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyUserSlsLogStorageTimeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>337A4DBA-8A01-5E9C-99CA-84293E13****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyUserSlsLogStorageTimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyUserSlsLogStorageTimeResponseBody self = new ModifyUserSlsLogStorageTimeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyUserSlsLogStorageTimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
