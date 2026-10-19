// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyAdvancedBackupStatusResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>45D2B592-DEBA-4347-BBF3-47FF6C97DBBC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyAdvancedBackupStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAdvancedBackupStatusResponseBody self = new ModifyAdvancedBackupStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAdvancedBackupStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
