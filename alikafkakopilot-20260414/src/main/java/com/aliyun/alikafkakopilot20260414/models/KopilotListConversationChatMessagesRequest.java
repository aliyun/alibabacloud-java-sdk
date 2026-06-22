// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkakopilot20260414.models;

import com.aliyun.tea.*;

public class KopilotListConversationChatMessagesRequest extends TeaModel {
    @NameInMap("BeforeTurnId")
    public Integer beforeTurnId;

    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SessionId")
    public String sessionId;

    public static KopilotListConversationChatMessagesRequest build(java.util.Map<String, ?> map) throws Exception {
        KopilotListConversationChatMessagesRequest self = new KopilotListConversationChatMessagesRequest();
        return TeaModel.build(map, self);
    }

    public KopilotListConversationChatMessagesRequest setBeforeTurnId(Integer beforeTurnId) {
        this.beforeTurnId = beforeTurnId;
        return this;
    }
    public Integer getBeforeTurnId() {
        return this.beforeTurnId;
    }

    public KopilotListConversationChatMessagesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public KopilotListConversationChatMessagesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public KopilotListConversationChatMessagesRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
