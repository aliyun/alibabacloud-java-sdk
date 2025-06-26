// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class DeleteBackupPolicyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>60DDD29D-E5A8-563C-88FB-06D3A1F1C609</p>
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
