// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ExecuteTextbookAssistantRetryConversationRequest extends TeaModel {
    /**
     * <p>The AI assistant\&quot;s message ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6788e0b4b54c5268c1b78638</p>
     */
    @NameInMap("assistant")
    public String assistant;

    /**
     * <p>The authorization token. You can obtain this token from the API that provides authorization for the textbook AI assistant feature.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tc_e6dc70c890866f4028ca685b6fa29874</p>
     */
    @NameInMap("authToken")
    public String authToken;

    /**
     * <p>The conversation ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6788e0b475a4631ffc626722</p>
     */
    @NameInMap("chatId")
    public String chatId;

    /**
     * <p>Specifies the scenario. Valid values: <code>SYNC</code> for synchronized practice and <code>EXPAND</code> for expansion practice.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SYNC</p>
     */
    @NameInMap("scenario")
    public String scenario;

    public static ExecuteTextbookAssistantRetryConversationRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteTextbookAssistantRetryConversationRequest self = new ExecuteTextbookAssistantRetryConversationRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteTextbookAssistantRetryConversationRequest setAssistant(String assistant) {
        this.assistant = assistant;
        return this;
    }
    public String getAssistant() {
        return this.assistant;
    }

    public ExecuteTextbookAssistantRetryConversationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecuteTextbookAssistantRetryConversationRequest setChatId(String chatId) {
        this.chatId = chatId;
        return this;
    }
    public String getChatId() {
        return this.chatId;
    }

    public ExecuteTextbookAssistantRetryConversationRequest setScenario(String scenario) {
        this.scenario = scenario;
        return this;
    }
    public String getScenario() {
        return this.scenario;
    }

}
