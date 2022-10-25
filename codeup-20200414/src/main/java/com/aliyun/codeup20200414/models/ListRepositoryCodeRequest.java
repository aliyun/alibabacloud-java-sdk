// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class ListRepositoryCodeRequest extends TeaModel {
    @NameInMap("OrganizationId")
    public String organizationId;

    @NameInMap("FilePath")
    public ListRepositoryCodeRequestFilePath filePath;

    @NameInMap("IsCodeBlock")
    public Boolean isCodeBlock;

    @NameInMap("KeyWord")
    public String keyWord;

    @NameInMap("Language")
    public String language;

    @NameInMap("Order")
    public String order;

    @NameInMap("Page")
    public Long page;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RepositoryPath")
    public ListRepositoryCodeRequestRepositoryPath repositoryPath;

    @NameInMap("Scope")
    public String scope;

    @NameInMap("Sort")
    public String sort;

    public static ListRepositoryCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRepositoryCodeRequest self = new ListRepositoryCodeRequest();
        return TeaModel.build(map, self);
    }

    public ListRepositoryCodeRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public ListRepositoryCodeRequest setFilePath(ListRepositoryCodeRequestFilePath filePath) {
        this.filePath = filePath;
        return this;
    }
    public ListRepositoryCodeRequestFilePath getFilePath() {
        return this.filePath;
    }

    public ListRepositoryCodeRequest setIsCodeBlock(Boolean isCodeBlock) {
        this.isCodeBlock = isCodeBlock;
        return this;
    }
    public Boolean getIsCodeBlock() {
        return this.isCodeBlock;
    }

    public ListRepositoryCodeRequest setKeyWord(String keyWord) {
        this.keyWord = keyWord;
        return this;
    }
    public String getKeyWord() {
        return this.keyWord;
    }

    public ListRepositoryCodeRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public ListRepositoryCodeRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListRepositoryCodeRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListRepositoryCodeRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListRepositoryCodeRequest setRepositoryPath(ListRepositoryCodeRequestRepositoryPath repositoryPath) {
        this.repositoryPath = repositoryPath;
        return this;
    }
    public ListRepositoryCodeRequestRepositoryPath getRepositoryPath() {
        return this.repositoryPath;
    }

    public ListRepositoryCodeRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public ListRepositoryCodeRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public static class ListRepositoryCodeRequestFilePath extends TeaModel {
        @NameInMap("MatchType")
        public String matchType;

        @NameInMap("Name")
        public String name;

        @NameInMap("OperatorType")
        public String operatorType;

        @NameInMap("Value")
        public String value;

        public static ListRepositoryCodeRequestFilePath build(java.util.Map<String, ?> map) throws Exception {
            ListRepositoryCodeRequestFilePath self = new ListRepositoryCodeRequestFilePath();
            return TeaModel.build(map, self);
        }

        public ListRepositoryCodeRequestFilePath setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public ListRepositoryCodeRequestFilePath setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListRepositoryCodeRequestFilePath setOperatorType(String operatorType) {
            this.operatorType = operatorType;
            return this;
        }
        public String getOperatorType() {
            return this.operatorType;
        }

        public ListRepositoryCodeRequestFilePath setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListRepositoryCodeRequestRepositoryPath extends TeaModel {
        @NameInMap("MatchType")
        public String matchType;

        @NameInMap("Name")
        public String name;

        @NameInMap("OperatorType")
        public String operatorType;

        @NameInMap("Value")
        public String value;

        public static ListRepositoryCodeRequestRepositoryPath build(java.util.Map<String, ?> map) throws Exception {
            ListRepositoryCodeRequestRepositoryPath self = new ListRepositoryCodeRequestRepositoryPath();
            return TeaModel.build(map, self);
        }

        public ListRepositoryCodeRequestRepositoryPath setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public ListRepositoryCodeRequestRepositoryPath setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListRepositoryCodeRequestRepositoryPath setOperatorType(String operatorType) {
            this.operatorType = operatorType;
            return this;
        }
        public String getOperatorType() {
            return this.operatorType;
        }

        public ListRepositoryCodeRequestRepositoryPath setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
