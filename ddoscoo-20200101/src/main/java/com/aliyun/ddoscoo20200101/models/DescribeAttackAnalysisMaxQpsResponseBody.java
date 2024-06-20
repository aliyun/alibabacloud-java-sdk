// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeAttackAnalysisMaxQpsResponseBody extends TeaModel {
    /**
     * <p>The peak queries per second (QPS) of DDoS attacks. Units: QPS.</p>
     * 
     * <strong>example:</strong>
     * <p>41652</p>
     */
    @NameInMap("Qps")
    public Long qps;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>8DFB602D-1AAC-46C4-90F2-C84086E7A6E4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAttackAnalysisMaxQpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAttackAnalysisMaxQpsResponseBody self = new DescribeAttackAnalysisMaxQpsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAttackAnalysisMaxQpsResponseBody setQps(Long qps) {
        this.qps = qps;
        return this;
    }
    public Long getQps() {
        return this.qps;
    }

    public DescribeAttackAnalysisMaxQpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
