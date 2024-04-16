// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListPublishedModulesRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("ExcludeAppId")
    public String excludeAppId;

    @NameInMap("ExcludeModuleId")
    public String excludeModuleId;

    @NameInMap("HasOwnerApp")
    public Boolean hasOwnerApp;

    @NameInMap("ModuleId")
    public String moduleId;

    @NameInMap("ModuleName")
    public String moduleName;

    @NameInMap("ModuleType")
    public String moduleType;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Platform")
    public String platform;

    @NameInMap("Source")
    public String source;

    public static ListPublishedModulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPublishedModulesRequest self = new ListPublishedModulesRequest();
        return TeaModel.build(map, self);
    }

    public ListPublishedModulesRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ListPublishedModulesRequest setExcludeAppId(String excludeAppId) {
        this.excludeAppId = excludeAppId;
        return this;
    }
    public String getExcludeAppId() {
        return this.excludeAppId;
    }

    public ListPublishedModulesRequest setExcludeModuleId(String excludeModuleId) {
        this.excludeModuleId = excludeModuleId;
        return this;
    }
    public String getExcludeModuleId() {
        return this.excludeModuleId;
    }

    public ListPublishedModulesRequest setHasOwnerApp(Boolean hasOwnerApp) {
        this.hasOwnerApp = hasOwnerApp;
        return this;
    }
    public Boolean getHasOwnerApp() {
        return this.hasOwnerApp;
    }

    public ListPublishedModulesRequest setModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }
    public String getModuleId() {
        return this.moduleId;
    }

    public ListPublishedModulesRequest setModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }
    public String getModuleName() {
        return this.moduleName;
    }

    public ListPublishedModulesRequest setModuleType(String moduleType) {
        this.moduleType = moduleType;
        return this;
    }
    public String getModuleType() {
        return this.moduleType;
    }

    public ListPublishedModulesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPublishedModulesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPublishedModulesRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public ListPublishedModulesRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
