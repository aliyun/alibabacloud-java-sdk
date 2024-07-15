// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class StopServiceInstanceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>49A369EF-A302-5006-B0CE-94CED47C38CF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StopServiceInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopServiceInstanceResponseBody self = new StopServiceInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public StopServiceInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
