// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class CreateInstanceRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable auto-renewal. Valid values:</p>
     * <ul>
     * <li>true: enables auto-renewal.</li>
     * <li>false: disables auto-renewal. If you select this value, you must manually renew the instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AutoRenewal</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The auto-renewal duration. Unit: months.</p>
     * <blockquote>
     * <p> This parameter takes effect only if you set AutoRenew to true. Default value: 1.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AutoRenewPeriod")
    public Integer autoRenewPeriod;

    /**
     * <p>The client token.</p>
     * 
     * <strong>example:</strong>
     * <p>c2c5d1274axxxxxxxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("EncryptedInstance")
    public Boolean encryptedInstance;

    /**
     * <p>The instance name. We recommend that you specify a name that does not exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>amqp-xxxxx</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The instance edition. Valid values:</p>
     * <ul>
     * <li>professional: Professional Edition</li>
     * <li>enterprise: Enterprise Edition</li>
     * <li>vip: Enterprise Platinum Edition</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>professional</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <strong>example:</strong>
     * <p>key-xxx</p>
     */
    @NameInMap("KmsKeyId")
    public String kmsKeyId;

    /**
     * <p>The maximum number of connections that can be established to the instance. Configure this parameter based on the values provided on the <a href="https://common-buy.aliyun.com/?commodityCode=ons_onsproxy_pre">ApsaraMQ for RocketMQ buy page</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>50000</p>
     */
    @NameInMap("MaxConnections")
    public Integer maxConnections;

    /**
     * <p>The maximum number of EIP-based TPS on the instance. Configure this parameter based on the values provided on the <a href="https://common-buy.aliyun.com/?commodityCode=ons_onsproxy_pre">ApsaraMQ for RocketMQ buy page</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>128</p>
     */
    @NameInMap("MaxEipTps")
    public Long maxEipTps;

    /**
     * <p>The maximum number of virtual private cloud (VPC)-based transactions per second (TPS) on the instance. Configure this parameter based on the values provided on the <a href="https://common-buy.aliyun.com/?commodityCode=ons_onsproxy_pre">ApsaraMQ for RocketMQ buy page</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("MaxPrivateTps")
    public Long maxPrivateTps;

    /**
     * <p>The billing method. Valid value:</p>
     * <ul>
     * <li>Subscription</li>
     * </ul>
     * <blockquote>
     * <p> API operations provided by ApsaraMQ for RabbitMQ are supported only by subscription instances. You can set this parameter only to Subscription.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Subscription</p>
     */
    @NameInMap("PaymentType")
    public String paymentType;

    /**
     * <p>The subscription period. The unit of the subscription period is specified by periodCycle.</p>
     * <blockquote>
     * <p> This parameter takes effect only if you set PaymentType to Subscription. Default value: 1.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the subscription period. Valid values:</p>
     * <ul>
     * <li>Month</li>
     * <li>Year</li>
     * </ul>
     * <blockquote>
     * <p> This parameter takes effect only if you set PaymentType to Subscription. Default value: Month.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PeriodCycle")
    public String periodCycle;

    /**
     * <p>The number of queues. Valid values:</p>
     * <ul>
     * <li>Professional Edition: 50 to 1000. The number of queues must increase in increments of 5.</li>
     * <li>Enterprise Edition: 200 to 6000. The number of queues must increase in increments of 100.</li>
     * <li>Enterprise Platinum Edition: 10000 to 80000. The number of queues must increase in increments of 100.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("QueueCapacity")
    public Integer queueCapacity;

    /**
     * <p>The renewal status. This parameter is the same as AutoRenew. You can configure one of these parameters. Valid value:</p>
     * <ul>
     * <li>AutoRenewal</li>
     * </ul>
     * <blockquote>
     * <p>If you configure both this parameter and AutoRenew, the value of this parameter is used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("RenewStatus")
    public String renewStatus;

    /**
     * <p>The unit of the auto-renewal period. Valid values:</p>
     * <ul>
     * <li>Month</li>
     * <li>Year</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("RenewalDurationUnit")
    public String renewalDurationUnit;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The billing method of the pay-as-you-go instance. Valid values:</p>
     * <ul>
     * <li>onDemand: You are charged based on your actual usage</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>onDemand</p>
     */
    @NameInMap("ServerlessChargeType")
    public String serverlessChargeType;

    /**
     * <p>The storage capacity. Unit: GB. Valid values:</p>
     * <ul>
     * <li>Professional Edition and Enterprise Edition instances: Set this parameter to 0.</li>
     * </ul>
     * <blockquote>
     * <p> The value 0 specifies that storage space is available for Professional Edition and Enterprise Edition instances, but no storage fees are generated.</p>
     * </blockquote>
     * <ul>
     * <li>Platinum Edition instances: Set the value to m × 100, where m ranges from 7 to 28.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("StorageSize")
    public Integer storageSize;

    /**
     * <p>Specifies whether elastic IP addresses (EIPs) are supported. Valid values:</p>
     * <ul>
     * <li>True</li>
     * <li>False</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SupportEip")
    public Boolean supportEip;

    /**
     * <p>Specifies whether to enable the message trace feature. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>Enterprise Platinum Edition instances allow you to retain message traces for 15 days free of charge. If you use an Enterprise Platinum Edition instance, you can set this parameter only to true and TracingStorageTime only to 15.</p>
     * </li>
     * <li><p>For instances of other editions, you can set this parameter to true or false.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SupportTracing")
    public Boolean supportTracing;

    /**
     * <p>The retention period of messages. Unit: days. Valid values:</p>
     * <ul>
     * <li>3</li>
     * <li>7</li>
     * <li>15</li>
     * </ul>
     * <blockquote>
     * <p> This parameter takes effect only if you set SupportTracing to true.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TracingStorageTime")
    public Integer tracingStorageTime;

    public static CreateInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceRequest self = new CreateInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstanceRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateInstanceRequest setAutoRenewPeriod(Integer autoRenewPeriod) {
        this.autoRenewPeriod = autoRenewPeriod;
        return this;
    }
    public Integer getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    public CreateInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateInstanceRequest setEncryptedInstance(Boolean encryptedInstance) {
        this.encryptedInstance = encryptedInstance;
        return this;
    }
    public Boolean getEncryptedInstance() {
        return this.encryptedInstance;
    }

    public CreateInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateInstanceRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CreateInstanceRequest setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }
    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    public CreateInstanceRequest setMaxConnections(Integer maxConnections) {
        this.maxConnections = maxConnections;
        return this;
    }
    public Integer getMaxConnections() {
        return this.maxConnections;
    }

    public CreateInstanceRequest setMaxEipTps(Long maxEipTps) {
        this.maxEipTps = maxEipTps;
        return this;
    }
    public Long getMaxEipTps() {
        return this.maxEipTps;
    }

    public CreateInstanceRequest setMaxPrivateTps(Long maxPrivateTps) {
        this.maxPrivateTps = maxPrivateTps;
        return this;
    }
    public Long getMaxPrivateTps() {
        return this.maxPrivateTps;
    }

    public CreateInstanceRequest setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public CreateInstanceRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateInstanceRequest setPeriodCycle(String periodCycle) {
        this.periodCycle = periodCycle;
        return this;
    }
    public String getPeriodCycle() {
        return this.periodCycle;
    }

    public CreateInstanceRequest setQueueCapacity(Integer queueCapacity) {
        this.queueCapacity = queueCapacity;
        return this;
    }
    public Integer getQueueCapacity() {
        return this.queueCapacity;
    }

    public CreateInstanceRequest setRenewStatus(String renewStatus) {
        this.renewStatus = renewStatus;
        return this;
    }
    public String getRenewStatus() {
        return this.renewStatus;
    }

    public CreateInstanceRequest setRenewalDurationUnit(String renewalDurationUnit) {
        this.renewalDurationUnit = renewalDurationUnit;
        return this;
    }
    public String getRenewalDurationUnit() {
        return this.renewalDurationUnit;
    }

    public CreateInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateInstanceRequest setServerlessChargeType(String serverlessChargeType) {
        this.serverlessChargeType = serverlessChargeType;
        return this;
    }
    public String getServerlessChargeType() {
        return this.serverlessChargeType;
    }

    public CreateInstanceRequest setStorageSize(Integer storageSize) {
        this.storageSize = storageSize;
        return this;
    }
    public Integer getStorageSize() {
        return this.storageSize;
    }

    public CreateInstanceRequest setSupportEip(Boolean supportEip) {
        this.supportEip = supportEip;
        return this;
    }
    public Boolean getSupportEip() {
        return this.supportEip;
    }

    public CreateInstanceRequest setSupportTracing(Boolean supportTracing) {
        this.supportTracing = supportTracing;
        return this;
    }
    public Boolean getSupportTracing() {
        return this.supportTracing;
    }

    public CreateInstanceRequest setTracingStorageTime(Integer tracingStorageTime) {
        this.tracingStorageTime = tracingStorageTime;
        return this;
    }
    public Integer getTracingStorageTime() {
        return this.tracingStorageTime;
    }

}
