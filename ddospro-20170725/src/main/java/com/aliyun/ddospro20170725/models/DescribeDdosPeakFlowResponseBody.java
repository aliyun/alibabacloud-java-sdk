// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class DescribeDdosPeakFlowResponseBody extends TeaModel {
    @NameInMap("PeakFlow")
    public String peakFlow;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDdosPeakFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDdosPeakFlowResponseBody self = new DescribeDdosPeakFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDdosPeakFlowResponseBody setPeakFlow(String peakFlow) {
        this.peakFlow = peakFlow;
        return this;
    }
    public String getPeakFlow() {
        return this.peakFlow;
    }

    public DescribeDdosPeakFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
