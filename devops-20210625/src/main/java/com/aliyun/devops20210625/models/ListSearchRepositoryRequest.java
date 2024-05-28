// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListSearchRepositoryRequest extends TeaModel {
    @NameInMap("aliyunPk")
    public String aliyunPk;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("keyword")
    public String keyword;

    @NameInMap("order")
    public String order;

    @NameInMap("page")
    public Integer page;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("repoPath")
    public ListSearchRepositoryRequestRepoPath repoPath;

    @NameInMap("scope")
    public String scope;

    @NameInMap("sort")
    public String sort;

    @NameInMap("visibilityLevel")
    public Integer visibilityLevel;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("organizationId")
    public String organizationId;

    public static ListSearchRepositoryRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSearchRepositoryRequest self = new ListSearchRepositoryRequest();
        return TeaModel.build(map, self);
    }

    public ListSearchRepositoryRequest setAliyunPk(String aliyunPk) {
        this.aliyunPk = aliyunPk;
        return this;
    }
    public String getAliyunPk() {
        return this.aliyunPk;
    }

    public ListSearchRepositoryRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListSearchRepositoryRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListSearchRepositoryRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListSearchRepositoryRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSearchRepositoryRequest setRepoPath(ListSearchRepositoryRequestRepoPath repoPath) {
        this.repoPath = repoPath;
        return this;
    }
    public ListSearchRepositoryRequestRepoPath getRepoPath() {
        return this.repoPath;
    }

    public ListSearchRepositoryRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public ListSearchRepositoryRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public ListSearchRepositoryRequest setVisibilityLevel(Integer visibilityLevel) {
        this.visibilityLevel = visibilityLevel;
        return this;
    }
    public Integer getVisibilityLevel() {
        return this.visibilityLevel;
    }

    public ListSearchRepositoryRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public static class ListSearchRepositoryRequestRepoPath extends TeaModel {
        @NameInMap("matchType")
        public String matchType;

        @NameInMap("operatorType")
        public String operatorType;

        @NameInMap("value")
        public String value;

        public static ListSearchRepositoryRequestRepoPath build(java.util.Map<String, ?> map) throws Exception {
            ListSearchRepositoryRequestRepoPath self = new ListSearchRepositoryRequestRepoPath();
            return TeaModel.build(map, self);
        }

        public ListSearchRepositoryRequestRepoPath setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public ListSearchRepositoryRequestRepoPath setOperatorType(String operatorType) {
            this.operatorType = operatorType;
            return this;
        }
        public String getOperatorType() {
            return this.operatorType;
        }

        public ListSearchRepositoryRequestRepoPath setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
