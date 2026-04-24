// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListImagesRequest extends TeaModel {
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
    public java.util.List<Long> projectIds;

    @NameInMap("ProviderTypes")
    public java.util.List<String> providerTypes;

    @NameInMap("SearchAll")
    public Boolean searchAll;

    /**
     * <strong>example:</strong>
     * <p>CreatedTime Desc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    @NameInMap("Stages")
    public java.util.List<String> stages;

    @NameInMap("Statuses")
    public java.util.List<String> statuses;

    @NameInMap("SupportedModules")
    public java.util.List<String> supportedModules;

    @NameInMap("SupportedTaskTypes")
    public java.util.List<String> supportedTaskTypes;

    public static ListImagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListImagesRequest self = new ListImagesRequest();
        return TeaModel.build(map, self);
    }

    public ListImagesRequest setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public ListImagesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListImagesRequest setOfficial(Boolean official) {
        this.official = official;
        return this;
    }
    public Boolean getOfficial() {
        return this.official;
    }

    public ListImagesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListImagesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListImagesRequest setProjectIds(java.util.List<Long> projectIds) {
        this.projectIds = projectIds;
        return this;
    }
    public java.util.List<Long> getProjectIds() {
        return this.projectIds;
    }

    public ListImagesRequest setProviderTypes(java.util.List<String> providerTypes) {
        this.providerTypes = providerTypes;
        return this;
    }
    public java.util.List<String> getProviderTypes() {
        return this.providerTypes;
    }

    public ListImagesRequest setSearchAll(Boolean searchAll) {
        this.searchAll = searchAll;
        return this;
    }
    public Boolean getSearchAll() {
        return this.searchAll;
    }

    public ListImagesRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListImagesRequest setStages(java.util.List<String> stages) {
        this.stages = stages;
        return this;
    }
    public java.util.List<String> getStages() {
        return this.stages;
    }

    public ListImagesRequest setStatuses(java.util.List<String> statuses) {
        this.statuses = statuses;
        return this;
    }
    public java.util.List<String> getStatuses() {
        return this.statuses;
    }

    public ListImagesRequest setSupportedModules(java.util.List<String> supportedModules) {
        this.supportedModules = supportedModules;
        return this;
    }
    public java.util.List<String> getSupportedModules() {
        return this.supportedModules;
    }

    public ListImagesRequest setSupportedTaskTypes(java.util.List<String> supportedTaskTypes) {
        this.supportedTaskTypes = supportedTaskTypes;
        return this;
    }
    public java.util.List<String> getSupportedTaskTypes() {
        return this.supportedTaskTypes;
    }

}
