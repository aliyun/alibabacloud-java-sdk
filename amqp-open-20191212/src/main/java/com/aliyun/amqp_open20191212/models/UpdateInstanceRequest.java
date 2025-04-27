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
     * <p>实例是否开通数据存储加密功能</p>
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
     * <p>The instance edition. Valid values for subscription instances:</p>
     * <ul>
     * <li>professional: Professional Edition</li>
     * <li>enterprise: Enterprise Edition</li>
     * <li>vip: Enterprise Platinum Edition.</li>
     * </ul>
     * <p>If your instance is a pay-as-you-go instance, you do not need to configure this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>professional</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>使用同地域下KMS密钥ID</p>
     * 
     * <strong>example:</strong>
     * <p>key-bjj66c2a893vmhawtq5fd</p>
     */
    @NameInMap("KmsKeyId")
    public String kmsKeyId;

    /**
     * <p>The maximum number of connections that can be created on the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("MaxConnections")
    public Integer maxConnections;

    /**
     * <p>The peak TPS for accessing the instance over the Internet.</p>
     * 
     * <strong>example:</strong>
     * <p>128</p>
     */
    @NameInMap("MaxEipTps")
    public Long maxEipTps;

    /**
     * <p>The peak transactions per second (TPS) for accessing the instance in a virtual private cloud (VPC).</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("MaxPrivateTps")
    public Long maxPrivateTps;

    /**
     * <p>The type of the configuration change. Valid values:</p>
     * <ul>
     * <li>UPGRADE</li>
     * <li>DOWNGRADE</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>UPGRADE</p>
     */
    @NameInMap("ModifyType")
    public String modifyType;

    /**
     * <p>The maximum number of queues that can be created on the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("QueueCapacity")
    public Integer queueCapacity;

    /**
     * <p>The billing method of the serverless instance. Valid values:</p>
     * <ul>
     * <li>onDemand: You are charged based on your actual usage.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>onDemand</p>
     */
    @NameInMap("ServerlessChargeType")
    public String serverlessChargeType;

    /**
     * <p>The size of the storage space that can be used to store messages.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("StorageSize")
    public Integer storageSize;

    /**
     * <p>Specifies whether elastic IP addresses (EIPs) are supported.</p>
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
     * <p>The retention period of message traces.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>3</li>
     * <li>7</li>
     * <li>15</li>
     * </ul>
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
