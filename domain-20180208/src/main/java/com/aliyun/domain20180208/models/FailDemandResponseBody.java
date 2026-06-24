// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class FailDemandResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static FailDemandResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FailDemandResponseBody self = new FailDemandResponseBody();
        return TeaModel.build(map, self);
    }

    public FailDemandResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
