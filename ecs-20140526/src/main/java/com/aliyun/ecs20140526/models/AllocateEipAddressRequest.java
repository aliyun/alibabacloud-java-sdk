// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AllocateEipAddressRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("Bandwidth")
    public String bandwidth;

    @NameInMap("ISP")
    public String ISP;

    @NameInMap("InternetChargeType")
    public String internetChargeType;

    @NameInMap("ActivityId")
    public Long activityId;

    @NameInMap("ClientToken")
    public String clientToken;

    public static AllocateEipAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        AllocateEipAddressRequest self = new AllocateEipAddressRequest();
        return TeaModel.build(map, self);
    }

    public AllocateEipAddressRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AllocateEipAddressRequest setBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public String getBandwidth() {
        return this.bandwidth;
    }

    public AllocateEipAddressRequest setISP(String ISP) {
        this.ISP = ISP;
        return this;
    }
    public String getISP() {
        return this.ISP;
    }

    public AllocateEipAddressRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public AllocateEipAddressRequest setActivityId(Long activityId) {
        this.activityId = activityId;
        return this;
    }
    public Long getActivityId() {
        return this.activityId;
    }

    public AllocateEipAddressRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
