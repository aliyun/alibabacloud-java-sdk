// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeTotalAttackMaxFlowResponseBody extends TeaModel {
    /**
     * <p>The peak bandwidth of attack traffic. Unit: bit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Bps")
    public Long bps;

    /**
     * <p>The peak packet rate of attack traffic . Unit: packets per second (pps).</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Pps")
    public Long pps;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>9173A3CB-C40B-559B-96B7-2373830BD06A</p>
     */
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
