// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class StopAndroidInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static StopAndroidInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopAndroidInstanceResponseBody self = new StopAndroidInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public StopAndroidInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
