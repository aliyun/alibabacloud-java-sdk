// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20160801.models;

import com.aliyun.tea.*;

public class CreateSynchronizationJobRequest extends TeaModel {
    @NameInMap("DestinationEndpoint")
    public CreateSynchronizationJobRequestDestinationEndpoint destinationEndpoint;

    @NameInMap("SourceEndpoint")
    public CreateSynchronizationJobRequestSourceEndpoint sourceEndpoint;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DestRegion")
    public String destRegion;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("PayType")
    public String payType;

    @NameInMap("Period")
    public String period;

    @NameInMap("SourceRegion")
    public String sourceRegion;

    @NameInMap("SynchronizationJobClass")
    public String synchronizationJobClass;

    @NameInMap("UsedTime")
    public Integer usedTime;

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

    public CreateSynchronizationJobRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
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
