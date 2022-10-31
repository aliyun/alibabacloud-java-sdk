// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class RollbackLiveStagingConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RollbackLiveStagingConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RollbackLiveStagingConfigResponseBody self = new RollbackLiveStagingConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public RollbackLiveStagingConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
