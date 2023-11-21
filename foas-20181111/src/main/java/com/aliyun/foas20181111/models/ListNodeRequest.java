// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class ListNodeRequest extends TeaModel {
    @NameInMap("actualStates")
    public java.util.List<Integer> actualStates;

    @NameInMap("apiType")
    public java.util.List<String> apiType;

    @NameInMap("creators")
    public java.util.List<String> creators;

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

    public static ListNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNodeRequest self = new ListNodeRequest();
        return TeaModel.build(map, self);
    }

    public ListNodeRequest setActualStates(java.util.List<Integer> actualStates) {
        this.actualStates = actualStates;
        return this;
    }
    public java.util.List<Integer> getActualStates() {
        return this.actualStates;
    }

    public ListNodeRequest setApiType(java.util.List<String> apiType) {
        this.apiType = apiType;
        return this;
    }
    public java.util.List<String> getApiType() {
        return this.apiType;
    }

    public ListNodeRequest setCreators(java.util.List<String> creators) {
        this.creators = creators;
        return this;
    }
    public java.util.List<String> getCreators() {
        return this.creators;
    }

    public ListNodeRequest setFolderId(Long folderId) {
        this.folderId = folderId;
        return this;
    }
    public Long getFolderId() {
        return this.folderId;
    }

    public ListNodeRequest setIsFuzzyQuery(Boolean isFuzzyQuery) {
        this.isFuzzyQuery = isFuzzyQuery;
        return this;
    }
    public Boolean getIsFuzzyQuery() {
        return this.isFuzzyQuery;
    }

    public ListNodeRequest setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public ListNodeRequest setMigrateState(String migrateState) {
        this.migrateState = migrateState;
        return this;
    }
    public String getMigrateState() {
        return this.migrateState;
    }

    public ListNodeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListNodeRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListNodeRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
