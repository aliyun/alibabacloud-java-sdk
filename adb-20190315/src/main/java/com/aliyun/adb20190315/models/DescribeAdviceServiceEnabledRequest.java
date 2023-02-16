// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeAdviceServiceEnabledRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeAdviceServiceEnabledRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAdviceServiceEnabledRequest self = new DescribeAdviceServiceEnabledRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAdviceServiceEnabledRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeAdviceServiceEnabledRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
