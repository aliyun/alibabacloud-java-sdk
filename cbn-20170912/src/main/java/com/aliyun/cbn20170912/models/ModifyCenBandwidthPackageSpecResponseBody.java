// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ModifyCenBandwidthPackageSpecResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyCenBandwidthPackageSpecResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyCenBandwidthPackageSpecResponseBody self = new ModifyCenBandwidthPackageSpecResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyCenBandwidthPackageSpecResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
