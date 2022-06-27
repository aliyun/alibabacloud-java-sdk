// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class InnerLimitRateCardsRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("Iccids")
    public java.util.List<String> iccids;

    @NameInMap("InnerApi")
    public Boolean innerApi;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Task")
    public Boolean task;

    public static InnerLimitRateCardsRequest build(java.util.Map<String, ?> map) throws Exception {
        InnerLimitRateCardsRequest self = new InnerLimitRateCardsRequest();
        return TeaModel.build(map, self);
    }

    public InnerLimitRateCardsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public InnerLimitRateCardsRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public InnerLimitRateCardsRequest setIccids(java.util.List<String> iccids) {
        this.iccids = iccids;
        return this;
    }
    public java.util.List<String> getIccids() {
        return this.iccids;
    }

    public InnerLimitRateCardsRequest setInnerApi(Boolean innerApi) {
        this.innerApi = innerApi;
        return this;
    }
    public Boolean getInnerApi() {
        return this.innerApi;
    }

    public InnerLimitRateCardsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public InnerLimitRateCardsRequest setTask(Boolean task) {
        this.task = task;
        return this;
    }
    public Boolean getTask() {
        return this.task;
    }

}
