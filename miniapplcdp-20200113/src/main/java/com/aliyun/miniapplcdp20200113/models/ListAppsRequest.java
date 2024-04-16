// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListAppsRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("AppStatus")
    public String appStatus;

    @NameInMap("AppType")
    public String appType;

    @NameInMap("CustomParentId")
    public String customParentId;

    @NameInMap("Description")
    public String description;

    @NameInMap("MainModuleId")
    public String mainModuleId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Source")
    public String source;

    @NameInMap("Template")
    public Boolean template;

    public static ListAppsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppsRequest self = new ListAppsRequest();
        return TeaModel.build(map, self);
    }

    public ListAppsRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListAppsRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListAppsRequest setAppStatus(String appStatus) {
        this.appStatus = appStatus;
        return this;
    }
    public String getAppStatus() {
        return this.appStatus;
    }

    public ListAppsRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public ListAppsRequest setCustomParentId(String customParentId) {
        this.customParentId = customParentId;
        return this;
    }
    public String getCustomParentId() {
        return this.customParentId;
    }

    public ListAppsRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ListAppsRequest setMainModuleId(String mainModuleId) {
        this.mainModuleId = mainModuleId;
        return this;
    }
    public String getMainModuleId() {
        return this.mainModuleId;
    }

    public ListAppsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAppsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAppsRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ListAppsRequest setTemplate(Boolean template) {
        this.template = template;
        return this;
    }
    public Boolean getTemplate() {
        return this.template;
    }

}
