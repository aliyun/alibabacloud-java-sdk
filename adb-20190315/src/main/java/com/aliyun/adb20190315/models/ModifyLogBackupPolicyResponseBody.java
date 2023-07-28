// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class ModifyLogBackupPolicyResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyLogBackupPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyLogBackupPolicyResponseBody self = new ModifyLogBackupPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyLogBackupPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
