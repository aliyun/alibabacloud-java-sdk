// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class UpdateInstanceRequest extends TeaModel {
    /**
     * <p>The client token.</p>
     * 
     * <strong>example:</strong>
     * <p>c2c5d1274axxxxxxxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The deployment architecture of the Serverless instance. Valid values:</p>
     * <ul>
     * <li><p>shared: A shared architecture. This applies to reserved plus elastic (shared) and pay-as-you-go instances.</p>
     * </li>
     * <li><p>dedicated: A dedicated architecture. This applies to reserved plus elastic (dedicated) instances.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>shared</p>
     */
    @NameInMap("Edition")
    public String edition;

    /**
     * <p>This feature is for dedicated instances only. Specifies whether to enable data encryption.</p>
     * <ul>
     * <li><p>You cannot change the EncryptedInstance and KmsKeyId properties of a dedicated instance. This includes changing its encryption status or downgrading it to a shared instance. Do not include the EncryptedInstance and KmsKeyId parameters when you call UpdateInstance to upgrade or downgrade a dedicated instance.</p>
     * </li>
     * <li><p>The EncryptedInstance and KmsKeyId parameters are used only when you upgrade a shared instance to an encrypted dedicated instance.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EncryptedInstance")
    public Boolean encryptedInstance;

    /**
     * <p>The ID of the ApsaraMQ for RabbitMQ instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amqp-cn-jtexxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The instance type. This parameter is required for subscription instances. Valid values:</p>
     * <ul>
     * <li><p>professional: Professional Edition</p>
     * </li>
     * <li><p>enterprise: Enterprise Edition</p>
     * </li>
     * <li><p>vip: Platinum Edition</p>
     * </li>
     * </ul>
     * <p>You do not need to specify this parameter for pay-as-you-go instances.</p>
     * 
     * <strong>example:</strong>
     * <p>professional</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>This feature is for dedicated instances only. This parameter is required if EncryptedInstance is set to true.
     * It specifies the ID of the KMS key used for data encryption.
     * The key must meet the following requirements:</p>
     * <ul>
     * <li><p>The KMS key must be in the same region as the ApsaraMQ for RabbitMQ instance.</p>
     * </li>
     * <li><p>The key cannot be a service key.</p>
     * </li>
     * <li><p>The key must be active.</p>
     * </li>
     * <li><p>The key must be a symmetric key.</p>
     * </li>
     * <li><p>The key must be used for encryption and decryption.</p>
     * </li>
     * <li><p>If the KMS key expires or is deleted, data reads and writes will fail, and the ApsaraMQ for RabbitMQ instance will become unavailable.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>key-bjj66c2a893vmhawtq5fd</p>
     */
    @NameInMap("KmsKeyId")
    public String kmsKeyId;

    /**
     * <p>The maximum number of connections.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("MaxConnections")
    public Integer maxConnections;

    /**
     * <p>The peak TPS for public network traffic.</p>
     * 
     * <strong>example:</strong>
     * <p>128</p>
     */
    @NameInMap("MaxEipTps")
    public Long maxEipTps;

    /**
     * <p>The peak transactions per second (TPS) for private network traffic.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("MaxPrivateTps")
    public Long maxPrivateTps;

    /**
     * <p>The type of specification change. Valid values:</p>
     * <ul>
     * <li><p>UPGRADE: Upgrade</p>
     * </li>
     * <li><p>DOWNGRADE: Downgrade</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>UPGRADE</p>
     */
    @NameInMap("ModifyType")
    public String modifyType;

    /**
     * <p>The provisioned TPS capacity for a reserved plus elastic instance.</p>
     * 
     * <strong>example:</strong>
     * <p>2000</p>
     */
    @NameInMap("ProvisionedCapacity")
    public Integer provisionedCapacity;

    /**
     * <p>The maximum number of queues.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("QueueCapacity")
    public Integer queueCapacity;

    /**
     * <p>The billing method of the pay-as-you-go (Serverless) instance. Valid value:</p>
     * <ul>
     * <li>onDemand: Pay-as-you-go</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>onDemand</p>
     */
    @NameInMap("ServerlessChargeType")
    public String serverlessChargeType;

    /**
     * <p>The message storage capacity. Unit: GB.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("StorageSize")
    public Integer storageSize;

    /**
     * <p>Specifies whether to enable Internet access.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SupportEip")
    public Boolean supportEip;

    /**
     * <p>Specifies whether to enable the message trace feature.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SupportTracing")
    public Boolean supportTracing;

    /**
     * <p>The retention period for message traces. Unit: days.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TracingStorageTime")
    public Integer tracingStorageTime;

    public static UpdateInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceRequest self = new UpdateInstanceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateInstanceRequest setEdition(String edition) {
        this.edition = edition;
        return this;
    }
    public String getEdition() {
        return this.edition;
    }

    public UpdateInstanceRequest setEncryptedInstance(Boolean encryptedInstance) {
        this.encryptedInstance = encryptedInstance;
        return this;
    }
    public Boolean getEncryptedInstance() {
        return this.encryptedInstance;
    }

    public UpdateInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateInstanceRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public UpdateInstanceRequest setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }
    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    public UpdateInstanceRequest setMaxConnections(Integer maxConnections) {
        this.maxConnections = maxConnections;
        return this;
    }
    public Integer getMaxConnections() {
        return this.maxConnections;
    }

    public UpdateInstanceRequest setMaxEipTps(Long maxEipTps) {
        this.maxEipTps = maxEipTps;
        return this;
    }
    public Long getMaxEipTps() {
        return this.maxEipTps;
    }

    public UpdateInstanceRequest setMaxPrivateTps(Long maxPrivateTps) {
        this.maxPrivateTps = maxPrivateTps;
        return this;
    }
    public Long getMaxPrivateTps() {
        return this.maxPrivateTps;
    }

    public UpdateInstanceRequest setModifyType(String modifyType) {
        this.modifyType = modifyType;
        return this;
    }
    public String getModifyType() {
        return this.modifyType;
    }

    public UpdateInstanceRequest setProvisionedCapacity(Integer provisionedCapacity) {
        this.provisionedCapacity = provisionedCapacity;
        return this;
    }
    public Integer getProvisionedCapacity() {
        return this.provisionedCapacity;
    }

    public UpdateInstanceRequest setQueueCapacity(Integer queueCapacity) {
        this.queueCapacity = queueCapacity;
        return this;
    }
    public Integer getQueueCapacity() {
        return this.queueCapacity;
    }

    public UpdateInstanceRequest setServerlessChargeType(String serverlessChargeType) {
        this.serverlessChargeType = serverlessChargeType;
        return this;
    }
    public String getServerlessChargeType() {
        return this.serverlessChargeType;
    }

    public UpdateInstanceRequest setStorageSize(Integer storageSize) {
        this.storageSize = storageSize;
        return this;
    }
    public Integer getStorageSize() {
        return this.storageSize;
    }

    public UpdateInstanceRequest setSupportEip(Boolean supportEip) {
        this.supportEip = supportEip;
        return this;
    }
    public Boolean getSupportEip() {
        return this.supportEip;
    }

    public UpdateInstanceRequest setSupportTracing(Boolean supportTracing) {
        this.supportTracing = supportTracing;
        return this;
    }
    public Boolean getSupportTracing() {
        return this.supportTracing;
    }

    public UpdateInstanceRequest setTracingStorageTime(Integer tracingStorageTime) {
        this.tracingStorageTime = tracingStorageTime;
        return this;
    }
    public Integer getTracingStorageTime() {
        return this.tracingStorageTime;
    }

}
