// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ExecuteTextbookAssistantDialogueRequest extends TeaModel {
    /**
     * <p>The authorization token required to call the API. To get this token, use the Textbook Assistant authorization API.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6788e0b475a4631ffc626722</p>
     */
    @NameInMap("authToken")
    public String authToken;

    /**
     * <p>The chat ID for this turn.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6788e0b475a4631ffc626722</p>
     */
    @NameInMap("chatId")
    public String chatId;

    /**
     * <p>The scenario. Valid values: SYNC for synchronous practice and EXPAND for extended practice.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SYNC</p>
     */
    @NameInMap("scenario")
    public String scenario;

    /**
     * <p>The user\&quot;s message content.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Hello</p>
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
