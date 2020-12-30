// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class CreateRestorePlanResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateRestorePlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRestorePlanResponseBody self = new CreateRestorePlanResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRestorePlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
