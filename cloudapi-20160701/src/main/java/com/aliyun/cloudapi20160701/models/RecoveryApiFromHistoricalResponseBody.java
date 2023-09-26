// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class RecoveryApiFromHistoricalResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RecoveryApiFromHistoricalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecoveryApiFromHistoricalResponseBody self = new RecoveryApiFromHistoricalResponseBody();
        return TeaModel.build(map, self);
    }

    public RecoveryApiFromHistoricalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
