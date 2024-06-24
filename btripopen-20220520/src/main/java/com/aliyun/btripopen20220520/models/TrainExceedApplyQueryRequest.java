// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TrainExceedApplyQueryRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>349720</p>
     */
    @NameInMap("apply_id")
    public Long applyId;

    @NameInMap("business_instance_id")
    public String businessInstanceId;

    public static TrainExceedApplyQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        TrainExceedApplyQueryRequest self = new TrainExceedApplyQueryRequest();
        return TeaModel.build(map, self);
    }

    public TrainExceedApplyQueryRequest setApplyId(Long applyId) {
        this.applyId = applyId;
        return this;
    }
    public Long getApplyId() {
        return this.applyId;
    }

    public TrainExceedApplyQueryRequest setBusinessInstanceId(String businessInstanceId) {
        this.businessInstanceId = businessInstanceId;
        return this;
    }
    public String getBusinessInstanceId() {
        return this.businessInstanceId;
    }

}
