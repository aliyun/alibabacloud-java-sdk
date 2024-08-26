// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class CheckProcessingServerLockApplyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Exists")
    public Boolean exists;

    /**
     * <strong>example:</strong>
     * <p>9DFCF6F8-243C-****-8035-4B12FEFD7D48</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CheckProcessingServerLockApplyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckProcessingServerLockApplyResponseBody self = new CheckProcessingServerLockApplyResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckProcessingServerLockApplyResponseBody setExists(Boolean exists) {
        this.exists = exists;
        return this;
    }
    public Boolean getExists() {
        return this.exists;
    }

    public CheckProcessingServerLockApplyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
