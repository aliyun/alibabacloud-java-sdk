// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeTotalAttackMaxFlowResponseBody extends TeaModel {
    @NameInMap("Bps")
    public Long bps;

    @NameInMap("Pps")
    public Long pps;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeTotalAttackMaxFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTotalAttackMaxFlowResponseBody self = new DescribeTotalAttackMaxFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTotalAttackMaxFlowResponseBody setBps(Long bps) {
        this.bps = bps;
        return this;
    }
    public Long getBps() {
        return this.bps;
    }

    public DescribeTotalAttackMaxFlowResponseBody setPps(Long pps) {
        this.pps = pps;
        return this;
    }
    public Long getPps() {
        return this.pps;
    }

    public DescribeTotalAttackMaxFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
