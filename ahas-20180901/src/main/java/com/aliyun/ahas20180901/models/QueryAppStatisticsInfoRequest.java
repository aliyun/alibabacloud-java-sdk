// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryAppStatisticsInfoRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AppTypes")
    public String appTypes;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("MinHeartbeat")
    public Long minHeartbeat;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("SourceType")
    public String sourceType;

    public static QueryAppStatisticsInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAppStatisticsInfoRequest self = new QueryAppStatisticsInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryAppStatisticsInfoRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public QueryAppStatisticsInfoRequest setAppTypes(String appTypes) {
        this.appTypes = appTypes;
        return this;
    }
    public String getAppTypes() {
        return this.appTypes;
    }

    public QueryAppStatisticsInfoRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public QueryAppStatisticsInfoRequest setMinHeartbeat(Long minHeartbeat) {
        this.minHeartbeat = minHeartbeat;
        return this;
    }
    public Long getMinHeartbeat() {
        return this.minHeartbeat;
    }

    public QueryAppStatisticsInfoRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public QueryAppStatisticsInfoRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
