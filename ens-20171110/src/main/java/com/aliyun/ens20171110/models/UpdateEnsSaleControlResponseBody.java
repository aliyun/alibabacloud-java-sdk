// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class UpdateEnsSaleControlResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateEnsSaleControlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateEnsSaleControlResponseBody self = new UpdateEnsSaleControlResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateEnsSaleControlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
