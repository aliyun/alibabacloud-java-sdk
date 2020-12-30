// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class CheckProcessingServerLockApplyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Exists")
    public Boolean exists;

    public static CheckProcessingServerLockApplyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckProcessingServerLockApplyResponseBody self = new CheckProcessingServerLockApplyResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckProcessingServerLockApplyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckProcessingServerLockApplyResponseBody setExists(Boolean exists) {
        this.exists = exists;
        return this;
    }
    public Boolean getExists() {
        return this.exists;
    }

}
