// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class DescribeDdosFlowProportionDiagramResponseBody extends TeaModel {
    @NameInMap("TotalBps")
    public Integer totalBps;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DropPps")
    public Integer dropPps;

    @NameInMap("DropBps")
    public Integer dropBps;

    @NameInMap("TotalPps")
    public Integer totalPps;

    public static DescribeDdosFlowProportionDiagramResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDdosFlowProportionDiagramResponseBody self = new DescribeDdosFlowProportionDiagramResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDdosFlowProportionDiagramResponseBody setTotalBps(Integer totalBps) {
        this.totalBps = totalBps;
        return this;
    }
    public Integer getTotalBps() {
        return this.totalBps;
    }

    public DescribeDdosFlowProportionDiagramResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDdosFlowProportionDiagramResponseBody setDropPps(Integer dropPps) {
        this.dropPps = dropPps;
        return this;
    }
    public Integer getDropPps() {
        return this.dropPps;
    }

    public DescribeDdosFlowProportionDiagramResponseBody setDropBps(Integer dropBps) {
        this.dropBps = dropBps;
        return this;
    }
    public Integer getDropBps() {
        return this.dropBps;
    }

    public DescribeDdosFlowProportionDiagramResponseBody setTotalPps(Integer totalPps) {
        this.totalPps = totalPps;
        return this;
    }
    public Integer getTotalPps() {
        return this.totalPps;
    }

}
