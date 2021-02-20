// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribePortAttackMaxFlowResponseBody extends TeaModel {
    @NameInMap("Pps")
    public Long pps;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Bps")
    public Long bps;

    public static DescribePortAttackMaxFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePortAttackMaxFlowResponseBody self = new DescribePortAttackMaxFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePortAttackMaxFlowResponseBody setPps(Long pps) {
        this.pps = pps;
        return this;
    }
    public Long getPps() {
        return this.pps;
    }

    public DescribePortAttackMaxFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePortAttackMaxFlowResponseBody setBps(Long bps) {
        this.bps = bps;
        return this;
    }
    public Long getBps() {
        return this.bps;
    }

}
