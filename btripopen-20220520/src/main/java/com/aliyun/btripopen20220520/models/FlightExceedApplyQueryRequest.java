// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightExceedApplyQueryRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>175634</p>
     */
    @NameInMap("apply_id")
    public Long applyId;

    @NameInMap("business_instance_id")
    public String businessInstanceId;

    public static FlightExceedApplyQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        FlightExceedApplyQueryRequest self = new FlightExceedApplyQueryRequest();
        return TeaModel.build(map, self);
    }

    public FlightExceedApplyQueryRequest setApplyId(Long applyId) {
        this.applyId = applyId;
        return this;
    }
    public Long getApplyId() {
        return this.applyId;
    }

    public FlightExceedApplyQueryRequest setBusinessInstanceId(String businessInstanceId) {
        this.businessInstanceId = businessInstanceId;
        return this;
    }
    public String getBusinessInstanceId() {
        return this.businessInstanceId;
    }

}
