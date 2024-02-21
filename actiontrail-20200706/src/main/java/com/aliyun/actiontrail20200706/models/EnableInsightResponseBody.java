// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class EnableInsightResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static EnableInsightResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableInsightResponseBody self = new EnableInsightResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableInsightResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
