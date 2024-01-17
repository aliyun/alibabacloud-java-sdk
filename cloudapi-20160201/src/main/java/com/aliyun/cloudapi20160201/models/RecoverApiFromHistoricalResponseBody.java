// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class RecoverApiFromHistoricalResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RecoverApiFromHistoricalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecoverApiFromHistoricalResponseBody self = new RecoverApiFromHistoricalResponseBody();
        return TeaModel.build(map, self);
    }

    public RecoverApiFromHistoricalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
