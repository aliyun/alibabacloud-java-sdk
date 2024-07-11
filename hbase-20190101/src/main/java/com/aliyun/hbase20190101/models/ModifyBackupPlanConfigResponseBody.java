// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ModifyBackupPlanConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>50F4A8C2-076F-4703-9813-2FCD7FBB91C2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyBackupPlanConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyBackupPlanConfigResponseBody self = new ModifyBackupPlanConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyBackupPlanConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
