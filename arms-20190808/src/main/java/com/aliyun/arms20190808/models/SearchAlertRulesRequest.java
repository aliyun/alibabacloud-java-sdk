// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchAlertRulesRequest extends TeaModel {
    @NameInMap("AlertRuleId")
    public String alertRuleId;

    @NameInMap("AppType")
    public String appType;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Pid")
    public String pid;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("SystemRegionId")
    public String systemRegionId;

    @NameInMap("Tags")
    public java.util.List<SearchAlertRulesRequestTags> tags;

    @NameInMap("Title")
    public String title;

    @NameInMap("Type")
    public String type;

    public static SearchAlertRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchAlertRulesRequest self = new SearchAlertRulesRequest();
        return TeaModel.build(map, self);
    }

    public SearchAlertRulesRequest setAlertRuleId(String alertRuleId) {
        this.alertRuleId = alertRuleId;
        return this;
    }
    public String getAlertRuleId() {
        return this.alertRuleId;
    }

    public SearchAlertRulesRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public SearchAlertRulesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public SearchAlertRulesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchAlertRulesRequest setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

    public SearchAlertRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SearchAlertRulesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public SearchAlertRulesRequest setSystemRegionId(String systemRegionId) {
        this.systemRegionId = systemRegionId;
        return this;
    }
    public String getSystemRegionId() {
        return this.systemRegionId;
    }

    public SearchAlertRulesRequest setTags(java.util.List<SearchAlertRulesRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<SearchAlertRulesRequestTags> getTags() {
        return this.tags;
    }

    public SearchAlertRulesRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public SearchAlertRulesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class SearchAlertRulesRequestTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static SearchAlertRulesRequestTags build(java.util.Map<String, ?> map) throws Exception {
            SearchAlertRulesRequestTags self = new SearchAlertRulesRequestTags();
            return TeaModel.build(map, self);
        }

        public SearchAlertRulesRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public SearchAlertRulesRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
