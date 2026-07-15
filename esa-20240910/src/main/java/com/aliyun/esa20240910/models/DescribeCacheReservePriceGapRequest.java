// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeCacheReservePriceGapRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>esa-cr-9tuv*********</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The requested cache size. Unit: GB.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("TargetQuotaGb")
    public Long targetQuotaGb;

    public static DescribeCacheReservePriceGapRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCacheReservePriceGapRequest self = new DescribeCacheReservePriceGapRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCacheReservePriceGapRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeCacheReservePriceGapRequest setTargetQuotaGb(Long targetQuotaGb) {
        this.targetQuotaGb = targetQuotaGb;
        return this;
    }
    public Long getTargetQuotaGb() {
        return this.targetQuotaGb;
    }

}
