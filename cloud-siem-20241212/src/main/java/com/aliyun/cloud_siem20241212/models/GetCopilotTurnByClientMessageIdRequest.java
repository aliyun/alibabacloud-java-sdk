// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class GetCopilotTurnByClientMessageIdRequest extends TeaModel {
    /**
     * <p>The client message ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>366932fb-9a83-4a2d-94dd-c925b35f****</p>
     */
    @NameInMap("ClientMessageId")
    public String clientMessageId;

    /**
     * <p>The conversation ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>54b6c969-4b75-47be-9f43-71f88aeb****</p>
     */
    @NameInMap("ConversationId")
    public String conversationId;

    /**
     * <p>The language of the returned message. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The region of the data management center for threat analysis. Select the region of the management center based on the region where your assets are located. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: Select this value if your assets are located in the Chinese mainland and Hong Kong (China).</li>
     * <li>ap-southeast-1: Select this value if your assets are located outside China.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The trace ID used to track the service request.</p>
     * 
     * <strong>example:</strong>
     * <p>550e8400e29b41d4a71644665544****</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static GetCopilotTurnByClientMessageIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCopilotTurnByClientMessageIdRequest self = new GetCopilotTurnByClientMessageIdRequest();
        return TeaModel.build(map, self);
    }

    public GetCopilotTurnByClientMessageIdRequest setClientMessageId(String clientMessageId) {
        this.clientMessageId = clientMessageId;
        return this;
    }
    public String getClientMessageId() {
        return this.clientMessageId;
    }

    public GetCopilotTurnByClientMessageIdRequest setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

    public GetCopilotTurnByClientMessageIdRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public GetCopilotTurnByClientMessageIdRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetCopilotTurnByClientMessageIdRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
