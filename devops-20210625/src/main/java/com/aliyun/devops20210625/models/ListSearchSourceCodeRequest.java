// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListSearchSourceCodeRequest extends TeaModel {
    @NameInMap("filePath")
    public ListSearchSourceCodeRequestFilePath filePath;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("isCodeBlock")
    public Boolean isCodeBlock;

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
     * <p>Java</p>
     */
    @NameInMap("language")
    public String language;

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
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("repoPath")
    public ListSearchSourceCodeRequestRepoPath repoPath;

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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>66c0c9fffeb86b450c199fcd</p>
     */
    @NameInMap("organizationId")
    public String organizationId;

    public static ListSearchSourceCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSearchSourceCodeRequest self = new ListSearchSourceCodeRequest();
        return TeaModel.build(map, self);
    }

    public ListSearchSourceCodeRequest setFilePath(ListSearchSourceCodeRequestFilePath filePath) {
        this.filePath = filePath;
        return this;
    }
    public ListSearchSourceCodeRequestFilePath getFilePath() {
        return this.filePath;
    }

    public ListSearchSourceCodeRequest setIsCodeBlock(Boolean isCodeBlock) {
        this.isCodeBlock = isCodeBlock;
        return this;
    }
    public Boolean getIsCodeBlock() {
        return this.isCodeBlock;
    }

    public ListSearchSourceCodeRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListSearchSourceCodeRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public ListSearchSourceCodeRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListSearchSourceCodeRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListSearchSourceCodeRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSearchSourceCodeRequest setRepoPath(ListSearchSourceCodeRequestRepoPath repoPath) {
        this.repoPath = repoPath;
        return this;
    }
    public ListSearchSourceCodeRequestRepoPath getRepoPath() {
        return this.repoPath;
    }

    public ListSearchSourceCodeRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public ListSearchSourceCodeRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public ListSearchSourceCodeRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public static class ListSearchSourceCodeRequestFilePath extends TeaModel {
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
         * <p>orgId/test-group/spring-boot-demo/test.java</p>
         */
        @NameInMap("value")
        public String value;

        public static ListSearchSourceCodeRequestFilePath build(java.util.Map<String, ?> map) throws Exception {
            ListSearchSourceCodeRequestFilePath self = new ListSearchSourceCodeRequestFilePath();
            return TeaModel.build(map, self);
        }

        public ListSearchSourceCodeRequestFilePath setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public ListSearchSourceCodeRequestFilePath setOperatorType(String operatorType) {
            this.operatorType = operatorType;
            return this;
        }
        public String getOperatorType() {
            return this.operatorType;
        }

        public ListSearchSourceCodeRequestFilePath setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListSearchSourceCodeRequestRepoPath extends TeaModel {
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
         * <p>xxx</p>
         */
        @NameInMap("value")
        public String value;

        public static ListSearchSourceCodeRequestRepoPath build(java.util.Map<String, ?> map) throws Exception {
            ListSearchSourceCodeRequestRepoPath self = new ListSearchSourceCodeRequestRepoPath();
            return TeaModel.build(map, self);
        }

        public ListSearchSourceCodeRequestRepoPath setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public ListSearchSourceCodeRequestRepoPath setOperatorType(String operatorType) {
            this.operatorType = operatorType;
            return this;
        }
        public String getOperatorType() {
            return this.operatorType;
        }

        public ListSearchSourceCodeRequestRepoPath setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
