// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ExecuteTextbookAssistantSuggestionRequest extends TeaModel {
    /**
     * <p>The unique identifier for the AI teacher\&quot;s message.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6788e0b4b54c5268c1b78638</p>
     */
    @NameInMap("assistant")
    public String assistant;

    /**
     * <p>The authorization token for the API call. To obtain this token, call the operation that generates authorization tokens for the AI teacher feature.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tc_e6dc70c890866f4028ca685b6fa29874</p>
     */
    @NameInMap("authToken")
    public String authToken;

    /**
     * <p>The unique identifier for the current chat.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6788e0b4b54c5268c1b78638</p>
     */
    @NameInMap("chatId")
    public String chatId;

    /**
     * <p>The practice scenario. Valid values are <code>SYNC</code> for synchronous practice and <code>EXPAND</code> for extended practice.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SYNC</p>
     */
    @NameInMap("scenario")
    public String scenario;

    public static ExecuteTextbookAssistantSuggestionRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteTextbookAssistantSuggestionRequest self = new ExecuteTextbookAssistantSuggestionRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteTextbookAssistantSuggestionRequest setAssistant(String assistant) {
        this.assistant = assistant;
        return this;
    }
    public String getAssistant() {
        return this.assistant;
    }

    public ExecuteTextbookAssistantSuggestionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecuteTextbookAssistantSuggestionRequest setChatId(String chatId) {
        this.chatId = chatId;
        return this;
    }
    public String getChatId() {
        return this.chatId;
    }

    public ExecuteTextbookAssistantSuggestionRequest setScenario(String scenario) {
        this.scenario = scenario;
        return this;
    }
    public String getScenario() {
        return this.scenario;
    }

}
