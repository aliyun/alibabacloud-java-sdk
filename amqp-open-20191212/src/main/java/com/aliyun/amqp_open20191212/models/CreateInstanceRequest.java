// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class CreateInstanceRequest extends TeaModel {
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    @NameInMap("AutoRenewPeriod")
    public Integer autoRenewPeriod;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("MaxConnections")
    public Integer maxConnections;

    @NameInMap("MaxEipTps")
    public Long maxEipTps;

    @NameInMap("MaxPrivateTps")
    public Long maxPrivateTps;

    @NameInMap("PaymentType")
    public String paymentType;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("PeriodCycle")
    public String periodCycle;

    @NameInMap("QueueCapacity")
    public Integer queueCapacity;

    /**
     * <p>autoRenew和renewStatus都是续费方式，当两个同时填写时，以renewStatus为准</p>
     */
    @NameInMap("RenewStatus")
    public String renewStatus;

    @NameInMap("RenewalDurationUnit")
    public String renewalDurationUnit;

    @NameInMap("StorageSize")
    public Integer storageSize;

    @NameInMap("SupportEip")
    public Boolean supportEip;

    @NameInMap("SupportTracing")
    public Boolean supportTracing;

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
