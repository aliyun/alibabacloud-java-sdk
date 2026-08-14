// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class CreateSynchronizationJobRequest extends TeaModel {
    @NameInMap("DestinationEndpoint")
    public CreateSynchronizationJobRequestDestinationEndpoint destinationEndpoint;

    @NameInMap("SourceEndpoint")
    public CreateSynchronizationJobRequestSourceEndpoint sourceEndpoint;

    /**
     * <p>The ID of the Alibaba Cloud account. You do not need to specify this parameter because it will be deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>12323344****</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. Generate a value from your client to ensure uniqueness across different requests. <strong>ClientToken</strong> supports only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>0c593ea1-3bea-11e9-b96b-88e9fe63****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The number of private custom ApsaraDB RDS instances attached to the source PolarDB-X instance. This parameter is required when <strong>SourceEndpoint.InstanceType</strong> is set to <strong>DRDS</strong>. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DBInstanceCount")
    public Integer DBInstanceCount;

    /**
     * <p>The region ID of the destination database for data synchronization. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
     * <blockquote>
     * <p>If the region specified by the <strong>SourceRegion</strong> parameter is Hong Kong (China) or a region outside China, set this parameter to the same region ID.</p>
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
     * <p>The billing method. Valid values:</p>
     * <ul>
     * <li><strong>PrePaid</strong>: subscription.</li>
     * <li><strong>PostPaid</strong>: pay-as-you-go. This is the default value.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The billing method of the subscription instance. Valid values:</p>
     * <ul>
     * <li><strong>Year</strong>: annual subscription.</li>
     * <li><strong>Month</strong>: monthly subscription.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is valid and required only when <strong>PayType</strong> is set to <strong>PrePaid</strong> (subscription).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Year</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The region ID of the data synchronization instance. Set this parameter to the same value as the <strong>DestRegion</strong> parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzawhxxc****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The region ID of the source database for data synchronization. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("SourceRegion")
    public String sourceRegion;

    /**
     * <p>The specification of the data synchronization link. Valid values: <strong>micro</strong>, <strong>small</strong>, <strong>medium</strong>, <strong>large</strong>.</p>
     * <blockquote>
     * <p>For more information about the description and performance test results of each specification, see <a href="https://help.aliyun.com/document_detail/26605.html">Specifications of data synchronization links</a>.</p>
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
     * <li><strong>oneway</strong>: one-way synchronization.</li>
     * <li><strong>bidirectional</strong>: two-way synchronization.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>Default value: <strong>oneway</strong>.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>You can set this parameter to <strong>bidirectional</strong> only when both <strong>SourceEndpoint.InstanceType</strong> and <strong>DestinationEndpoint.InstanceType</strong> are set to <strong>MySQL</strong>, <strong>PolarDB</strong>, or <strong>Redis</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>oneway</p>
     */
    @NameInMap("Topology")
    public String topology;

    /**
     * <p>The subscription duration of the subscription instance.</p>
     * <ul>
     * <li>If the billing method is set to <strong>Year</strong>, valid values are <strong>1 to 5</strong>.</li>
     * <li>If the billing method is set to <strong>Month</strong>, valid values are <strong>1 to 60</strong>.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is valid and required only when <strong>PayType</strong> is set to <strong>PrePaid</strong> (subscription).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UsedTime")
    public Integer usedTime;

    /**
     * <p>The network type for Data Transmission Service. Set the value to <strong>Intranet</strong> (Express Connect).</p>
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
         * <p>目标库的实例类型，取值：</p>
         * <ul>
         * <li><strong>MySQL</strong>：MySQL数据库（包括RDS MySQL和自建MySQL）。</li>
         * <li><strong>PolarDB</strong>：PolarDB集群（仅支持MySQL或兼容Oracle语法的引擎）。</li>
         * <li><strong>Redis</strong>：Redis数据库。</li>
         * <li><strong>MaxCompute</strong>：MaxCompute实例。</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>默认取值为<strong>MySQL</strong>。</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>关于支持的源库和目标库对应情况，请参见支持的<a href="https://help.aliyun.com/document_detail/130744.html">数据库、同步初始化类型和同步拓扑</a>。</li>
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
         * <p>源库的实例类型，取值：</p>
         * <ul>
         * <li><strong>MySQL</strong>：MySQL数据库（包括RDS MySQL和自建MySQL）。</li>
         * <li><strong>PolarDB</strong>：PolarDB集群（仅支持MySQL或兼容Oracle语法的引擎）。</li>
         * <li><strong>Redis</strong>：Redis数据库。</li>
         * <li><strong>DRDS</strong>：云原生分布式数据库PolarDB-X 1.0。</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>默认取值为<strong>MySQL</strong>。</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>关于支持的源库和目标库对应情况，请参见支持的<a href="https://help.aliyun.com/document_detail/130744.html">数据库、同步初始化类型和同步拓扑</a>。</li>
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
