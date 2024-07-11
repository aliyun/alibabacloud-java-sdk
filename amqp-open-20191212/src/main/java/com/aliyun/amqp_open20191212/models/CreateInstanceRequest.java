// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class CreateInstanceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>AutoRenewal</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AutoRenewPeriod")
    public Integer autoRenewPeriod;

    /**
     * <strong>example:</strong>
     * <p>c2c5d1274axxxxxxxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <strong>example:</strong>
     * <p>professional</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <strong>example:</strong>
     * <p>50000</p>
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
     * <p>Subscription</p>
     */
    @NameInMap("PaymentType")
    public String paymentType;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PeriodCycle")
    public String periodCycle;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("QueueCapacity")
    public Integer queueCapacity;

    /**
     * <p>autoRenew和renewStatus都是续费方式，当两个同时填写时，以renewStatus为准</p>
     */
    @NameInMap("RenewStatus")
    public String renewStatus;

    @NameInMap("RenewalDurationUnit")
    public String renewalDurationUnit;

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
     * <p>true</p>
     */
    @NameInMap("SupportEip")
    public Boolean supportEip;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SupportTracing")
    public Boolean supportTracing;

    /**
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
