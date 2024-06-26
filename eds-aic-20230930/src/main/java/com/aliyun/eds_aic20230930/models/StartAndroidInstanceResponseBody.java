// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class StartAndroidInstanceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>17C731AB-AAEE-5844-A352-D8D0352D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StartAndroidInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartAndroidInstanceResponseBody self = new StartAndroidInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public StartAndroidInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
