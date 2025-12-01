// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class CreateBackupPlanRequest extends TeaModel {
    /**
     * <p>The backup method of the backup schedule. Valid values:</p>
     * <ul>
     * <li><strong>logical</strong>: logical backup</li>
     * <li><strong>physical</strong>: physical backup</li>
     * <li><strong>duplication</strong>: dump backup</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>logical</p>
     */
    @NameInMap("BackupMethod")
    public String backupMethod;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>KJSAHKJFHKJSHFKASHFKJADFHKDXXXX</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The region in which the database you want to back up resides.</p>
     * <blockquote>
     * <p>This parameter is required if the <strong>PayType</strong> parameter is set to <strong>postpay</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DatabaseRegion")
    public String databaseRegion;

    /**
     * <p>The type of the source database. Valid values:</p>
     * <ul>
     * <li><strong>MySQL</strong></li>
     * <li><strong>MSSQL</strong></li>
     * <li><strong>Oracle</strong></li>
     * <li><strong>MariaDB</strong></li>
     * <li><strong>PostgreSQL</strong></li>
     * <li><strong>DRDS</strong></li>
     * <li><strong>MongoDB</strong></li>
     * <li><strong>Redis</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("DatabaseType")
    public String databaseType;

    /**
     * <p>The source of the request. The default value is OpenAPI and cannot be changed.</p>
     * 
     * <strong>example:</strong>
     * <p>OpenAPI</p>
     */
    @NameInMap("FromApp")
    public String fromApp;

    /**
     * <p>The type of the backup schedule. Valid values:</p>
     * <ul>
     * <li><strong>micro</strong></li>
     * <li><strong>small</strong></li>
     * <li><strong>medium</strong></li>
     * <li><strong>large</strong></li>
     * <li><strong>xlarge</strong></li>
     * </ul>
     * <blockquote>
     * <p> A backup schedule type with higher specifications offers higher backup and restoration performance. For more information, see <a href="https://help.aliyun.com/document_detail/84372.html">Select a backup schedule type</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>micro</p>
     */
    @NameInMap("InstanceClass")
    public String instanceClass;

    /**
     * <p>The type of the source database instance. Valid values:</p>
     * <ul>
     * <li><strong>RDS</strong>: ApsaraDB RDS.</li>
     * <li><strong>PolarDB</strong>: PolarDB.</li>
     * <li><strong>DDS</strong>: ApsaraDB for MongoDB.</li>
     * <li><strong>Kvstore</strong>: ApsaraDB for Redis.</li>
     * <li><strong>Other</strong>: Database connected by using an IP address and a port number.</li>
     * <li><strong>dg</strong>: Self-managed database that has no public IP address or port number and is connected over Database Gateway.</li>
     * </ul>
     * <blockquote>
     * <p> If <strong>PayType</strong> is set to <strong>postpay</strong>, this parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>RDS</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The billing method of the backup schedule. Valid values:</p>
     * <ul>
     * <li><strong>postpay</strong>: pay-as-you-go</li>
     * <li><strong>prepay</strong>: subscription</li>
     * </ul>
     * <blockquote>
     * <p>The default value is <strong>prepay</strong>. If the <strong>BackupMethod</strong> parameter is set to <strong>duplication</strong>, <strong>postpay</strong> is supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>prepay</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The unit of the subscription period. Valid values:</p>
     * <ul>
     * <li><strong>Year</strong>: yearly subscription</li>
     * <li><strong>Month</strong>: monthly subscription</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The ID of the region in which you can activate Data Disaster Recovery. You can call the <a href="https://help.aliyun.com/document_detail/2869853.html">DescribeRegions</a> operation to query the regions supported by Data Disaster Recovery.</p>
     * <blockquote>
     * <p> For more information, see <a href="https://help.aliyun.com/document_detail/2869810.html">Endpoints</a>.</p>
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
     * <p>The region in which you want to store the backup data.</p>
     * <blockquote>
     * <p>This parameter is required if the <strong>PayType</strong> parameter is set to <strong>postpay</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("StorageRegion")
    public String storageRegion;

    /**
     * <p>This parameter is unavailable.</p>
     * 
     * <strong>example:</strong>
     * <p>N/A</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    /**
     * <p>The subscription period. Valid values:</p>
     * <ul>
     * <li>If <strong>Period</strong> is set to <strong>Year</strong>, the valid values of <strong>UsedTime</strong> range from 1 to 5.</li>
     * <li>If <strong>Period</strong> is set to <strong>Month</strong>, the valid values of <strong>UsedTime</strong> range from 1 to 11.</li>
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
