// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GenerateMessageChatTokenRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>19de81b3b3d94abda22******</p>
     */
    @NameInMap("AIAgentId")
    public String AIAgentId;

    /**
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("Expire")
    public Integer expire;

    /**
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("Role")
    public String role;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>YOURUSERID</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static GenerateMessageChatTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateMessageChatTokenRequest self = new GenerateMessageChatTokenRequest();
        return TeaModel.build(map, self);
    }

    public GenerateMessageChatTokenRequest setAIAgentId(String AIAgentId) {
        this.AIAgentId = AIAgentId;
        return this;
    }
    public String getAIAgentId() {
        return this.AIAgentId;
    }

    public GenerateMessageChatTokenRequest setExpire(Integer expire) {
        this.expire = expire;
        return this;
    }
    public Integer getExpire() {
        return this.expire;
    }

    public GenerateMessageChatTokenRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public GenerateMessageChatTokenRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
