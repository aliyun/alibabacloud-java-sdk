// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ExecuteTextbookAssistantDialogueRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("authToken")
    public String authToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("chatId")
    public String chatId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("scenario")
    public String scenario;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("userMessage")
    public String userMessage;

    public static ExecuteTextbookAssistantDialogueRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteTextbookAssistantDialogueRequest self = new ExecuteTextbookAssistantDialogueRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteTextbookAssistantDialogueRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecuteTextbookAssistantDialogueRequest setChatId(String chatId) {
        this.chatId = chatId;
        return this;
    }
    public String getChatId() {
        return this.chatId;
    }

    public ExecuteTextbookAssistantDialogueRequest setScenario(String scenario) {
        this.scenario = scenario;
        return this;
    }
    public String getScenario() {
        return this.scenario;
    }

    public ExecuteTextbookAssistantDialogueRequest setUserMessage(String userMessage) {
        this.userMessage = userMessage;
        return this;
    }
    public String getUserMessage() {
        return this.userMessage;
    }

}
