// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class CreateSynchronizationJobRequest extends TeaModel {
    @NameInMap("DestinationEndpoint")
    public CreateSynchronizationJobRequestDestinationEndpoint destinationEndpoint;

    @NameInMap("SourceEndpoint")
    public CreateSynchronizationJobRequestSourceEndpoint sourceEndpoint;

    /**
     * <p>The ID of the Alibaba Cloud account. You do not need to specify this parameter because this parameter will be removed in the future.</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that it is unique among different requests. The **ClientToken** parameter can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>If you set the **SourceEndpoint.InstanceType** parameter to **DRDS**, you must specify the DBInstanceCount parameter. This parameter specifies the number of private RDS instances attached to the source PolarDB-X instance. Default value: **1**.</p>
     */
    @NameInMap("DBInstanceCount")
    public Integer DBInstanceCount;

    /**
     * <p>The ID of the region where the destination database resides. For more information, see [List of supported regions](~~141033~~).</p>
     * <br>
     * <p>>  If the **SourceRegion** parameter is set to the China (Hong Kong) region or a region outside the Chinese mainland, you must set the DestRegion parameter to the same region ID.</p>
     */
    @NameInMap("DestRegion")
    public String destRegion;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The billing method of the data synchronization instance.</p>
     * <br>
     * <p>*   **PrePaid**: subscription</p>
     * <p>*   **PostPaid** (default value): pay-as-you-go</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The billing cycle of the subscription instance. Valid values:</p>
     * <br>
     * <p>*   **Year**</p>
     * <p>*   **Month**</p>
     * <br>
     * <p>>  You must specify this parameter only if you set the PayType parameter to **PrePaid**.</p>
     */
    @NameInMap("Period")
    public String period;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the region where the source database resides. For more information, see [List of supported regions](~~141033~~).</p>
     */
    @NameInMap("SourceRegion")
    public String sourceRegion;

    /**
     * <p>The specification of the data synchronization instance. Valid values: **micro**, **small**, **medium**, and **large**.</p>
     * <br>
     * <p>>  For more information about the test performance of each specification, see [Specifications of data synchronization instances](~~26605~~).</p>
     */
    @NameInMap("SynchronizationJobClass")
    public String synchronizationJobClass;

    /**
     * <p>The synchronization topology. Valid values:</p>
     * <br>
     * <p>*   **oneway**: one-way synchronization</p>
     * <p>*   **bidirectional**: two-way synchronization</p>
     * <br>
     * <p>> </p>
     * <p>*   The default value is **oneway**.</p>
     * <p>*   This parameter can be set to **bidirectional** only when the **SourceEndpoint.InstanceType** and **DestinationEndpoint.InstanceType** parameters are set to **MySQL**, **PolarDB**, or **Redis**.</p>
     */
    @NameInMap("Topology")
    public String topology;

    /**
     * <p>The subscription length.</p>
     * <br>
     * <p>*   If the billing cycle is **Year**, the value range is **1 to 5**.</p>
     * <p>*   If the billing cycle is **Month**, the value range is **1 to 60**.</p>
     * <br>
     * <p>>  You must specify this parameter only if you set the PayType parameter to **PrePaid**.</p>
     */
    @NameInMap("UsedTime")
    public Integer usedTime;

    /**
     * <p>The network type. Valid value: **Intranet**, which indicates virtual private cloud (VPC).</p>
     */
    @NameInMap("networkType")
    public String networkType;

    public static CreateSynchronizationJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSynchronizationJobRequest self = new CreateSynchronizationJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateSynchronizationJobRequest setDestinationEndpoint(CreateSynchronizationJobRequestDestinationEndpoint destinationEndpoint) {
        this.destinationEndpoint = destinationEndpoint;
        return this;
    }
    public CreateSynchronizationJobRequestDestinationEndpoint getDestinationEndpoint() {
        return this.destinationEndpoint;
    }

    public CreateSynchronizationJobRequest setSourceEndpoint(CreateSynchronizationJobRequestSourceEndpoint sourceEndpoint) {
        this.sourceEndpoint = sourceEndpoint;
        return this;
    }
    public CreateSynchronizationJobRequestSourceEndpoint getSourceEndpoint() {
        return this.sourceEndpoint;
    }

    public CreateSynchronizationJobRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public CreateSynchronizationJobRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateSynchronizationJobRequest setDBInstanceCount(Integer DBInstanceCount) {
        this.DBInstanceCount = DBInstanceCount;
        return this;
    }
    public Integer getDBInstanceCount() {
        return this.DBInstanceCount;
    }

    public CreateSynchronizationJobRequest setDestRegion(String destRegion) {
        this.destRegion = destRegion;
        return this;
    }
    public String getDestRegion() {
        return this.destRegion;
    }

    public CreateSynchronizationJobRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public CreateSynchronizationJobRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CreateSynchronizationJobRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public CreateSynchronizationJobRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateSynchronizationJobRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateSynchronizationJobRequest setSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
        return this;
    }
    public String getSourceRegion() {
        return this.sourceRegion;
    }

    public CreateSynchronizationJobRequest setSynchronizationJobClass(String synchronizationJobClass) {
        this.synchronizationJobClass = synchronizationJobClass;
        return this;
    }
    public String getSynchronizationJobClass() {
        return this.synchronizationJobClass;
    }

    public CreateSynchronizationJobRequest setTopology(String topology) {
        this.topology = topology;
        return this;
    }
    public String getTopology() {
        return this.topology;
    }

    public CreateSynchronizationJobRequest setUsedTime(Integer usedTime) {
        this.usedTime = usedTime;
        return this;
    }
    public Integer getUsedTime() {
        return this.usedTime;
    }

    public CreateSynchronizationJobRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public static class CreateSynchronizationJobRequestDestinationEndpoint extends TeaModel {
        /**
         * <p>The instance type of the destination database. Valid values:</p>
         * <br>
         * <p>*   **MySQL**: ApsaraDB RDS for MySQL instance or self-managed MySQL database</p>
         * <p>*   **PolarDB**: PolarDB for MySQL cluster or PolarDB O Edition cluster</p>
         * <p>*   **Redis**: Redis database</p>
         * <p>*   **MaxCompute**: MaxCompute project</p>
         * <br>
         * <p>> </p>
         * <p>*   Default value: **MySQL**.</p>
         * <p>*   For more information about the supported source and destination databases, see [Database types, initial synchronization types, and synchronization topologies](~~130744~~).</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        public static CreateSynchronizationJobRequestDestinationEndpoint build(java.util.Map<String, ?> map) throws Exception {
            CreateSynchronizationJobRequestDestinationEndpoint self = new CreateSynchronizationJobRequestDestinationEndpoint();
            return TeaModel.build(map, self);
        }

        public CreateSynchronizationJobRequestDestinationEndpoint setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

    }

    public static class CreateSynchronizationJobRequestSourceEndpoint extends TeaModel {
        /**
         * <p>The instance type of the source database. Valid values:</p>
         * <br>
         * <p>*   **MySQL**: ApsaraDB RDS for MySQL instance or self-managed MySQL database</p>
         * <p>*   **PolarDB**: PolarDB for MySQL cluster or PolarDB O Edition cluster</p>
         * <p>*   **Redis**: Redis database</p>
         * <p>*   **DRDS**: PolarDB-X instance V1.0</p>
         * <br>
         * <p>> </p>
         * <p>*   Default value: **MySQL**.</p>
         * <p>*   For more information about the supported source and destination databases, see [Database types, initial synchronization types, and synchronization topologies](~~130744~~).</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        public static CreateSynchronizationJobRequestSourceEndpoint build(java.util.Map<String, ?> map) throws Exception {
            CreateSynchronizationJobRequestSourceEndpoint self = new CreateSynchronizationJobRequestSourceEndpoint();
            return TeaModel.build(map, self);
        }

        public CreateSynchronizationJobRequestSourceEndpoint setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

    }

}
