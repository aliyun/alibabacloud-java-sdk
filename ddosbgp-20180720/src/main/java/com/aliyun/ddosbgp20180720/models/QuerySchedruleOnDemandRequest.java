// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class QuerySchedruleOnDemandRequest extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the on-demand instance.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static QuerySchedruleOnDemandRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySchedruleOnDemandRequest self = new QuerySchedruleOnDemandRequest();
        return TeaModel.build(map, self);
    }

    public QuerySchedruleOnDemandRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QuerySchedruleOnDemandRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
