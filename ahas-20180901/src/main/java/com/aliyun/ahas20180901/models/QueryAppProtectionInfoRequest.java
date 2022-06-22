// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryAppProtectionInfoRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Simple")
    public Boolean simple;

    @NameInMap("SourceType")
    public String sourceType;

    @NameInMap("StartTime")
    public Long startTime;

    public static QueryAppProtectionInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAppProtectionInfoRequest self = new QueryAppProtectionInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryAppProtectionInfoRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public QueryAppProtectionInfoRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryAppProtectionInfoRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public QueryAppProtectionInfoRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public QueryAppProtectionInfoRequest setSimple(Boolean simple) {
        this.simple = simple;
        return this;
    }
    public Boolean getSimple() {
        return this.simple;
    }

    public QueryAppProtectionInfoRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public QueryAppProtectionInfoRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
