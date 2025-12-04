// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListDocumentRetrieveResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>data</p>
     */
    @NameInMap("Data")
    public java.util.List<ListDocumentRetrieveResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>71</p>
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
     * <p>cEoBWREAXdxaOyjq/cqAbg==</p>
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
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListDocumentRetrieveResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDocumentRetrieveResponseBody self = new ListDocumentRetrieveResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDocumentRetrieveResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDocumentRetrieveResponseBody setData(java.util.List<ListDocumentRetrieveResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListDocumentRetrieveResponseBodyData> getData() {
        return this.data;
    }

    public ListDocumentRetrieveResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListDocumentRetrieveResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDocumentRetrieveResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDocumentRetrieveResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDocumentRetrieveResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDocumentRetrieveResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListDocumentRetrieveResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListDocumentRetrieveResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>文章正文</p>
         */
        @NameInMap("Essay")
        public String essay;

        /**
         * <strong>example:</strong>
         * <p>发布机构</p>
         */
        @NameInMap("IssuingAuthority")
        public String issuingAuthority;

        /**
         * <strong>example:</strong>
         * <p>文章链接</p>
         */
        @NameInMap("Link")
        public String link;

        /**
         * <strong>example:</strong>
         * <p>2023-02-01</p>
         */
        @NameInMap("PublicationDate")
        public String publicationDate;

        /**
         * <strong>example:</strong>
         * <p>文章标题</p>
         */
        @NameInMap("Title")
        public String title;

        public static ListDocumentRetrieveResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDocumentRetrieveResponseBodyData self = new ListDocumentRetrieveResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDocumentRetrieveResponseBodyData setEssay(String essay) {
            this.essay = essay;
            return this;
        }
        public String getEssay() {
            return this.essay;
        }

        public ListDocumentRetrieveResponseBodyData setIssuingAuthority(String issuingAuthority) {
            this.issuingAuthority = issuingAuthority;
            return this;
        }
        public String getIssuingAuthority() {
            return this.issuingAuthority;
        }

        public ListDocumentRetrieveResponseBodyData setLink(String link) {
            this.link = link;
            return this;
        }
        public String getLink() {
            return this.link;
        }

        public ListDocumentRetrieveResponseBodyData setPublicationDate(String publicationDate) {
            this.publicationDate = publicationDate;
            return this;
        }
        public String getPublicationDate() {
            return this.publicationDate;
        }

        public ListDocumentRetrieveResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
