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
     * 
     * <strong>example:</strong>
     * <p>12323344****</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that it is unique among different requests. The <strong>ClientToken</strong> parameter can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>0c593ea1-3bea-11e9-b96b-88e9fe63****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>If you set the <strong>SourceEndpoint.InstanceType</strong> parameter to <strong>DRDS</strong>, you must specify the DBInstanceCount parameter. This parameter specifies the number of private RDS instances attached to the source PolarDB-X instance. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("DBInstanceCount")
    public Integer DBInstanceCount;

    /**
     * <p>The ID of the region where the destination database resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">List of supported regions</a>.</p>
     * <blockquote>
     * <p> If the <strong>SourceRegion</strong> parameter is set to the China (Hong Kong) region or a region outside the Chinese mainland, you must set the DestRegion parameter to the same region ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DestRegion")
    public String destRegion;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The billing method of the data synchronization instance.</p>
     * <ul>
     * <li><strong>PrePaid</strong>: subscription</li>
     * <li><strong>PostPaid</strong> (default value): pay-as-you-go</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The billing cycle of the subscription instance. Valid values:</p>
     * <ul>
     * <li><strong>Year</strong></li>
     * <li><strong>Month</strong></li>
     * </ul>
     * <blockquote>
     * <p> You must specify this parameter only if you set the PayType parameter to <strong>PrePaid</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Year</p>
     */
    @NameInMap("Period")
    public String period;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the region where the source database resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">List of supported regions</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("SourceRegion")
    public String sourceRegion;

    /**
     * <p>The specification of the data synchronization instance. Valid values: <strong>micro</strong>, <strong>small</strong>, <strong>medium</strong>, and <strong>large</strong>.</p>
     * <blockquote>
     * <p> For more information about the test performance of each specification, see <a href="https://help.aliyun.com/document_detail/26605.html">Specifications of data synchronization instances</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>small</p>
     */
    @NameInMap("SynchronizationJobClass")
    public String synchronizationJobClass;

    /**
     * <p>The synchronization topology. Valid values:</p>
     * <ul>
     * <li><strong>oneway</strong>: one-way synchronization</li>
     * <li><strong>bidirectional</strong>: two-way synchronization</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>The default value is <strong>oneway</strong>.</li>
     * <li>This parameter can be set to <strong>bidirectional</strong> only when the <strong>SourceEndpoint.InstanceType</strong> and <strong>DestinationEndpoint.InstanceType</strong> parameters are set to <strong>MySQL</strong>, <strong>PolarDB</strong>, or <strong>Redis</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>oneway</p>
     */
    @NameInMap("Topology")
    public String topology;

    /**
     * <p>The subscription length.</p>
     * <ul>
     * <li>If the billing cycle is <strong>Year</strong>, the value range is <strong>1 to 5</strong>.</li>
     * <li>If the billing cycle is <strong>Month</strong>, the value range is <strong>1 to 60</strong>.</li>
     * </ul>
     * <blockquote>
     * <p> You must specify this parameter only if you set the PayType parameter to <strong>PrePaid</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UsedTime")
    public Integer usedTime;

    /**
     * <p>The network type. Valid value: <strong>Intranet</strong>, which indicates virtual private cloud (VPC).</p>
     * 
     * <strong>example:</strong>
     * <p>Intranet</p>
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
         * <ul>
         * <li><strong>MySQL</strong>: ApsaraDB RDS for MySQL instance or self-managed MySQL database</li>
         * <li><strong>PolarDB</strong>: PolarDB for MySQL cluster or PolarDB O Edition cluster</li>
         * <li><strong>Redis</strong>: Redis database</li>
         * <li><strong>MaxCompute</strong>: MaxCompute project</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li>Default value: <strong>MySQL</strong>.</li>
         * <li>For more information about the supported source and destination databases, see <a href="https://help.aliyun.com/document_detail/130744.html">Database types, initial synchronization types, and synchronization topologies</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
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
         * <ul>
         * <li><strong>MySQL</strong>: ApsaraDB RDS for MySQL instance or self-managed MySQL database</li>
         * <li><strong>PolarDB</strong>: PolarDB for MySQL cluster or PolarDB O Edition cluster</li>
         * <li><strong>Redis</strong>: Redis database</li>
         * <li><strong>DRDS</strong>: PolarDB-X instance V1.0</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li>Default value: <strong>MySQL</strong>.</li>
         * <li>For more information about the supported source and destination databases, see <a href="https://help.aliyun.com/document_detail/130744.html">Database types, initial synchronization types, and synchronization topologies</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
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
