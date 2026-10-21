// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class CancelCopilotTurnRequest extends TeaModel {
    /**
     * <p>The session ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>54b6c969-4b75-47be-9f43-71f88aeb****</p>
     */
    @NameInMap("ConversationId")
    public String conversationId;

    /**
     * <p>The language of the response messages. Valid values:</p>
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
     * <p>The region where the data management center for threat analysis is located. Select the management center region based on the region where your assets reside. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: Assets are located in the Chinese mainland.</li>
     * <li>ap-southeast-1: Assets are located outside China.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The trace ID used to track service requests.</p>
     * 
     * <strong>example:</strong>
     * <p>550e8400e29b41d4a71644665544****</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    /**
     * <p>The conversation turn ID, obtained from the streaming response of CreateCopilotChat.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dc18b894-19a3-45ee-8768-a59478e0****</p>
     */
    @NameInMap("TurnId")
    public String turnId;

    public static CancelCopilotTurnRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelCopilotTurnRequest self = new CancelCopilotTurnRequest();
        return TeaModel.build(map, self);
    }

    public CancelCopilotTurnRequest setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

    public CancelCopilotTurnRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CancelCopilotTurnRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CancelCopilotTurnRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public CancelCopilotTurnRequest setTurnId(String turnId) {
        this.turnId = turnId;
        return this;
    }
    public String getTurnId() {
        return this.turnId;
    }

}
