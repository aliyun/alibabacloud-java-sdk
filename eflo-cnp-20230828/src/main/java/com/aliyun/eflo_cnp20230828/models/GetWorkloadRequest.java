// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_cnp20230828.models;

import com.aliyun.tea.*;

public class GetWorkloadRequest extends TeaModel {
    /**
     * <p>Workload ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>13</p>
     */
    @NameInMap("WorkloadId")
    public Long workloadId;

    public static GetWorkloadRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWorkloadRequest self = new GetWorkloadRequest();
        return TeaModel.build(map, self);
    }

    public GetWorkloadRequest setWorkloadId(Long workloadId) {
        this.workloadId = workloadId;
        return this;
    }
    public Long getWorkloadId() {
        return this.workloadId;
    }

}
