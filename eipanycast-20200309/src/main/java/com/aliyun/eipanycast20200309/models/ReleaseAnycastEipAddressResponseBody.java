// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309.models;

import com.aliyun.tea.*;

public class ReleaseAnycastEipAddressResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ReleaseAnycastEipAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReleaseAnycastEipAddressResponseBody self = new ReleaseAnycastEipAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public ReleaseAnycastEipAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
