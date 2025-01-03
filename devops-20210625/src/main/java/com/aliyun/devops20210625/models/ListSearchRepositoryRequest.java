// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListSearchRepositoryRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1840004904455497</p>
     */
    @NameInMap("aliyunPk")
    public String aliyunPk;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("order")
    public String order;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("repoPath")
    public ListSearchRepositoryRequestRepoPath repoPath;

    /**
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("scope")
    public String scope;

    /**
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("sort")
    public String sort;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("visibilityLevel")
    public Integer visibilityLevel;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>61e54b0e0bb300d827e1ae27</p>
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
        /**
         * <strong>example:</strong>
         * <p>term</p>
         */
        @NameInMap("matchType")
        public String matchType;

        /**
         * <strong>example:</strong>
         * <p>equal</p>
         */
        @NameInMap("operatorType")
        public String operatorType;

        /**
         * <strong>example:</strong>
         * <p>orgId/test-group/spring-boot-demo</p>
         */
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
