// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ListTextbookAssistantBooksRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tc_197bf5bb81889cc79eb51ae9b8c0cea3</p>
     */
    @NameInMap("authToken")
    public String authToken;

    /**
     * <strong>example:</strong>
     * <p>231698</p>
     */
    @NameInMap("bookId")
    public String bookId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("grade")
    public String grade;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public String maxResults;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public String page;

    @NameInMap("version")
    public String version;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("volume")
    public String volume;

    public static ListTextbookAssistantBooksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTextbookAssistantBooksRequest self = new ListTextbookAssistantBooksRequest();
        return TeaModel.build(map, self);
    }

    public ListTextbookAssistantBooksRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListTextbookAssistantBooksRequest setBookId(String bookId) {
        this.bookId = bookId;
        return this;
    }
    public String getBookId() {
        return this.bookId;
    }

    public ListTextbookAssistantBooksRequest setGrade(String grade) {
        this.grade = grade;
        return this;
    }
    public String getGrade() {
        return this.grade;
    }

    public ListTextbookAssistantBooksRequest setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
        return this.maxResults;
    }

    public ListTextbookAssistantBooksRequest setPage(String page) {
        this.page = page;
        return this;
    }
    public String getPage() {
        return this.page;
    }

    public ListTextbookAssistantBooksRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public ListTextbookAssistantBooksRequest setVolume(String volume) {
        this.volume = volume;
        return this;
    }
    public String getVolume() {
        return this.volume;
    }

}
