// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryParamRuleHotKeyOnNodesRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AppName")
    public String appName;

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

    public static QueryParamRuleHotKeyOnNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryParamRuleHotKeyOnNodesRequest self = new QueryParamRuleHotKeyOnNodesRequest();
        return TeaModel.build(map, self);
    }

    public QueryParamRuleHotKeyOnNodesRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public QueryParamRuleHotKeyOnNodesRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryParamRuleHotKeyOnNodesRequest setHotKey(String hotKey) {
        this.hotKey = hotKey;
        return this;
    }
    public String getHotKey() {
        return this.hotKey;
    }

    public QueryParamRuleHotKeyOnNodesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public QueryParamRuleHotKeyOnNodesRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public QueryParamRuleHotKeyOnNodesRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public QueryParamRuleHotKeyOnNodesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryParamRuleHotKeyOnNodesRequest setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

}
