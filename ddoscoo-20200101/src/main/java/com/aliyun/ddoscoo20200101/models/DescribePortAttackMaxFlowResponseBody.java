// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribePortAttackMaxFlowResponseBody extends TeaModel {
    /**
     * <p>The peak bandwidth of attack traffic. Unit: bit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>149559</p>
     */
    @NameInMap("Bps")
    public Long bps;

    /**
     * <p>The peak packet rate of attack traffic . Unit: packets per second (pps).</p>
     * 
     * <strong>example:</strong>
     * <p>23</p>
     */
    @NameInMap("Pps")
    public Long pps;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C33EB3D5-AF96-43CA-9C7E-37A81BC06A1E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePortAttackMaxFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePortAttackMaxFlowResponseBody self = new DescribePortAttackMaxFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePortAttackMaxFlowResponseBody setBps(Long bps) {
        this.bps = bps;
        return this;
    }
    public Long getBps() {
        return this.bps;
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

}
