// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class DisableAlarmRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("AlarmTaskId")
    public String alarmTaskId;

    public static DisableAlarmRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableAlarmRequest self = new DisableAlarmRequest();
        return TeaModel.build(map, self);
    }

    public DisableAlarmRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DisableAlarmRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DisableAlarmRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DisableAlarmRequest setAlarmTaskId(String alarmTaskId) {
        this.alarmTaskId = alarmTaskId;
        return this;
    }
    public String getAlarmTaskId() {
        return this.alarmTaskId;
    }

}
