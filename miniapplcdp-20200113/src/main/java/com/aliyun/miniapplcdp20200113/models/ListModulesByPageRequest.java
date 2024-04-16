// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListModulesByPageRequest extends TeaModel {
    @NameInMap("CustomParentId")
    public String customParentId;

    @NameInMap("Description")
    public String description;

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

    public static ListModulesByPageRequest build(java.util.Map<String, ?> map) throws Exception {
        ListModulesByPageRequest self = new ListModulesByPageRequest();
        return TeaModel.build(map, self);
    }

    public ListModulesByPageRequest setCustomParentId(String customParentId) {
        this.customParentId = customParentId;
        return this;
    }
    public String getCustomParentId() {
        return this.customParentId;
    }

    public ListModulesByPageRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ListModulesByPageRequest setHasOwnerApp(Boolean hasOwnerApp) {
        this.hasOwnerApp = hasOwnerApp;
        return this;
    }
    public Boolean getHasOwnerApp() {
        return this.hasOwnerApp;
    }

    public ListModulesByPageRequest setModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }
    public String getModuleId() {
        return this.moduleId;
    }

    public ListModulesByPageRequest setModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }
    public String getModuleName() {
        return this.moduleName;
    }

    public ListModulesByPageRequest setModuleType(String moduleType) {
        this.moduleType = moduleType;
        return this;
    }
    public String getModuleType() {
        return this.moduleType;
    }

    public ListModulesByPageRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListModulesByPageRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListModulesByPageRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public ListModulesByPageRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
