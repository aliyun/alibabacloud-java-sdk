// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteEnsSaleConditionControlResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteEnsSaleConditionControlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteEnsSaleConditionControlResponseBody self = new DeleteEnsSaleConditionControlResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteEnsSaleConditionControlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
