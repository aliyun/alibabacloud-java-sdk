// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class EnableAdviceServiceRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("RegionId")
    public String regionId;

    public static EnableAdviceServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableAdviceServiceRequest self = new EnableAdviceServiceRequest();
        return TeaModel.build(map, self);
    }

    public EnableAdviceServiceRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public EnableAdviceServiceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
