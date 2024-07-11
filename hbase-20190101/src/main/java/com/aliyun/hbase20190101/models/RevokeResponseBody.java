// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class RevokeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>C9085433-A56A-4089-B49A-DF5A4E2B7B06</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RevokeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RevokeResponseBody self = new RevokeResponseBody();
        return TeaModel.build(map, self);
    }

    public RevokeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
