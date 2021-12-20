// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetStructSyncJobDetailRequest extends TeaModel {
    @NameInMap("OrderId")
    public Long orderId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Tid")
    public Long tid;

    public static GetStructSyncJobDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStructSyncJobDetailRequest self = new GetStructSyncJobDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetStructSyncJobDetailRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public GetStructSyncJobDetailRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetStructSyncJobDetailRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
