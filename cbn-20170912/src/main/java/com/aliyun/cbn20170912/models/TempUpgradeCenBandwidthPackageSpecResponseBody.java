// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class TempUpgradeCenBandwidthPackageSpecResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static TempUpgradeCenBandwidthPackageSpecResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TempUpgradeCenBandwidthPackageSpecResponseBody self = new TempUpgradeCenBandwidthPackageSpecResponseBody();
        return TeaModel.build(map, self);
    }

    public TempUpgradeCenBandwidthPackageSpecResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
