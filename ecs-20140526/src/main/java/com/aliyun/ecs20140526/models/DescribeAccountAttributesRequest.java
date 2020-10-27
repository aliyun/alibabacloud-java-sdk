// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeAccountAttributesRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("AttributeName")
    public java.util.List<String> attributeName;

    public static DescribeAccountAttributesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountAttributesRequest self = new DescribeAccountAttributesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAccountAttributesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAccountAttributesRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public DescribeAccountAttributesRequest setAttributeName(java.util.List<String> attributeName) {
        this.attributeName = attributeName;
        return this;
    }
    public java.util.List<String> getAttributeName() {
        return this.attributeName;
    }

}
