// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ModifyBackupPolicyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>17E3AC63-300D-4B69-9108-45EC20E50E85</p>
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
