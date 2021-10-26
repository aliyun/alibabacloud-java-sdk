// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeleteTrafficControlResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteTrafficControlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteTrafficControlResponseBody self = new DeleteTrafficControlResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteTrafficControlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
