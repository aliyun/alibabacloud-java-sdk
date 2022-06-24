// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelProtectionModuleListAllByPageRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Model")
    public Long model;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("PageIndex")
    public String pageIndex;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("Resource")
    public String resource;

    @NameInMap("RuleType")
    public Long ruleType;

    @NameInMap("SearchKey")
    public String searchKey;

    public static SentinelProtectionModuleListAllByPageRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelProtectionModuleListAllByPageRequest self = new SentinelProtectionModuleListAllByPageRequest();
        return TeaModel.build(map, self);
    }

    public SentinelProtectionModuleListAllByPageRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public SentinelProtectionModuleListAllByPageRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SentinelProtectionModuleListAllByPageRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SentinelProtectionModuleListAllByPageRequest setModel(Long model) {
        this.model = model;
        return this;
    }
    public Long getModel() {
        return this.model;
    }

    public SentinelProtectionModuleListAllByPageRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public SentinelProtectionModuleListAllByPageRequest setPageIndex(String pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public String getPageIndex() {
        return this.pageIndex;
    }

    public SentinelProtectionModuleListAllByPageRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public SentinelProtectionModuleListAllByPageRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public SentinelProtectionModuleListAllByPageRequest setRuleType(Long ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public Long getRuleType() {
        return this.ruleType;
    }

    public SentinelProtectionModuleListAllByPageRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

}
