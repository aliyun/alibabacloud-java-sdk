// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class InnerStopCardsRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("Iccids")
    public java.util.List<String> iccids;

    @NameInMap("InnerApi")
    public String innerApi;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Task")
    public String task;

    public static InnerStopCardsRequest build(java.util.Map<String, ?> map) throws Exception {
        InnerStopCardsRequest self = new InnerStopCardsRequest();
        return TeaModel.build(map, self);
    }

    public InnerStopCardsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public InnerStopCardsRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public InnerStopCardsRequest setIccids(java.util.List<String> iccids) {
        this.iccids = iccids;
        return this;
    }
    public java.util.List<String> getIccids() {
        return this.iccids;
    }

    public InnerStopCardsRequest setInnerApi(String innerApi) {
        this.innerApi = innerApi;
        return this;
    }
    public String getInnerApi() {
        return this.innerApi;
    }

    public InnerStopCardsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public InnerStopCardsRequest setTask(String task) {
        this.task = task;
        return this;
    }
    public String getTask() {
        return this.task;
    }

}
