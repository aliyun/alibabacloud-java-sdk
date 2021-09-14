// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class DescribeDbfsSpecificationsRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("EcsInstanceType")
    public String ecsInstanceType;

    @NameInMap("Category")
    public String category;

    public static DescribeDbfsSpecificationsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDbfsSpecificationsRequest self = new DescribeDbfsSpecificationsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDbfsSpecificationsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDbfsSpecificationsRequest setEcsInstanceType(String ecsInstanceType) {
        this.ecsInstanceType = ecsInstanceType;
        return this;
    }
    public String getEcsInstanceType() {
        return this.ecsInstanceType;
    }

    public DescribeDbfsSpecificationsRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

}
