// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelListAppsOfTypesRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AppTypes")
    public String appTypes;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("MinHeartBeat")
    public Long minHeartBeat;

    @NameInMap("Namespace")
    public String namespace;

    public static SentinelListAppsOfTypesRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelListAppsOfTypesRequest self = new SentinelListAppsOfTypesRequest();
        return TeaModel.build(map, self);
    }

    public SentinelListAppsOfTypesRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public SentinelListAppsOfTypesRequest setAppTypes(String appTypes) {
        this.appTypes = appTypes;
        return this;
    }
    public String getAppTypes() {
        return this.appTypes;
    }

    public SentinelListAppsOfTypesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SentinelListAppsOfTypesRequest setMinHeartBeat(Long minHeartBeat) {
        this.minHeartBeat = minHeartBeat;
        return this;
    }
    public Long getMinHeartBeat() {
        return this.minHeartBeat;
    }

    public SentinelListAppsOfTypesRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
