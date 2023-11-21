// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class ListNodeShrinkRequest extends TeaModel {
    @NameInMap("actualStates")
    public String actualStatesShrink;

    @NameInMap("apiType")
    public String apiTypeShrink;

    @NameInMap("creators")
    public String creatorsShrink;

    @NameInMap("folderId")
    public Long folderId;

    @NameInMap("isFuzzyQuery")
    public Boolean isFuzzyQuery;

    @NameInMap("jobType")
    public String jobType;

    @NameInMap("migrateState")
    public String migrateState;

    @NameInMap("name")
    public String name;

    @NameInMap("pageIndex")
    public Integer pageIndex;

    @NameInMap("pageSize")
    public Integer pageSize;

    public static ListNodeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNodeShrinkRequest self = new ListNodeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListNodeShrinkRequest setActualStatesShrink(String actualStatesShrink) {
        this.actualStatesShrink = actualStatesShrink;
        return this;
    }
    public String getActualStatesShrink() {
        return this.actualStatesShrink;
    }

    public ListNodeShrinkRequest setApiTypeShrink(String apiTypeShrink) {
        this.apiTypeShrink = apiTypeShrink;
        return this;
    }
    public String getApiTypeShrink() {
        return this.apiTypeShrink;
    }

    public ListNodeShrinkRequest setCreatorsShrink(String creatorsShrink) {
        this.creatorsShrink = creatorsShrink;
        return this;
    }
    public String getCreatorsShrink() {
        return this.creatorsShrink;
    }

    public ListNodeShrinkRequest setFolderId(Long folderId) {
        this.folderId = folderId;
        return this;
    }
    public Long getFolderId() {
        return this.folderId;
    }

    public ListNodeShrinkRequest setIsFuzzyQuery(Boolean isFuzzyQuery) {
        this.isFuzzyQuery = isFuzzyQuery;
        return this;
    }
    public Boolean getIsFuzzyQuery() {
        return this.isFuzzyQuery;
    }

    public ListNodeShrinkRequest setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public ListNodeShrinkRequest setMigrateState(String migrateState) {
        this.migrateState = migrateState;
        return this;
    }
    public String getMigrateState() {
        return this.migrateState;
    }

    public ListNodeShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListNodeShrinkRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListNodeShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
