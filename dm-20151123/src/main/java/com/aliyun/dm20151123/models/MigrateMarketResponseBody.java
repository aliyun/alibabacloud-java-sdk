// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class MigrateMarketResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static MigrateMarketResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MigrateMarketResponseBody self = new MigrateMarketResponseBody();
        return TeaModel.build(map, self);
    }

    public MigrateMarketResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
