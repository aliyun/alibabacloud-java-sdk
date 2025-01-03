// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListRepositoryCommitsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>f0b1e61db5961df5975a93f9129d2513</p>
     */
    @NameInMap("accessToken")
    public String accessToken;

    /**
     * <strong>example:</strong>
     * <p>2022-08-18 08:00:00</p>
     */
    @NameInMap("end")
    public String end;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>60de7a6852743a5162b5f957</p>
     */
    @NameInMap("organizationId")
    public String organizationId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Long page;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>src/cpp/main.cpp</p>
     */
    @NameInMap("path")
    public String path;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("refName")
    public String refName;

    /**
     * <strong>example:</strong>
     * <p>search</p>
     */
    @NameInMap("search")
    public String search;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("showCommentsCount")
    public Boolean showCommentsCount;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("showSignature")
    public Boolean showSignature;

    /**
     * <strong>example:</strong>
     * <p>2022-03-18 08:00:00</p>
     */
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
