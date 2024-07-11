// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class UpdateInstanceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>c2c5d1274axxxxxxxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amqp-cn-jtexxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>professional</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("MaxConnections")
    public Integer maxConnections;

    /**
     * <strong>example:</strong>
     * <p>128</p>
     */
    @NameInMap("MaxEipTps")
    public Long maxEipTps;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("MaxPrivateTps")
    public Long maxPrivateTps;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>UPGRADE</p>
     */
    @NameInMap("ModifyType")
    public String modifyType;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("QueueCapacity")
    public Integer queueCapacity;

    /**
     * <strong>example:</strong>
     * <p>onDemand</p>
     */
    @NameInMap("ServerlessChargeType")
    public String serverlessChargeType;

    /**
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("StorageSize")
    public Integer storageSize;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SupportEip")
    public Boolean supportEip;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SupportTracing")
    public Boolean supportTracing;

    /**
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
