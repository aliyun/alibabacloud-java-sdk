// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListAuditTermsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>DataNotExists</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListAuditTermsResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>77</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>x\&quot;x\&quot;x</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>F2F366D6-E9FE-1006-BB70-2C650896AAB5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>58</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListAuditTermsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAuditTermsResponseBody self = new ListAuditTermsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAuditTermsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAuditTermsResponseBody setData(java.util.List<ListAuditTermsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAuditTermsResponseBodyData> getData() {
        return this.data;
    }

    public ListAuditTermsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListAuditTermsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAuditTermsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAuditTermsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAuditTermsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAuditTermsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListAuditTermsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListAuditTermsResponseBodyData extends TeaModel {
        @NameInMap("ExceptionWord")
        public java.util.List<String> exceptionWord;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>龘</p>
         */
        @NameInMap("Keyword")
        public String keyword;

        /**
         * <strong>example:</strong>
         * <p>龘(dá)</p>
         */
        @NameInMap("SuggestWord")
        public String suggestWord;

        /**
         * <strong>example:</strong>
         * <p>龙行龘龘出自四库本《玉篇》23龙部第8字，文字释义为群龙腾飞的样子，昂扬而热烈。</p>
         */
        @NameInMap("TermsDesc")
        public String termsDesc;

        public static ListAuditTermsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAuditTermsResponseBodyData self = new ListAuditTermsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAuditTermsResponseBodyData setExceptionWord(java.util.List<String> exceptionWord) {
            this.exceptionWord = exceptionWord;
            return this;
        }
        public java.util.List<String> getExceptionWord() {
            return this.exceptionWord;
        }

        public ListAuditTermsResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListAuditTermsResponseBodyData setKeyword(String keyword) {
            this.keyword = keyword;
            return this;
        }
        public String getKeyword() {
            return this.keyword;
        }

        public ListAuditTermsResponseBodyData setSuggestWord(String suggestWord) {
            this.suggestWord = suggestWord;
            return this;
        }
        public String getSuggestWord() {
            return this.suggestWord;
        }

        public ListAuditTermsResponseBodyData setTermsDesc(String termsDesc) {
            this.termsDesc = termsDesc;
            return this;
        }
        public String getTermsDesc() {
            return this.termsDesc;
        }

    }

}
