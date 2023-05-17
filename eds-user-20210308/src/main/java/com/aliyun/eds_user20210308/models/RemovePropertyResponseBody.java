// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class RemovePropertyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RemovePropertyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemovePropertyResponseBody self = new RemovePropertyResponseBody();
        return TeaModel.build(map, self);
    }

    public RemovePropertyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
