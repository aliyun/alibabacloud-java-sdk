// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ListTextbookAssistantBookDirectoriesRequest extends TeaModel {
    /**
     * <p>The API authorization token. You can obtain this token from the authorization API for the AI English teacher feature.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tc_e6dc70c890866f4028ca685b6fa29874</p>
     */
    @NameInMap("authToken")
    public String authToken;

    /**
     * <p>The book ID. You can obtain this ID from the API for retrieving English textbooks.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>231698</p>
     */
    @NameInMap("bookId")
    public String bookId;

    /**
     * <p>The exercise scenario.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SYNC</p>
     */
    @NameInMap("scenario")
    public String scenario;

    public static ListTextbookAssistantBookDirectoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTextbookAssistantBookDirectoriesRequest self = new ListTextbookAssistantBookDirectoriesRequest();
        return TeaModel.build(map, self);
    }

    public ListTextbookAssistantBookDirectoriesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListTextbookAssistantBookDirectoriesRequest setBookId(String bookId) {
        this.bookId = bookId;
        return this;
    }
    public String getBookId() {
        return this.bookId;
    }

    public ListTextbookAssistantBookDirectoriesRequest setScenario(String scenario) {
        this.scenario = scenario;
        return this;
    }
    public String getScenario() {
        return this.scenario;
    }

}
