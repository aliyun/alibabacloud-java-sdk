// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class SetGroupDeletionProtectionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetGroupDeletionProtectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetGroupDeletionProtectionResponseBody self = new SetGroupDeletionProtectionResponseBody();
        return TeaModel.build(map, self);
    }

    public SetGroupDeletionProtectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
