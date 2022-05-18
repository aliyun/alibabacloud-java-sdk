// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class DescribeMeterImpPlayBackTimeByLiveIdRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("EndTs")
    public Long endTs;

    @NameInMap("LiveId")
    public String liveId;

    @NameInMap("StartTs")
    public Long startTs;

    public static DescribeMeterImpPlayBackTimeByLiveIdRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterImpPlayBackTimeByLiveIdRequest self = new DescribeMeterImpPlayBackTimeByLiveIdRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMeterImpPlayBackTimeByLiveIdRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeMeterImpPlayBackTimeByLiveIdRequest setEndTs(Long endTs) {
        this.endTs = endTs;
        return this;
    }
    public Long getEndTs() {
        return this.endTs;
    }

    public DescribeMeterImpPlayBackTimeByLiveIdRequest setLiveId(String liveId) {
        this.liveId = liveId;
        return this;
    }
    public String getLiveId() {
        return this.liveId;
    }

    public DescribeMeterImpPlayBackTimeByLiveIdRequest setStartTs(Long startTs) {
        this.startTs = startTs;
        return this;
    }
    public Long getStartTs() {
        return this.startTs;
    }

}
