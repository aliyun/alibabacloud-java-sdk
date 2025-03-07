// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianchatbot20241105.models;

import com.aliyun.tea.*;

public class SseChatRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>chatbot-cn-dDmF3jcdVf</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <strong>example:</strong>
     * <p>TIMEOUT</p>
     */
    @NameInMap("Command")
    public String command;

    /**
     * <strong>example:</strong>
     * <p>uid129312098593</p>
     */
    @NameInMap("SenderId")
    public String senderId;

    @NameInMap("SenderNick")
    public String senderNick;

    /**
     * <strong>example:</strong>
     * <p>15e04f27-acd7-489d-872f-1d68f7535e33</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("Utterance")
    public String utterance;

    @NameInMap("VendorParam")
    public String vendorParam;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-g7jspxljq8k909h3</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static SseChatRequest build(java.util.Map<String, ?> map) throws Exception {
        SseChatRequest self = new SseChatRequest();
        return TeaModel.build(map, self);
    }

    public SseChatRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SseChatRequest setCommand(String command) {
        this.command = command;
        return this;
    }
    public String getCommand() {
        return this.command;
    }

    public SseChatRequest setSenderId(String senderId) {
        this.senderId = senderId;
        return this;
    }
    public String getSenderId() {
        return this.senderId;
    }

    public SseChatRequest setSenderNick(String senderNick) {
        this.senderNick = senderNick;
        return this;
    }
    public String getSenderNick() {
        return this.senderNick;
    }

    public SseChatRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public SseChatRequest setUtterance(String utterance) {
        this.utterance = utterance;
        return this;
    }
    public String getUtterance() {
        return this.utterance;
    }

    public SseChatRequest setVendorParam(String vendorParam) {
        this.vendorParam = vendorParam;
        return this;
    }
    public String getVendorParam() {
        return this.vendorParam;
    }

    public SseChatRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
