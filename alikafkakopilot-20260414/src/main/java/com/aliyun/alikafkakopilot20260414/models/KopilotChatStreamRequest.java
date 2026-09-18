// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkakopilot20260414.models;

import com.aliyun.tea.*;

public class KopilotChatStreamRequest extends TeaModel {
    /**
     * <p>The language for system operation prompts. Valid values: zh-CN, en-US, and ja-JP. If not specified, the compatible language parameter is read. If neither is specified, the request language is used. This parameter does not guarantee that the language of freely generated model content will change.</p>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The chat message content entered by the user.</p>
     * 
     * <strong>example:</strong>
     * <p>hello</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The session ID.</p>
     * 
     * <strong>example:</strong>
     * <p>efff104e-c0b1-4005-8c73-*********</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    public static KopilotChatStreamRequest build(java.util.Map<String, ?> map) throws Exception {
        KopilotChatStreamRequest self = new KopilotChatStreamRequest();
        return TeaModel.build(map, self);
    }

    public KopilotChatStreamRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public KopilotChatStreamRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public KopilotChatStreamRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public KopilotChatStreamRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
