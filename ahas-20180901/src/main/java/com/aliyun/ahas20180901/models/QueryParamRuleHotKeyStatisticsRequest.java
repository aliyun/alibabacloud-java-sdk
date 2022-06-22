// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryParamRuleHotKeyStatisticsRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("HotKey")
    public String hotKey;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Rule")
    public String rule;

    @NameInMap("StartTime")
    public Long startTime;

    public static QueryParamRuleHotKeyStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryParamRuleHotKeyStatisticsRequest self = new QueryParamRuleHotKeyStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public QueryParamRuleHotKeyStatisticsRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public QueryParamRuleHotKeyStatisticsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryParamRuleHotKeyStatisticsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryParamRuleHotKeyStatisticsRequest setHotKey(String hotKey) {
        this.hotKey = hotKey;
        return this;
    }
    public String getHotKey() {
        return this.hotKey;
    }

    public QueryParamRuleHotKeyStatisticsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public QueryParamRuleHotKeyStatisticsRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public QueryParamRuleHotKeyStatisticsRequest setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

    public QueryParamRuleHotKeyStatisticsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
