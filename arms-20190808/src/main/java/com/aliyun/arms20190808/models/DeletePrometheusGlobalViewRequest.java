// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeletePrometheusGlobalViewRequest extends TeaModel {
    /**
     * <p>The ID of the global aggregation instance.</p>
     */
    @NameInMap("GlobalViewClusterId")
    public String globalViewClusterId;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeletePrometheusGlobalViewRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePrometheusGlobalViewRequest self = new DeletePrometheusGlobalViewRequest();
        return TeaModel.build(map, self);
    }

    public DeletePrometheusGlobalViewRequest setGlobalViewClusterId(String globalViewClusterId) {
        this.globalViewClusterId = globalViewClusterId;
        return this;
    }
    public String getGlobalViewClusterId() {
        return this.globalViewClusterId;
    }

    public DeletePrometheusGlobalViewRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
