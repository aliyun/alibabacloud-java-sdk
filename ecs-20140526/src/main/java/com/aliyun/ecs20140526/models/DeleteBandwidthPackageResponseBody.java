// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteBandwidthPackageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteBandwidthPackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteBandwidthPackageResponseBody self = new DeleteBandwidthPackageResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteBandwidthPackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
