// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateSecurityStrategyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0bc5df3a17***903790e8e8a</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateSecurityStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSecurityStrategyResponseBody self = new UpdateSecurityStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSecurityStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
