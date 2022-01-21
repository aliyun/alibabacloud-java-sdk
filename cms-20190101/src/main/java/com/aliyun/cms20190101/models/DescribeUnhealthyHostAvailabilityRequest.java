// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeUnhealthyHostAvailabilityRequest extends TeaModel {
    @NameInMap("Id")
    public java.util.List<Long> id;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeUnhealthyHostAvailabilityRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUnhealthyHostAvailabilityRequest self = new DescribeUnhealthyHostAvailabilityRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUnhealthyHostAvailabilityRequest setId(java.util.List<Long> id) {
        this.id = id;
        return this;
    }
    public java.util.List<Long> getId() {
        return this.id;
    }

    public DescribeUnhealthyHostAvailabilityRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
