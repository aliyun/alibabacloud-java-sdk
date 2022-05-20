// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class ResumeCardsRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("Iccids")
    public java.util.List<String> iccids;

    @NameInMap("RegionId")
    public String regionId;

    public static ResumeCardsRequest build(java.util.Map<String, ?> map) throws Exception {
        ResumeCardsRequest self = new ResumeCardsRequest();
        return TeaModel.build(map, self);
    }

    public ResumeCardsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ResumeCardsRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ResumeCardsRequest setIccids(java.util.List<String> iccids) {
        this.iccids = iccids;
        return this;
    }
    public java.util.List<String> getIccids() {
        return this.iccids;
    }

    public ResumeCardsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
