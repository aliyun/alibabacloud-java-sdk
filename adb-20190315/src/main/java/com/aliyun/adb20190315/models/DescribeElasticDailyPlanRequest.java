// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeElasticDailyPlanRequest extends TeaModel {
    /**
     * <p>The ID of the AnalyticDB for MySQL Data Warehouse Edition (V3.0) cluster.</p>
     * <br>
     * <p>>  You can call the [DescribeDBClusters](~~129857~~) operation to query the cluster IDs of all AnalyticDB for MySQL Data Warehouse Edition (V3.0) clusters within a specific region.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The start date of the current-day scaling plan. Specify the date in the yyyy-MM-dd format.</p>
     */
    @NameInMap("ElasticDailyPlanDay")
    public String elasticDailyPlanDay;

    /**
     * <p>The execution state of the current-day scaling plan. Separate multiple values with commas (,). Valid values:</p>
     * <br>
     * <p>*   **1**: The scaling plan is not executed.</p>
     * <p>*   **2**: The scaling plan is being executed.</p>
     * <p>*   **3**: The scaling plan is executed.</p>
     * <p>*   **4**: The scaling plan fails to be executed.</p>
     */
    @NameInMap("ElasticDailyPlanStatusList")
    public String elasticDailyPlanStatusList;

    /**
     * <p>The name of the scaling plan. Valid values:</p>
     * <br>
     * <p>*   The name must be 2 to 30 characters in length.</p>
     * <p>*   The name can contain letters, digits, and underscores (\_).</p>
     */
    @NameInMap("ElasticPlanName")
    public String elasticPlanName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The name of the resource group.</p>
     * <br>
     * <p>>  You can call the [DescribeDBResourceGroup](~~466685~~) operation to query the resource group name.</p>
     */
    @NameInMap("ResourcePoolName")
    public String resourcePoolName;

    public static DescribeElasticDailyPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeElasticDailyPlanRequest self = new DescribeElasticDailyPlanRequest();
        return TeaModel.build(map, self);
    }

    public DescribeElasticDailyPlanRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
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

    public DescribeElasticDailyPlanRequest setElasticPlanName(String elasticPlanName) {
        this.elasticPlanName = elasticPlanName;
        return this;
    }
    public String getElasticPlanName() {
        return this.elasticPlanName;
    }

    public DescribeElasticDailyPlanRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
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

    public DescribeElasticDailyPlanRequest setResourcePoolName(String resourcePoolName) {
        this.resourcePoolName = resourcePoolName;
        return this;
    }
    public String getResourcePoolName() {
        return this.resourcePoolName;
    }

}
