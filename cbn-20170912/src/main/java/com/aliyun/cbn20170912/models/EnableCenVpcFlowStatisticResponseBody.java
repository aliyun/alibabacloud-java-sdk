// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class EnableCenVpcFlowStatisticResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static EnableCenVpcFlowStatisticResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableCenVpcFlowStatisticResponseBody self = new EnableCenVpcFlowStatisticResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableCenVpcFlowStatisticResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
