// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class RebootAndroidInstancesInGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>227CBB4C-F5DC-589D-A667-C5CA3D52****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RebootAndroidInstancesInGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RebootAndroidInstancesInGroupResponseBody self = new RebootAndroidInstancesInGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public RebootAndroidInstancesInGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
