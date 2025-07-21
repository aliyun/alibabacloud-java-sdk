// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ReleaseKmsInstanceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>475f1620-b9d3-4d35-b5c6-3fbdd941423d</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ReleaseKmsInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReleaseKmsInstanceResponseBody self = new ReleaseKmsInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ReleaseKmsInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
