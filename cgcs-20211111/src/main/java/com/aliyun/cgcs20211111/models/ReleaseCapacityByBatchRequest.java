// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class ReleaseCapacityByBatchRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResBatchId")
    public String resBatchId;

    public static ReleaseCapacityByBatchRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseCapacityByBatchRequest self = new ReleaseCapacityByBatchRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseCapacityByBatchRequest setResBatchId(String resBatchId) {
        this.resBatchId = resBatchId;
        return this;
    }
    public String getResBatchId() {
        return this.resBatchId;
    }

}
