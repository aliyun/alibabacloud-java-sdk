// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.location20150612.models;

import com.aliyun.tea.*;

public class DescribeServicesRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Password")
    public String password;

    public static DescribeServicesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeServicesRequest self = new DescribeServicesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeServicesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeServicesRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

}
