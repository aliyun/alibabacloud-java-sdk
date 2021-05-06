// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeElasticDailyPlanRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("ElasticPlanName")
    public String elasticPlanName;

    @NameInMap("ResourcePoolName")
    public String resourcePoolName;

    @NameInMap("ElasticDailyPlanDay")
    public String elasticDailyPlanDay;

    @NameInMap("ElasticDailyPlanStatusList")
    public String elasticDailyPlanStatusList;

    public static DescribeElasticDailyPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeElasticDailyPlanRequest self = new DescribeElasticDailyPlanRequest();
        return TeaModel.build(map, self);
    }

    public DescribeElasticDailyPlanRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeElasticDailyPlanRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeElasticDailyPlanRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeElasticDailyPlanRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeElasticDailyPlanRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeElasticDailyPlanRequest setElasticPlanName(String elasticPlanName) {
        this.elasticPlanName = elasticPlanName;
        return this;
    }
    public String getElasticPlanName() {
        return this.elasticPlanName;
    }

    public DescribeElasticDailyPlanRequest setResourcePoolName(String resourcePoolName) {
        this.resourcePoolName = resourcePoolName;
        return this;
    }
    public String getResourcePoolName() {
        return this.resourcePoolName;
    }

    public DescribeElasticDailyPlanRequest setElasticDailyPlanDay(String elasticDailyPlanDay) {
        this.elasticDailyPlanDay = elasticDailyPlanDay;
        return this;
    }
    public String getElasticDailyPlanDay() {
        return this.elasticDailyPlanDay;
    }

    public DescribeElasticDailyPlanRequest setElasticDailyPlanStatusList(String elasticDailyPlanStatusList) {
        this.elasticDailyPlanStatusList = elasticDailyPlanStatusList;
        return this;
    }
    public String getElasticDailyPlanStatusList() {
        return this.elasticDailyPlanStatusList;
    }

}
