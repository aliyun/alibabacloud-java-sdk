// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ExecuteTextbookAssistantSseDialogueRequest extends TeaModel {
    /**
     * <p>The authorization token for the API call. Obtain this token from the authorization API for the AI teacher feature.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tc_e6dc70c890866f4028ca685b6fa29874</p>
     */
    @NameInMap("authToken")
    public String authToken;

    /**
     * <p>The ID of the current conversation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>67e374acb54c526c95c4fbd4</p>
     */
    @NameInMap("chatId")
    public String chatId;

    /**
     * <p>The scenario. Set the value to SYNC for Synchronous Practice or EXPAND for Expansion Practice.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>EXPAND</p>
     */
    @NameInMap("scenario")
    public String scenario;

    /**
     * <p>The content of the user\&quot;s message.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hello</p>
     */
    @NameInMap("userMessage")
    public String userMessage;

    public static ExecuteTextbookAssistantSseDialogueRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteTextbookAssistantSseDialogueRequest self = new ExecuteTextbookAssistantSseDialogueRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteTextbookAssistantSseDialogueRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecuteTextbookAssistantSseDialogueRequest setChatId(String chatId) {
        this.chatId = chatId;
        return this;
    }
    public String getChatId() {
        return this.chatId;
    }

    public ExecuteTextbookAssistantSseDialogueRequest setScenario(String scenario) {
        this.scenario = scenario;
        return this;
    }
    public String getScenario() {
        return this.scenario;
    }

    public ExecuteTextbookAssistantSseDialogueRequest setUserMessage(String userMessage) {
        this.userMessage = userMessage;
        return this;
    }
    public String getUserMessage() {
        return this.userMessage;
    }

}
