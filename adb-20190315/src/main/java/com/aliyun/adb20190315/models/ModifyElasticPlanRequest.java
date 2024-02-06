// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class ModifyElasticPlanRequest extends TeaModel {
    /**
     * <p>The ID of the AnalyticDB for MySQL Data Warehouse Edition (V3.0) cluster.</p>
     * <br>
     * <p>> You can call the [DescribeDBClusters](~~129857~~) operation to query the IDs of all AnalyticDB for MySQL Data Warehouse Edition (V3.0) clusters within a region.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>Specifies whether the scaling plan takes effect. Valid values:</p>
     * <br>
     * <p>*   **true** (default)</p>
     * <p>*   **false**</p>
     */
    @NameInMap("ElasticPlanEnable")
    public Boolean elasticPlanEnable;

    /**
     * <p>The end date of the scaling plan. Specify the date in the yyyy-MM-dd format.</p>
     */
    @NameInMap("ElasticPlanEndDay")
    public String elasticPlanEndDay;

    @NameInMap("ElasticPlanMonthlyRepeat")
    public String elasticPlanMonthlyRepeat;

    /**
     * <p>The name of the scaling plan.</p>
     * <br>
     * <p>*   The name must be 2 to 30 characters in length.</p>
     * <p>*   The name can contain letters, digits, and underscores (\_).</p>
     * <br>
     * <p>> You can call the [DescribeElasticPlan](~~190596~~) operation to query the information about all scaling plans of a cluster, including the scaling plan names.</p>
     */
    @NameInMap("ElasticPlanName")
    public String elasticPlanName;

    /**
     * <p>The number of nodes that are involved in the scaling plan.</p>
     * <br>
     * <p>*   If ElasticPlanType is set to **worker**, you can set this parameter to 0 or leave this parameter empty.</p>
     * <p>*   If ElasticPlanType is set to **executorcombineworker** or **executor**, you must set this parameter to a value that is greater than 0.</p>
     */
    @NameInMap("ElasticPlanNodeNum")
    public Integer elasticPlanNodeNum;

    /**
     * <p>The start date of the scaling plan. Specify the date in the yyyy-MM-dd format.</p>
     */
    @NameInMap("ElasticPlanStartDay")
    public String elasticPlanStartDay;

    /**
     * <p>The restoration time of the scaling plan. Specify the time on the hour in the HH:mm:ss format. The interval between the scale-up time and the restoration time cannot be more than 24 hours.</p>
     */
    @NameInMap("ElasticPlanTimeEnd")
    public String elasticPlanTimeEnd;

    /**
     * <p>The scale-up time of the scaling plan. Specify the time on the hour in the HH:mm:ss format.</p>
     */
    @NameInMap("ElasticPlanTimeStart")
    public String elasticPlanTimeStart;

    /**
     * <p>The type of the scaling plan. Valid values:</p>
     * <br>
     * <p>*   **worker**: scales only elastic I/O resources.</p>
     * <p>*   **executor**: scales only computing resources.</p>
     * <p>*   **executorcombineworker** (default): scales both elastic I/O resources and computing resources by proportion.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   If you want to set this parameter to **executorcombineworker**, make sure that the cluster runs a minor version of 3.1.3.2 or later.</p>
     * <br>
     * <p>*   If you want to set this parameter to **worker** or **executor**, make sure that the cluster runs a minor version of 3.1.6.1 or later and a ticket is submitted. After your request is approved, you can set this parameter to **worker** or **executor**.</p>
     */
    @NameInMap("ElasticPlanType")
    public String elasticPlanType;

    /**
     * <p>The days of the week when you want to execute the scaling plan. Valid values: 0 to 6, which indicate Sunday to Saturday. Separate multiple values with commas (,).</p>
     */
    @NameInMap("ElasticPlanWeeklyRepeat")
    public String elasticPlanWeeklyRepeat;

    /**
     * <p>The resource specifications that can be scaled up by the scaling plan. Valid values:</p>
     * <br>
     * <p>*   8 Core 64 GB (default)</p>
     * <p>*   16 Core 64 GB</p>
     * <p>*   32 Core 64 GB</p>
     * <p>*   64 Core 128 GB</p>
     * <p>*   12 Core 96 GB</p>
     * <p>*   24 Core 96 GB</p>
     * <p>*   52 Core 86 GB</p>
     */
    @NameInMap("ElasticPlanWorkerSpec")
    public String elasticPlanWorkerSpec;

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
     * <p>> You can call the [DescribeDBResourceGroup](~~466685~~) operation to query the resource group name.</p>
     */
    @NameInMap("ResourcePoolName")
    public String resourcePoolName;

    public static ModifyElasticPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyElasticPlanRequest self = new ModifyElasticPlanRequest();
        return TeaModel.build(map, self);
    }

    public ModifyElasticPlanRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyElasticPlanRequest setElasticPlanEnable(Boolean elasticPlanEnable) {
        this.elasticPlanEnable = elasticPlanEnable;
        return this;
    }
    public Boolean getElasticPlanEnable() {
        return this.elasticPlanEnable;
    }

    public ModifyElasticPlanRequest setElasticPlanEndDay(String elasticPlanEndDay) {
        this.elasticPlanEndDay = elasticPlanEndDay;
        return this;
    }
    public String getElasticPlanEndDay() {
        return this.elasticPlanEndDay;
    }

    public ModifyElasticPlanRequest setElasticPlanMonthlyRepeat(String elasticPlanMonthlyRepeat) {
        this.elasticPlanMonthlyRepeat = elasticPlanMonthlyRepeat;
        return this;
    }
    public String getElasticPlanMonthlyRepeat() {
        return this.elasticPlanMonthlyRepeat;
    }

    public ModifyElasticPlanRequest setElasticPlanName(String elasticPlanName) {
        this.elasticPlanName = elasticPlanName;
        return this;
    }
    public String getElasticPlanName() {
        return this.elasticPlanName;
    }

    public ModifyElasticPlanRequest setElasticPlanNodeNum(Integer elasticPlanNodeNum) {
        this.elasticPlanNodeNum = elasticPlanNodeNum;
        return this;
    }
    public Integer getElasticPlanNodeNum() {
        return this.elasticPlanNodeNum;
    }

    public ModifyElasticPlanRequest setElasticPlanStartDay(String elasticPlanStartDay) {
        this.elasticPlanStartDay = elasticPlanStartDay;
        return this;
    }
    public String getElasticPlanStartDay() {
        return this.elasticPlanStartDay;
    }

    public ModifyElasticPlanRequest setElasticPlanTimeEnd(String elasticPlanTimeEnd) {
        this.elasticPlanTimeEnd = elasticPlanTimeEnd;
        return this;
    }
    public String getElasticPlanTimeEnd() {
        return this.elasticPlanTimeEnd;
    }

    public ModifyElasticPlanRequest setElasticPlanTimeStart(String elasticPlanTimeStart) {
        this.elasticPlanTimeStart = elasticPlanTimeStart;
        return this;
    }
    public String getElasticPlanTimeStart() {
        return this.elasticPlanTimeStart;
    }

    public ModifyElasticPlanRequest setElasticPlanType(String elasticPlanType) {
        this.elasticPlanType = elasticPlanType;
        return this;
    }
    public String getElasticPlanType() {
        return this.elasticPlanType;
    }

    public ModifyElasticPlanRequest setElasticPlanWeeklyRepeat(String elasticPlanWeeklyRepeat) {
        this.elasticPlanWeeklyRepeat = elasticPlanWeeklyRepeat;
        return this;
    }
    public String getElasticPlanWeeklyRepeat() {
        return this.elasticPlanWeeklyRepeat;
    }

    public ModifyElasticPlanRequest setElasticPlanWorkerSpec(String elasticPlanWorkerSpec) {
        this.elasticPlanWorkerSpec = elasticPlanWorkerSpec;
        return this;
    }
    public String getElasticPlanWorkerSpec() {
        return this.elasticPlanWorkerSpec;
    }

    public ModifyElasticPlanRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyElasticPlanRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyElasticPlanRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyElasticPlanRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyElasticPlanRequest setResourcePoolName(String resourcePoolName) {
        this.resourcePoolName = resourcePoolName;
        return this;
    }
    public String getResourcePoolName() {
        return this.resourcePoolName;
    }

}
