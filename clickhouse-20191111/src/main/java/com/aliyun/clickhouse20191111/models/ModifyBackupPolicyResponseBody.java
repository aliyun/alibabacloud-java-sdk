// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class ModifyBackupPolicyResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyBackupPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyBackupPolicyResponseBody self = new ModifyBackupPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyBackupPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
