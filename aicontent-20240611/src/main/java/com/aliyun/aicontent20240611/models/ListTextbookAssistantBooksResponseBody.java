// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ListTextbookAssistantBooksResponseBody extends TeaModel {
    @NameInMap("data")
    public ListTextbookAssistantBooksResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>B_USER_NOT_FOUND_EXCEPTION</p>
     */
    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>B695B377-7029-5805-9DE2-1AAE06C1BF6B</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
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
        @NameInMap("author")
        public String author;

        /**
         * <strong>example:</strong>
         * <p>231698</p>
         */
        @NameInMap("bookId")
        public String bookId;

        @NameInMap("bookName")
        public String bookName;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("coverImage")
        public String coverImage;

        /**
         * <strong>example:</strong>
         * <p>2024-7（1）</p>
         */
        @NameInMap("edition")
        public String edition;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("grade")
        public String grade;

        /**
         * <strong>example:</strong>
         * <p>2024-7（1）</p>
         */
        @NameInMap("impression")
        public String impression;

        /**
         * <strong>example:</strong>
         * <p>9787107382505</p>
         */
        @NameInMap("isbn")
        public String isbn;

        @NameInMap("publisher")
        public String publisher;

        /**
         * <strong>example:</strong>
         * <p>ENGLISH</p>
         */
        @NameInMap("subject")
        public String subject;

        @NameInMap("version")
        public String version;

        /**
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
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("currentPage")
        public Integer currentPage;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("maxResults")
        public Integer maxResults;

        /**
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
        @NameInMap("bookList")
        public java.util.List<ListTextbookAssistantBooksResponseBodyDataBookList> bookList;

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
