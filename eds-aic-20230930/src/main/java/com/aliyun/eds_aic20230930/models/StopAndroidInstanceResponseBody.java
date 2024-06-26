// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class StopAndroidInstanceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>E38B41A8-8E00-5AE4-A957-6636ACB8****</p>
     */
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
