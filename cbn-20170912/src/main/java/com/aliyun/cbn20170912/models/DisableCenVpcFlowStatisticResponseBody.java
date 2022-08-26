// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DisableCenVpcFlowStatisticResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DisableCenVpcFlowStatisticResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableCenVpcFlowStatisticResponseBody self = new DisableCenVpcFlowStatisticResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableCenVpcFlowStatisticResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
