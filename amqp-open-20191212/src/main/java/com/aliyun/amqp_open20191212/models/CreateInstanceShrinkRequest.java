// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class CreateInstanceShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ram openSource</p>
     */
    @NameInMap("AuthModel")
    public String authModel;

    /**
     * <p>The renewal method. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: Enables auto-renewal.</p>
     * </li>
     * <li><p><code>false</code>: Disables auto-renewal.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The auto-renewal duration. The <code>RenewalDurationUnit</code> parameter specifies the unit, which defaults to month.</p>
     * <blockquote>
     * <p>This parameter is required if you set <code>AutoRenew</code> to <code>true</code>. The default value is 1.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AutoRenewPeriod")
    public Integer autoRenewPeriod;

    /**
     * <p>The client token used to ensure request idempotence.</p>
     * 
     * <strong>example:</strong>
     * <p>c2c5d1274axxxxxxxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The deployment architecture for the serverless instance. Valid values:</p>
     * <ul>
     * <li><p><code>shared</code>: The shared architecture, which is applicable to reserved and elastic (shared) instances and pay-as-you-go instances.</p>
     * </li>
     * <li><p><code>dedicated</code>: The dedicated architecture, which is applicable to reserved and elastic (dedicated) instances.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>shared</p>
     */
    @NameInMap("Edition")
    public String edition;

    /**
     * <p>This parameter is applicable only to dedicated instances. Specifies whether to enable data-at-rest encryption for the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EncryptedInstance")
    public Boolean encryptedInstance;

    /**
     * <p>The name of the instance. The name can be up to 64 characters long.</p>
     * 
     * <strong>example:</strong>
     * <p>amqp-xxxxx</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The instance type.
     * This parameter is required for subscription instances. Valid values:</p>
     * <ul>
     * <li><p><code>professional</code>: Professional Edition</p>
     * </li>
     * <li><p><code>enterprise</code>: Enterprise Edition</p>
     * </li>
     * <li><p><code>vip</code>: Platinum Edition</p>
     * </li>
     * </ul>
     * <p>You do not need to specify this parameter for serverless instances.</p>
     * 
     * <strong>example:</strong>
     * <p>professional</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>This parameter applies only to dedicated instances and is required if <code>EncryptedInstance</code> is set to <code>true</code>. It specifies the ID of the KMS key used for data-at-rest encryption. The key must meet the following requirements:</p>
     * <ul>
     * <li><p>The key cannot be a service key.</p>
     * </li>
     * <li><p>The key must be in the Enabled state.</p>
     * </li>
     * <li><p>The key must be a symmetric key, not an asymmetric key.</p>
     * </li>
     * <li><p>The key usage must be for encryption and decryption.</p>
     * </li>
     * <li><p>If the KMS key expires or is deleted, data reads and writes will become unavailable, and the ApsaraMQ for RabbitMQ instance may become inoperable.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>key-xxx</p>
     */
    @NameInMap("KmsKeyId")
    public String kmsKeyId;

    /**
     * <p>Specifies whether to enable only the TLS-encrypted port. This parameter applies only to reserved and elastic (dedicated) instances, and Platinum Edition instances.</p>
     * 
     * <strong>example:</strong>
     * <p>tcp_and_ssl</p>
     */
    @NameInMap("ListenerMode")
    public String listenerMode;

    /**
     * <p>The maximum number of connections.</p>
     * <p>For information about the valid values, see the instance specifications on the <a href="https://common-buy.aliyun.com/?commodityCode=ons_onsproxy_pre">ApsaraMQ for RabbitMQ</a> product page.</p>
     * 
     * <strong>example:</strong>
     * <p>50000</p>
     */
    @NameInMap("MaxConnections")
    public Integer maxConnections;

    /**
     * <p>The peak transactions per second (TPS) of the instance over the public network.</p>
     * <p>For information about the valid values, see the instance specifications on the <a href="https://common-buy.aliyun.com/?commodityCode=ons_onsproxy_pre">ApsaraMQ for RabbitMQ</a> product page.</p>
     * 
     * <strong>example:</strong>
     * <p>128</p>
     */
    @NameInMap("MaxEipTps")
    public Long maxEipTps;

    /**
     * <p>The peak transactions per second (TPS) of the instance over a private network.</p>
     * <p>For information about the valid values, see the instance specifications on the <a href="https://common-buy.aliyun.com/?commodityCode=ons_onsproxy_pre">ApsaraMQ for RabbitMQ</a> product page.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("MaxPrivateTps")
    public Long maxPrivateTps;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <ul>
     * <li><p><code>Subscription</code>: The subscription-based billing method.</p>
     * </li>
     * <li><p><code>PayAsYouGo</code>: The pay-as-you-go method for serverless instances.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Subscription</p>
     */
    @NameInMap("PaymentType")
    public String paymentType;

    /**
     * <p>The subscription duration. The <code>PeriodCycle</code> parameter specifies the unit.</p>
     * <blockquote>
     * <p>This parameter is required if you set <code>PaymentType</code> to <code>Subscription</code>. The default value is 1.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the subscription duration. Valid values:</p>
     * <ul>
     * <li><p><code>Month</code>: month</p>
     * </li>
     * <li><p><code>Year</code>: year</p>
     * </li>
     * </ul>
     * <p>This parameter is required if you set <code>PaymentType</code> to <code>Subscription</code>. The default value is <code>Month</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PeriodCycle")
    public String periodCycle;

    /**
     * <p>The provisioned TPS capacity for a reserved and elastic instance.</p>
     * 
     * <strong>example:</strong>
     * <p>2000</p>
     */
    @NameInMap("ProvisionedCapacity")
    public Integer provisionedCapacity;

    /**
     * <p>The queue capacity of the instance.</p>
     * <p>For information about the valid values, see the instance specifications on the <a href="https://common-buy.aliyun.com/?commodityCode=ons_onsproxy_pre">ApsaraMQ for RabbitMQ</a> product page.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("QueueCapacity")
    public Integer queueCapacity;

    /**
     * <p>The renewal status. This parameter is equivalent to <code>AutoRenew</code>. Valid value:</p>
     * <ul>
     * <li><code>AutoRenewal</code>: Enables auto-renewal.</li>
     * </ul>
     * <blockquote>
     * <p>Both <code>AutoRenew</code> and <code>RenewStatus</code> specify the renewal method. If you specify both parameters, the value of <code>RenewStatus</code> takes precedence.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("RenewStatus")
    public String renewStatus;

    /**
     * <p>The unit of the auto-renewal duration. Valid values:</p>
     * <ul>
     * <li><p><code>Month</code>: month</p>
     * </li>
     * <li><p><code>Year</code>: year</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("RenewalDurationUnit")
    public String renewalDurationUnit;

    /**
     * <p>The ID of the resource group to which the instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmvvajg5qkxhi</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the security group. This security group is used for the PrivateLink-based endpoint. The security group must meet the following requirements:</p>
     * <ol>
     * <li><p>Add an inbound rule to allow traffic on TCP ports 5672 and 5671.</p>
     * </li>
     * <li><p>Managed security groups are not supported.</p>
     * </li>
     * <li><p>The security group must belong to the specified VPC.</p>
     * </li>
     * </ol>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-xxx</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The billing type of the serverless instance. Valid value:</p>
     * <ul>
     * <li><code>onDemand</code>: pay-as-you-go</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>onDemand</p>
     */
    @NameInMap("ServerlessChargeType")
    public String serverlessChargeType;

    @NameInMap("ServerlessSwitch")
    public Boolean serverlessSwitch;

    /**
     * <p>The message storage space. Unit: GB. Valid values:</p>
     * <ul>
     * <li>Professional Edition and Enterprise Edition instances: The value is fixed at 0.</li>
     * </ul>
     * <blockquote>
     * <p>A value of 0 means storage is not charged for Professional Edition and Enterprise Edition instances; it does not mean the instances lack storage space.</p>
     * </blockquote>
     * <ul>
     * <li>Platinum Edition instances: m × 100, where m is an integer from 7 to 28.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("StorageSize")
    public Integer storageSize;

    /**
     * <p>Specifies whether to enable access over the public network. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: Enables access over the public network.</p>
     * </li>
     * <li><p><code>false</code>: Disables access over the public network.</p>
     * </li>
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
     * <li><p><code>true</code>: Enables the message trace feature.</p>
     * </li>
     * <li><p><code>false</code>: Disables the message trace feature.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>The message trace feature is included for 15 days at no charge on Platinum Edition instances. For these instances, you must enable this feature and set the retention period to 15 days.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>For other instance types, you can enable or disable this feature.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SupportTracing")
    public Boolean supportTracing;

    /**
     * <p>The resource tags.</p>
     */
    @NameInMap("Tags")
    public String tagsShrink;

    /**
     * <p>The retention period of message traces. Unit: days. Valid values:</p>
     * <ul>
     * <li><p><code>3</code></p>
     * </li>
     * <li><p><code>7</code></p>
     * </li>
     * <li><p><code>15</code></p>
     * </li>
     * </ul>
     * <p>This parameter is required if you set <code>SupportTracing</code> to <code>true</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TracingStorageTime")
    public Integer tracingStorageTime;

    /**
     * <p>The ID of the VPC. This parameter is used to create a PrivateLink-based endpoint.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-xxx</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The vSwitch IDs used to create a PrivateLink-based endpoint when you create the instance. The vSwitches must meet the following requirements:</p>
     * <ol>
     * <li><p>You must specify two vSwitches that reside in different availability zones, except for regions that have only a single availability zone.</p>
     * </li>
     * <li><p>The vSwitches must belong to the specified VPC.</p>
     * </li>
     * <li><p>The vSwitches must be in the Available state.</p>
     * </li>
     * <li><p>Each vSwitch must have at least 20 available IP addresses.</p>
     * </li>
     * <li><p>The availability zones for the specified vSwitches must support NLB instance creation.</p>
     * </li>
     * </ol>
     * <p>This parameter is required.</p>
     */
    @NameInMap("VswitchIds")
    public String vswitchIdsShrink;

    public static CreateInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceShrinkRequest self = new CreateInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstanceShrinkRequest setAuthModel(String authModel) {
        this.authModel = authModel;
        return this;
    }
    public String getAuthModel() {
        return this.authModel;
    }

    public CreateInstanceShrinkRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateInstanceShrinkRequest setAutoRenewPeriod(Integer autoRenewPeriod) {
        this.autoRenewPeriod = autoRenewPeriod;
        return this;
    }
    public Integer getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    public CreateInstanceShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateInstanceShrinkRequest setEdition(String edition) {
        this.edition = edition;
        return this;
    }
    public String getEdition() {
        return this.edition;
    }

    public CreateInstanceShrinkRequest setEncryptedInstance(Boolean encryptedInstance) {
        this.encryptedInstance = encryptedInstance;
        return this;
    }
    public Boolean getEncryptedInstance() {
        return this.encryptedInstance;
    }

    public CreateInstanceShrinkRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateInstanceShrinkRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CreateInstanceShrinkRequest setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }
    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    public CreateInstanceShrinkRequest setListenerMode(String listenerMode) {
        this.listenerMode = listenerMode;
        return this;
    }
    public String getListenerMode() {
        return this.listenerMode;
    }

    public CreateInstanceShrinkRequest setMaxConnections(Integer maxConnections) {
        this.maxConnections = maxConnections;
        return this;
    }
    public Integer getMaxConnections() {
        return this.maxConnections;
    }

    public CreateInstanceShrinkRequest setMaxEipTps(Long maxEipTps) {
        this.maxEipTps = maxEipTps;
        return this;
    }
    public Long getMaxEipTps() {
        return this.maxEipTps;
    }

    public CreateInstanceShrinkRequest setMaxPrivateTps(Long maxPrivateTps) {
        this.maxPrivateTps = maxPrivateTps;
        return this;
    }
    public Long getMaxPrivateTps() {
        return this.maxPrivateTps;
    }

    public CreateInstanceShrinkRequest setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public CreateInstanceShrinkRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateInstanceShrinkRequest setPeriodCycle(String periodCycle) {
        this.periodCycle = periodCycle;
        return this;
    }
    public String getPeriodCycle() {
        return this.periodCycle;
    }

    public CreateInstanceShrinkRequest setProvisionedCapacity(Integer provisionedCapacity) {
        this.provisionedCapacity = provisionedCapacity;
        return this;
    }
    public Integer getProvisionedCapacity() {
        return this.provisionedCapacity;
    }

    public CreateInstanceShrinkRequest setQueueCapacity(Integer queueCapacity) {
        this.queueCapacity = queueCapacity;
        return this;
    }
    public Integer getQueueCapacity() {
        return this.queueCapacity;
    }

    public CreateInstanceShrinkRequest setRenewStatus(String renewStatus) {
        this.renewStatus = renewStatus;
        return this;
    }
    public String getRenewStatus() {
        return this.renewStatus;
    }

    public CreateInstanceShrinkRequest setRenewalDurationUnit(String renewalDurationUnit) {
        this.renewalDurationUnit = renewalDurationUnit;
        return this;
    }
    public String getRenewalDurationUnit() {
        return this.renewalDurationUnit;
    }

    public CreateInstanceShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateInstanceShrinkRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public CreateInstanceShrinkRequest setServerlessChargeType(String serverlessChargeType) {
        this.serverlessChargeType = serverlessChargeType;
        return this;
    }
    public String getServerlessChargeType() {
        return this.serverlessChargeType;
    }

    public CreateInstanceShrinkRequest setServerlessSwitch(Boolean serverlessSwitch) {
        this.serverlessSwitch = serverlessSwitch;
        return this;
    }
    public Boolean getServerlessSwitch() {
        return this.serverlessSwitch;
    }

    public CreateInstanceShrinkRequest setStorageSize(Integer storageSize) {
        this.storageSize = storageSize;
        return this;
    }
    public Integer getStorageSize() {
        return this.storageSize;
    }

    public CreateInstanceShrinkRequest setSupportEip(Boolean supportEip) {
        this.supportEip = supportEip;
        return this;
    }
    public Boolean getSupportEip() {
        return this.supportEip;
    }

    public CreateInstanceShrinkRequest setSupportTracing(Boolean supportTracing) {
        this.supportTracing = supportTracing;
        return this;
    }
    public Boolean getSupportTracing() {
        return this.supportTracing;
    }

    public CreateInstanceShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

    public CreateInstanceShrinkRequest setTracingStorageTime(Integer tracingStorageTime) {
        this.tracingStorageTime = tracingStorageTime;
        return this;
    }
    public Integer getTracingStorageTime() {
        return this.tracingStorageTime;
    }

    public CreateInstanceShrinkRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateInstanceShrinkRequest setVswitchIdsShrink(String vswitchIdsShrink) {
        this.vswitchIdsShrink = vswitchIdsShrink;
        return this;
    }
    public String getVswitchIdsShrink() {
        return this.vswitchIdsShrink;
    }

}
