// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListRepositoryCommitsRequest extends TeaModel {
    @NameInMap("accessToken")
    public String accessToken;

    @NameInMap("end")
    public String end;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("organizationId")
    public String organizationId;

    @NameInMap("page")
    public Long page;

    @NameInMap("pageSize")
    public Long pageSize;

    @NameInMap("path")
    public String path;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("refName")
    public String refName;

    @NameInMap("search")
    public String search;

    @NameInMap("showCommentsCount")
    public Boolean showCommentsCount;

    @NameInMap("showSignature")
    public Boolean showSignature;

    @NameInMap("start")
    public String start;

    public static ListRepositoryCommitsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRepositoryCommitsRequest self = new ListRepositoryCommitsRequest();
        return TeaModel.build(map, self);
    }

    public ListRepositoryCommitsRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public ListRepositoryCommitsRequest setEnd(String end) {
        this.end = end;
        return this;
    }
    public String getEnd() {
        return this.end;
    }

    public ListRepositoryCommitsRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public ListRepositoryCommitsRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListRepositoryCommitsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListRepositoryCommitsRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public ListRepositoryCommitsRequest setRefName(String refName) {
        this.refName = refName;
        return this;
    }
    public String getRefName() {
        return this.refName;
    }

    public ListRepositoryCommitsRequest setSearch(String search) {
        this.search = search;
        return this;
    }
    public String getSearch() {
        return this.search;
    }

    public ListRepositoryCommitsRequest setShowCommentsCount(Boolean showCommentsCount) {
        this.showCommentsCount = showCommentsCount;
        return this;
    }
    public Boolean getShowCommentsCount() {
        return this.showCommentsCount;
    }

    public ListRepositoryCommitsRequest setShowSignature(Boolean showSignature) {
        this.showSignature = showSignature;
        return this;
    }
    public Boolean getShowSignature() {
        return this.showSignature;
    }

    public ListRepositoryCommitsRequest setStart(String start) {
        this.start = start;
        return this;
    }
    public String getStart() {
        return this.start;
    }

}
