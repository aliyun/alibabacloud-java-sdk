// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelAppEventsByTypeRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("QueryLevel")
    public Integer queryLevel;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("eventType")
    public Long eventType;

    public static SentinelAppEventsByTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelAppEventsByTypeRequest self = new SentinelAppEventsByTypeRequest();
        return TeaModel.build(map, self);
    }

    public SentinelAppEventsByTypeRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public SentinelAppEventsByTypeRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SentinelAppEventsByTypeRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public SentinelAppEventsByTypeRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SentinelAppEventsByTypeRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public SentinelAppEventsByTypeRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public SentinelAppEventsByTypeRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SentinelAppEventsByTypeRequest setQueryLevel(Integer queryLevel) {
        this.queryLevel = queryLevel;
        return this;
    }
    public Integer getQueryLevel() {
        return this.queryLevel;
    }

    public SentinelAppEventsByTypeRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public SentinelAppEventsByTypeRequest setEventType(Long eventType) {
        this.eventType = eventType;
        return this;
    }
    public Long getEventType() {
        return this.eventType;
    }

}
