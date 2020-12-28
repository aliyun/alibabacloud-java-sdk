// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AddBandwidthPackageIpsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddBandwidthPackageIpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddBandwidthPackageIpsResponseBody self = new AddBandwidthPackageIpsResponseBody();
        return TeaModel.build(map, self);
    }

    public AddBandwidthPackageIpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
