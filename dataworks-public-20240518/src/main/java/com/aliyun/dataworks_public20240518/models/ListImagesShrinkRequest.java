// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListImagesShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Public</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <strong>example:</strong>
     * <p>image</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("Official")
    public Boolean official;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProjectIds")
    public String projectIdsShrink;

    @NameInMap("ProviderTypes")
    public String providerTypesShrink;

    @NameInMap("SearchAll")
    public Boolean searchAll;

    /**
     * <strong>example:</strong>
     * <p>CreatedTime Desc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    @NameInMap("Stages")
    public String stagesShrink;

    @NameInMap("Statuses")
    public String statusesShrink;

    @NameInMap("SupportedModules")
    public String supportedModulesShrink;

    @NameInMap("SupportedTaskTypes")
    public String supportedTaskTypesShrink;

    public static ListImagesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListImagesShrinkRequest self = new ListImagesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListImagesShrinkRequest setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public ListImagesShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListImagesShrinkRequest setOfficial(Boolean official) {
        this.official = official;
        return this;
    }
    public Boolean getOfficial() {
        return this.official;
    }

    public ListImagesShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListImagesShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListImagesShrinkRequest setProjectIdsShrink(String projectIdsShrink) {
        this.projectIdsShrink = projectIdsShrink;
        return this;
    }
    public String getProjectIdsShrink() {
        return this.projectIdsShrink;
    }

    public ListImagesShrinkRequest setProviderTypesShrink(String providerTypesShrink) {
        this.providerTypesShrink = providerTypesShrink;
        return this;
    }
    public String getProviderTypesShrink() {
        return this.providerTypesShrink;
    }

    public ListImagesShrinkRequest setSearchAll(Boolean searchAll) {
        this.searchAll = searchAll;
        return this;
    }
    public Boolean getSearchAll() {
        return this.searchAll;
    }

    public ListImagesShrinkRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListImagesShrinkRequest setStagesShrink(String stagesShrink) {
        this.stagesShrink = stagesShrink;
        return this;
    }
    public String getStagesShrink() {
        return this.stagesShrink;
    }

    public ListImagesShrinkRequest setStatusesShrink(String statusesShrink) {
        this.statusesShrink = statusesShrink;
        return this;
    }
    public String getStatusesShrink() {
        return this.statusesShrink;
    }

    public ListImagesShrinkRequest setSupportedModulesShrink(String supportedModulesShrink) {
        this.supportedModulesShrink = supportedModulesShrink;
        return this;
    }
    public String getSupportedModulesShrink() {
        return this.supportedModulesShrink;
    }

    public ListImagesShrinkRequest setSupportedTaskTypesShrink(String supportedTaskTypesShrink) {
        this.supportedTaskTypesShrink = supportedTaskTypesShrink;
        return this;
    }
    public String getSupportedTaskTypesShrink() {
        return this.supportedTaskTypesShrink;
    }

}
