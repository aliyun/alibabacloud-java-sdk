// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListImagesShrinkRequest extends TeaModel {
    /**
     * <p>The accessibility of the image. Valid values:</p>
     * <ul>
     * <li>Public: The image is visible to all users.</li>
     * <li>Private: The image is visible only to the creator.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Public</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <p>The image name used for fuzzy match.</p>
     * 
     * <strong>example:</strong>
     * <p>image</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Specifies whether the image is an official image.</p>
     */
    @NameInMap("Official")
    public Boolean official;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The list of workspace IDs.</p>
     */
    @NameInMap("ProjectIds")
    public String projectIdsShrink;

    /**
     * <p>The list of image reference data types.</p>
     */
    @NameInMap("ProviderTypes")
    public String providerTypesShrink;

    /**
     * <p>Specifies whether to search for all images.</p>
     */
    @NameInMap("SearchAll")
    public Boolean searchAll;

    /**
     * <p>The list of sort fields. Fields such as scheduled time and start time are supported. The format is &quot;sort field + sort order (Desc/Asc)&quot;. Asc can be omitted. Valid values for sort fields:</p>
     * <ul>
     * <li>CreateTime (Desc/Asc): creation time.</li>
     * <li>Name (Desc/Asc): image name.
     * Default value: CreateTime Asc.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CreatedTime Desc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The list of image publishing stages to query.</p>
     */
    @NameInMap("Stages")
    public String stagesShrink;

    /**
     * <p>The list of image statuses to query.</p>
     */
    @NameInMap("Statuses")
    public String statusesShrink;

    /**
     * <p>The list of supported modules.</p>
     */
    @NameInMap("SupportedModules")
    public String supportedModulesShrink;

    /**
     * <p>The list of supported task types.</p>
     */
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
