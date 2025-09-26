// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class RelatedWorkload extends TeaModel {
    @NameInMap("workloadId")
    public String workloadId;

    @NameInMap("workloadName")
    public String workloadName;

    @NameInMap("workloadType")
    public String workloadType;

    public static RelatedWorkload build(java.util.Map<String, ?> map) throws Exception {
        RelatedWorkload self = new RelatedWorkload();
        return TeaModel.build(map, self);
    }

    public RelatedWorkload setWorkloadId(String workloadId) {
        this.workloadId = workloadId;
        return this;
    }
    public String getWorkloadId() {
        return this.workloadId;
    }

    public RelatedWorkload setWorkloadName(String workloadName) {
        this.workloadName = workloadName;
        return this;
    }
    public String getWorkloadName() {
        return this.workloadName;
    }

    public RelatedWorkload setWorkloadType(String workloadType) {
        this.workloadType = workloadType;
        return this;
    }
    public String getWorkloadType() {
        return this.workloadType;
    }

}
