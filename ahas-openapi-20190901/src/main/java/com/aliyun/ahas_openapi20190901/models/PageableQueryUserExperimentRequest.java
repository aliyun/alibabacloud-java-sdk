// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class PageableQueryUserExperimentRequest extends TeaModel {
    @NameInMap("SearchKey")
    public String searchKey;

    @NameInMap("State")
    public String state;

    @NameInMap("Page")
    public Integer page;

    @NameInMap("Size")
    public Integer size;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Tags")
    public java.util.List<String> tags;

    @NameInMap("Results")
    public java.util.List<String> results;

    public static PageableQueryUserExperimentRequest build(java.util.Map<String, ?> map) throws Exception {
        PageableQueryUserExperimentRequest self = new PageableQueryUserExperimentRequest();
        return TeaModel.build(map, self);
    }

    public PageableQueryUserExperimentRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public PageableQueryUserExperimentRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public PageableQueryUserExperimentRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public PageableQueryUserExperimentRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public PageableQueryUserExperimentRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public PageableQueryUserExperimentRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public PageableQueryUserExperimentRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public PageableQueryUserExperimentRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public PageableQueryUserExperimentRequest setTags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<String> getTags() {
        return this.tags;
    }

    public PageableQueryUserExperimentRequest setResults(java.util.List<String> results) {
        this.results = results;
        return this;
    }
    public java.util.List<String> getResults() {
        return this.results;
    }

}
