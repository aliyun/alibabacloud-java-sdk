// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryParamRuleHotKeyStatisticsOnNodeRequest extends TeaModel {
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

    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Rule")
    public String rule;

    @NameInMap("StartTime")
    public Long startTime;

    public static QueryParamRuleHotKeyStatisticsOnNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryParamRuleHotKeyStatisticsOnNodeRequest self = new QueryParamRuleHotKeyStatisticsOnNodeRequest();
        return TeaModel.build(map, self);
    }

    public QueryParamRuleHotKeyStatisticsOnNodeRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public QueryParamRuleHotKeyStatisticsOnNodeRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryParamRuleHotKeyStatisticsOnNodeRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryParamRuleHotKeyStatisticsOnNodeRequest setHotKey(String hotKey) {
        this.hotKey = hotKey;
        return this;
    }
    public String getHotKey() {
        return this.hotKey;
    }

    public QueryParamRuleHotKeyStatisticsOnNodeRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public QueryParamRuleHotKeyStatisticsOnNodeRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public QueryParamRuleHotKeyStatisticsOnNodeRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public QueryParamRuleHotKeyStatisticsOnNodeRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryParamRuleHotKeyStatisticsOnNodeRequest setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

    public QueryParamRuleHotKeyStatisticsOnNodeRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
