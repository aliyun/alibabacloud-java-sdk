// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ConfigureSynchronizationJobReplicatorCompareRequest extends TeaModel {
    @NameInMap("AccountId")
    public String accountId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SynchronizationDirection")
    public String synchronizationDirection;

    @NameInMap("SynchronizationJobId")
    public String synchronizationJobId;

    @NameInMap("SynchronizationReplicatorCompareEnable")
    public Boolean synchronizationReplicatorCompareEnable;

    public static ConfigureSynchronizationJobReplicatorCompareRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigureSynchronizationJobReplicatorCompareRequest self = new ConfigureSynchronizationJobReplicatorCompareRequest();
        return TeaModel.build(map, self);
    }

    public ConfigureSynchronizationJobReplicatorCompareRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public ConfigureSynchronizationJobReplicatorCompareRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ConfigureSynchronizationJobReplicatorCompareRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public ConfigureSynchronizationJobReplicatorCompareRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ConfigureSynchronizationJobReplicatorCompareRequest setSynchronizationDirection(String synchronizationDirection) {
        this.synchronizationDirection = synchronizationDirection;
        return this;
    }
    public String getSynchronizationDirection() {
        return this.synchronizationDirection;
    }

    public ConfigureSynchronizationJobReplicatorCompareRequest setSynchronizationJobId(String synchronizationJobId) {
        this.synchronizationJobId = synchronizationJobId;
        return this;
    }
    public String getSynchronizationJobId() {
        return this.synchronizationJobId;
    }

    public ConfigureSynchronizationJobReplicatorCompareRequest setSynchronizationReplicatorCompareEnable(Boolean synchronizationReplicatorCompareEnable) {
        this.synchronizationReplicatorCompareEnable = synchronizationReplicatorCompareEnable;
        return this;
    }
    public Boolean getSynchronizationReplicatorCompareEnable() {
        return this.synchronizationReplicatorCompareEnable;
    }

}
