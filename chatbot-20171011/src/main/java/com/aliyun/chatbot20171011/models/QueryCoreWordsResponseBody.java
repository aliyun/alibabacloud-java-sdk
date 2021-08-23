// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class QueryCoreWordsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("CoreWords")
    public java.util.List<QueryCoreWordsResponseBodyCoreWords> coreWords;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    public static QueryCoreWordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCoreWordsResponseBody self = new QueryCoreWordsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCoreWordsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public QueryCoreWordsResponseBody setCoreWords(java.util.List<QueryCoreWordsResponseBodyCoreWords> coreWords) {
        this.coreWords = coreWords;
        return this;
    }
    public java.util.List<QueryCoreWordsResponseBodyCoreWords> getCoreWords() {
        return this.coreWords;
    }

    public QueryCoreWordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCoreWordsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryCoreWordsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public static class QueryCoreWordsResponseBodyCoreWords extends TeaModel {
        @NameInMap("CoreWordCode")
        public String coreWordCode;

        @NameInMap("CoreWordName")
        public String coreWordName;

        @NameInMap("Synonyms")
        public java.util.List<String> synonyms;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ModifyTime")
        public String modifyTime;

        public static QueryCoreWordsResponseBodyCoreWords build(java.util.Map<String, ?> map) throws Exception {
            QueryCoreWordsResponseBodyCoreWords self = new QueryCoreWordsResponseBodyCoreWords();
            return TeaModel.build(map, self);
        }

        public QueryCoreWordsResponseBodyCoreWords setCoreWordCode(String coreWordCode) {
            this.coreWordCode = coreWordCode;
            return this;
        }
        public String getCoreWordCode() {
            return this.coreWordCode;
        }

        public QueryCoreWordsResponseBodyCoreWords setCoreWordName(String coreWordName) {
            this.coreWordName = coreWordName;
            return this;
        }
        public String getCoreWordName() {
            return this.coreWordName;
        }

        public QueryCoreWordsResponseBodyCoreWords setSynonyms(java.util.List<String> synonyms) {
            this.synonyms = synonyms;
            return this;
        }
        public java.util.List<String> getSynonyms() {
            return this.synonyms;
        }

        public QueryCoreWordsResponseBodyCoreWords setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryCoreWordsResponseBodyCoreWords setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

    }

}
