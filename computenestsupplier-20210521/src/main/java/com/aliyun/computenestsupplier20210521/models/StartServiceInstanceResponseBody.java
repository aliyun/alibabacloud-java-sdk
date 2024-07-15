// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class StartServiceInstanceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2E91D771-0183-52CE-86CB-882D99B2CB77</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StartServiceInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartServiceInstanceResponseBody self = new StartServiceInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public StartServiceInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
