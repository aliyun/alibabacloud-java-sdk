// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelAppListSentinelAppsRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AppType")
    public Integer appType;

    @NameInMap("MinHeartBeat")
    public Long minHeartBeat;

    @NameInMap("Namespace")
    public String namespace;

    public static SentinelAppListSentinelAppsRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelAppListSentinelAppsRequest self = new SentinelAppListSentinelAppsRequest();
        return TeaModel.build(map, self);
    }

    public SentinelAppListSentinelAppsRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public SentinelAppListSentinelAppsRequest setAppType(Integer appType) {
        this.appType = appType;
        return this;
    }
    public Integer getAppType() {
        return this.appType;
    }

    public SentinelAppListSentinelAppsRequest setMinHeartBeat(Long minHeartBeat) {
        this.minHeartBeat = minHeartBeat;
        return this;
    }
    public Long getMinHeartBeat() {
        return this.minHeartBeat;
    }

    public SentinelAppListSentinelAppsRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
