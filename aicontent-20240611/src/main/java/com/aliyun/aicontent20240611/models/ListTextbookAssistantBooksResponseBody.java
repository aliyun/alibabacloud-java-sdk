// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ListTextbookAssistantBooksResponseBody extends TeaModel {
    /**
     * <p>The data object in the response.</p>
     */
    @NameInMap("data")
    public ListTextbookAssistantBooksResponseBodyData data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>B_USER_NOT_FOUND_EXCEPTION</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>用户不存在</p>
     */
    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B695B377-7029-5805-9DE2-1AAE06C1BF6B</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Whether the request succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ListTextbookAssistantBooksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTextbookAssistantBooksResponseBody self = new ListTextbookAssistantBooksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTextbookAssistantBooksResponseBody setData(ListTextbookAssistantBooksResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListTextbookAssistantBooksResponseBodyData getData() {
        return this.data;
    }

    public ListTextbookAssistantBooksResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ListTextbookAssistantBooksResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ListTextbookAssistantBooksResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListTextbookAssistantBooksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTextbookAssistantBooksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListTextbookAssistantBooksResponseBodyDataBookList extends TeaModel {
        /**
         * <p>The author.</p>
         * 
         * <strong>example:</strong>
         * <p>吴欣</p>
         */
        @NameInMap("author")
        public String author;

        /**
         * <p>The book ID.</p>
         * 
         * <strong>example:</strong>
         * <p>231698</p>
         */
        @NameInMap("bookId")
        public String bookId;

        /**
         * <p>The book name.</p>
         * 
         * <strong>example:</strong>
         * <p>K12英语-人教版PEP三起-三年级上册</p>
         */
        @NameInMap("bookName")
        public String bookName;

        /**
         * <p>The cover image.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("coverImage")
        public String coverImage;

        /**
         * <p>The edition.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-7（1）</p>
         */
        @NameInMap("edition")
        public String edition;

        /**
         * <p>The grade. Valid values are strings from <code>&quot;1&quot;</code> to <code>&quot;9&quot;</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("grade")
        public String grade;

        /**
         * <p>The impression.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-7（1）</p>
         */
        @NameInMap("impression")
        public String impression;

        /**
         * <p>The International Standard Book Number (ISBN).</p>
         * 
         * <strong>example:</strong>
         * <p>9787107382505</p>
         */
        @NameInMap("isbn")
        public String isbn;

        /**
         * <p>The publisher.</p>
         * 
         * <strong>example:</strong>
         * <p>人民教育出版社</p>
         */
        @NameInMap("publisher")
        public String publisher;

        /**
         * <p>The subject.</p>
         * 
         * <strong>example:</strong>
         * <p>ENGLISH</p>
         */
        @NameInMap("subject")
        public String subject;

        /**
         * <p>The textbook version.</p>
         * 
         * <strong>example:</strong>
         * <p>人教版</p>
         */
        @NameInMap("version")
        public String version;

        /**
         * <p>The volume. Valid values: <code>&quot;0&quot;</code> (all-in-one), <code>&quot;1&quot;</code> (first semester), and <code>&quot;2&quot;</code> (second semester).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("volume")
        public String volume;

        public static ListTextbookAssistantBooksResponseBodyDataBookList build(java.util.Map<String, ?> map) throws Exception {
            ListTextbookAssistantBooksResponseBodyDataBookList self = new ListTextbookAssistantBooksResponseBodyDataBookList();
            return TeaModel.build(map, self);
        }

        public ListTextbookAssistantBooksResponseBodyDataBookList setAuthor(String author) {
            this.author = author;
            return this;
        }
        public String getAuthor() {
            return this.author;
        }

        public ListTextbookAssistantBooksResponseBodyDataBookList setBookId(String bookId) {
            this.bookId = bookId;
            return this;
        }
        public String getBookId() {
            return this.bookId;
        }

        public ListTextbookAssistantBooksResponseBodyDataBookList setBookName(String bookName) {
            this.bookName = bookName;
            return this;
        }
        public String getBookName() {
            return this.bookName;
        }

        public ListTextbookAssistantBooksResponseBodyDataBookList setCoverImage(String coverImage) {
            this.coverImage = coverImage;
            return this;
        }
        public String getCoverImage() {
            return this.coverImage;
        }

        public ListTextbookAssistantBooksResponseBodyDataBookList setEdition(String edition) {
            this.edition = edition;
            return this;
        }
        public String getEdition() {
            return this.edition;
        }

        public ListTextbookAssistantBooksResponseBodyDataBookList setGrade(String grade) {
            this.grade = grade;
            return this;
        }
        public String getGrade() {
            return this.grade;
        }

        public ListTextbookAssistantBooksResponseBodyDataBookList setImpression(String impression) {
            this.impression = impression;
            return this;
        }
        public String getImpression() {
            return this.impression;
        }

        public ListTextbookAssistantBooksResponseBodyDataBookList setIsbn(String isbn) {
            this.isbn = isbn;
            return this;
        }
        public String getIsbn() {
            return this.isbn;
        }

        public ListTextbookAssistantBooksResponseBodyDataBookList setPublisher(String publisher) {
            this.publisher = publisher;
            return this;
        }
        public String getPublisher() {
            return this.publisher;
        }

        public ListTextbookAssistantBooksResponseBodyDataBookList setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

        public ListTextbookAssistantBooksResponseBodyDataBookList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ListTextbookAssistantBooksResponseBodyDataBookList setVolume(String volume) {
            this.volume = volume;
            return this;
        }
        public String getVolume() {
            return this.volume;
        }

    }

    public static class ListTextbookAssistantBooksResponseBodyDataPaginationData extends TeaModel {
        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("currentPage")
        public Integer currentPage;

        /**
         * <p>The maximum number of items per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("maxResults")
        public Integer maxResults;

        /**
         * <p>The total number of items.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("totalCount")
        public Integer totalCount;

        public static ListTextbookAssistantBooksResponseBodyDataPaginationData build(java.util.Map<String, ?> map) throws Exception {
            ListTextbookAssistantBooksResponseBodyDataPaginationData self = new ListTextbookAssistantBooksResponseBodyDataPaginationData();
            return TeaModel.build(map, self);
        }

        public ListTextbookAssistantBooksResponseBodyDataPaginationData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListTextbookAssistantBooksResponseBodyDataPaginationData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ListTextbookAssistantBooksResponseBodyDataPaginationData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class ListTextbookAssistantBooksResponseBodyData extends TeaModel {
        /**
         * <p>A list of book objects.</p>
         */
        @NameInMap("bookList")
        public java.util.List<ListTextbookAssistantBooksResponseBodyDataBookList> bookList;

        /**
         * <p>The pagination data.</p>
         */
        @NameInMap("paginationData")
        public ListTextbookAssistantBooksResponseBodyDataPaginationData paginationData;

        public static ListTextbookAssistantBooksResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTextbookAssistantBooksResponseBodyData self = new ListTextbookAssistantBooksResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTextbookAssistantBooksResponseBodyData setBookList(java.util.List<ListTextbookAssistantBooksResponseBodyDataBookList> bookList) {
            this.bookList = bookList;
            return this;
        }
        public java.util.List<ListTextbookAssistantBooksResponseBodyDataBookList> getBookList() {
            return this.bookList;
        }

        public ListTextbookAssistantBooksResponseBodyData setPaginationData(ListTextbookAssistantBooksResponseBodyDataPaginationData paginationData) {
            this.paginationData = paginationData;
            return this;
        }
        public ListTextbookAssistantBooksResponseBodyDataPaginationData getPaginationData() {
            return this.paginationData;
        }

    }

}
