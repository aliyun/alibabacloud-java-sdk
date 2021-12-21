// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class EnableCenVbrHealthCheckRequest extends TeaModel {
    @NameInMap("CenId")
    public String cenId;

    @NameInMap("HealthCheckInterval")
    public Integer healthCheckInterval;

    @NameInMap("HealthCheckOnly")
    public Boolean healthCheckOnly;

    @NameInMap("HealthCheckSourceIp")
    public String healthCheckSourceIp;

    @NameInMap("HealthCheckTargetIp")
    public String healthCheckTargetIp;

    @NameInMap("HealthyThreshold")
    public Integer healthyThreshold;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("VbrInstanceId")
    public String vbrInstanceId;

    @NameInMap("VbrInstanceOwnerId")
    public Long vbrInstanceOwnerId;

    @NameInMap("VbrInstanceRegionId")
    public String vbrInstanceRegionId;

    public static EnableCenVbrHealthCheckRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableCenVbrHealthCheckRequest self = new EnableCenVbrHealthCheckRequest();
        return TeaModel.build(map, self);
    }

    public EnableCenVbrHealthCheckRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public EnableCenVbrHealthCheckRequest setHealthCheckInterval(Integer healthCheckInterval) {
        this.healthCheckInterval = healthCheckInterval;
        return this;
    }
    public Integer getHealthCheckInterval() {
        return this.healthCheckInterval;
    }

    public EnableCenVbrHealthCheckRequest setHealthCheckOnly(Boolean healthCheckOnly) {
        this.healthCheckOnly = healthCheckOnly;
        return this;
    }
    public Boolean getHealthCheckOnly() {
        return this.healthCheckOnly;
    }

    public EnableCenVbrHealthCheckRequest setHealthCheckSourceIp(String healthCheckSourceIp) {
        this.healthCheckSourceIp = healthCheckSourceIp;
        return this;
    }
    public String getHealthCheckSourceIp() {
        return this.healthCheckSourceIp;
    }

    public EnableCenVbrHealthCheckRequest setHealthCheckTargetIp(String healthCheckTargetIp) {
        this.healthCheckTargetIp = healthCheckTargetIp;
        return this;
    }
    public String getHealthCheckTargetIp() {
        return this.healthCheckTargetIp;
    }

    public EnableCenVbrHealthCheckRequest setHealthyThreshold(Integer healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
        return this;
    }
    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }

    public EnableCenVbrHealthCheckRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public EnableCenVbrHealthCheckRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public EnableCenVbrHealthCheckRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public EnableCenVbrHealthCheckRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public EnableCenVbrHealthCheckRequest setVbrInstanceId(String vbrInstanceId) {
        this.vbrInstanceId = vbrInstanceId;
        return this;
    }
    public String getVbrInstanceId() {
        return this.vbrInstanceId;
    }

    public EnableCenVbrHealthCheckRequest setVbrInstanceOwnerId(Long vbrInstanceOwnerId) {
        this.vbrInstanceOwnerId = vbrInstanceOwnerId;
        return this;
    }
    public Long getVbrInstanceOwnerId() {
        return this.vbrInstanceOwnerId;
    }

    public EnableCenVbrHealthCheckRequest setVbrInstanceRegionId(String vbrInstanceRegionId) {
        this.vbrInstanceRegionId = vbrInstanceRegionId;
        return this;
    }
    public String getVbrInstanceRegionId() {
        return this.vbrInstanceRegionId;
    }

}
