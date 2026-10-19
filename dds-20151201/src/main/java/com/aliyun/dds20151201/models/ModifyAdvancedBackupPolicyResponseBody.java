// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyAdvancedBackupPolicyResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2F42BB4E-461F-5B55-A37C-53B1141C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyAdvancedBackupPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAdvancedBackupPolicyResponseBody self = new ModifyAdvancedBackupPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAdvancedBackupPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
