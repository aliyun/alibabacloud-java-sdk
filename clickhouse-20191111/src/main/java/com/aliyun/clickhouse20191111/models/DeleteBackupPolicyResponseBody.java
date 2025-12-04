// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DeleteBackupPolicyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>F5178C10-1407-4987-9133-DE4DC9119F34</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteBackupPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteBackupPolicyResponseBody self = new DeleteBackupPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteBackupPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
