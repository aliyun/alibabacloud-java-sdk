// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ResetAndroidInstancesInGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ResetAndroidInstancesInGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetAndroidInstancesInGroupResponseBody self = new ResetAndroidInstancesInGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetAndroidInstancesInGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
