// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListSearchCommitRequest extends TeaModel {
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
    public ListSearchCommitRequestRepoPath repoPath;

    @NameInMap("scope")
    public String scope;

    @NameInMap("sort")
    public String sort;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("organizationId")
    public String organizationId;

    public static ListSearchCommitRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSearchCommitRequest self = new ListSearchCommitRequest();
        return TeaModel.build(map, self);
    }

    public ListSearchCommitRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListSearchCommitRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListSearchCommitRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListSearchCommitRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSearchCommitRequest setRepoPath(ListSearchCommitRequestRepoPath repoPath) {
        this.repoPath = repoPath;
        return this;
    }
    public ListSearchCommitRequestRepoPath getRepoPath() {
        return this.repoPath;
    }

    public ListSearchCommitRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public ListSearchCommitRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public ListSearchCommitRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public static class ListSearchCommitRequestRepoPath extends TeaModel {
        @NameInMap("matchType")
        public String matchType;

        @NameInMap("operatorType")
        public String operatorType;

        @NameInMap("value")
        public String value;

        public static ListSearchCommitRequestRepoPath build(java.util.Map<String, ?> map) throws Exception {
            ListSearchCommitRequestRepoPath self = new ListSearchCommitRequestRepoPath();
            return TeaModel.build(map, self);
        }

        public ListSearchCommitRequestRepoPath setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public ListSearchCommitRequestRepoPath setOperatorType(String operatorType) {
            this.operatorType = operatorType;
            return this;
        }
        public String getOperatorType() {
            return this.operatorType;
        }

        public ListSearchCommitRequestRepoPath setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
