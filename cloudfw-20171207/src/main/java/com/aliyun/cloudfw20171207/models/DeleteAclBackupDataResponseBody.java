// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteAclBackupDataResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>75E60025-43C5-5635-B7B7-272C5246****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAclBackupDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAclBackupDataResponseBody self = new DeleteAclBackupDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAclBackupDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
