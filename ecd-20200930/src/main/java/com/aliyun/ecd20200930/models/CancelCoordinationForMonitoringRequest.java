// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CancelCoordinationForMonitoringRequest extends TeaModel {
    @NameInMap("CoIds")
    public java.util.List<String> coIds;

    @NameInMap("EndUserId")
    public String endUserId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("UserType")
    public String userType;

    public static CancelCoordinationForMonitoringRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelCoordinationForMonitoringRequest self = new CancelCoordinationForMonitoringRequest();
        return TeaModel.build(map, self);
    }

    public CancelCoordinationForMonitoringRequest setCoIds(java.util.List<String> coIds) {
        this.coIds = coIds;
        return this;
    }
    public java.util.List<String> getCoIds() {
        return this.coIds;
    }

    public CancelCoordinationForMonitoringRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public CancelCoordinationForMonitoringRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CancelCoordinationForMonitoringRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

}
