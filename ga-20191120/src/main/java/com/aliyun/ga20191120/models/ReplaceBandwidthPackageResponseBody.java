// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ReplaceBandwidthPackageResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ReplaceBandwidthPackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReplaceBandwidthPackageResponseBody self = new ReplaceBandwidthPackageResponseBody();
        return TeaModel.build(map, self);
    }

    public ReplaceBandwidthPackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
