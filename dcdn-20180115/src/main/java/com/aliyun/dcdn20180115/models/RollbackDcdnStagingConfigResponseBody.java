// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class RollbackDcdnStagingConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RollbackDcdnStagingConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RollbackDcdnStagingConfigResponseBody self = new RollbackDcdnStagingConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public RollbackDcdnStagingConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
