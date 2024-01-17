// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class RecoveryApiDefineFromHistoricalResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RecoveryApiDefineFromHistoricalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecoveryApiDefineFromHistoricalResponseBody self = new RecoveryApiDefineFromHistoricalResponseBody();
        return TeaModel.build(map, self);
    }

    public RecoveryApiDefineFromHistoricalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
