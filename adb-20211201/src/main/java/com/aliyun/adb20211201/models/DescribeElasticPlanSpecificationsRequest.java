// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeElasticPlanSpecificationsRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("ResourceGroupName")
    public String resourceGroupName;

    @NameInMap("Type")
    public String type;

    public static DescribeElasticPlanSpecificationsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeElasticPlanSpecificationsRequest self = new DescribeElasticPlanSpecificationsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeElasticPlanSpecificationsRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeElasticPlanSpecificationsRequest setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }
    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public DescribeElasticPlanSpecificationsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
