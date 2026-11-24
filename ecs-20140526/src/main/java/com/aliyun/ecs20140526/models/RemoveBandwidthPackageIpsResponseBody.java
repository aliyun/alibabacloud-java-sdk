// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RemoveBandwidthPackageIpsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123e4567-e89b-42d3-a456-426614174000</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveBandwidthPackageIpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveBandwidthPackageIpsResponseBody self = new RemoveBandwidthPackageIpsResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveBandwidthPackageIpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
