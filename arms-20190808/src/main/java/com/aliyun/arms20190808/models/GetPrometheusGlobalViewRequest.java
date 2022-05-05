// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetPrometheusGlobalViewRequest extends TeaModel {
    @NameInMap("GlobalViewClusterId")
    public String globalViewClusterId;

    @NameInMap("RegionId")
    public String regionId;

    public static GetPrometheusGlobalViewRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPrometheusGlobalViewRequest self = new GetPrometheusGlobalViewRequest();
        return TeaModel.build(map, self);
    }

    public GetPrometheusGlobalViewRequest setGlobalViewClusterId(String globalViewClusterId) {
        this.globalViewClusterId = globalViewClusterId;
        return this;
    }
    public String getGlobalViewClusterId() {
        return this.globalViewClusterId;
    }

    public GetPrometheusGlobalViewRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
