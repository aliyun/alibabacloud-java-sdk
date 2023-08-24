// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class ResetAreaLimitCardsRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("Iccids")
    public java.util.List<String> iccids;

    @NameInMap("Province")
    public String province;

    @NameInMap("RegionId")
    public String regionId;

    public static ResetAreaLimitCardsRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetAreaLimitCardsRequest self = new ResetAreaLimitCardsRequest();
        return TeaModel.build(map, self);
    }

    public ResetAreaLimitCardsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ResetAreaLimitCardsRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ResetAreaLimitCardsRequest setIccids(java.util.List<String> iccids) {
        this.iccids = iccids;
        return this;
    }
    public java.util.List<String> getIccids() {
        return this.iccids;
    }

    public ResetAreaLimitCardsRequest setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

    public ResetAreaLimitCardsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
