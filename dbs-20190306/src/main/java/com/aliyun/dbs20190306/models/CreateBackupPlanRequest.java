// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class CreateBackupPlanRequest extends TeaModel {
    /**
     * <p>The backup method. Valid values:</p>
     * <ul>
     * <li><p><strong>logical</strong>: logical backup</p>
     * </li>
     * <li><p><strong>physical</strong>: physical backup</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>logical</p>
     */
    @NameInMap("BackupMethod")
    public String backupMethod;

    /**
     * <p>A client token that is used to ensure the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>KJSAHKJFHKJSHFKASHFKJADFHKDXXXX</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The region of the database.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DatabaseRegion")
    public String databaseRegion;

    /**
     * <p>The database type. Valid values:</p>
     * <ul>
     * <li><p><strong>MySQL</strong></p>
     * </li>
     * <li><p><strong>MSSQL</strong></p>
     * </li>
     * <li><p><strong>Oracle</strong></p>
     * </li>
     * <li><p><strong>MariaDB</strong></p>
     * </li>
     * <li><p><strong>PostgreSQL</strong></p>
     * </li>
     * <li><p><strong>DRDS</strong></p>
     * </li>
     * <li><p><strong>MongoDB</strong></p>
     * </li>
     * <li><p><strong>Redis</strong></p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("DatabaseType")
    public String databaseType;

    /**
     * <p>The source of the request. The default value is OpenAPI. You do not need to set this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>OpenAPI</p>
     */
    @NameInMap("FromApp")
    public String fromApp;

    /**
     * <p>The instance class. Valid values:</p>
     * <ul>
     * <li><p><strong>micro</strong>: Entry</p>
     * </li>
     * <li><p><strong>small</strong>: Basic</p>
     * </li>
     * <li><p><strong>medium</strong>: Standard</p>
     * </li>
     * <li><p><strong>large</strong>: Enhanced</p>
     * </li>
     * <li><p><strong>xlarge</strong>: Enhanced (no traffic limit)</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The higher the instance class, the better the performance of backup and recovery. For more information, see <a href="https://help.aliyun.com/document_detail/84372.html">Specifications</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>micro</p>
     */
    @NameInMap("InstanceClass")
    public String instanceClass;

    /**
     * <p>The database instance type. Valid values:</p>
     * <ul>
     * <li><p><strong>RDS</strong></p>
     * </li>
     * <li><p><strong>PolarDB</strong></p>
     * </li>
     * <li><p><strong>DDS</strong>: Alibaba Cloud MongoDB</p>
     * </li>
     * <li><p><strong>Kvstore</strong>: Alibaba Cloud Redis</p>
     * </li>
     * <li><p><strong>Other</strong>: A database that is connected over the Internet.</p>
     * </li>
     * <li><p><strong>dg</strong>: A self-managed database without a public IP address and port that is connected through Database Gateway (DG).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RDS</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The payment method. Valid value:</p>
     * <p><strong>prepay</strong>: subscription</p>
     * 
     * <strong>example:</strong>
     * <p>prepay</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The billing cycle of the subscription instance. Valid values:</p>
     * <ul>
     * <li><p><strong>Year</strong></p>
     * </li>
     * <li><p><strong>Month</strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The region ID of the DBS instance. This parameter is required. Call the <a href="https://help.aliyun.com/document_detail/2869853.html">DescribeRegions</a> operation to view the regions that DBS supports.</p>
     * <blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/2869810.html">Endpoints</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzecovzti****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The storage region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("StorageRegion")
    public String storageRegion;

    /**
     * <p>This parameter is not used.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    /**
     * <p>The subscription duration. Valid values:</p>
     * <ul>
     * <li><p>If you set the <strong>Period</strong> parameter to <strong>Year</strong>, the value of <strong>UsedTime</strong> can be 1 to 5.</p>
     * </li>
     * <li><p>If you set the <strong>Period</strong> parameter to <strong>Month</strong>, the value of <strong>UsedTime</strong> can be 1 to 11.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UsedTime")
    public Integer usedTime;

    public static CreateBackupPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBackupPlanRequest self = new CreateBackupPlanRequest();
        return TeaModel.build(map, self);
    }

    public CreateBackupPlanRequest setBackupMethod(String backupMethod) {
        this.backupMethod = backupMethod;
        return this;
    }
    public String getBackupMethod() {
        return this.backupMethod;
    }

    public CreateBackupPlanRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateBackupPlanRequest setDatabaseRegion(String databaseRegion) {
        this.databaseRegion = databaseRegion;
        return this;
    }
    public String getDatabaseRegion() {
        return this.databaseRegion;
    }

    public CreateBackupPlanRequest setDatabaseType(String databaseType) {
        this.databaseType = databaseType;
        return this;
    }
    public String getDatabaseType() {
        return this.databaseType;
    }

    public CreateBackupPlanRequest setFromApp(String fromApp) {
        this.fromApp = fromApp;
        return this;
    }
    public String getFromApp() {
        return this.fromApp;
    }

    public CreateBackupPlanRequest setInstanceClass(String instanceClass) {
        this.instanceClass = instanceClass;
        return this;
    }
    public String getInstanceClass() {
        return this.instanceClass;
    }

    public CreateBackupPlanRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CreateBackupPlanRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public CreateBackupPlanRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CreateBackupPlanRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public CreateBackupPlanRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public CreateBackupPlanRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateBackupPlanRequest setStorageRegion(String storageRegion) {
        this.storageRegion = storageRegion;
        return this;
    }
    public String getStorageRegion() {
        return this.storageRegion;
    }

    public CreateBackupPlanRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

    public CreateBackupPlanRequest setUsedTime(Integer usedTime) {
        this.usedTime = usedTime;
        return this;
    }
    public Integer getUsedTime() {
        return this.usedTime;
    }

}
