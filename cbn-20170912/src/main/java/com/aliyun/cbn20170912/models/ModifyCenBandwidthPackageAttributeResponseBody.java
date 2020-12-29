// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ModifyCenBandwidthPackageAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyCenBandwidthPackageAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyCenBandwidthPackageAttributeResponseBody self = new ModifyCenBandwidthPackageAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyCenBandwidthPackageAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
