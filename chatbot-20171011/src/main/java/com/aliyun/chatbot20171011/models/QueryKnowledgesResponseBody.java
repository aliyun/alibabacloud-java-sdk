// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class QueryKnowledgesResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Knowledges")
    public java.util.List<QueryKnowledgesResponseBodyKnowledges> knowledges;

    public static QueryKnowledgesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryKnowledgesResponseBody self = new QueryKnowledgesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryKnowledgesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public QueryKnowledgesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryKnowledgesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryKnowledgesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryKnowledgesResponseBody setKnowledges(java.util.List<QueryKnowledgesResponseBodyKnowledges> knowledges) {
        this.knowledges = knowledges;
        return this;
    }
    public java.util.List<QueryKnowledgesResponseBodyKnowledges> getKnowledges() {
        return this.knowledges;
    }

    public static class QueryKnowledgesResponseBodyKnowledges extends TeaModel {
        @NameInMap("KnowledgeStatus")
        public Integer knowledgeStatus;

        @NameInMap("EndDate")
        public String endDate;

        @NameInMap("KnowledgeId")
        public Long knowledgeId;

        @NameInMap("CreateUserName")
        public String createUserName;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("StartDate")
        public String startDate;

        @NameInMap("KnowledgeTitle")
        public String knowledgeTitle;

        @NameInMap("ModifyUserName")
        public String modifyUserName;

        @NameInMap("CoreWords")
        public java.util.List<String> coreWords;

        @NameInMap("Version")
        public String version;

        @NameInMap("CategoryId")
        public Long categoryId;

        @NameInMap("ModifyTime")
        public String modifyTime;

        public static QueryKnowledgesResponseBodyKnowledges build(java.util.Map<String, ?> map) throws Exception {
            QueryKnowledgesResponseBodyKnowledges self = new QueryKnowledgesResponseBodyKnowledges();
            return TeaModel.build(map, self);
        }

        public QueryKnowledgesResponseBodyKnowledges setKnowledgeStatus(Integer knowledgeStatus) {
            this.knowledgeStatus = knowledgeStatus;
            return this;
        }
        public Integer getKnowledgeStatus() {
            return this.knowledgeStatus;
        }

        public QueryKnowledgesResponseBodyKnowledges setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public QueryKnowledgesResponseBodyKnowledges setKnowledgeId(Long knowledgeId) {
            this.knowledgeId = knowledgeId;
            return this;
        }
        public Long getKnowledgeId() {
            return this.knowledgeId;
        }

        public QueryKnowledgesResponseBodyKnowledges setCreateUserName(String createUserName) {
            this.createUserName = createUserName;
            return this;
        }
        public String getCreateUserName() {
            return this.createUserName;
        }

        public QueryKnowledgesResponseBodyKnowledges setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryKnowledgesResponseBodyKnowledges setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public QueryKnowledgesResponseBodyKnowledges setKnowledgeTitle(String knowledgeTitle) {
            this.knowledgeTitle = knowledgeTitle;
            return this;
        }
        public String getKnowledgeTitle() {
            return this.knowledgeTitle;
        }

        public QueryKnowledgesResponseBodyKnowledges setModifyUserName(String modifyUserName) {
            this.modifyUserName = modifyUserName;
            return this;
        }
        public String getModifyUserName() {
            return this.modifyUserName;
        }

        public QueryKnowledgesResponseBodyKnowledges setCoreWords(java.util.List<String> coreWords) {
            this.coreWords = coreWords;
            return this;
        }
        public java.util.List<String> getCoreWords() {
            return this.coreWords;
        }

        public QueryKnowledgesResponseBodyKnowledges setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public QueryKnowledgesResponseBodyKnowledges setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public QueryKnowledgesResponseBodyKnowledges setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

    }

}
