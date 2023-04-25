// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class GetQuotaTipRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the region in which the instance resides.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetQuotaTipRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQuotaTipRequest self = new GetQuotaTipRequest();
        return TeaModel.build(map, self);
    }

    public GetQuotaTipRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetQuotaTipRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
