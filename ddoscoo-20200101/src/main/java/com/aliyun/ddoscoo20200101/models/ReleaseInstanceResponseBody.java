// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ReleaseInstanceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>06FFAF5F-CD3E-4886-A849-AAB40DFF6515</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ReleaseInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReleaseInstanceResponseBody self = new ReleaseInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ReleaseInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
