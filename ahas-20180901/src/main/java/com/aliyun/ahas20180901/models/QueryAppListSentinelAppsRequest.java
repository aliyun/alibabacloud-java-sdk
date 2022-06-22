// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryAppListSentinelAppsRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AppType")
    public Integer appType;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("MinHeartBeat")
    public Long minHeartBeat;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("SourceType")
    public String sourceType;

    public static QueryAppListSentinelAppsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAppListSentinelAppsRequest self = new QueryAppListSentinelAppsRequest();
        return TeaModel.build(map, self);
    }

    public QueryAppListSentinelAppsRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public QueryAppListSentinelAppsRequest setAppType(Integer appType) {
        this.appType = appType;
        return this;
    }
    public Integer getAppType() {
        return this.appType;
    }

    public QueryAppListSentinelAppsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public QueryAppListSentinelAppsRequest setMinHeartBeat(Long minHeartBeat) {
        this.minHeartBeat = minHeartBeat;
        return this;
    }
    public Long getMinHeartBeat() {
        return this.minHeartBeat;
    }

    public QueryAppListSentinelAppsRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public QueryAppListSentinelAppsRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
